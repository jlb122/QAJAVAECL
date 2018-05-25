package javafxExamples;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Layouts extends Application {

	@Override
	public void start(Stage primaryStage) throws Exception {
		
		StackPane root = new StackPane();
		Scene scene = new Scene(root, 600, 300);
		primaryStage.setTitle("Layouts");
		primaryStage.setScene(scene);
		primaryStage.show();

		Button btn1 = new Button("Submit");
		Button btn2 = new Button("Reset");
		
		CheckBox cb1 = new CheckBox("Dog");
		CheckBox cb2 = new CheckBox("Cat");
		CheckBox cb3 = new CheckBox("Rat");
		CheckBox cb4 = new CheckBox("Rabbit");
		
		Button top = new Button("Top");
		Button right = new Button("Right");
		Button bottom = new Button("Bottom");
		Button left = new Button("Left");
		Button center = new Button("Center");
		
		// Demo 10.18 - HBox Layout
		// Makes Horizontal Rows
//		HBox h = new HBox(10);		// Spacing = 10
//		
//		h.getChildren().addAll(btn1, btn2);
//		
//		root.getChildren().add(h);
		
		// Demo 10.19 - VBox Layout
		// Makes Vertical Columns
//		VBox v = new VBox(10);
//		
//		v.getChildren().addAll(btn1, btn2);
//		
//		root.getChildren().add(v);
		
		// Demo 10.20 - FlowPane
		// Flows like a text editor
//		FlowPane flow = new FlowPane();
//		
//		flow.setHgap(30);
//		flow.getChildren().addAll(btn1, btn2);
//		
//		root.getChildren().add(flow);
		
		// Demo 10.21 - GridPane
		// Represents a table structure
//		GridPane grid = new GridPane();
//		
//		grid.setPadding(new Insets(20));
//		grid.setHgap(20);
//		grid.setVgap(20);
//		grid.add(cb1,  0,  0);
//		grid.add(cb2,  0,  1);
//		grid.add(cb3,  1,  0);
//		grid.add(cb4,  1,  1);
//		
//		root.getChildren().add(grid);
		
		// Demo 10.22 - Border Pane
		// Only 1 node allowed per region
		BorderPane border = new BorderPane();
		
		border.setPadding(new Insets(10, 20, 10, 20));
		
		border.setTop(top);			// Pos.TOP_LEFT
		border.setRight(right);		// Pos.TOP_RIGHT
		border.setBottom(bottom);	// Pos.BOTTOM_LEFT
		border.setLeft(left);		// Pos.TOP_LEFT
		border.setCenter(center);	// Pos.CENTER
		
		root.getChildren().add(border);
		
	}


	public static void main(String[] args) {
		launch(args);
	}
}
