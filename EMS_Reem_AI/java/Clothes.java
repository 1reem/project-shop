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
public class Clothes extends Item   {
 

private String color;
private String department;
private String size;
  //----------

  
        public void setColor(String color)
            {
                this.color = color;
            }
        public void setDepartment(String department)
            {
                this.department = department;
            }
        public void setSize(String size)
            {
                this.size = size;
            }
 
        public String getColor()
            {
                return color;
            }
        public String getDepartment()
            {
                return department;
            }
        public String getSize()
            {
                return size;
            }

    //////////////////////////////////////
        
@Override
  public String orderSummary(int quantity)

       {
        return "Purchased Items: "+super.getItemID()+
                "\n, QTY= "+quantity+"\n, Price= "
                +(quantity*super.getPrice());

    } 
  
    /////////////////////////////
      
    public void showItems()
    {
        File file;
        String itemID,itemName,color,department,size,price;
        try
            {
            file = new File("/Users/reemk/Downloads/Clothes.txt");
            Scanner input = new Scanner(file);
            input.useDelimiter(","); 
            System.out.println("Clothes File: ");
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
   ////////////////////
    
    public void writeItems(String sc1,String sc2,String sc3,String sc4,String sc5,String sc6)
            {
                FileWriter  file;
                PrintWriter printWriter;
                try
                    {
            file = new FileWriter ("/Users/reemk/Downloads/Clothes.txt",true);
            
            printWriter = new PrintWriter(file);
            printWriter.println();
            printWriter.print(sc1+",");
            printWriter.print(sc2+",");
            printWriter.print(sc3+",");
            printWriter.print(sc4+",");
            printWriter.print(sc5+",");
            printWriter.print(sc6+",");

            printWriter.close();
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
    ////////////////////////////////////////////////
    public boolean searchItems(String itemID)
        {
            File file;
            String item;
            boolean flag = false;
            try
                {
                    file = new File("/Users/reemk/Downloads/Clothes.txt");
                    Scanner input = new Scanner(file);
                    input.useDelimiter(","); 
                    while (input.hasNext())
                        {
                            item = input.next();
                            System.out.println(item);
                            
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
      
    /////////////////////////////////////////////////////
    
    public void deleteItems(String itemID)
        {   
            try
                {
                    File fileR = new File ("/Users/reemk/Downloads/Clothes.txt");
                    Scanner input = new Scanner(fileR);
                    
                    FileWriter fileW = new FileWriter(fileR,true);
                    PrintWriter output = new PrintWriter("/Users/reemk/Downloads/Clothes.txt");
                       
                    ArrayList<String> items = new ArrayList<String>();
                        
                    while (input.hasNext()) {
                            String item = input.nextLine();
                        
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
                       
                    new FileWriter("/Users/reemk/Downloads/Clothes.txt", false).close();
                        
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
    
    ////////////////////////////////////

   public void findPrice()
        {
            File file;
            String 
                    item,itemName,brand,model,year,price = null;
            try
                {
                    file = new File("/Users/reemk/Downloads/.txt");
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
        }}
//////////////////////////////////////////////////////////