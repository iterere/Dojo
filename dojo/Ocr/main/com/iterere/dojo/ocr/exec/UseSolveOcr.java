package com.iterere.dojo.ocr.exec;

import com.iterere.dojo.ocr.service.ReaderOcr;
import com.iterere.dojo.ocr.service.SolveOcr;

/**
 * First Dojo @ ITerere - OCR Problem
 * http://dojopuzzles.com/problemas/exibe/ocr-bancario/
 * 
 * @author Filipe Névola (@FilipeNevola)
 * @author Raoni Teixeira (@raoniteixeira)
 * @author Leandro Paschuini (@LePaschuini)
 * 
 *         02/24/2011
 */
public class UseSolveOcr {
	public static void main(String... args) {
		System.out.println(SolveOcr.solve(ReaderOcr.readOcrFromFile()));
	}
}
