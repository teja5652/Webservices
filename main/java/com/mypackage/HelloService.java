package com.mypackage;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/hello")
public class HelloService {

	@GET
	@Path("first")
	@Produces(MediaType.APPLICATION_JSON)
	public String sayhello()
	{
		return "hello";
	}
	
	
	@GET
	@Path("second")
	@Produces(("application/json"))
	//@Produces(MediaType.APPLICATION_JSON) // is used to display the data on ui either in json or xml or html , text
	public Employee hello()
	{
		Employee e = new Employee();
		//e.setName("sai");
	//	e.setAge("24");
		return e;
		
	}
	
}
