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


public class TakeInformation {
	
	private int id;
	private String date;
	
	public TakeInformation() {
	}

	public TakeInformation(int id, String date) {
		this.id = id;
		this.date = date;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	@Override
	public String toString() {
		return  id + "___" + date.replaceAll("\\s+", "-") + "___";
	}
	

}