package com.example.dbtest;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import android.util.Log;

public class DbHelp {
	
    //orclΪoracle���ݿ��е����ݿ�����localhost��ʾ���ӱ�����oracle���ݿ�     
   //1521Ϊ���ӵĶ˿ں�     
    private static String url="jdbc:oracle:thin:@192.168.16.112:1521:settle";    
    //systemΪ��½oracle���ݿ���û���     
    private static String user="couponms";    
    //managerΪ�û���system������     
    private static String password="couponms";    
    public static Connection conn;    
    public static PreparedStatement ps;    
    public static ResultSet rs;    
    public static Statement st ;    
      
	public static void initConnection() {

	}
	
	public static void test(){
		new Thread(){
			fds

			fdsfds
			ds


			fdsfds
			
			@Override
			public void run(){
			            
				 try {    
			            //��ʼ��������     
			            Class.forName("oracle.jdbc.driver.OracleDriver");    
			            //�������ݿ������ַ������ƣ������conn��ֵ     
			            conn=DriverManager.getConnection(url, user, password);    
			                
			        } catch (Exception e) {    
			            // TODO: handle exception     
			            e.printStackTrace();    
			        }    
			        try {    
			        	
			            String sql = "select * from act";     // ��ѯ���ݵ�sql���     
			            st = (Statement) conn.createStatement();    //��������ִ�о�̬sql����Statement����st���ֲ�����     
			                
			            ResultSet rs = st.executeQuery(sql);    //ִ��sql��ѯ��䣬���ز�ѯ���ݵĽ����     
			            System.out.println("���Ĳ�ѯ���Ϊ��");    
			            while (rs.next()) { // �ж��Ƿ�����һ������     
			                    
			                // �����ֶ�����ȡ��Ӧ��ֵ     
			                String name = rs.getString("ACT_ID");    
			               
			                //����鵽�ļ�¼�ĸ����ֶε�ֵ     
			               Log.i("testddd",name);   
			                
			            }    
			            conn.close();   //�ر����ݿ�����     
			                
			        } catch (SQLException e) {    
			            System.out.println("��ѯ����ʧ��");    
			        }    
			}
		}.start();
	}
}
