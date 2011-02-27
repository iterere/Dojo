package com.iterere.dojo.ocr.service;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 * First Dojo @ ITerere - OCR Problem
 * http://dojopuzzles.com/problemas/exibe/ocr-bancario/
 * 
 * @author Filipe N�vola (@FilipeNevola)
 * @author Raoni Teixeira (@raoniteixeira)
 * @author Leandro Paschuini (@LePaschuini)
 * 
 *         02/24/2011
 */
public class ReaderOcr {
	private static final String fileName = "d:/test.txt";

	public static String[] readOcrFromFile() {
		File file = openFile(fileName);

		FileInputStream fis = null;
		try {
			fis = new FileInputStream(file);
		} catch (FileNotFoundException e) {
			System.err.println("File not found." + fileName);
			e.printStackTrace();
		}
		Scanner scanner = new Scanner(fis);
		String[] ocrLines = new String[3];
		for (int i = 0; i < 3; ++i) {
			ocrLines[i] = scanner.nextLine();
		}

		return ocrLines;

	}

	private static File openFile(String fileName) {
		return new File(fileName);
	}

}
