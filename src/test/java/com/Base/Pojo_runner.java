package com.Base;

import com.Base_concept.Pojo_class;

public class Pojo_runner {
  
	public static void main (String[] args) {
		Pojo_class p = new Pojo_class();
		System.out.println(p.getA());
		System.out.println(p.setA(30));
		System.out.println(p.getA());
	}
}
