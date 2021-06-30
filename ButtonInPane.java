package chapter14;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class ButtonInPane extends Application{

	@Override
	public void start(Stage primaryStag)
	{
		StackPane pane = new StackPane();
		pane.getChildren().add(new Button("OK"));
		Scene scene = new Scene(pane, 1000, 200);
		primaryStag.setScene(scene);
		primaryStag.show();
	}
	public static void main(String[] args) {
		launch(args);

	}

}
//--module-path D:\javafx-sdk-16\lib --add-modules javafx.controls