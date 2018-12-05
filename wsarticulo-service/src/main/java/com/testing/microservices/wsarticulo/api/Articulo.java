package com.testing.microservices.wsarticulo.api;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@Data
@NoArgsConstructor
@AllArgsConstructor
@XmlRootElement(name = "articulo", namespace="http://microservices.testing.com/wsarticulo")
@XmlAccessorType(XmlAccessType.FIELD) 
public class Articulo implements Serializable{

	private static final long serialVersionUID = -6041932683921516865L;
	
	@XmlElement
	private Long idArticulo;
	
	@XmlElement
	private String codigo;
	
	@XmlElement
	private String descripcion;
	
}
