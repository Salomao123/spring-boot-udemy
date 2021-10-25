package br.com.erudio.utils.impl;

import org.springframework.stereotype.Service;

import br.com.erudio.exception.UnsuportedMathOperationException;
import br.com.erudio.utils.UtilsInterface;

@Service
public class UtilsImpl implements UtilsInterface{

	@Override
	public Double converToDouble(String strNumber) {
		if(strNumber == null) {
			return 0D;
		}
		
		String number = strNumber.replaceAll(",", ".");
		if(!isNumeric(number)) {			
			throw new UnsuportedMathOperationException("Is only accepted a numeric value. Please, define a number.");
		}
		
		return Double.parseDouble(number);
	}

	@Override
	public Boolean isNumeric(String strNumber) {
		if(strNumber == null) {
			return false;
		}
		String number = strNumber.replaceAll(",", ".");
		return number.matches("[-+]?[0-9]*\\.?[0-9]+");
	}

}
