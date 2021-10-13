package com.adl.newsapp.view;

import com.adl.newsapp.interfaces.ActionListener;

public class Component {
	
	private String name;
	private String label;
	private Component component;
	private Form form;
	
	public Component() {
		
	}
	
	public Component(String nama, String label) {
		this.name = nama;
		this.label = label;
	}
	
	public void show() {
		System.out.println("=========================");
		System.out.println("Name : " + name);
		System.out.println("Label : " + label);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLabel() {
		return label;
	}

	public void setLabel(String label) {
		this.label = label;
	}

	public void setAction (ActionListener action, Component component){
		action.onAction(component);
	}
	
}
