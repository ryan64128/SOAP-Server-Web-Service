package com.example;

import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.soap.SOAPBinding;
import javax.jws.soap.SOAPBinding.Style;

@WebService
@SOAPBinding(style = Style.DOCUMENT)
public interface SOAPMathOps {
	@WebMethod int squareIt(int i);
	@WebMethod int cubeIt(int i);
}
