package com.mq.restfull.services;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;

@Produces({"application/xml", "application/json"})
public interface ProductService {

	
	public void addProduct(@PathParam("product_id") Product product_id);
	
	@GET
	@Path("/product/{product_id}/")
	public Product getProduct(@PathParam("product_id") String prod_id);
}
