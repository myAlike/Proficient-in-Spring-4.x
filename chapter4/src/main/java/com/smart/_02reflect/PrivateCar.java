package com.smart._02reflect;

import org.springframework.core.io.Resource;

public class PrivateCar {
   private String color;
   protected void drive(){
	   System.out.println("drive private car! the color is:"+color);
   }
}
