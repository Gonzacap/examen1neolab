package edu.neo.vista;

import java.util.ArrayList;
import java.util.List;

import edu.neoris.escribir.EscribirJson;

public class App {

	private final static String PATH = "C:\\PATH";
	private final static String FILE_NAME = "\\ARCHIVO.json";
	
	
	public static void main(String[] args) {
		EscribirJson ej = new EscribirJson(PATH + FILE_NAME);
//		ej.escribirObject(OBJETO);
	}
}


