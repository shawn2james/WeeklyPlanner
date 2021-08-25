module com.shawnjames.weeklyplanner {
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.graphics;

    opens com.shawnjames.weeklyplanner to javafx.fxml;
    exports com.shawnjames.weeklyplanner;
}