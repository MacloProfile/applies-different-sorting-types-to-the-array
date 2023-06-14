module com.mcl.typesofsorts {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.mcl.typesofsorts to javafx.fxml;
    exports com.mcl.typesofsorts;
    exports com.mcl.typesofsorts.Controllers;
    opens com.mcl.typesofsorts.Controllers to javafx.fxml;
}