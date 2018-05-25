package javafxExamples;
	

import javafx.application.Application;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.StackPane;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;


public class AddComponents extends Application {
	
	// Demo 10.13 - Modify some of the default statements and add a button
	
	@Override
	public void start(Stage primaryStage) throws Exception {

		Button btn = new Button("Click me!");
		
		StackPane root = new StackPane();
		GridPane grid = new GridPane();
		
		root.setAlignment(Pos.TOP_CENTER);
		grid.setAlignment(Pos.TOP_CENTER);
		grid.setHgap(10);
		grid.setVgap(10);
		grid.setPadding(new Insets(25, 25, 25, 25));

		root.getChildren().add(grid);
		grid.add(btn, 0, 0);

		// Demo 10.14 - Add Labels
		Label firstNameLabel = new Label("First Name:");
		firstNameLabel.setFont(Font.font("Tahoma", FontWeight.NORMAL, 20));
		
		Label lastNameLabel = new Label("Last Name:");
		lastNameLabel.setFont(Font.font("Times New Roman", FontWeight.BOLD, 30));
		
		Label emailLabel = new Label("Email:");
		emailLabel.setFont(Font.font("Verdana", FontWeight.EXTRA_BOLD, 20));
		
		Label passwordLabel = new Label("Password:");
		passwordLabel.setFont(Font.font("Verdana", FontWeight.EXTRA_BOLD, 20));
		
		grid.add(firstNameLabel, 0, 1);
		grid.add(lastNameLabel, 0, 2);
		grid.add(emailLabel, 0, 3);
		grid.add(passwordLabel, 0, 4);
		
		// Demo 10.15 - TextFields
		TextField firstName = new TextField();
		firstName.setMaxWidth(150);
		
		TextField lastName = new TextField();
		lastName.setMaxWidth(150);
		
		TextField email = new TextField();
		email.setMaxWidth(150);
		
		TextField password = new TextField();
		password.setMaxWidth(150);
		
		grid.add(firstName, 1, 1);
		grid.add(lastName, 1, 2);
		grid.add(email, 1, 3);
		grid.add(password, 1, 4);
		
		// Demo 10.16 - Radio Buttons and Toggle Groups
		RadioButton insert = new RadioButton("Insert");
		RadioButton update = new RadioButton("Update");
		RadioButton delete = new RadioButton("Delete");
		RadioButton view = new RadioButton("View");
		
		ToggleGroup transaction = new ToggleGroup(); 	// Creates button group
		
		insert.setToggleGroup(transaction);
		update.setToggleGroup(transaction);
		delete.setToggleGroup(transaction);
		view.setToggleGroup(transaction);
		
		grid.add(insert, 0, 5);
		grid.add(update, 1, 5);
		grid.add(delete, 2, 5);
		grid.add(view, 3, 5);
		
		// Demo 10.17 - Checkboxes
		CheckBox cb1 = new CheckBox("Cricket");
		CheckBox cb2 = new CheckBox("Football");
		CheckBox cb3 = new CheckBox("Rugby");
		CheckBox cb4 = new CheckBox("Tennis");
		
		CheckBox checkboxList[] = {cb1, cb2, cb3, cb4};
		
		grid.add(cb1, 0, 6);
		grid.add(cb2, 1, 6);
		grid.add(cb3, 2, 6);
		grid.add(cb4, 3, 6);
		
		for(CheckBox cb : checkboxList) {
			cb.selectedProperty().addListener(new ChangeListener<Boolean>() {
				public void changed(ObservableValue<? extends Boolean> observable, Boolean oldValue, Boolean newValue) {
					if(cb.isSelected()) {
						System.out.println(cb.getText());
					}
				}
			});
		}		
		
		Scene scene = new Scene(root,600,300);
		primaryStage.setTitle("Adding Components");
		primaryStage.setScene(scene);
		primaryStage.show();
		
	}
	
	
	public static void main(String[] args) {
		launch(args);
	}
}
