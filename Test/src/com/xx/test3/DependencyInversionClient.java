package com.xx.test3;

public class DependencyInversionClient {
	public static void main(String[] args){
		Mother mother = new Mother();
		mother.narrate(new Book());
		mother.narrate(new Newspaper());

	}
}
