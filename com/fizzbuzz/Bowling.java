package com.fizzbuzz;

public class Bowling {
	public static void main(String[] args) {
		int throwsPerFrame = 2;
		int frames = 10;
		int pins = 10;
		
		for (int i = 1; i <= frames; i ++){
			System.out.println("Frame " + i);
			for (int t = 1; t <= throwsPerFrame; t ++ );
			
			
			
			int throw1PerFrame = (int)(Math.random()*pins);
			
			if (throw1PerFrame == 10);{				
			System.out.println("X STRIKE X");
			}
			break;
			
			
			int throw2PerFrame = (int) ((int) (pins - throw1PerFrame)*(Math.random()));
			if (throw1PerFrame + throw2PerFrame == 10);
			System.out.println("/ SPARE /");
			
			
		
					
					
			
			
			
		}
	}
}

