package com.xx.test2;


	import java.io.BufferedReader;  
	import java.io.InputStream;  
	import java.io.InputStreamReader;  
	import java.net.HttpURLConnection;  
	import java.net.URL;  
	import java.util.ArrayList;  
	import java.util.List;  
	import java.util.regex.Matcher;  
	import java.util.regex.Pattern;  
	  
	public class TestRequestData {  
	    public static void main(String[] args) throws Exception {  
	        //Ŀ����ҳURL��ַ  
	        getURLInfo("http://www.ic.net.cn/userSite/publicQuote/quotes_list.php","utf-8");  
	    }  
	    public static List<Product> getURLInfo(String urlInfo,String charset) throws Exception {  
	        //��ȡĿ����ҳURL��ַ����ȡ��ҳԴ��  
	        URL url = new URL(urlInfo);  
	        HttpURLConnection httpUrl = (HttpURLConnection)url.openConnection();  
	        InputStream is = httpUrl.getInputStream();  
	        BufferedReader br = new BufferedReader(new InputStreamReader(is,"utf-8"));  
	        StringBuilder sb = new StringBuilder();  
	        String line;  
	        while ((line = br.readLine()) != null) {  
	            //�����Ƕ����ӽ��д���  
	            line = line.replaceAll("</?a[^>]*>", "");  
	            //�����Ƕ���ʽ���д���  
	            line = line.replaceAll("<(\\w+)[^>]*>", "<$1>");  
	            sb.append(line);  
	        }  
	        is.close();  
	        br.close();  
	        //�����ҳԴ��  
	        return getDataStructure(sb.toString().trim());  
	    }  
	    static Pattern proInfo   
	           = Pattern.compile("<div>(.*?)</div>\\s*<div>(.*?)</div>\\s*<div>(.*?)</div>\\s*<div>(.*?)</div>\\s*<div>(.*?)</div>", Pattern.DOTALL);  
	    private static List<Product> getDataStructure(String str) {  
	        //����������ʽ�Ի�ȡ����ҳԴ���������ƥ�䣬��ȡ������Ҫ�����ݣ����Ժ�Ĺ����У����ǿ��Բ���httpclient+jsoup,  
	        //������ʱ����������ʽ�����ݽ��г�ȡ��ȡ  
	        String[] info = str.split("</li>");  
	        List<Product> list = new ArrayList<Product>();  
	        for (String s : info) {  
	            Matcher m = proInfo.matcher(s);  
	            Product p = null;  
	            if (m.find()) {  
	                p = new Product();  
	                //���ò�Ʒ�ͺ�  
	                String[] ss = m.group(1).trim().replace(" ", "").split(">");  
	                p.setProStyle(ss[1]);  
	                //���ò�Ʒ����  
	                p.setProAmount(m.group(2).trim().replace(" ", ""));  
	                //���ò�Ʒ����  
	                p.setProPrice(m.group(4).trim().replace(" ", ""));  
	                //���ò�Ʒ��Ӧ��  
	                p.setProSupplier(m.group(5).trim().replace(" ", ""));  
	                list.add(p);  
	            }  
	        }  
	        //����Լ������治������Ҫ��ȡ�����ݽ����Ƴ�  
	        list.remove(0);  
	        for (int i = 0; i < list.size(); i++) {  
	            System.out.println("��Ʒ�ͺ�:"+list.get(i).getProStyle()+",��Ʒ����:"+list.get(i).getProAmount()  
	                    +",��Ʒ����:"+list.get(i).getProPrice()+",��Ʒ��Ӧ��:"+list.get(i).getProSupplier());  
	        }  
	        return list;  
	    }  
	}  
	class Product {  
	    private String proStyle;//��Ʒ�ͺ�  
	    private String proAmount;//��Ʒ����  
	    private String proPrice;//��Ʒ����  
	    private String proSupplier;//��Ʒ��Ӧ��  
	    public String getProStyle() {  
	        return proStyle;  
	    }  
	    public void setProStyle(String proStyle) {  
	        this.proStyle = proStyle;  
	    }  
	    public String getProSupplier() {  
	        return proSupplier;  
	    }  
	    public void setProSupplier(String proSupplier) {  
	        this.proSupplier = proSupplier;  
	    }  
	      
	    public String getProAmount() {  
	        return proAmount;  
	    }  
	    public void setProAmount(String proAmount) {  
	        this.proAmount = proAmount;  
	    }  
	    public String getProPrice() {  
	        return proPrice;  
	    }  
	    public void setProPrice(String proPrice) {  
	        this.proPrice = proPrice;  
	    }  
	    public Product() {  
	          
	    }  
	    @Override  
	    public String toString() {  
	        return "Product [proAmount=" + proAmount + ", proPrice=" + proPrice  
	                + ", proStyle=" + proStyle + ", proSupplier=" + proSupplier  
	                + "]";  
	    }  
	      
	  
}
