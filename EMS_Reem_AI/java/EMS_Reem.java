/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ems_reem;

import java.io.IOException;
import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Stage;

/**
 *
 * @author reemk
 */


public class EMS_Reem extends Application {
    //====================
   Item electronics = new Electronic();
    
    Clothes clothes = new Clothes();
 //====================
//==================== 
User Admin = new User(15493,"Reem","Mohammed","Rem_33","1234567","Ireem@gmail.com","admine");
User Customer = new User(14823,"Noor","Abraham","NOR_77","1234567","Noor@gmail.com","costomer");

   Stage q;
   Stage q2;
   Stage q3;
    Stage q4;
    Stage q5;
Stage q6;
Stage q7;
//Stage q8;
Stage q9;
Stage q10;
Stage q11;
Stage q12;
    public EMS_Reem() throws IOException{
     q = mainStage(); 
      q2=  adminScreen();
     q3= customerScreen();
    q4= select1();
    q5=select2();
 q6=buyelec();
 q7=buyClothesScreen();
//q8 =addeleitem();
 q9=deleteitem();
 q10=delcloitem();
 q11=addnewcloitem();
   q12=addneweleitem();
    }
    @Override
    public void start(Stage primaryStage)
    {
        
       primaryStage =q;
       primaryStage.show();
      
  
    }

    
    
    
 public  Stage mainStage(){  
     
  BorderPane m=new  BorderPane();
 m.setPadding(new Insets(25,14,25,14));
     
Text text =new Text(" E-Store Management System (EMS)  ");
text.setFont(Font.font("Arial", FontWeight.BOLD, 20));
text.setFill(Color.BLUE);
BorderPane.setAlignment(text, Pos.CENTER);
m.setTop(text);
     
GridPane grid=new GridPane();
grid.setAlignment(Pos.CENTER);
grid.setHgap(16);
grid.setVgap(12);
     
//----------
 Label UserName=new Label("Username: ");
grid.add(UserName, 0, 0);
TextField textFild=new TextField();
grid.add(textFild, 1, 0);
UserName.setFont(Font.font("Arial", FontWeight.BOLD, 16));
   
//-----
 Label password =new Label("password: ");
 password.setFont(Font.font("Arial", FontWeight.BOLD, 16));
 grid.add(password , 0, 1);
 PasswordField Password=new PasswordField();
 grid.add(Password , 1, 1);
    
 //------
Button btn =new Button("Login");
btn.setFont(Font.font("Times New Roman", FontWeight.BOLD,  20));
btn.setPrefSize(100, 70);
grid.add(btn , 1, 3);
 m.setLeft(grid);
 btn.setOnAction(e->{
 q2.show(); });
     
//
Label err = new Label ();
err.setTextFill(Color.RED);
grid.add(err, 1, 4);
//-------------
     btn.setOnAction (e -> {
if (textFild.getText().equals(Admin.getUsername())&& Password.getText().equals(Admin.getPassword()))
{ 
 q.close();
 q2.show();
}
else if (textFild.getText().equals(Customer.getUsername())&& Password.getText().equals(Customer.getPassword()))
{
    q.close();
    q3.show(); 
}
else
{
err.setText("Wrong username or password,\n please try agin."); 
}     
                
});
//---------- 
 
StackPane stack = new StackPane();	
Image image = new Image("ems_reem/11.jpg");
ImageView imageview  = new ImageView(image);
imageview .setFitHeight(200);
imageview .setFitWidth(200);
stack.getChildren().add(imageview );
stack.setPadding(new Insets(0,0,0,0));
 m.setRight(stack);
   
 Scene scene=new Scene(m,600,500);
 Stage s = new Stage ();
 s.setTitle("E-Store Management System (Login Screen)");
 s.setScene(scene);

 return s;

 }
 
 
 

public Stage adminScreen(){
   
 Text text =new Text("Admin Menu\n");
 text.setFont(Font.font("Arial", FontWeight.BOLD, 20));
 text.setFill(Color.BLUE);
//v- 
 VBox VB=new VBox(10);
  //1-creat the node
 Button btn1 = new Button(" Add a New Item  ");
 btn1.setPrefSize(250, 50);
 btn1.setOnAction(e->{
      q4.show();
      q2.close();
       });
 btn1.setFont(Font.font("Times New Roman", FontWeight.BOLD, 18));
 Button btn2= new Button(" Delet an Item ");
 btn2.setPrefSize(250, 50);
 btn2.setOnAction(e->{
      q5.show();
      q2.close();
       });
 btn2.setFont(Font.font("Times New Roman", FontWeight.BOLD, 18));
 Button btn3 = new Button(" Exit ");
 btn3.setOnAction(e->{
 q2.close(); });
 
        btn3.setPrefSize(250, 50);
        btn3.setFont(Font.font("Times New Roman", FontWeight.BOLD, 18));

       //-------------------
//       VB.getChildren().add(text); 
//       VB.getChildren().add(btn1);
//       VB.getChildren().add(btn2);
//       VB.getChildren().add(btn3);

 VB.getChildren().addAll(text,btn1,btn2,btn3);
 VB.setAlignment(Pos.CENTER); 
//3- creat the scene 
Scene scene2 = new Scene(VB, 300, 400);//4-PLANS THE NODE ON THE SCENE

    Stage s1 = new Stage ();
   s1.setTitle("Admin Screen   ");
        s1.setScene(scene2 );
       
    return s1;
    }




public Stage customerScreen(){
    

  Text text =new Text("Customer main menu\n");
        
        text.setFont(Font.font("Arial", FontWeight.BOLD, 20));
        text.setFill(Color.BLUE);
        
      
        VBox vb = new VBox(10);
        vb.setAlignment(Pos.CENTER);
      
        Button btn1 = new Button(" electronics ");
        btn1.setFont(Font.font("Times New Roman", FontWeight.BOLD, 18));
        btn1.setPrefSize(250, 50);
         btn1.setOnAction(e->{
         q3.close();
         q6.show();
      
       });
        Button btn2 = new Button(" clothes ");
        btn2.setFont(Font.font("Times New Roman", FontWeight.BOLD, 18));
        btn2.setPrefSize(250, 50);
         btn2.setOnAction(e->{
         q3.close();
         q7.show();
      
       });
        Button btn3 = new Button(" Exit ");
        btn3.setFont(Font.font("Times New Roman", FontWeight.BOLD, 18));
        btn3.setPrefSize(250, 50);
        btn3.setOnAction(e->{
        q3.close();
       });
   
        
      vb.getChildren().addAll(text,btn1,btn2,btn3);
          
       Scene scene = new Scene(vb, 300, 400);
       
      
        Stage p = new Stage ();
        p.setTitle(" Customer main menu ");
       p.setScene(scene);
       
         return p;
}


//====================
//====================

public Stage select1(){
       VBox vb = new VBox(10);
       vb.setAlignment(Pos.CENTER);
     
     Button btn1 = new Button(" add a clothes ");    
    btn1.setFont(Font.font("Times New Roman", FontWeight.BOLD, 18));
    btn1.setPrefSize(250, 50);
     btn1.setOnAction(e->{
        q4.close();
        q11.show();
     });
        
    
     
    
                         
    Button btn2 = new Button("add an Electronic");    
    btn2.setFont(Font.font("Times New Roman", FontWeight.BOLD, 18));
    btn2.setPrefSize(250, 50);
   btn2.setOnAction(e->{
         q4.close();
        q12.show();
   });
    
    
    StackPane stack = new StackPane();	
    Image image = new Image("ems_reem/p1.PNG");
    ImageView imageview  = new ImageView(image);
    imageview .setFitHeight(50);
    imageview .setFitWidth(80);
   stack.getChildren().add(imageview );
   stack.setPadding(new Insets(0,0,0,0));
   stack.setAlignment(Pos.BOTTOM_LEFT);
   
 
     Button btn3 = new Button("  back ",imageview);
     btn3.setFont(Font.font("Times New Roman", FontWeight.BOLD, 18));
     btn3.setPrefSize(250, 50);
     btn3.setOnAction(e->{
        q4.close();
        q2.show();});
//     
     Text text = new Text(" please choose \n");
     text.setFont(Font.font("Times New Roman", FontWeight.BOLD, 20));
     text.setFill(Color.BLUE);
     
      vb.getChildren().addAll(text,btn1,btn2,btn3);
   
     

                  
    Scene c = new Scene (vb,300,400);
    Stage s = new Stage ();
    s.setTitle("Seclet ");
    s.setScene(c);
    return s ;
    }
public Stage select2(){
    
       VBox vb = new VBox(10);
       vb.setAlignment(Pos.CENTER);
     
     Button btn1 = new Button(" Delete a clothes ");    
    btn1.setFont(Font.font("Times New Roman", FontWeight.BOLD, 18));
    btn1.setPrefSize(250, 50);
     btn1.setOnAction(e->{
      q5.close();
      q10.show();
      
       });
                         
    Button btn2 = new Button("Delete an Electronic");    
    btn2.setFont(Font.font("Times New Roman", FontWeight.BOLD, 18));
    btn2.setPrefSize(250, 50);
     btn2.setOnAction(e->{
      q5.close();
      q9.show();
      
     });
       
    
    
    StackPane stack = new StackPane();	
    Image image = new Image("ems_reem/p1.PNG");
    ImageView imageview  = new ImageView(image);
    imageview .setFitHeight(50);
    imageview .setFitWidth(80);
   stack.getChildren().add(imageview );
   stack.setPadding(new Insets(0,0,0,0));
   stack.setAlignment(Pos.BOTTOM_LEFT);
   
 
     Button btn3 = new Button("  back ",imageview);
     btn3.setFont(Font.font("Times New Roman", FontWeight.BOLD, 18));
     btn3.setPrefSize(250, 50);
     btn3.setOnAction(e->{
      q5.close();
      q2.show();
      
       });
     
     Text text = new Text(" please choose \n");
     text.setFont(Font.font("Times New Roman", FontWeight.BOLD, 20));
     text.setFill(Color.BLUE);
     
      vb.getChildren().addAll(text,btn1,btn2,btn3);
   
     
      

                  
    Scene c = new Scene (vb,300,400);
    Stage s = new Stage ();
    s.setTitle("Seclet ");
    s.setScene(c);
    return s ;
    }


//====================
//====================

public Stage buyelec(){

       BorderPane p3 = new BorderPane();
        p3.setPadding(new Insets(12, 12, 12, 12));
        
        Label labbuy = new Label("Electronic Item Purchase Form\n"); 
          labbuy.setAlignment( Pos.CENTER);
          labbuy.setFont(Font.font("Arial", FontWeight.BOLD, 20));
          labbuy.setTextFill(Color.BLUE);
          p3.setTop(labbuy);
          
          GridPane gp3 = new GridPane();
         

          gp3.setAlignment(Pos.CENTER);
          gp3.setVgap(10); 
          
          Label labbuy1 = new Label("ItemID*: ");
          
          gp3.add(labbuy1,0,0);
          TextField txb1 = new TextField();
          
          gp3.add(txb1,1,0);
          
          Label labbuy2 = new Label("ItemName*: ");
          
          gp3.add(labbuy2,0,1);
          TextField txb2 = new TextField();
          
          gp3.add(txb2,1,1);
          
           Label labbuy3 = new Label("Brand: ");
      
          gp3.add(labbuy3,0,2);
          TextField txb3 = new TextField();
          
          gp3.add(txb3,1,2);
          
          Label labbuy4 = new Label("Model: ");
         
          gp3.add(labbuy4,0,3);
          TextField txb4 = new TextField();
         
          gp3.add(txb4,1,3);
          
          Label labbuy5 = new Label("Quantity: ");
          
          gp3.add(labbuy5,0,4);
          TextField txb5 = new TextField();
          
          gp3.add(txb5,1,4);
          p3.setCenter(gp3);
          
          GridPane gp4 = new GridPane();
          gp4.setAlignment(Pos.CENTER);
          gp4.setVgap(25);
          gp4.setHgap(20);
          
         
    
         Button btn1 =new Button ("Buy");
         btn1.setFont(Font.font("Times New Roman", FontWeight.BOLD, 18));
         btn1.setPrefSize(100, 60);
                               
          gp4.add(btn1,0,0);
          
           Button btn2 =new Button ("Exit");
          btn2.setFont(Font.font("Times New Roman", FontWeight.BOLD, 18));
          btn2.setPrefSize(100, 60);
          btn2.setOnAction(e->{
          q6.close(); });
                             

          gp4.add(btn2,1,0);
          Label wo = new Label();
          BorderPane.setAlignment(labbuy, Pos.CENTER);
          wo.setFont(Font.font("Arial", 14));
          wo.setTextFill(Color.RED);
          gp4.add(wo, 0, 1, 2, 2);
          p3.setBottom(gp4);
          
        btn1.setOnAction(e ->
    {
    if(txb1.getText().isEmpty() || txb2.getText().isEmpty())
        wo.setText("ItemID and ItemName are required feild");
    else
        {
            if(electronics.searchItems(txb1.getText()) == false)
                {
                   wo.setText("Sorry, This item dose not exist..try again");
                }
            else
                {
                    electronics.setItemID(Long.parseLong(txb1.getText()));
                    electronics.findPrice();
                    wo.setText(electronics.orderSummary(Integer.parseInt( txb5.getText())));
                }
        }


    });
                   
           
          Scene scene = new Scene(p3,600,500);
          Stage s = new Stage();
          s.setTitle("Buying Electronics Screen"); 
          s.setScene(scene); 
          
          return s;    
    }





//====================
//====================


