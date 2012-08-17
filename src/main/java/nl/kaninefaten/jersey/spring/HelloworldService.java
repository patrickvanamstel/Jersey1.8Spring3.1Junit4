package nl.kaninefaten.jersey.spring;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.core.Response;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@Path("/bean/wiresample")
public class HelloworldService {

	@Autowired
	@Qualifier(value = "SpringSampleBeanImpl")
	private SpringSampleBean springSampleBean;

	@GET
	@Path("/hello")
	public Response hello() {
		return Response
				.status(Response.Status.OK.getStatusCode())
				.entity("HelloworldService"
						+ springSampleBean.getClass().getName()).build();
	}

}
