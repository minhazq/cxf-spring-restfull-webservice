package com.mq.restfull.services;

import javax.websocket.server.PathParam;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

import org.springframework.stereotype.Service;

@Service
@Path("/prime")
public class ProbablyPrimeService {

	@GET
	@Path("/{number}")
	@Produces("text/plain")
	public boolean isPrime(@PathParam("number") String number){
		return true;
	}
}
