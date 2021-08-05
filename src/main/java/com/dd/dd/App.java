package com.dd.dd;

import org.springframework.beans.factory.annotation.Autowired;

public class App {
	
	
	 //@Autowired
	private demo d=new demo();	
	

	public void App1(int x,String y) 
		{
		  
		   d.setId(x);
		   d.setName(y);
		   System.out.println(d);
		  
		}
	
	 public static void main(String[] args) {

		   
		   App p=new App();
		   p.App1(5,"Hi");
		     
	  }
	
	
 
}

