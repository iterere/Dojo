package com.iterere.dojo.ocr.test;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.junit.Test;

import com.iterere.dojo.ocr.bean.PossibleNumbers;
import com.iterere.dojo.ocr.factory.PossibleNumbersFactory;
import com.iterere.dojo.ocr.service.ReaderOcr;
import com.iterere.dojo.ocr.service.SolveOcr;

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
public class SolveOcrTest {
	@Test
	public void testSolve() {
		String[] ocrLines = ReaderOcr.readOcrFromFile();
		Integer res = SolveOcr.solve(ocrLines);
		assertTrue(res == 490067715);
	}

	@Test
	public void testDivideNinePeacesNull() {
		String[] ocrLines = ReaderOcr.readOcrFromFile();
		String[] peaces = SolveOcr.divideNinePeaces(ocrLines[0]);
		assertNotNull(peaces);
	}

	@Test
	public void testDivideNinePeacesSize() {
		String[] ocrLines = ReaderOcr.readOcrFromFile();
		String[] peaces = SolveOcr.divideNinePeaces(ocrLines[0]);

		assertTrue(peaces.length == 9);

	}

	@Test
	public void testDivideNinePeaces() {
		String[] ocrLines = ReaderOcr.readOcrFromFile();
		String[] peaces = SolveOcr.divideNinePeaces(ocrLines[0]);
		for (String s : peaces) {
			assertTrue(s.length() == 3);
		}
	}

	@Test
	public void testCutMethodWithOneUnderlineOnTheFirstLine() {
		PossibleNumbers pn = PossibleNumbersFactory.getInstance();
		SolveOcr.cut(pn, " _ ", 1);
		assertMatchNumbers(createList(0, 2, 3, 5, 6, 7, 8, 9),
				pn.getListNumbers());
	}

	@Test
	public void testCutMethodWithThreeSpacesOnTheFirstLine() {
		PossibleNumbers pn = PossibleNumbersFactory.getInstance();
		SolveOcr.cut(pn, "   ", 1);
		assertMatchNumbers(createList(1, 4), pn.getListNumbers());
	}

	@Test
	public void testCutMethodWithTwoSpacesAndPipeOnTheSecondLine() {
		PossibleNumbers pn = PossibleNumbersFactory.getInstance();
		SolveOcr.cut(pn, "  |", 2);
		assertMatchNumbers(createList(1, 7), pn.getListNumbers());
	}

	@Test
	public void testCutMethodWithOneSpaceUndelineAndPipeOnTheSecondLine() {
		PossibleNumbers pn = PossibleNumbersFactory.getInstance();
		SolveOcr.cut(pn, " _|", 2);
		assertMatchNumbers(createList(2, 3), pn.getListNumbers());
	}

	@Test
	public void testCutMethodWithPipeUndelineAndPipeOnTheSecondLine() {
		PossibleNumbers pn = PossibleNumbersFactory.getInstance();
		SolveOcr.cut(pn, "|_|", 2);
		assertMatchNumbers(createList(4, 8, 9), pn.getListNumbers());
	}

	@Test
	public void testCutMethodWithPipeUndelineAndOneSpaceOnTheSecondLine() {
		PossibleNumbers pn = PossibleNumbersFactory.getInstance();
		SolveOcr.cut(pn, "|_ ", 2);
		assertMatchNumbers(createList(5, 6), pn.getListNumbers());
	}

	@Test
	public void testCutMethodWithTwoSpacesAndPipeOnTheThirdLine() {
		PossibleNumbers pn = PossibleNumbersFactory.getInstance();
		SolveOcr.cut(pn, "  |", 3);
		assertMatchNumbers(createList(1, 4, 7), pn.getListNumbers());
	}

	@Test
	public void testCutMethodWithOneSpacesUndelineAndPipeOnTheThirdLine() {
		PossibleNumbers pn = PossibleNumbersFactory.getInstance();
		SolveOcr.cut(pn, " _|", 3);
		assertMatchNumbers(createList(3, 5, 9), pn.getListNumbers());
	}

	@Test
	public void testCutMethodWithPipeUndelineAndPipeOnTheThirdLine() {
		PossibleNumbers pn = PossibleNumbersFactory.getInstance();
		SolveOcr.cut(pn, "|_|", 3);
		assertMatchNumbers(createList(0, 6, 8), pn.getListNumbers());
	}

	@Test
	public void testCutMethodWithPipeUndelineAndOneSpaceOnTheThirdLine() {
		PossibleNumbers pn = PossibleNumbersFactory.getInstance();
		SolveOcr.cut(pn, "|_ ", 3);
		assertMatchNumbers(createList(2), pn.getListNumbers());
	}

	private List<Integer> createList(Integer... integers) {
		List<Integer> list = Arrays.asList(integers);
		Collections.sort(list);
		return list;
	}

	private void assertMatchNumbers(List<Integer> exp, List<Integer> res) {
		assertTrue(exp.size() == res.size());
		for (int i = 0; i < exp.size(); i++) {
			assertTrue(exp.get(i) == res.get(i));
		}

	}

}
