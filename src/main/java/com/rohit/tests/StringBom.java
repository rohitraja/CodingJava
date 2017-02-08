package com.rohit.tests;

public class StringBom {
	public  static String getNonBombString(String bomString){
		String bomFreeString="";
		if(bomString!=null){
			int stringLength = bomString.length();
			int iterator =0;
			
			while(iterator<stringLength-1){
				if(bomString.charAt(iterator)== bomString.charAt(iterator+1)){
					while(iterator<stringLength-1 && bomString.charAt(iterator)== bomString.charAt(iterator+1)){
						iterator++;
					}
				}else{
					
					bomFreeString=bomFreeString+bomString.charAt(iterator);
				}
				iterator++;
				if(iterator==stringLength-1)
					bomFreeString=bomFreeString+bomString.charAt(iterator);
			}
			
		}
		
		
		return bomFreeString;
	}
	public static void main(String arg[]){
		
		System.out.println(getNonBombString("bbbbbbcalooooooonrrrrrrrrrdddddddg"));
		
	}

}
