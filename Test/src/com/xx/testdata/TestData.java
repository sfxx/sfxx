package com.xx.testdata;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;

public class TestData {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Connection conn = null;
		PreparedStatement pre = null;
		try {
			conn = DataBaseConnection.getDataBaseConnection("jdbc:oracle:thin:@172.24.222.14:1521:stdsepc","epc","infodba").getConnection();
			String sql = "insert into ITEMNAMEZHEN (ITEMNAME_ZH,ITEMNAME_TH,ITEMNAME_AF) values(?,?,?)";
			pre = conn.prepareStatement(sql);
			pre.setNString(1, "规格啊");
			pre.setNString(2, "เครื่องกรองอากาศ");
			pre.setNString(3, null);
			pre.execute();
		  } catch (Exception e) {
			e.printStackTrace();
			} finally{
			if(conn != null){
				try {
					conn.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}	
	  
	}

}
