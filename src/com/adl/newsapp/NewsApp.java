package com.adl.newsapp;

import com.adl.newsapp.interfaces.ActionListener;
import com.adl.newsapp.view.Component;
import com.adl.newsapp.view.ComponentAnak;
import com.adl.newsapp.view.ContentComponent;
import com.adl.newsapp.view.FooterComponent;
import com.adl.newsapp.view.Form;
import com.adl.newsapp.view.HeaderComponent;
import com.adl.newsapp.view.InputComponent;

public class NewsApp {
	
	public static void main (String [] args) {
		Form form = new Form();
		
		Component component1 = new Component("txtNama","Nama saya dewabrata");
		Component component2 = new Component("txtNama2","Nama saya dewabrata2");
		Component component3 = new Component("txtNama3","Nama saya test by Name");
		
		HeaderComponent headerComponent = new HeaderComponent();
		headerComponent.setName("header name");
		headerComponent.setLabel("header label");
		
		ContentComponent contentComponent = new ContentComponent();
		contentComponent.setLabel("Content name");
		contentComponent.setLabel("Content label");
		
		InputComponent inputComponent = new InputComponent("txtInput", "Masukan input : ");
		
		FooterComponent footerComponent = new FooterComponent();
		footerComponent.setName("footer name");
		footerComponent.setLabel("footer label");
		
		form.addComponent(headerComponent);
		form.addComponent(contentComponent);
		form.addComponent(footerComponent);
		form.addComponent(inputComponent);
		
		form.showComponents();
	
		inputComponent.setAction(new ActionListener() {

			@Override
			public void onAction(Component component) {
				// TODO Auto-generated method stub
				component.setLabel(inputComponent.getValue());
				form.showComponents();
			}
			
		}, headerComponent);
	}

}
