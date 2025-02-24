package edu.farmingdale.maze_csc311_assignment3;

import javafx.fxml.FXML;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

public class HelloController {
    @FXML
    private ImageView robotView;


    public ImageView getRobotView() {
        return robotView;
    }

    public void initialize() {
        robotView.setImage(new Image(getClass().getResource("/edu/farmingdale/maze_csc311_assignment3/robot.png").toExternalForm()));
    }
}