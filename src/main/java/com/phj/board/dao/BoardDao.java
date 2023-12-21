package com.phj.board.dao;

import java.sql.Connection;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.sql.DataSource;

public class BoardDao {
	
	DataSource dataSource;
	
	public BoardDao() {
	
		try {
			Context context = new InitialContext();
			context.lookup("java:comp/env/jdbc/oracledb");
		} catch (NamingException e) {
			e.printStackTrace();
		}
		
	}
	
	
		public void write(String bname, String btitle, String bcontent) {
			
			Connection conn = null;
			PreparedStatement pstmt = null;
			
			try {
				stmt = conn.prepareStatement(sql);
				
			}
		}

}
