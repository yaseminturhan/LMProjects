/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ClassImplemantation;

/**
 *
 * @author yaseminturhan
 */


import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Random;

import Interface.interfaces;
import ClassImplemantation.User;
import ClassImplemantation.Global;

public class UserImp extends FileProcess implements interfaces<User>{
	
	private static final String FILE_NAME= "user.txt";

	@Override
	public void save(User user, String tempId) {
		user.setId(Integer.parseInt(tempId));
		user.setDate(new Date().toString());
		super.writeFile(FILE_NAME, user.toString());
	}

	@Override
	public void save(User t) {

	}

	@Override
	public void update(String id, User t) {
		String temp =id;
		delete(id);
		this.save(t,temp);
	}

	@Override
	public void delete(String id) {
		super.deleteLine(FILE_NAME, id);
		
	}

	@Override
	public List<User> getAll() {
		ArrayList<User> users = new ArrayList<>();
		for(String line : super.readLines(FILE_NAME)) {
			String[] attr = line.split("___");
			
			User user = new User(
					Integer.valueOf(attr[0]),
					attr[1],
					attr[2],
					attr[3],
					attr[4],
                                        attr[5]
					
			);
			users.add(user);
		}
		return users;
	}

	public ArrayList<ArrayList<String>> getAllForTable() {
		ArrayList<ArrayList<String>> datas = new ArrayList<>();
		for(User user : this.getAll()) {
			ArrayList<String> data = new ArrayList<>();
			data.add(String.valueOf(user.getId()));
			data.add(user.getDate());
			data.add(user.getName());
			data.add(user.getSurname());
			data.add(user.getUsername());
			data.add(user.getPassword());
			datas.add(data);
		}
		return datas;
	}

	public ArrayList<String> getColumnsForTable() {
		ArrayList<String> columns = new ArrayList<>();
		columns.add("Id");
		columns.add("Date");
		columns.add("Name");
		columns.add("Surname");
		columns.add("Username");
		columns.add("Password");
		
		return columns;
	}
	
	public boolean login(String userName, String password) {
		ArrayList<String> users = super.readLines(FILE_NAME);
		for(String line : users) {
			String[] attr = line.split("___");
			if(attr[4].equals(userName) && attr[5].equals(password)) {
				User user = new User(Integer.parseInt(attr[0]), attr[1], attr[2], attr[3], 
						attr[4], attr[5]);
				Global.user = user;
				return true;
			}
		}
		return false;
	}
	


	

}