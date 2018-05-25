package javafxExamples;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class NavSecondStage extends Application {

	Button firstStageButton;
	
	@Override
	public void start(Stage primaryStage) throws Exception {
		
		Button firstStageButton = new Button("Back to first stage");
		
		StackPane root = new StackPane();
		
		root.getChildren().add(firstStageButton);
		
		Scene scene = new Scene(root, 300, 300);
		
		primaryStage.setScene(scene);
		primaryStage.setTitle("Second Stage");
		firstStageButton.setOnAction(new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent event) {
				primaryStage.close();
				try {
					new NavFirstStage().start(new Stage());
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
