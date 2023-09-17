package br.com.erudio;


import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import br.com.erudio.excpetions.UnsuportedMathOperation;

@RestController
public class MathController {
	
		
		@RequestMapping( value ="/sum/{numberOne}/{numberTwo}", method=RequestMethod.GET)
		public Double sum(
				@PathVariable(value = "numberOne") String numberOne,
				
			    @PathVariable(value = "numberTwo") String numberTwo,
			String name) throws  Exception{
			
			    if(!isNumeric(numberOne) || !isNumeric(numberTwo)){
			    	throw new UnsuportedMathOperation("Set a numeric value");
			    }
			    return convertToDouble(numberOne) +  convertToDouble(numberTwo) ;
		}
		
		@RequestMapping( value ="/mult/{numberOne}/{numberTwo}", method=RequestMethod.GET)
		public Double mult(
				@PathVariable(value = "numberOne") String numberOne,
				
			    @PathVariable(value = "numberTwo") String numberTwo,
			String name) throws  Exception{
			
			    if(!isNumeric(numberOne) || !isNumeric(numberTwo)){
			    	throw new UnsuportedMathOperation("Set a numeric value");
			    }
			    return convertToDouble(numberOne) *  convertToDouble(numberTwo) ;
		}

		private Double convertToDouble(String strNumber) {
			if(strNumber == null) return 0D;
			String number = strNumber.replaceAll(",", ".");
			
	        return Double.parseDouble(number);
			
		}

		private boolean isNumeric(String strNumber) {
			if(strNumber == null) return false;
			String number = strNumber.replaceAll(",", ".");
			
			return number.matches("[-+]?[0-9]*\\.?[0-9]+");
		}

}
