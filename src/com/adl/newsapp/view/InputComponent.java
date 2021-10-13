package com.adl.newsapp.view;

import java.util.Scanner;

public class InputComponent extends Component {
	
	private String value = "";
	private Scanner sc = new Scanner(System.in);
	
	public InputComponent() {
		super();
	}
	
	public InputComponent(String nama, String label) {
		super(nama, label);
	}
	
	
	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}

	@Override
	public void show() {
		// TODO Auto-generated method stub
	
		System.out.print(this.getLabel());
		this.value = sc.next();
		
		System.out.println("Input : "+this.value);
	}
}
