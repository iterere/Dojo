package com.iterere.dojo.ocr.bean;

import java.util.LinkedList;
import java.util.List;

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
public class PossibleNumbers {
	List<Integer> listNumbers;

	public PossibleNumbers() {
		listNumbers = new LinkedList<Integer>();
		for (int i = 0; i <= 9; i++)
			listNumbers.add(Integer.valueOf(i));

	}

	public List<Integer> getListNumbers() {
		return listNumbers;
	}

	public void removeNumber(Integer value) {
		listNumbers.remove(value);

	}

	public void removeNumbers(Integer... values) {
		for (Integer i : values) {
			removeNumber(i);
		}
	}

	public Boolean check() {
		return listNumbers.size() == 1;
	}

	public Boolean removeNumberAndCheck(Integer value) {
		removeNumber(value);
		return check();
	}
}
