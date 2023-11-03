package service;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;

@WebService
public class CalculatriceWS {
	@WebMethod
	public double somme (@WebParam double a,@WebParam double b)
	{
		return a+b;
	}
}