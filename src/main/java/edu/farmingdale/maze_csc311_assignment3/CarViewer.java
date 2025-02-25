package edu.farmingdale.maze_csc311_assignment3;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;
import java.io.IOException;


public class CarViewer extends Application {
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(CarController.class.getResource("Car.fxml"));
        Parent root = fxmlLoader.load();
        Scene scene = new Scene(root, 600, 400);


        CarController controller = fxmlLoader.getController();
        ImageView CARView = controller.getCARview();


        // Event Handling for Car Movement
        scene.setOnKeyPressed(event -> {
            switch (event.getCode()) {
                case UP:
                    CARView.setLayoutY(CARView.getLayoutY() - 5);
                    break;
                case DOWN:
                    CARView.setLayoutY(CARView.getLayoutY() + 5);
                    break;
                case LEFT:
                    CARView.setLayoutX(CARView.getLayoutX() - 5);
                    break;
                case RIGHT:
                    CARView.setLayoutX(CARView.getLayoutX() + 5);
                    break;
            }
        });


        stage.setTitle("CarMove");
        stage.setScene(scene);
        stage.show();
    }


    public static void main(String[] args) {
        launch();
    }
}

