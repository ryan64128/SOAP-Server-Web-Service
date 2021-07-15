package com.example;

import javax.jws.WebService;

@WebService(endpointInterface = "com.example.SOAPMathOps")
public class SOAPMathImpl implements SOAPMathOps {

	public int squareIt(int i) {
		return i*i;
	}

	public int cubeIt(int i) {
		return i*i*i;
	}

}
