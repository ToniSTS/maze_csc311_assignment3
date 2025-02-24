package edu.farmingdale.maze_csc311_assignment3;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("hello-view.fxml"));
        Parent root = fxmlLoader.load();
        Scene scene = new Scene(root, 600, 400);

        HelloController controller = fxmlLoader.getController();
        ImageView robotView = controller.getRobotView();

        // Key Event Handling for Robot Movement
        scene.setOnKeyPressed(event -> {
            switch (event.getCode()) {
                case UP:
                    robotView.setY(robotView.getY() - 5);
                    break;
                case DOWN:
                    robotView.setY(robotView.getY() + 5);
                    break;
                case LEFT:
                    robotView.setX(robotView.getX() - 5);
                    break;
                case RIGHT:
                    robotView.setX(robotView.getX() + 5);
                    break;
            }
        });

        stage.setTitle("Robot");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}