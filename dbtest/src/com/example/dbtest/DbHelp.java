package com.example.dbtest;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import android.util.Log;

public class DbHelp {
	
    //orclÎªoracleÊý¾Ý¿âÖÐµÄÊý¾Ý¿âÃû£¬localhost±íÊ¾Á¬½Ó±¾»úµÄoracleÊý¾Ý¿â     
   //1521ÎªÁ¬½ÓµÄ¶Ë¿ÚºÅ     
    private static String url="jdbc:oracle:thin:@192.168.16.112:1521:settle";    
    //systemÎªµÇÂ½oracleÊý¾Ý¿âµÄÓÃ»§Ãû     
    private static String user="couponms";    
    //managerÎªÓÃ»§ÃûsystemµÄÃÜÂë     
    private static String password="couponms";    
    public static Connection conn;    
    public static PreparedStatement ps;    
    public static ResultSet rs;    
    public static Statement st ;    
      
	public static void initConnection() {

	}
	
	public static void test(){
		new Thread(){
			dfsfs
			fds

			fdsfds

			fds

			fsd
			ds


			fdsfds
			
			@Override
			public void run(){
			            
				 try {    
			            //³õÊ¼»¯Çý¶¯°ü     
			            Class.forName("oracle.jdbc.driver.OracleDriver");    
			            //¸ù¾ÝÊý¾Ý¿âÁ¬½Ó×Ö·û£¬Ãû³Æ£¬ÃÜÂë¸øconn¸³Öµ     
			            conn=DriverManager.getConnection(url, user, password);    
			                
			        } catch (Exception e) {    
			            // TODO: handle exception     
			            e.printStackTrace();    
			        }    
			        try {    
			        	
			            String sql = "select * from act";     // ²éÑ¯Êý¾ÝµÄsqlÓï¾ä     
			            st = (Statement) conn.createStatement();    //´´½¨ÓÃÓÚÖ´ÐÐ¾²Ì¬sqlÓï¾äµÄStatement¶ÔÏó£¬stÊô¾Ö²¿±äÁ¿     
			                
			            ResultSet rs = st.executeQuery(sql);    //Ö´ÐÐsql²éÑ¯Óï¾ä£¬·µ»Ø²éÑ¯Êý¾ÝµÄ½á¹û¼¯     
			            System.out.println("×îºóµÄ²éÑ¯½á¹ûÎª£º");    
			            while (rs.next()) { // ÅÐ¶ÏÊÇ·ñ»¹ÓÐÏÂÒ»¸öÊý¾Ý     
			                    
			                // ¸ù¾Ý×Ö¶ÎÃû»ñÈ¡ÏàÓ¦µÄÖµ     
			                String name = rs.getString("ACT_ID");    
			               
			                //Êä³ö²éµ½µÄ¼ÇÂ¼µÄ¸÷¸ö×Ö¶ÎµÄÖµ     
			               Log.i("testddd",name);   
			                
			            }    
			            conn.close();   //¹Ø±ÕÊý¾Ý¿âÁ¬½Ó     
			                
			        } catch (SQLException e) {    
			            System.out.println("²éÑ¯Êý¾ÝÊ§°Ü");    
			        }    
			}
		}.start();
	}
}
