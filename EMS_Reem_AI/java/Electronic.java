/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author reemk
 */
public class Electronic extends Item   {
    
    
    Electronic(){
        
    }
     private String brand;
    private String model;
    private int year;
    
    
        public void setBrand(String brand)
            {
                this.brand = brand;
            }
        public void setModel(String model)
            {
                this.model = model;
            }
        public void setYear(int year)
            {
                this.year = year;
            }
    
        public String getBrand()
            {
                return brand;
            }
        public String getModel()
            {
                return model;
            }
        public int getYear()
            {
                return year;
            }
    
    
         @Override
       public String orderSummary(int quantity)
       {
        return "Purchased Items: "+super.getItemID()+
                ",\n QTY= "+quantity+",\n Price= "+
                (quantity*super.getPrice());
           
        } 

    
    public void showItems(){
        try {
                File file= new File("/Users/reemk/Downloads/Electronics.txt");
                Scanner input = new Scanner(file);
                input.useDelimiter(",");
                String itemID,itemName,color,department,size,price;
                System.out.println("Electronics File:  ");
                while (input.hasNext())
                    {
                        itemID = input.next();
                        itemName = input.next();
                        color = input.next();
                        department = input.next();
                        size = input.next();
                        price = input.next();
                        System.out.println(itemID + "," + itemName + "," + color + "," + department + "," + size + "," + price);
                    }
                input.close();
            }
        catch(FileNotFoundException ex)
            {
                System.out.println("This File Dose Not Exist!..");
            }
        catch (InputMismatchException ex) 
            {
                System.out.println(ex);
            }
        catch (Exception ex) 
            {
                System.out.println(ex);
            }
    }
    
    
     public  void writeItems(String St1,String St2,String St3
             ,String St4,String St5,String St6){
                try
                    {
                        FileWriter  file = new FileWriter ("/Users/reemk/Downloads/Electronics.txt",true);
                        PrintWriter output = new PrintWriter(file);
                        output.println();
                        output.print(St1+",");
                        output.print(St2+",");
                        output.print(St3+",");
                        output.print(St4+",");
                        output.print(St5+",");
                        output.print(St6+",");

                        output.close();
                    }
                catch(FileNotFoundException ex)
                    {
                        System.out.println("This File Dose Not Exist!");
                    }
                catch (Exception ex) 
                    {
                        System.out.println(ex);
                    }   
            }
     
    public boolean searchItems(String itemID)
        {
            File file;
            String item;
            boolean flag = false;
            try
                {
                    file = new File("/Users/reemk/Downloads/Electronics.txt");
                    Scanner input = new Scanner(file);
                    input.useDelimiter(","); 
                    while (input.hasNext())
                        {
                            item = input.next();
                            
                            
                            if(item.equals(itemID))
                                {
                                    flag = true;
                                    break;
                                } 
                            input.nextLine();
                        }
                    input.close();
                }
            catch(FileNotFoundException ex)
                {
                    System.out.println("This File Dose Not Exist!");
                }
            catch (InputMismatchException ex) 
                {
                    System.out.println(ex);
                }
            catch (Exception ex) 
                {
                    System.out.println(ex);
                }
            return flag;   
        }
    
    
         public void deleteItems(String itemID)
        {   
            try
                {
                    File fileR = new File ("/Users/reemk/Downloads/Electronics.txt");
                    Scanner input = new Scanner(fileR);
                       
                    FileWriter fileW = new FileWriter("Electronics.txt",true);
                    PrintWriter output = new PrintWriter(fileW);
                      
                    ArrayList<String> items = new ArrayList<String>();
                      
                    while (input.hasNext()) 
                        {
                            String item = input.nextLine();
                            items.add(item);
                        }
                    input.close();
                       
                    for(int i = 0; i<items.size();i++)
                        {
                            if(items.get(i).matches(itemID+".*"))
                                {
                                    items.remove(i);
                                    break;
                                }    
                        }
                    
                    new FileWriter("/Users/reemk/Downloads/Electronics.txt", false).close();
                        
                    for(int i = 0; i<items.size();i++)
                        {
                           output.println(items.get(i));
                        }
                    output.close();
                }
            catch(FileNotFoundException ex)
                {
                    System.out.println("This File Dose Not Exist!");
                }
            catch (InputMismatchException ex) 
                {
                    System.out.println(ex);
                }
            catch (Exception ex) 
                {
                    System.out.println(ex);
                }
         
}
             public void findPrice()
        {
            File file;
            String item,itemName,brand,model,year,price = null;
            try
                {
                    file = new File("/Users/reemk/Downloads/Electronics.txt");
                    Scanner input = new Scanner(file);
                    input.useDelimiter(",");
                    while (input.hasNext())
                        {
                            item = input.next();
                            if(item.equals(String.valueOf(super.getItemID())))
                                {
                                    itemName = input.next();
                                    brand = input.next();
                                    model = input.next();
                                    year = input.next();
                                    price = input.next();
                                    break;
                                } 
                            input.nextLine();
                        }
                    super.setPrice(Double.parseDouble(price));
                    input.close();
                }
            catch(FileNotFoundException ex)
                {
                    System.out.println("This File Dose Not Exist!...");
                }
            catch (InputMismatchException ex) 
                {
                    System.out.println(ex);
                }
            catch (Exception ex) 
                {
                    System.out.println(ex);
                }
        }
}







