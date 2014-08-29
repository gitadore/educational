package com.kaiserandi;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String verb = "";
		boolean beenden;
		try {
			do{
				System.out.println("Bitte ein Verb eingeben oder mit <Enter> beenden: ");
				verb = br.readLine();
				beenden = verb.equals("");
				if(!beenden){
					Regelwerk regelwerk = new Regelwerk(verb);
					System.out.println(regelwerk.getInfinitiv());
				}
			} while (!beenden);
			System.exit(0);
		} catch (IOException e) {
			e.printStackTrace();
			System.exit(1);
		}
	}

}
