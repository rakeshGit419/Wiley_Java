package com.springdemo;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class UserDataReader  {
	public static void main(String[] args){
		File file = new File("");
		try {
			Scanner scn = new Scanner(file);
			while(scn.hasNextLine()) {
				System.out.println(scn.nextLine());
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}
}
