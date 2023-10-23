package com.main;

import com.bean.Academy;
import com.bean.Corso;

public class MainApplication {

	public static void main(String[] args) {
		
		
		/*
		 * UNA DELLE DUE MODALITA' 
		 * UTILI AD INIZIALIZZARE
		 * UN ARRAY
		 */
		int arrayInt [] = new int [3];
		
		arrayInt[0] = 89;
		arrayInt[1] = 22;
		arrayInt[2] = 89;
		
		for (int i=0; i< arrayInt.length; i++) {
			
			   System.out.println("Contenuto arrayInt " + arrayInt[i]);
			
		}
		
		
		/*
		 * SECONDA MODALITA' UTILE PER
		 * INIZIALIZZARE UN ARRAY
		 */
		int arrayNew [] = {98,76,57};
		
		
		for (int i=0; i< arrayNew.length; i++) {
			
			   System.out.println("Contenuto arrayNew " + arrayNew[i]);
			
		}
		
		/*
		 * ARRAY DI REFERENCE AD OGGETTI
		 */
		Corso corsi [] = new Corso[3];
		corsi[0]= new Corso("1028X","Java SE","Roma");
		corsi[1] = new Corso("1028Y","Java EE","Milano");
		corsi[2] = new Corso("1024H","Spring","Napoli");
		
		for (Corso corso : corsi) {
			
			System.out.println("Contenuto corsi " + corso.toString());
			
		}
		
		/*
		 * Il Polimorfismo ci consente di inizializzare un
		 * Array di reference dello stesso tipo (Object)
		 * che potranno poi assumere forme di Oggetti Differenti
		 * in quanto tutti gli Oggetti sono figli di Object
		 */
		Object arrayCA [] = new Object[2];
		arrayCA[0] = new Corso("1076G","Angular","Roma");
		arrayCA[1] = new Academy("1067K","Microservizi","Formatemp","Milano");
		
		for (Object object : arrayCA) {
			
			System.out.println(object.toString());
		}
		
		
		

	}

}
