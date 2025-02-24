module edu.farmingdale.maze_csc311_assignment3 {
    requires javafx.controls;
    requires javafx.fxml;


    opens edu.farmingdale.maze_csc311_assignment3 to javafx.fxml;
    exports edu.farmingdale.maze_csc311_assignment3;
}