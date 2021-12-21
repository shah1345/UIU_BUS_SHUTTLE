module com.shah.uiubus.uiu_bus_shuttle {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires com.dlsc.formsfx;
    requires org.kordamp.bootstrapfx.core;

    opens com.shah.uiubus.uiu_bus_shuttle to javafx.fxml;
    exports com.shah.uiubus.uiu_bus_shuttle;
}