package com.mypackage;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;

@Path("/employee")
public class EmployeeService {
	
	@GET
	@Path("{sai}")
	//@Produces("application/json")
	public Employee getDetails(@PathParam("sai") int id )
	{
		EmployeeDao dao = new EmployeeDao();
		Employee e = dao.Connection(id);
		return e;
}
/*
 * @GET
 * 
 * @Path("{sai}/{teja}")
 * 
 * @Produces("application/json") public Object
 * getMultipleDetails(@PathParam("sai") int id , @PathParam("teja") String
 * ename) { EmployeeDao dao = new EmployeeDao(); Employee e =
 * dao.CheckConnection(id , ename); if(e != null) { return e ; } NotFound n1 =
 * new NotFound(); n1.setNo(200); n1.setErrormessage("not found"); return n1; }
 */
	
	@GET
	@Produces({"application/json","application/xml"})
	public Object Bottle(@QueryParam("id") int id , @QueryParam("name") String name)
	{
		EmployeeDao dao = new EmployeeDao();
		Employee e = dao.CheckConnection(id , name);
		if(e != null)
		{
		return e ;
		}
		NotFound n1 = new NotFound();
		n1.setNo(200);
		n1.setErrormessage("not found");
		return n1;
}
	
/*
 * @POST
 * 
 * @Consumes("application/json") public Object insert(Employee e) { if(e !=
 * null) { EmployeeDao ed= new EmployeeDao(); ed.Insertdata(e); Success s = new
 * Success(); s.setMessage("Data Inserted Sucessfully"); //return s; } NotFound
 * n1 = new NotFound(); n1.setNo(500);
 * n1.setErrormessage(" data could not be Inserted"); return n1 ; }
 */
	@POST
	@Consumes("application/json")
	public Object create(Employee e1)
	{
		EmployeeDao ed= new EmployeeDao();
		 Employee e = ed.Insertdata(e1);	
		 if(e != null)
		{
			 Success s = new Success(); 
				s.setMessage("Data Inserted Sucessfully"); 
		return s;
		}
			
		 NotFound n1 = new NotFound();
			n1.setNo(200);
			n1.setErrormessage("DATA NOT INSTERTED");
			return n1;
	}
	
}