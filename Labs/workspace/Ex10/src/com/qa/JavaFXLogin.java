package com.qa;

import java.io.BufferedReader;
import java.io.FileReader;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class JavaFXLogin extends Application{

	@Override
	public void start(Stage primaryStage) throws Exception {
		// TODO Auto-generated method stub
		Label emailLabel = new Label("Email ID");
		emailLabel.setFont(Font.font("Verdana", FontWeight.NORMAL, 20));
		Label passwordLabel = new Label("Password");
		passwordLabel.setFont(Font.font("Verdana", FontWeight.NORMAL, 20));

		Label newUserLabel = new Label("New User?");
		newUserLabel.setFont(Font.font("Verdana", FontWeight.NORMAL, 20));

		TextField emailTextField = new TextField();
		emailTextField.setMaxWidth(300);
		PasswordField passwordTextField = new PasswordField();
		passwordTextField.setMaxWidth(300);

		
		Button submitBtn = new Button("Submit");
		Button resetBtn = new Button("Reset");
		Button registerBtn = new Button("Register");
		
		GridPane grid = new GridPane();
		grid.setPadding(new Insets(100));
		grid.setHgap(20);
		grid.setVgap(20);
		
		Text scenetitle = new Text("Login Stage");
		scenetitle.setFont(Font.font("Tahoma", FontWeight.NORMAL, 20));
		grid.add(scenetitle, 0, 0, 2, 1);
	
		grid.add(emailLabel, 0, 1);
		grid.add(emailTextField, 1, 1);
		grid.add(passwordLabel, 0, 2);
		grid.add(passwordTextField, 1, 2);
		grid.add(submitBtn, 0, 3);
		grid.add(resetBtn, 1, 3);
		grid.add(newUserLabel, 0, 4);
		grid.add(registerBtn, 1, 4);
		
		
		// Register EventHandler
		
		registerBtn.setOnAction(new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent event) {
			
			      try {
			    	  primaryStage.close(); // Close the current stage
					  new JavaFXRegister().start(new Stage());
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			});
		
		
		submitBtn.setOnAction(new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent event) {
			
				 FileReader fr = null;
				 BufferedReader br = null;
				 StringBuffer sb = new StringBuffer();
			      try {
			    	 
			    	    String inputEmailId = emailTextField.getText();
			    	    String inputPassword = passwordTextField.getText();
			    	    
			    	    
			    	    fr = new FileReader("userdata.txt");
			    	    
			    	    br = new BufferedReader(fr);
			    	    
			    	    String line;
			    	    
			    	    while((line=br.readLine())!=null)
			    	    {
			    	       	sb.append(line+"\n");
			    	    }
			    	    
			    	    if(sb.toString().contains(inputEmailId) && sb.toString().contains(inputPassword))
			    	    {
			    	       System.out.println("Valid User");
			    	    }
			    	    else
			    	    {
			    	    	System.out.println("Invalid User");
			    	    }
			    	    
			    	  	    	  
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			});
		
		resetBtn.setOnAction(new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent event) {
			
			
			      try {
								    			    	 
			    	  emailTextField.setText("");
			    	  passwordTextField.setText("");
			    				    	  
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
								    
				}
					    
			}
			});

	
		primaryStage.setTitle("JavaFX Login Stage");
		
		Scene scene = new Scene(grid,500,500);
		
		primaryStage.setScene(scene);
		
		primaryStage.show();
			
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        launch(args);
	}

}
