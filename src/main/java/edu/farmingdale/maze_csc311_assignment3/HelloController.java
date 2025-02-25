package edu.farmingdale.maze_csc311_assignment3;

import javafx.fxml.FXML;
import javafx.scene.control.TabPane;
import javafx.scene.image.ImageView;

public class HelloController {

    @FXML
    private TabPane tabPane;

    @FXML
    private ImageView maze1View;

    @FXML
    private ImageView robotView;

    @FXML
    public void initialize() {
        tabPane.setFocusTraversable(false);
    }

    public ImageView getMaze1View() {
        return maze1View;
    }

    public ImageView getRobotView() {
        return robotView;
    }
}
