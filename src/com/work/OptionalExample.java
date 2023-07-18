package com.work;

import java.util.Optional;

public class OptionalExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	     Optional<String> optionalString = Optional.of("Hello World");
	     
	     System.out.println("optionalString = " + optionalString);
	     
	     System.out.println("getWords:" + getWords());
	     
	     

	}

	private static Optional<String> getWords() 
	{
	  String[] word =new String [10];
	  
	 word[1]= "vikram";
	  
	  Optional<String> optionalS = Optional.ofNullable(word[1]);
	  
	  if (optionalS.isPresent())
          return optionalS;
      else
          return Optional.empty();
		
	}

}
