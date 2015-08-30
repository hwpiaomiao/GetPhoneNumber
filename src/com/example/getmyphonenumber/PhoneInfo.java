package com.example.getmyphonenumber;

import android.R.string;

public class PhoneInfo {
	private String number;
	private String name;

	public PhoneInfo(String name, String number) {
		// TODO Auto-generated constructor stub
		setName(name);
		setNumber(number);
	}

	public String getNumber() {
		return number;
	}

	public void setNumber(String number) {
		this.number = number;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