  public Stage buyClothesScreen()
    {
        BorderPane p3 = new BorderPane();
        p3.setPadding(new Insets(12, 12, 12, 12));
        
        Label labbuy = new Label("Clothes Item Purchase Form\n"); 
          labbuy.setAlignment( Pos.CENTER);
          labbuy.setFont(Font.font("Arial", FontWeight.BOLD, 20));
          labbuy.setTextFill(Color.BLUE);
          p3.setTop(labbuy);
          
          GridPane gp3 = new GridPane();
         

          gp3.setAlignment(Pos.CENTER);
          gp3.setVgap(10); 
          
          Label labbuy1 = new Label("ItemID*: ");
          
          gp3.add(labbuy1,0,0);
          TextField txb1 = new TextField();
          
          gp3.add(txb1,1,0);
          
          Label labbuy2 = new Label("ItemName*: ");
          
          gp3.add(labbuy2,0,1);
          TextField txb2 = new TextField();
          
          gp3.add(txb2,1,1);
          
           Label labbuy3 = new Label("color: ");
      
          gp3.add(labbuy3,0,2);
          TextField txb3 = new TextField();
          
          gp3.add(txb3,1,2);
          
          Label labbuy4 = new Label("sizel: ");
         
          gp3.add(labbuy4,0,3);
          TextField txb4 = new TextField();
         
          gp3.add(txb4,1,3);
          
          Label labbuy5 = new Label("Quantity: ");
          
          gp3.add(labbuy5,0,4);
          TextField txb5 = new TextField();
          
          gp3.add(txb5,1,4);
          p3.setCenter(gp3);
          
          GridPane gp4 = new GridPane();
          gp4.setAlignment(Pos.CENTER);
          gp4.setVgap(25);
          gp4.setHgap(20);
          
         
    
         Button btn1 =new Button ("Buy");
         btn1.setFont(Font.font("Times New Roman", FontWeight.BOLD, 18));
         btn1.setPrefSize(100, 60);
                               
          gp4.add(btn1,0,0);
          
           Button btn2 =new Button ("Exit");
          btn2.setFont(Font.font("Times New Roman", FontWeight.BOLD, 18));
          btn2.setPrefSize(100, 60);
          btn2.setOnAction(e->{
          q7.close(); });
                             

          gp4.add(btn2,1,0);
          Label wo = new Label();
          BorderPane.setAlignment(labbuy, Pos.CENTER);
          wo.setFont(Font.font("Arial",  14));
          wo.setTextFill(Color.RED);
          gp4.add(wo, 0, 1, 2, 2);
          p3.setBottom(gp4);
                   
           
          Scene scene = new Scene(p3,600,500);
          Stage s = new Stage();
          s.setTitle("Buying Clothes  Screen"); 
          s.setScene(scene); 
          
       btn1.setOnAction(e ->
        {
            if(txb1.getText().isEmpty() || txb2.getText().isEmpty())
                wo.setText("ItemID and ItemName are required feild");
            else
                {
                    if(clothes.searchItems(txb1.getText()) == false)
                        {
                           wo.setText("Sorry, This item dose not exist..try again");
                        }
                    else
                        {
                           clothes.setItemID(Long.parseLong(txb1.getText()));
                            clothes.findPrice();
                            wo.setText(clothes.orderSummary(Integer.parseInt( txb5.getText())));///////
                        }
                }


        });
       
     
       return s;    
    }

