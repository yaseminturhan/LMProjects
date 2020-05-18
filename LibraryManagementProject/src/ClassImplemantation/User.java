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


public class User extends TakeInformation{
	
	private String name;
	private String surname;
	private String username;
	private String password;
	

	public User(String name, String surname, String username, String password) {
		super();
		this.name = name;
		this.surname = surname;
		this.username = username;
		this.password = password;
		
	}

	public User(int id, String date, String name, String surname, String username, String password) {
		super(id, date);
		this.name = name;
		this.surname = surname;
		this.username = username;
		this.password = password;
		
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	
	@Override
	public String toString() {
		return super.toString() + name + "___" + surname + "___" + username + "___" + password + "___" ;
	}


}