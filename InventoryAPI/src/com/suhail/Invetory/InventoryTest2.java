package com.suhail.Invetory;



import java.util.Arrays;
import java.util.List;

import javax.annotation.ManagedBean;
import javax.ejb.EJB;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.google.gson.Gson;
import com.suhail.Inventory.InventoryDBRemote;
import com.suhail.Inventory.PurchaseHistory;
@Path("/GetInventory")
@ManagedBean
public class InventoryTest2 {
	@EJB InventoryDBRemote IDBR;
	@GET
	@Produces(MediaType.APPLICATION_JSON)

	public String GetInventory(){
		
		System.out.println("You have reached");
	List<PurchaseHistory> inv=IDBR.GetAllInventory();
	Gson gs=new Gson();
	String jsonCartList = gs.toJson(inv);
		return jsonCartList;
	}
}
