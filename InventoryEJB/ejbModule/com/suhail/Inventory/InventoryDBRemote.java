package com.suhail.Inventory;

import java.util.List;

import javax.ejb.Remote;

@Remote
public interface InventoryDBRemote {
public List<PurchaseHistory> GetAllInventory();
public void InsertInventory(String name,int quantity,int price);

}
