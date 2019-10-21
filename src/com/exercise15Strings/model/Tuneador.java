package com.exercise15Strings.model;

public class Tuneador {
	public static String[] tunea(String[] strs) {
		for (int i=0; i<strs.length;i++) {
			strs[i] = strs[i].trim();
			strs[i] = strs[i].toLowerCase();
			strs[i] = strs[i].replace('a','0');
			strs[i] = strs[i].replace('e','0');
			strs[i] = strs[i].replace('i','0');
			strs[i] = strs[i].replace('u','0');
		}
		return strs;
	}
	public static double mediaVector(int[] miArray) {
		double suma=0;
	for (int i=0; i<miArray.length;i++) {
		suma=suma+miArray[i];
	}
	return suma/miArray.length;
	}

}
