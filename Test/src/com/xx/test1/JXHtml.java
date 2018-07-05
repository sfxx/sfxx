package com.xx.test1;

import java.io.File;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.HashMap;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class JXHtml {
    public static void main(String[] args) throws ClassNotFoundException, SQLException{
    	File input = new File("C:\\Users\\infodba\\Desktop\\C3D_1S325911930H1_OM_B\\C3DHMain1.html");
    	Document doc = null;
    	try {
			 doc = Jsoup.parse(input, "UTF-8", "http://example.com/");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		//System.out.println("doc"+doc); 
		Elements content = doc.getElementsByTag("script");
		  //System.out.println("content"+content);
		  Element e = content.get(1);
		  StringBuffer sb=new StringBuffer();
		  sb.append(e.toString());
		  String str = sb.toString().substring(30);
		  str= str.substring(0, str.length()-9);
		  System.out.println("e"+e);
		  Connection con = null;
		    PreparedStatement pre = null;
		    ResultSet result = null;
      	HashMap map = new HashMap();
		  Class.forName("oracle.jdbc.driver.OracleDriver");
	        String URL1 = "jdbc:oracle:thin:@172.24.222.14:1521:stdsepc";
			String USERNAME1 = "epc";
			String Password1 = "infodba";
			con = DriverManager.getConnection(URL1,USERNAME1,Password1);
	        String selectSql="insert into c3d_data_js values(?,?)";
	        pre = con.prepareStatement(selectSql);
	        pre.setString(1, "C3D_1S325911930H1_OM");
	        pre.setString(2,  str);
	        System.out.println(str.length());
	        pre.execute();

    }
}