 //====================
//====================
  
   public Stage addnewcloitem(){
    
        BorderPane p = new BorderPane();
        p.setPadding(new Insets(15, 15, 15, 15));
            
    
        GridPane gp = new GridPane();    
        gp.setAlignment(Pos.CENTER);
        gp.setVgap(20);
        gp.setHgap(25);
        
        Label lab = new Label("Add a New Clothes ");
        lab.setFont(Font.font("Times New Roman", FontWeight.BOLD, 20));
        lab.setTextFill(Color.BLUE);
        gp.add(lab,0,0,2,1);
        
        Label lab1 = new Label("ItemID*: ");
        lab1.setFont(Font.font("Times New Roman", FontWeight.BOLD, 18));
        gp.add(lab1,0,1);
        TextField etx1 = new TextField();
        etx1.setFont(Font.font("Times New Roman", FontWeight.BOLD, 18));
        gp.add(etx1,1,1);
        
        Label lab2 = new Label("ItemName*: ");
        lab2.setFont(Font.font("Times New Roman", FontWeight.BOLD, 18));;
        gp.add(lab2,0,2);
        TextField etx2 = new TextField();
        etx2.setFont(Font.font("Times New Roman", FontWeight.BOLD, 18));
        gp.add(etx2,1,2);
        
        Label lab3 = new Label("color*: ");
        lab3.setFont(Font.font("Times New Roman", FontWeight.BOLD, 18));
        gp.add(lab3,0,3);
        TextField etx3 = new TextField();
        etx3.setFont(Font.font("Times New Roman", FontWeight.BOLD, 18));
        gp.add(etx3,1,3);
        
        Label lab4 = new Label("deparment*: ");
        lab4.setFont(Font.font("Times New Roman", FontWeight.BOLD, 18));
        gp.add(lab4,0,4);
        TextField etx4 = new TextField();
        etx4.setFont(Font.font("Times New Roman", FontWeight.BOLD, 18));
        gp.add(etx4,1,4);
        
        Label lab5 = new Label("size*: ");
        lab5.setFont(Font.font("Times New Roman", FontWeight.BOLD, 18));
        gp.add(lab5,0,5);
        TextField etx5 = new TextField();
        etx5.setFont(Font.font("Times New Roman", FontWeight.BOLD, 18));
        gp.add(etx5,1,5);
        
        Label lab6 = new Label("Price*: ");
        lab6.setFont(Font.font("Times New Roman", FontWeight.BOLD, 18));
        gp.add(lab6,0,6);
        TextField etx6 = new TextField();
        etx6.setFont(Font.font("Times New Roman", FontWeight.BOLD, 18));
        gp.add(etx6,1,6);
        
        
        Label errc = new Label();
        errc.setFont(Font.font("Times New Roman", FontWeight.BOLD, 18));
        errc.setTextFill(Color.RED);
        gp.add(errc,1,7);
        
        Button bc = new Button("Save");
        bc.setFont(Font.font("Times New Roman", FontWeight.BOLD, 18));
        bc.setPrefSize(100, 60);
        
        gp.add(bc,1,8);  
        
        
        
        
     StackPane stack = new StackPane();	
    Image image = new Image("ems_reem/p1.PNG");
    ImageView imageview  = new ImageView(image);
    imageview .setFitHeight(20);
    imageview .setFitWidth(30);
   stack.getChildren().add(imageview );
   stack.setPadding(new Insets(0,0,0,0));
   stack.setAlignment(Pos.BOTTOM_LEFT);
   
 
     Button btn3 = new Button("  back ",imageview);
     btn3.setFont(Font.font("Times New Roman", FontWeight.BOLD, 14));
     btn3.setPrefSize(100, 60);
     btn3.setOnAction(e->{
        q11.close();
        q4.show();});
        
       
        gp.add(btn3,0,8);
        
        
        
          bc.setOnAction(e ->
            {
                if(clothes.searchItems(etx1.getText()) == false)
                    {
                        clothes.writeItems(etx1.getText(), etx2.getText(),etx3.getText(), etx4.getText(), etx5.getText(), etx6.getText());
                        errc.setText(" Added successfully..");
                    }
                else
                    {
                        errc.setText("This item is already exist..");
                    }
            });  
          
          
          
          
          

        
  
        Scene scene = new Scene(gp,600,500);
        Stage stage = new Stage();
        stage.setTitle("Add a New Item Screen"); 
        stage.setScene(scene);  
        return stage;  
}
  
