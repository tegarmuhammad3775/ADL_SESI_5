package com.adl.newsapp.view;

public class HeaderComponent extends Component {

	public HeaderComponent() {
		super();
	}

	public HeaderComponent(String nama, String label) {
		super(nama, label);
	}

	@Override
	public void show() {
		// TODO Auto-generated method stub
		String header = "======================== \n" + "|  header              | \n" + "|                      | \n"
				+ "|  " + this.getLabel() + " | \n" + "|                      | \n" + "|                      | \n"
				+ "======================== ";
		System.out.println(header);
	}


}
