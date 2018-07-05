package com.xx.writeXml;

import java.io.File;
import java.io.FileOutputStream;

import org.dom4j.DocumentHelper;
import org.dom4j.io.OutputFormat;
import org.dom4j.io.XMLWriter;

public class Demon {
	
	public static void main(String[] args){
		File file = new File("C:\\Users\\infodba\\Desktop\\test.xml");
		try {
			DOM4Jcreate(file);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	 public static void DOM4Jcreate(File file)throws Exception{
	        org.dom4j.Document document=DocumentHelper.createDocument();
	        org.dom4j.Element root=document.addElement("rss");
	        root.addAttribute("version", "2.0");
	        org.dom4j.Element channel=root.addElement("channel");
	        org.dom4j.Element title=channel.addElement("title");
	        title.setText("新闻国内");
	        org.dom4j.Element item=root.addElement("item");
	        org.dom4j.Element title1=item.addElement("title");
	        title1.setText("零件");

	        //...
	        XMLWriter writer=new XMLWriter(new FileOutputStream(file),OutputFormat.createPrettyPrint());
	        writer.setEscapeText(false);//字符是否转义,默认true
	        writer.write(document);
	        writer.close();
	    }

}
