package com.demoapp;


import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
// http protocol: get put post delete
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;

//@PathParam vs @QueryParam
//	message/pathparam/sumit
@Path("/message")
//message/queryparam?name=ravi&address=delhi
public class HelloResources {

	//Query param
	@Path("/queryparam")
	@GET
	@Produces(MediaType.TEXT_PLAIN)
	public String sayHello3(@QueryParam(value = "ename")String ename,@QueryParam(value = "eAddress")String eAddress  ) {
		return "hello to jersy web service2 using queryparam "+ ename+" : "+ eAddress;
	}
	
	//path param
	
	@Path("/pathparam/{name}/{address}")
	@GET
	@Produces(MediaType.TEXT_PLAIN)
	public String sayHello2(@PathParam("name") String ename, @PathParam("address")String eAddress) {
		return "hello to jersy web service2 using pathparam "+ ename+" : "+ eAddress;
	}
	
	@GET
	@Produces(MediaType.TEXT_PLAIN)
	public String sayHello() {
		return "hello to jersy web service";
	}
	
}
