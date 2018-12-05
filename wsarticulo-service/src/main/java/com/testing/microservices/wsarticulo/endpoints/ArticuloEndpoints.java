package com.testing.microservices.wsarticulo.endpoints;

import org.apache.cxf.Bus;
import javax.xml.ws.Endpoint;
import org.apache.cxf.jaxws.EndpointImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.testing.microservices.wsarticulo.ws.ArticuloWS;

@Configuration
public class ArticuloEndpoints {
	
	@Autowired
    private Bus bus;
	
	@Autowired
	private ArticuloWS articuloWS;
 
    @Bean
    public Endpoint endpoint() {
        EndpointImpl endpoint = new EndpointImpl(bus, articuloWS);
        endpoint.publish("/articuloWS");
        return endpoint;
    }
}
