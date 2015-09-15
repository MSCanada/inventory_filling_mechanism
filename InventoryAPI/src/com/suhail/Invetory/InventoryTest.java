package com.suhail.Invetory;

import javax.annotation.ManagedBean;
import javax.ejb.EJB;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;

import com.suhail.Inventory.InventoryDBRemote;
@Path("/InsertInventory")
@ManagedBean
public class InventoryTest {
	@EJB InventoryDBRemote IDBR;
	@GET
		public void InsertInventory(@QueryParam("item") String name,@QueryParam("price") int price,@QueryParam("quantity") int quantity){
		
		System.out.println("You have reached");
		IDBR.InsertInventory(name,quantity,price);
		
	}
}
