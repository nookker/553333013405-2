package com.lab1.kagawa;

public class Kagawa {

	private String name;
	private String position;
	private String  friend[];




	public Kagawa () {
		name = "Shinji Kagawa";
		position = "RB";
		friend  = new String[] {"David De Gea", "Adnan Januzaj", "Juan Mata", "Luis Nani"};


		System.out.println("Shinji Kagawa");
	}

	public Kagawa (int i) {
		System.out.println("Shinji Kagawa 1");
	}


	public  String getname() {

		return name ;
	}
	public  String getposition() {

		return position ;
	}

	public  String[] getfriend() {

		return friend ;
	}
}


