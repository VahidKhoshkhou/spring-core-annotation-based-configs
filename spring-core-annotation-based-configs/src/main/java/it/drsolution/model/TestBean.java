package it.drsolution.model;

public class TestBean {
	private String name;
	private String message;

	
	
	public TestBean(String name, String message) {
		this.name = name ;
		this.message = message;

		System.out.println("a bean has been created");
	}

	public TestBean(String message) {
		this.name = "";
		this.message=message;
	}
	
	public String getName() {
		return name;
		
	}

	public void setName(String name) {
		this.name = name;
	}
	
	
	public void printYourMessage() {
		System.out.println(name+" "+message);
		
	}


}
	