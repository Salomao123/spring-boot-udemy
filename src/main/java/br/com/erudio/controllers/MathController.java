package br.com.erudio.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import br.com.erudio.exception.UnsuportedMathOperationException;
import br.com.erudio.service.MathOperationService;

@RestController
public class MathController {
	
	@Autowired
	private MathOperationService mathOperation;
	
	@RequestMapping(value="/sum/{numberOne}/{numberTwo}", method = RequestMethod.GET)
	public Double sum(@PathVariable("numberTwo") String numberOne, @PathVariable("numberOne") String numberTwo) throws Exception{
		return mathOperation.sum(numberOne, numberTwo);
	}
	
	@RequestMapping(value="/multi/{numberOne}/{numberTwo}", method = RequestMethod.GET)
	public Double multiple(@PathVariable("numberOne") String numberOne,	@PathVariable("numberTwo") String numberTwo) throws Exception{
		return mathOperation.multiplication(numberOne, numberTwo);
	}
	
	@RequestMapping(value="/sub/{numberOne}/{numberTwo}", method = RequestMethod.GET)
	public Double sub(@PathVariable("numberOne") String numberOne, @PathVariable("numberTwo") String numberTwo) throws Exception{
		return mathOperation.subtration(numberOne, numberTwo);
	}
	
	@RequestMapping(value="/div/{numberOne}/{numberTwo}", method = RequestMethod.GET)
	public Double div(@PathVariable("numberOne") String numberOne, @PathVariable("numberTwo") String numberTwo) throws Exception{
		return mathOperation.devide(numberOne, numberTwo);
	}
}
