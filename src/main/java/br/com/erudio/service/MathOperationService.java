package br.com.erudio.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.erudio.interfaces.MathInterface;
import br.com.erudio.utils.impl.UtilsImpl;

@Service
public class MathOperationService implements MathInterface{
	
	@Autowired
	private UtilsImpl utils;

	@Override
	public Double sum(String numberOne, String numberTwo) {
		return utils.converToDouble(numberOne) + utils.converToDouble(numberTwo);
	}

	@Override
	public Double subtration(String numberOne, String numberTwo) {
		return utils.converToDouble(numberOne) - utils.converToDouble(numberTwo);
	}

	@Override
	public Double multiplication(String numberOne, String numberTwo) {
		return utils.converToDouble(numberOne) * utils.converToDouble(numberTwo);
	}

	@Override
	public Double devide(String numberOne, String numberTwo) {
		return utils.converToDouble(numberOne) / utils.converToDouble(numberTwo);
	}
}
