package edu.farmingdale.maze_csc311_assignment3;

import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.util.Duration;

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