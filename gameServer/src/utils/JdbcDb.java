package utils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;


public class JdbcDb {
   
    private static final String DRIVER_NAME = "com.mysql.cj.jdbc.Driver";

    private static final String url = "jdbc:mysql://121.199.10.134:3306/study?useUnicode=true&characterEncoding=UTF-8&zeroDateTimeBehavior=convertToNull&serverTimezone=GMT%2B8&useSSL=false";

    private static final String userName = "root";

    private static final String password = "root";
 

    private static  Connection conn;

    private  static PreparedStatement stmt;
   
    private static  ResultSet rs;
 
   
 
 
    public static Connection getConn() {
    	 try {
			Class.forName(DRIVER_NAME);
			 conn = DriverManager.getConnection(url, userName, password);
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        
        return conn;
    }
 
 
    public  static void close() {
        try {
            if (rs != null) {
                rs.close();
                rs = null;
            }
            if (stmt != null) {
                stmt.close();
                stmt = null;
            }
 
            if (conn != null) {
                conn.close();
                conn = null;
            }
        } catch (SQLException e) {
            System.err.println("Resource release exception");
        }
    }
 
   
 

    public static ResultSet executeSql(String sql, Object... args) {
        try {
//            System.out.println("Run SQL : \n" + sql);
            stmt = conn.prepareStatement(sql);
            if (null != args && args.length != 0) {
                for (int i = 0; i < args.length; i++) {
                    stmt.setObject(i + 1, args[i]);
                }
            }
 
            rs = stmt.executeQuery();
        } catch (SQLException e) {
            System.err.println("Data query exception");
            e.printStackTrace();
        }
        return rs;
    }
    
    
   
	public static int executeUpdate(String sql, Object... ars) {
		int num = 0;
		
		try {
			conn=getConn();
			stmt = conn.prepareStatement(sql);
			
			for (int i = 0; i < ars.length; i++) {
				stmt.setObject(i + 1, ars[i]);
			}
			
			num = stmt.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		
		}finally{
			close();
		}
		return num;
	}
 
	
	public static int executeAdd(String sql, Object... ars) {
		int num = 0;
		
		try {
			conn=getConn();
			stmt = conn.prepareStatement(sql,Statement.RETURN_GENERATED_KEYS);
			
			for (int i = 0; i < ars.length; i++) {
				stmt.setObject(i + 1, ars[i]);
			}
		
			num = stmt.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		
		}finally{
			close();
		}
		return num;
	}
 
	
    
    public static <T> T excuteQuery(Class<T> klass, String sql, Object... args) {
        try {
        	conn=getConn();
            rs = executeSql(sql, args);
            ResultSetMetaData metaData = rs.getMetaData();
 
            boolean isHave=false;
            Map<String, Object> resultMap = new HashMap<>();
            if (rs.next()) {
                for (int i = 1; i <= metaData.getColumnCount(); i++) {
                    String columnname = metaData.getColumnLabel(i);
                    Object obj = rs.getObject(i);
                    resultMap.put(columnname, obj);
                    isHave=true;
                }
            }
 
            if(isHave==true) {
            	 return JSON.parseObject(JSON.toJSONString(resultMap), klass);
            }else {
            	return null;
            }
           
        } catch (Exception e) {
            System.err.println("Data query exception");
            e.printStackTrace();
        } finally {
            close();
        }
        return JSON.toJavaObject(new JSONObject(), klass);
    }
 
  
    public static <T> List<T> excuteQueryToList(Class<T> klass, String sql, Object... args) {
        try {
        	conn=getConn();
            rs = executeSql(sql, args);
            List<Map<String, String>> resultList = new ArrayList<>();
            Map<String, String> resultMap=null;
            while (rs.next()) {
            	resultMap = new HashMap<>();
                ResultSetMetaData metaData = rs.getMetaData();
                int columnCount = metaData.getColumnCount();
                for (int i = 1; i <= columnCount; i++) {
                    resultMap.put(metaData.getColumnName(i), rs.getString(i));
                }
                resultList.add(resultMap);
            }
 
            return JSON.parseArray(JSON.toJSONString(resultList), klass);
        } catch (Exception e) {
            System.err.println("Data query exception");
            e.printStackTrace();
        } finally {
            close();
        }
        return JSON.parseArray("[]", klass);
    }
}
