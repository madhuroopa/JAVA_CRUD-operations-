package com.bvrit.addressbook.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.bvrit.addressbook.beans.ContactBean;


public class ContactDAO{
	  // declaring connection statement ConnectionDAO
	  Connection conn;
	  PreparedStatement st;
	  ConnectionDAO cd;
	  // default constructor
	  public ContactDAO () 
			  throws ClassNotFoundException{
		  cd = new ConnectionDAO();
		  conn = cd.getConnection();
	  }
	  // addContact() method
	  public int addContact(ContactBean cbean)
			  throws SQLException{
		  	int result = 0;
			String query = 
					"insert into contacts values(?,?,?,?,?)";
			 st = conn.prepareStatement(query);
			 st.setString(1, cbean.getId());
			 st.setString(2, cbean.getName());
			 st.setString(3, cbean.getEmail());
			 st.setString(4, cbean.getPhno());
			 st.setString(5, cbean.getUser());
		     result = st.executeUpdate();
			 return result;
		}
	  
	  // listContacts() method
	  public List<ContactBean> listContacts(String user) 
			  throws SQLException{
		  String query = "SELECT * from contacts where user = '"+user+"'"; 
			List<ContactBean> cbeanList = new ArrayList<ContactBean>();
			st = conn.prepareStatement(query);
			ResultSet rs = st.executeQuery(query);    		   		   		
	   		ContactBean bean;
	   		while(rs.next()) {
	   			String contactId = rs.getString("contactid");
	   			String name = rs.getString("name");
	   			String email = rs.getString("email");
	   			String phno = rs.getString("phno");
	   			bean = new ContactBean(contactId, name, email, phno, user);
	   			cbeanList.add(bean);
	   		}
	   		return cbeanList;
		}
	    
	  //delete() method
		public int delete(String id) 
				throws SQLException {
			int result = 0;
			String query = "delete from contacts where contactid='"+id+"'";
			st = conn.prepareStatement(query);
			result = st.executeUpdate();
		    return result;	
		}
		
		// update() method
		public int update(ContactBean cbean) 
				throws SQLException {
			int result = 0;
			String id = cbean.getId();
		    String name = cbean.getName();
		    String email = cbean.getEmail();
		    String phno = cbean.getPhno();
			String query = "update contacts set name ='"+name+"',email='"+email+"',phno='"+phno+"'where contactid='"+id+"'";
			Statement st = conn.createStatement();
		     result = st.executeUpdate(query);
	         return result;
		}
}