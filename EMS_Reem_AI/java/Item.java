/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ems_reem;

/**
 *
 * @author reemk
 */
public abstract class Item {


 private long itemID;
        private String itemName;
        private  double price;
        
        protected Item()
            {

            }
        protected Item(long itemID,String itemName,double price)
            {
                this.itemID = itemID;
                this.itemName = itemName;
                this.price = price;
            }
    
        public void setItemID(long itemID)
            {
                this.itemID = itemID;
            }
        public void setItemName(String itemName)
            {
                this.itemName = itemName;
            }
        public void setPrice(double price)
            {
                this.price = price;
            }
    
        public long getItemID()
            {
                return itemID;
            }
        public String getItemName()
            {
                return itemName;
            }
        public double getPrice()
            {
                return price;
            }
   
        public abstract String orderSummary(int quantity);
        public abstract void showItems();
        public abstract boolean searchItems(String itemID);
        public abstract void writeItems(String c1,String c2,String c3,String c4,String c5,String c6);
        public abstract void deleteItems(String itemID);    
        public abstract void findPrice();
    }

