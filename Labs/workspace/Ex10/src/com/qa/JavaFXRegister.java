package com.qa;

import java.io.BufferedWriter;
import java.io.FileWriter;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;
import javafx.scene.control.ButtonType;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class JavaFXRegister extends Application {

	@Override
	public void start(Stage primaryStage) throws Exception {
		// TODO Auto-generated method stub
		
		// Create Labels
		Label firstNameLabel = new Label("First Name");
		firstNameLabel.setFont(Font.font("Tahoma", FontWeight.NORMAL, 20));
		Label lastNameLabel = new Label("Last Name");
		lastNameLabel.setFont(Font.font("Tahoma",FontWeight.NORMAL, 20));
		Label emailLabel = new Label("Email ID");
		emailLabel.setFont(Font.font("Tahoma", FontWeight.NORMAL, 20));
		Label passwordLabel = new Label("Password");
		passwordLabel.setFont(Font.font("Tahoma", FontWeight.NORMAL, 20));
   
		// Create Textfields
		TextField firstNameTextField = new TextField();
		firstNameTextField.setMaxWidth(150);
		TextField lastNameTextField = new TextField();
		lastNameTextField.setMaxWidth(150);
		TextField emailTextField = new TextField();
		emailTextField.setMaxWidth(150);
		PasswordField passwordTextField = new PasswordField();
		passwordTextField.setMaxWidth(150);
	
		// Create buttons
		Button registerBtn = new Button("Register");
		Button loginBtn = new Button("Back to login ");
		Button resetBtn = new Button("Reset");
		
		
		GridPane grid = new GridPane();
		grid.setPadding(new Insets(50));
		grid.setHgap(20);
		grid.setVgap(20);
		
		Text scenetitle = new Text("Register Stage");
		scenetitle.setFont(Font.font("Tahoma", FontWeight.NORMAL, 20));
		grid.add(scenetitle, 0, 0, 2, 1);
	
		grid.add(firstNameLabel, 0, 1);
		grid.add(firstNameTextField, 1, 1);
		grid.add(lastNameLabel, 0, 2);
		grid.add(lastNameTextField, 1, 2);
		grid.add(emailLabel, 0, 3);
		grid.add(emailTextField, 1, 3);
		grid.add(passwordLabel, 0, 4);
		grid.add(passwordTextField, 1, 4);
		grid.add(registerBtn, 0, 5);
		grid.add(resetBtn, 1, 5);
		grid.add(loginBtn, 0, 6,2,1);
		
		
		
		loginBtn.setOnAction(new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent event) {
			
			      try {
			    	  primaryStage.close(); // Close the current stage
					  new JavaFXLogin().start(new Stage());
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			});
			
		registerBtn.setOnAction(new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent event) {
			
			  FileWriter fw = null;
	    	  
	    	  BufferedWriter bw = null;
			      try {
					
			    	  // C 1
			    	  String firstName = firstNameTextField.getText();
			    	  String lastName = lastNameTextField.getText();
			    	  String emailId = emailTextField.getText();
			    	  String password = passwordTextField.getText();
			    	  
			    	  
			    	  if(firstName.equals("") || lastName.equals("") || emailId.equals("") || password.equals(""))
			    	  {
			    		  Alert alert = new Alert(AlertType.CONFIRMATION, "Values cannot be empty", ButtonType.OK);
			    		  alert.showAndWait();
			    	  }
			    	  else
			    	  {
			    	  String userData = firstName+","+lastName+","+emailId+","+password+"\n";
			    	  
			    	  fw = new FileWriter("userdata.txt",true);
			    	  
			    	  bw = new BufferedWriter(fw);
			    	  
			    	  bw.write(userData);
			    	  
			    	  Alert alert = new Alert(AlertType.CONFIRMATION, "Registration Successful", ButtonType.OK);
		    		  alert.showAndWait();

			    	  }
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
								    
				}
			    finally
			    {
			    	try
					{
			    		if(bw!=null)
						bw.close();
		    	    }
					catch(Exception ex)
					{
						ex.printStackTrace();
					}
				
			    }
			    
			}
			});
		
			
		resetBtn.setOnAction(new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent event) {
			
			
			      try {
					
			    	  // C 1
			    	  firstNameTextField.setText("");
			    	  lastNameTextField.setText("");
			    	  emailTextField.setText("");
			    	  passwordTextField.setText("");
			    	  
			    	  
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
								    
				}
					    
			}
			});
		
		
		
		primaryStage.setTitle("JavaFX Register Stage");
		
		Scene scene = new Scene(grid,500,500);
		
		primaryStage.setScene(scene);
		
		primaryStage.show();
				

	}
	
	

	
}
