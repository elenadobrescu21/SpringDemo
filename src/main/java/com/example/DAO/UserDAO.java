package com.example.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.stereotype.Repository;

import com.example.Entity.*;


@Repository
public class UserDAO {
	
	private static ArrayList<User> users;
	private DataSource dataSource;
	
	 static {

	      users  = new ArrayList<User>();
	      users.add(new User(1, "Dobrescu Elena", "abcd"));
	      users.add(new User(2, "Udrea Marius", "blabla"));
	    }

	public static ArrayList<User> getUsers() {
		return users;
	}

	public static void setUsers(ArrayList<User> users) {
		UserDAO.users = users;
	}
	
	 public void removeUuser(int id) {
		 users.remove(id);
	 }
	 
	 public User getUser(int id) {
		return users.get(id); 
	 }
	 
	 public void insertUser(User user) {
		 users.add(user);
	 }
	 
	 public void setDataSource(DataSource dataSource) {
			this.dataSource = dataSource;
		}
	 
	 public void insert(User user){

			String sql = "INSERT INTO users " +
					"(id, name, password) VALUES (?, ?, ?)";
			Connection conn = null;

			try {
				conn = dataSource.getConnection();
				PreparedStatement ps = conn.prepareStatement(sql);
				ps.setInt(1, user.getId());
				ps.setString(2, user.getUsername());
				ps.setString(3, user.getPassword());
				ps.executeUpdate();
				ps.close();

			} catch (SQLException e) {
				throw new RuntimeException(e);

			} finally {
				if (conn != null) {
					try {
						conn.close();
					} catch (SQLException e) {}
				}
			}
		}

}
