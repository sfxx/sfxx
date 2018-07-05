package com.xx.testdata;

import java.sql.Connection;
import java.sql.DriverManager;

public class DataBaseConnection {
	
	private final String DBDRIVER="oracle.jdbc.driver.OracleDriver";
	
	private Connection conn=null;
	
	private static DataBaseConnection dataConn = null;
	
    private  DataBaseConnection(String DBURL,String DBUSER,String DBPASSWORD){
		try{
			if(dataConn == null){
				Class.forName(DBDRIVER);
				this.conn=DriverManager.getConnection(DBURL,DBUSER,DBPASSWORD);
			}
			
		}catch (Exception e){
			e.printStackTrace();
		}		
	}	
    
    public static DataBaseConnection getDataBaseConnection(String DBURL,String DBUSER,String DBPASSWORD){
    	if(dataConn == null){
    		dataConn = new DataBaseConnection(DBURL,DBUSER,DBPASSWORD);
    	
    	}
    	return dataConn;
    }
    
    
	public Connection getConnection(){
		return this.conn;
	}	
	
	
	
	public void close(){
		try{
			this.conn.close();
		}catch (Exception e){
			e.printStackTrace();
		}	
	}
}
