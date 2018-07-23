package com.example.dbtest;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import android.util.Log;

public class DbHelp {
	
    //orcl为oracle数据库中的数据库名，localhost表示连接本机的oracle数据库     
   //1521为连接的端口号     
    private static String url="jdbc:oracle:thin:@192.168.16.112:1521:settle";    
    //system为登陆oracle数据库的用户名     
    private static String user="couponms";    
    //manager为用户名system的密码     
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
			            //初始化驱动包     
			            Class.forName("oracle.jdbc.driver.OracleDriver");    
			            //根据数据库连接字符，名称，密码给conn赋值     
			            conn=DriverManager.getConnection(url, user, password);    
			                
			        } catch (Exception e) {    
			            // TODO: handle exception     
			            e.printStackTrace();    
			        }    
			        try {    
			        	
			            String sql = "select * from act";     // 查询数据的sql语句     
			            st = (Statement) conn.createStatement();    //创建用于执行静态sql语句的Statement对象，st属局部变量     
			                
			            ResultSet rs = st.executeQuery(sql);    //执行sql查询语句，返回查询数据的结果集     
			            System.out.println("最后的查询结果为：");    
			            while (rs.next()) { // 判断是否还有下一个数据     
			                    
			                // 根据字段名获取相应的值     
			                String name = rs.getString("ACT_ID");    
			               
			                //输出查到的记录的各个字段的值     
			               Log.i("testddd",name);   
			                
			            }    
			            conn.close();   //关闭数据库连接     
			                
			        } catch (SQLException e) {    
			            System.out.println("查询数据失败");    
			        }    
			}
		}.start();
	}
}
