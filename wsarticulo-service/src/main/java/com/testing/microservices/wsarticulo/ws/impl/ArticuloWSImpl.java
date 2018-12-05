package com.testing.microservices.wsarticulo.ws.impl;

import javax.jws.WebMethod;
import javax.jws.WebResult;
import javax.jws.WebService;

import org.springframework.stereotype.Service;

import com.testing.microservices.wsarticulo.api.Articulo;
import com.testing.microservices.wsarticulo.api.ArticuloRequest;
import com.testing.microservices.wsarticulo.ws.ArticuloWS;

@Service("articuloWS")
@WebService(name="articuloWS", targetNamespace="http://microservices.testing.com/wsarticulo")
public class ArticuloWSImpl implements ArticuloWS {
	
	@WebMethod(operationName="saveArticulo")
	public @WebResult(name="articulo") Articulo saveArticulo(ArticuloRequest articuloRequest) {
		
		return Articulo
				.builder()
				.idArticulo(1L)
				.codigo("Artículo1")
				.descripcion("Artículo 1")
				.build();
	}
}
