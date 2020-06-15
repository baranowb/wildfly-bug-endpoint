package com.test.wildfly.endpoint.services;

import com.test.wildfly.endpoint.model.TestResponse;
import java.util.concurrent.ThreadLocalRandom;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import org.apache.commons.lang3.RandomStringUtils;

@Path("/api")
public class EndpointService {

  @GET
  @Path("/ping")
  @Produces(MediaType.APPLICATION_JSON)
  public TestResponse ping() {
    final long id = ThreadLocalRandom.current().nextInt(1, 100);
    final String content = RandomStringUtils.randomAlphabetic(10);
    return new TestResponse(id, content);
  }
}
