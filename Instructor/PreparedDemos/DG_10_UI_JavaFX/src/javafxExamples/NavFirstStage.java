package javafxExamples;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class NavFirstStage extends Application {

	private Button secondStageButton;
	
	@Override
	public void start(Stage primaryStage) throws Exception {
		
		secondStageButton = new Button("Go to Second Stage");
		
		StackPane root = new StackPane();
		
		root.getChildren().add(secondStageButton);
		
		Scene scene = new Scene(root, 300, 300);
		primaryStage.setScene(scene);
		primaryStage.setTitle("First Stage");
		
		secondStageButton.setOnAction(new EventHandler<ActionEvent>(){
			@Override
			public void handle(ActionEvent event) {
				primaryStage.close(); 	// Close the current stage
				try {
						new NavSecondStage().start(new Stage());
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		});
		
		primaryStage.show();
	}
	
	public static void main(String[] args) {
		launch(args);
	}

}
