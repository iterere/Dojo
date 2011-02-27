package com.iterere.dojo.ocr.factory;

import com.iterere.dojo.ocr.bean.PossibleNumbers;

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
public class PossibleNumbersFactory {

	public static PossibleNumbers getInstance() {
		PossibleNumbers pn = new PossibleNumbers();
		return pn;
	}

}
