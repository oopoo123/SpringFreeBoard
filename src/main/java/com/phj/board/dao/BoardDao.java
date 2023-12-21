package com.phj.board.dao;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.sql.DataSource;

public class BoardDao {
	
	DataSource dataSource;
	
	public BoardDao() {
		
		Context context = new InitialContext();
		context.lookup("java:comp/env/jdbc/oracledb");
	} catch (NamingException)


	public void write(String bname, String btitle, String bcontent) {
		
		
	}

}
