package com.bhan.pro;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

public class LoginDAO {
	public static ArrayList<LoginDTO> getlist() {
		ArrayList<LoginDTO> log = new ArrayList<>();
		try {
			Connection con = jdbc.getCon();
			String query = "select * from userlogin";
			PreparedStatement ps = con.prepareStatement(query);
			ResultSet rs = ps.executeQuery();
			while (rs.next()) {
				LoginDTO bean=new LoginDTO(rs.getString(1),rs.getString(2));
				log.add(bean);
			}

		} catch (Exception e) {
			System.out.println(e);
		}
		return log;
	}

}
