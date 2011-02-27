package com.iterere.dojo.ocr.test;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

import com.iterere.dojo.ocr.service.ReaderOcr;

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
public class ReaderOcrTest {
	@Test
	public void testMethodReader() {
		String[] ocrLines = ReaderOcr.readOcrFromFile();
		assertTrue(ocrLines.length == 3);
	}
}
