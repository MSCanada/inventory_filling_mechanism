package com.suhail.Inventory;

import java.util.List;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 * Session Bean implementation class InventoryDB
 */
@Stateless
@LocalBean
public class InventoryDB implements InventoryDBRemote {
@PersistenceContext(name="InventoryEJB") EntityManager em;
    /**
     * Default constructor. 
     */
    public InventoryDB() {
        
    	
    }

	@Override
	public List<PurchaseHistory> GetAllInventory() {
		System.out.println("Reached in Purchase");
		List<PurchaseHistory> in=em.createNativeQuery("select * from purchase_history").getResultList();
		System.out.println(in.size());
		return in;
		
	}

	@Override
	public void InsertInventory(String name,int quantity,int price) {
		PurchaseHistory inv=new PurchaseHistory();
		inv.setNameItem(name);
		inv.setQuantity(quantity);
		inv.setTotalCost(price*quantity);
		em.persist(inv);
	}

}
