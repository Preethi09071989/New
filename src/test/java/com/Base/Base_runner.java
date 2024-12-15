package com.Base;

import java.io.IOException;

import com.Base_concept.Base_class;

public class Base_runner extends Base_class {

	public static void main(String[] args) throws IOException, InterruptedException {
		browserlaunch();
		url("https://www.facebook.com/");
		sleep(2000);
		
		screenshot("fb.png");
		
		close();
		 
	    browserlaunch();
		url("https://www.instagram.com/");
		sleep(2000);
		screenshot("insta.png");
		close();
			
	}
}
