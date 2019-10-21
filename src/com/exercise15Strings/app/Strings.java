package com.exercise15Strings.app;
import java.lang.*;

import com.exercise15Strings.model.Tuneador;

public class Strings {

	public static void main(String[] Cyan) {
/*Recibe parametros o parametros por eso el String[] args*/
/*Todas las clases se puden instanciar tengan el main o no juejuejue*/
//VARIBLES-------------------------------------------------------------------------------------------------------
		String str = "Strign cualquiera, realmente no impora lo que diga";
		String str2 = "Strign cualquiere, realmente no impora lo que diga";
		StringBuffer bf= new StringBuffer("A n n A");
		StringBuffer RV;
//ADD QUE PUEDE TENER UN STRING----------------------------------------------------------------------------------		
		System.out.println(str.charAt(3));
		System.out.println(str.codePointAt(1));
		System.out.println(str.codePointBefore(3));
		System.out.println(str.codePointCount(0,4));
		System.out.println(str.compareTo(str2));
		System.out.println(str.equals(str2));
		System.out.println(str.concat(str2));
		System.out.println(str.contains(str2));
		System.out.println(str.concat("importa"));
		System.out.println(String.valueOf(21));
		System.out.println(str.endsWith("diga"));
		System.out.println(str.trim()+str.trim());
		System.out.println(str.indexOf('g'));//non greedy
		System.out.println(str.lastIndexOf('g'));//greedy
		System.out.println(str.length());
		String[]str3=str.split(",");
		/*for(String c:str2) {
			System.out.println(c);
		}*/
		for (int i=0; i<str3.length;i++) {
			System.out.println(str3[i]);
		}
		String str4="";
		str4 = str.replace('H', 'D');
		System.out.println(str4);
		System.out.println(str4.toLowerCase());
		System.out.println(str4.toUpperCase());
		
//Algorithm, like.... no buffer----------------------------------------------------------------------------------
		String reversed="";
		for (int i=str.length()-1;i>=0;i--) {
			reversed=reversed+str.charAt(i);
		}
		
//Reverse and stuff----------------------------------------------------------------------------------------------
		System.out.println("\nOriginal: "+bf);
		RV= bf.reverse();
		System.out.println("Reverse String: "+RV+"   -Cyan.");
		System.out.println(RV.equals(bf));
		
		String[] misCadenas= {str,str2,str4};
		String[] misNuevasCadenas= Tuneador.tunea(misCadenas);
		for (int i=0; i<misCadenas.length;i++) {
			
			System.out.println(misNuevasCadenas[i]);
			
		}
//Vectores de numeros-------------------------------------------------------------------------------------------
		int[] misEnteros = {15, 5, 8, 9};
		System.out.println("la media es: "+Tuneador.mediaVector(misEnteros));
	}
	
}