 //====================
//====================
   
    public Stage addneweleitem(){
    
        BorderPane p = new BorderPane();
        p.setPadding(new Insets(15, 15, 15, 15));
            
    
        GridPane gp = new GridPane();    
        gp.setAlignment(Pos.CENTER);
        gp.setVgap(20);
        gp.setHgap(25);
        
        Label lab = new Label("Add a New an Electronic ");
        lab.setFont(Font.font("Times New Roman", FontWeight.BOLD, 20));
        lab.setTextFill(Color.BLUE);
        gp.add(lab,0,0,2,1);
        
        Label lab1 = new Label("ItemID*: ");
        lab1.setFont(Font.font("Times New Roman", FontWeight.BOLD, 18));
        gp.add(lab1,0,1);
        TextField etx1 = new TextField();
        etx1.setFont(Font.font("Times New Roman", FontWeight.BOLD, 18));
        gp.add(etx1,1,1);
        
        Label lab2 = new Label("ItemName*: ");
        lab2.setFont(Font.font("Times New Roman", FontWeight.BOLD, 18));;
        gp.add(lab2,0,2);
        TextField etx2 = new TextField();
        etx2.setFont(Font.font("Times New Roman", FontWeight.BOLD, 18));
        gp.add(etx2,1,2);
        
        Label lab3 = new Label("Brand*: ");
        lab3.setFont(Font.font("Times New Roman", FontWeight.BOLD, 18));
        gp.add(lab3,0,3);
        TextField etx3 = new TextField();
        etx3.setFont(Font.font("Times New Roman", FontWeight.BOLD, 18));
        gp.add(etx3,1,3);
        
        Label lab4 = new Label("Model*: ");
        lab4.setFont(Font.font("Times New Roman", FontWeight.BOLD, 18));
        gp.add(lab4,0,4);
        TextField etx4 = new TextField();
        etx4.setFont(Font.font("Times New Roman", FontWeight.BOLD, 18));
        gp.add(etx4,1,4);
        
        Label lab5 = new Label("Year*: ");
        lab5.setFont(Font.font("Times New Roman", FontWeight.BOLD, 18));
        gp.add(lab5,0,5);
        TextField etx5 = new TextField();
        etx5.setFont(Font.font("Times New Roman", FontWeight.BOLD, 18));
        gp.add(etx5,1,5);
        
        Label lab6 = new Label("Price*: ");
        lab6.setFont(Font.font("Times New Roman", FontWeight.BOLD, 18));
        gp.add(lab6,0,6);
        TextField etx6 = new TextField();
        etx6.setFont(Font.font("Times New Roman", FontWeight.BOLD, 18));
        gp.add(etx6,1,6);
        
        
        Label errc = new Label();
        errc.setFont(Font.font("Times New Roman",  14));
        errc.setTextFill(Color.RED);
        gp.add(errc,1,7);
        
        Button bc = new Button("Save");
        bc.setFont(Font.font("Times New Roman",  14));
        bc.setPrefSize(100, 60);
        
        gp.add(bc,1,8);  
        
        
        
        
     StackPane stack = new StackPane();	
    Image image = new Image("ems_reem/p1.PNG");
    ImageView imageview  = new ImageView(image);
    imageview .setFitHeight(20);
    imageview .setFitWidth(30);
   stack.getChildren().add(imageview );
   stack.setPadding(new Insets(0,0,0,0));
   stack.setAlignment(Pos.BOTTOM_LEFT);
   
 
     Button btn3 = new Button("  back ",imageview);
     btn3.setFont(Font.font("Times New Roman", 18));
     btn3.setPrefSize(100, 60);
//     btn3.setOnAction(e->{
//        q12.close();
//        q4.show();});
        
       
        gp.add(btn3,0,8);
        
        
        
        //----------------
          bc.setOnAction(e ->
            {
                if(electronics.searchItems(etx1.getText()) == false)
                    {
                       electronics.writeItems(etx1.getText(), etx2.getText(),etx3.getText(), etx4.getText(), etx5.getText(), etx6.getText());
                       errc.setText("Added successfully...");
                    }
                else
                    {
                       errc.setText("This item is already exist...");
                    }
            });
       
        
        btn3.setOnAction(e ->
            {
               q12.close();
              q4.show();

            });

        
          
    //----------
        Scene scene = new Scene(gp,600,500);
        Stage stage = new Stage();
        stage.setTitle("Add a New Item Screen"); 
        stage.setScene(scene);  
        return stage;  
}
  
  
  
  
  
  
  
  
  public Stage deleteitem()
    {
        BorderPane p7 = new BorderPane();
        p7.setPadding(new Insets(15, 15, 15, 15));
            
        GridPane gp7 = new GridPane();
        gp7.setAlignment(Pos.CENTER);
        gp7.setVgap(10);
        gp7.setHgap(10); 
            
        Label Dlab = new Label("Delete an Electronic");
        Dlab.setFont(Font.font("Times New Roman", FontWeight.BOLD, 20));
        Dlab.setTextFill(Color.BLUE);
        gp7.add(Dlab,0,0,2,1);
            
        Label Dlab1 = new Label("ItemID*: ");
        Dlab1.setFont(Font.font("Times New Roman", FontWeight.BOLD, 18));
        gp7.add(Dlab1,0,1);  
            
        TextField Dtxt1 = new TextField();
        Dtxt1.setFont(Font.font("Times New Roman", FontWeight.BOLD, 18));
        gp7.add(Dtxt1,1,1);
           
        Label Derr = new Label();
        Derr.setFont(Font.font("Times New Roman", 14));
        Derr.setTextFill(Color.RED);
        gp7.add(Derr,1,2);
            
            
        Button Dbb = new Button("Delete");
        Dbb.setFont(Font.font("Times New Roman", FontWeight.BOLD, 18));
        Dbb.setPrefSize(100, 60);
        
          Dbb.setOnAction(e ->
            {
                if(electronics.searchItems(Dtxt1.getText()) == false)
                    {
                       Derr.setText("This item dose not exist");
                    }
                else
                    {
                       electronics.deleteItems(Dtxt1.getText());
                       Derr.setText("Item deleted successfully");
                       electronics.showItems();
                    }
            });
                            

        gp7.add(Dbb,0,3);  
        
        
        
     StackPane stack = new StackPane();	
    Image image = new Image("ems_reem/p1.PNG");
    ImageView imageview  = new ImageView(image);
    imageview .setFitHeight(20);
    imageview .setFitWidth(30);
     stack.getChildren().add(imageview );
     stack.setPadding(new Insets(0,0,0,0));
     stack.setAlignment(Pos.BOTTOM_LEFT);
   
 
     Button btn3 = new Button("  back ",imageview);
     btn3.setFont(Font.font("Times New Roman", FontWeight.BOLD, 14));
     btn3.setPrefSize(100, 60);
  
      btn3.setOnAction(e->{
        q9.close();
        q5.show();});
       
 
        gp7.add(btn3,1,3);
        p7.setLeft(gp7);
            
        
    
        Scene scene = new Scene(p7,450,300);
        Stage stage = new Stage();
        stage.setTitle("Delete an Item Screen"); 
        stage.setScene(scene);  
        return stage;
    }
//-------------------------------
   
