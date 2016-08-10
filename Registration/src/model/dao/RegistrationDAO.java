package model.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.sql.DataSource;

import model.domain.RegistrationBean;

public class RegistrationDAO{

	static DataSource source = null;
	
	static{		 
		try {
			Context initContext = new InitialContext();		
			Context envContext = (Context)initContext.lookup("java:/comp/env");
			source = (DataSource)envContext.lookup("jdbc/mysql");
		} catch (NamingException e) {	
			e.printStackTrace();
		}	
	}
	
	public static RegistrationBean[] readRegistrationList(){
		Connection con = null;	
		PreparedStatement pstmt = null;
		ResultSet rset = null;
		RegistrationBean[] registrationList = null;
		ArrayList<RegistrationBean> alist = new ArrayList<RegistrationBean>();
		String sql="SELECT NUMBER, NAME, ATTENDANCE FROM REGISTRATION";	
		try {
			con = source.getConnection();
			pstmt = con.prepareStatement(sql);
			rset = pstmt.executeQuery();
			
			while(rset.next()){
				alist.add(new RegistrationBean(rset.getInt(1), rset.getString(2), rset.getString(3)));
			}
			
			registrationList = new RegistrationBean[alist.size()];
			alist.toArray(registrationList);
			
		} catch (SQLException e) {
			e.printStackTrace();
		}finally{
			close(rset, pstmt, con);
		}
		return registrationList;
	}
	
	public static void close(Statement stmt, Connection con){
		try{
			if(stmt != null){
				stmt.close();
				stmt = null;
			}
			
			if(con != null){
				con.close();
				con = null;
			}
			
		}catch(SQLException e){
			e.printStackTrace();
		}
	}
	
	public static void close(ResultSet rset, Statement stmt, Connection con){
		try{
			if(rset != null){
				rset.close();			
			}
			
			if(stmt != null){
				stmt.close();				
			}
			
			if(con != null){
				con.close();				
			}
			
		}catch(SQLException e){
			e.printStackTrace();
		}
	}
}