package com.rohit.oops;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class TestClass {
	
	
	  void m() throws IOException{  
		  /*
		   * 
		   * 
		   * 
		   * 
		   * 
		   */
		  }  
	  void n() throws IOException{  
			m();
	  }  

	
	public static void main(String arg[]){
	      File file = new File("E://file.txt");
	      try {
			FileReader fr = new FileReader(file);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
	}

}
