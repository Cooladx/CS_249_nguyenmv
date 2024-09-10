module exercisesmod {
    requires javafx.controls;
    requires javafx.fxml;
    requires transitive javafx.graphics;

    opens edu.nguyenmv.exercises00 to javafx.fxml;

    exports edu.nguyenmv.exercises00;
}