  public Stage delcloitem()
    {
        BorderPane p7 = new BorderPane();
        p7.setPadding(new Insets(15, 15, 15, 15));
            
        GridPane gp7 = new GridPane();
        gp7.setAlignment(Pos.CENTER);
        gp7.setVgap(10);
        gp7.setHgap(10); 
            
        Label Dlab = new Label("Delete an Clothes ");
        Dlab.setFont(Font.font("Times New Roman", FontWeight.BOLD, 20));
        Dlab.setTextFill(Color.BLUE);
        gp7.add(Dlab,0,0,2,1);
            
        Label Dlab1 = new Label("ItemID*: ");
        Dlab1.setFont(Font.font("Times New Roman", FontWeight.BOLD, 18));
        gp7.add(Dlab1,0,1);  
            
        TextField Dtxt1 = new TextField();
        Dtxt1.setFont(Font.font("Times New Roman", FontWeight.BOLD, 18));
        gp7.add(Dtxt1,1,1);
           
        Label Derr = new Label();
        Derr.setFont(Font.font("Times New Roman",  14));
        Derr.setTextFill(Color.RED);
        gp7.add(Derr,1,2);
            
            
        Button Dbb = new Button("Delete");
        Dbb.setFont(Font.font("Times New Roman", FontWeight.BOLD, 18));
        Dbb.setPrefSize(100, 60);
                          
          Dbb.setOnAction(e ->
            {
                if(clothes.searchItems(Dtxt1.getText()) == false)
                    {
                       Derr.setText("This item dose not exist");
                    }
                else
                    {
                       clothes.deleteItems(Dtxt1.getText());
                       Derr.setText("Item deleted successfully");
                       clothes.showItems();
                    }
            });

        gp7.add(Dbb,0,3);  
        
        
        
     StackPane stack = new StackPane();	
    Image image = new Image("ems_reem/p1.PNG");
    ImageView imageview  = new ImageView(image);
    imageview .setFitHeight(20);
    imageview .setFitWidth(30);
     stack.getChildren().add(imageview );
     stack.setPadding(new Insets(0,0,0,0));
     stack.setAlignment(Pos.BOTTOM_LEFT);
   
 
     Button btn3 = new Button("  back ",imageview);
     btn3.setFont(Font.font("Times New Roman", FontWeight.BOLD, 14));
     btn3.setPrefSize(100, 60);
  
      btn3.setOnAction(e->{
        q10.close();
        q5.show();});
       
 
        gp7.add(btn3,1,3);
        p7.setLeft(gp7);
            
        
    
        Scene scene = new Scene(p7,450,300);
        Stage stage = new Stage();
        stage.setTitle("Delete an Item Screen"); 
        stage.setScene(scene);  
        return stage;
    }



    


//
////====================
////====================
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
}
