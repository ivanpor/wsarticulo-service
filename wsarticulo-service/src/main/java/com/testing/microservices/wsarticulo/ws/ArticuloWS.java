package com.testing.microservices.wsarticulo.ws;

import javax.jws.WebMethod;
import javax.jws.WebResult;
import javax.jws.WebService;

import com.testing.microservices.wsarticulo.api.Articulo;
import com.testing.microservices.wsarticulo.api.ArticuloRequest;

@WebService(name="articuloWS", targetNamespace="http://microservices.testing.com/wsarticulo")
public interface ArticuloWS {
	

	@WebMethod(operationName="saveArticulo")
	public @WebResult(name="articulo") Articulo saveArticulo(ArticuloRequest articuloRequest);
}
