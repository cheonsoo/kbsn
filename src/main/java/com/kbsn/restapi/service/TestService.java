package com.kbsn.restapi.service;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

//@ContextConfiguration(locations={"classpath*:spring/application-config.xml"}) // application-config.xml 에서 <context:annotation-config /> 항목을 사용했기 때문에 필요가 없다.
@Path("/test")
public class TestService {
	
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	@Path("{val1}")
	public Response get(@PathParam("val1") String val1) {
		return Response.status(200).entity(new String("test")).build();
	}
}
