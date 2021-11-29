package com.demoapp;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;

@Path("/message")
public class HelloResouce {
	
	//-----------demo of PathParam------------------/name/address
	@GET
	@Path("pathparam/{name}/{address}")
	@Produces(MediaType.TEXT_PLAIN)
	public String sayHelloPathParam(@PathParam(value = "name")String ename, 
			@PathParam(value="address")String eaddress) {
		return "hello to jax rs using path param "+ ename + " : "+ eaddress;
	}
	
	//-----------demo of QueryParam------------------?name=raj&address=delhi
	
	@GET
	@Path("queryparam")
	@Produces(MediaType.TEXT_PLAIN)
	public String sayHelloQueryParam(@QueryParam(value = "name")String name,
			@QueryParam(value="address")String address) {
		return "hello to jax rs using Query param "+ name + " : "+ address;
	}
	
	
	@GET
	@Produces(MediaType.TEXT_PLAIN)
	public String sayHello() {
		return "hello to jax rs using jersy";
	}
}














