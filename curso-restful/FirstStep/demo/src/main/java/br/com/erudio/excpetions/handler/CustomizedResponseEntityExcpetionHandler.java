package br.com.erudio.excpetions.handler;

import java.util.Date;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import br.com.erudio.excpetions.ExcpetionResponse;
import br.com.erudio.excpetions.UnsuportedMathOperation;

@ControllerAdvice
@RestController
public class CustomizedResponseEntityExcpetionHandler extends ResponseEntityExceptionHandler{
	
	@ExceptionHandler(Exception.class)
	public final ResponseEntity<ExcpetionResponse> handleAllExcpetions(Exception ex, WebRequest request){
		ExcpetionResponse excpetionResponse = new ExcpetionResponse(
				new Date()
				, ex.getMessage()
				,request.getDescription(false));
		return new ResponseEntity<>(excpetionResponse,HttpStatus.INTERNAL_SERVER_ERROR );
	}
	@ExceptionHandler(UnsuportedMathOperation.class)
	public final ResponseEntity<ExcpetionResponse> handleBadReqiestExceptions(Exception ex, WebRequest request){
		ExcpetionResponse excpetionResponse = new ExcpetionResponse(
				new Date()
				, ex.getMessage()
				,request.getDescription(false));
		return new ResponseEntity<>(excpetionResponse,HttpStatus.BAD_REQUEST );
	}

}
