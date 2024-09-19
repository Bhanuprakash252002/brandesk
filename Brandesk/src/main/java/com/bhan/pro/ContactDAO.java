package com.bhan.pro;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

public class ContactDAO {

	public static int setContactDetails(String name,String mobilenum,String select0,String select1,String select2,String select3,String Note) {
		int success=0;
		try
		{
			Connection con =jdbc.getCon();
			PreparedStatement ps=con.prepareStatement("insert into contactdetails(?,?,?,?,?,?,?,?)");
			ps.setString(1, name);
			ps.setString(2, mobilenum);
			ps.setString(3, select0);
			ps.setString(4, select1);
			ps.setString(5, select2);
			ps.setString(6, select3);
			ps.setString(7, Note);
			
			success=ps.executeUpdate();
			
		}catch(Exception e)
		{
			System.out.println(e);
		}
		return success;
	}

	public static ArrayList<ContactDTO> getlist() {
		ArrayList<ContactDTO> menu = new ArrayList<>();
		try {
			Connection con = jdbc.getCon();
			String query = "select * from restuarant_menu";
			PreparedStatement ps = con.prepareStatement(query);
			ResultSet rs = ps.executeQuery();
			while (rs.next()) {
				ContactDTO bean = new ContactDTO(rs.getInt(1),rs.getString(2),rs.getString(3),rs.getString(4),rs.getString(5),rs.getString(6),rs.getString(7),rs.getString(8))
				menu.add(bean);
			}

		} catch (Exception e) {
			System.out.println(e);
		}
		return menu;
	}
}
