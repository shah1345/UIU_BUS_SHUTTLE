package com.example.map;


        import java.net.URL;
        import java.util.ResourceBundle;
        import javafx.event.ActionEvent;
        import javafx.fxml.FXML;
        import javafx.fxml.Initializable;
        import javafx.scene.control.Button;
        import javafx.scene.paint.Color;
        import javafx.scene.web.WebEngine;
        import javafx.scene.web.WebView;

public class MainPcontroler implements Initializable {


    @FXML
    private WebEngine engine;


    @FXML
    private Button a0;

    @FXML
    private Button a1;

    @FXML
    private Button a2;

    @FXML
    private Button a3;

    @FXML
    private Button a4;

    @FXML
    private Button a5;

    @FXML
    private Button a6;

    @FXML
    private Button a7;

    @FXML
    private Button b0;

    @FXML
    private Button b1;

    @FXML
    private Button b2;

    @FXML
    private Button b3;

    @FXML
    private Button b4;

    @FXML
    private Button b5;

    @FXML
    private Button b6;

    @FXML
    private Button b7;

    @FXML
    private Button c0;

    @FXML
    private Button c1;

    @FXML
    private Button c2;

    @FXML
    private Button c3;

    @FXML
    private Button c4;

    @FXML
    private Button c5;

    @FXML
    private Button c6;

    @FXML
    private Button c7;

    @FXML
    private Button d0;

    @FXML
    private Button d1;

    @FXML
    private Button d2;

    @FXML
    private Button d3;

    @FXML
    private Button d4;

    @FXML
    private Button d5;

    @FXML
    private Button d6;

    @FXML
    private Button d7;
    @FXML
    private Button e0;






    @FXML // fx:id="buslocationweb"
    private WebView webviewbus;; // Value injected by FXMLLoader


    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

         engine = webviewbus.getEngine();
        engine.load("https://www.google.com/maps/place/23%C2%B047'50.2%22N+90%C2%B027'00.6%22E/@23.7972742,90.4496248,19z/data=!3m1!4b1!4m6!3m5!1s0x0:0x93d97e78b3df502!7e2!8m2!3d23.797273!4d90.4501719?hl=en");
    }

    public void A0(ActionEvent actionEvent) {

        if(a0.getStyle().equals("-fx-background-color: #ff0000; ")){
            a0.setStyle("-fx-background-color: #ffe6e6; ");
        } else  a0.setStyle("-fx-background-color: #ff0000; ");

    }
    public void B0(ActionEvent actionEvent) {

        if(b0.getStyle().equals("-fx-background-color: #ff0000; ")){
            b0.setStyle("-fx-background-color: #ffe6e6; ");
        } else  b0.setStyle("-fx-background-color: #ff0000; ");

    }
    public void C0(ActionEvent actionEvent) {
        if(c0.getStyle().equals("-fx-background-color: #ff0000; ")){
            c0.setStyle("-fx-background-color: #ffe6e6; ");
        } else  c0.setStyle("-fx-background-color: #ff0000; ");
    }
    public void D0(ActionEvent actionEvent) {
        if(d0.getStyle().equals("-fx-background-color: #ff0000; ")){
            d0.setStyle("-fx-background-color: #ffe6e6; ");
        } else  d0.setStyle("-fx-background-color: #ff0000; ");
    }


    public void A1(ActionEvent actionEvent) {
        if(a1.getStyle().equals("-fx-background-color: #ff0000; ")){
            a1.setStyle("-fx-background-color: #ffe6e6; ");
        } else  a1.setStyle("-fx-background-color: #ff0000; ");
    }
    public void B1(ActionEvent actionEvent) {
        if(b1.getStyle().equals("-fx-background-color: #ff0000; ")){
            b1.setStyle("-fx-background-color: #ffe6e6; ");
        } else  b1.setStyle("-fx-background-color: #ff0000; ");
    }
    public void C1(ActionEvent actionEvent) {
        if(c1.getStyle().equals("-fx-background-color: #ff0000; ")){
            c1.setStyle("-fx-background-color: #ffe6e6; ");
        } else  c1.setStyle("-fx-background-color: #ff0000; ");
    }
    public void D1(ActionEvent actionEvent) {
        if(d1.getStyle().equals("-fx-background-color: #ff0000; ")){
            d1.setStyle("-fx-background-color: #ffe6e6; ");
        } else  d1.setStyle("-fx-background-color: #ff0000; ");
    }


    public void A2(ActionEvent actionEvent) {
        if(a2.getStyle().equals("-fx-background-color: #ff0000; ")){
            a2.setStyle("-fx-background-color: #ffe6e6; ");
        } else  a2.setStyle("-fx-background-color: #ff0000; ");
    }
    public void B2(ActionEvent actionEvent) {
        if(b2.getStyle().equals("-fx-background-color: #ff0000; ")){
            b2.setStyle("-fx-background-color: #ffe6e6; ");
        } else  b2.setStyle("-fx-background-color: #ff0000; ");
    }
    public void C2(ActionEvent actionEvent) {
        if(c2.getStyle().equals("-fx-background-color: #ff0000; ")){
            c2.setStyle("-fx-background-color: #ffe6e6; ");
        } else  c2.setStyle("-fx-background-color: #ff0000; ");
    }
    public void D2(ActionEvent actionEvent) {
        if(d2.getStyle().equals("-fx-background-color: #ff0000; ")){
            d2.setStyle("-fx-background-color: #ffe6e6; ");
        } else  d2.setStyle("-fx-background-color: #ff0000; ");
    }



    public void A3(ActionEvent actionEvent) {
        if(a3.getStyle().equals("-fx-background-color: #ff0000; ")){
            a3.setStyle("-fx-background-color: #ffe6e6; ");
        } else  a3.setStyle("-fx-background-color: #ff0000; ");
    }
    public void B3(ActionEvent actionEvent) {
        if(b3.getStyle().equals("-fx-background-color: #ff0000; ")){
            b3.setStyle("-fx-background-color: #ffe6e6; ");
        } else  b3.setStyle("-fx-background-color: #ff0000; ");
    }
    public void C3(ActionEvent actionEvent) {
        if(c3.getStyle().equals("-fx-background-color: #ff0000; ")){
            c3.setStyle("-fx-background-color: #ffe6e6; ");
        } else  c3.setStyle("-fx-background-color: #ff0000; ");
    }
    public void D3(ActionEvent actionEvent) {
        if(d3.getStyle().equals("-fx-background-color: #ff0000; ")){
            d3.setStyle("-fx-background-color: #ffe6e6; ");
        } else  d3.setStyle("-fx-background-color: #ff0000; ");
    }

    public void A4(ActionEvent actionEvent) {
        if(a4.getStyle().equals("-fx-background-color: #ff0000; ")){
            a4.setStyle("-fx-background-color: #ffe6e6; ");
        } else  a4.setStyle("-fx-background-color: #ff0000; ");
    }
    public void B4(ActionEvent actionEvent) {
        if(b4.getStyle().equals("-fx-background-color: #ff0000; ")){
            b4.setStyle("-fx-background-color: #ffe6e6; ");
        } else  b4.setStyle("-fx-background-color: #ff0000; ");
    }
    public void C4(ActionEvent actionEvent) {
        if(c4.getStyle().equals("-fx-background-color: #ff0000; ")){
            c4.setStyle("-fx-background-color: #ffe6e6; ");
        } else  c4.setStyle("-fx-background-color: #ff0000; ");
    }
    public void D4(ActionEvent actionEvent) {
        if(d4.getStyle().equals("-fx-background-color: #ff0000; ")){
            d4.setStyle("-fx-background-color: #ffe6e6; ");
        } else  d4.setStyle("-fx-background-color: #ff0000; ");
    }


    public void A5(ActionEvent actionEvent) {
        if(a5.getStyle().equals("-fx-background-color: #ff0000; ")){
            a5.setStyle("-fx-background-color: #ffe6e6; ");
        } else  a5.setStyle("-fx-background-color: #ff0000; ");
    }
    public void B5(ActionEvent actionEvent) {
        if(b5.getStyle().equals("-fx-background-color: #ff0000; ")){
            b5.setStyle("-fx-background-color: #ffe6e6; ");
        } else  b5.setStyle("-fx-background-color: #ff0000; ");
    }
    public void C5(ActionEvent actionEvent) {
        if(c5.getStyle().equals("-fx-background-color: #ff0000; ")){
            c5.setStyle("-fx-background-color: #ffe6e6; ");
        } else  c5.setStyle("-fx-background-color: #ff0000; ");
    }
    public void D5(ActionEvent actionEvent) {
        if(d5.getStyle().equals("-fx-background-color: #ff0000; ")){
            d5.setStyle("-fx-background-color: #ffe6e6; ");
        } else  d5.setStyle("-fx-background-color: #ff0000; ");
    }

    public void A6(ActionEvent actionEvent) {
        if(a6.getStyle().equals("-fx-background-color: #ff0000; ")){
            a6.setStyle("-fx-background-color: #ffe6e6; ");
        } else  a6.setStyle("-fx-background-color: #ff0000; ");
    }
    public void B6(ActionEvent actionEvent) {
        if(b6.getStyle().equals("-fx-background-color: #ff0000; ")){
            b6.setStyle("-fx-background-color: #ffe6e6; ");
        } else  b6.setStyle("-fx-background-color: #ff0000; ");
    }
    public void C6(ActionEvent actionEvent) {
        if(c6.getStyle().equals("-fx-background-color: #ff0000; ")){
            c6.setStyle("-fx-background-color: #ffe6e6; ");
        } else  c6.setStyle("-fx-background-color: #ff0000; ");
    }
    public void D6(ActionEvent actionEvent) {
        if(d6.getStyle().equals("-fx-background-color: #ff0000; ")){
            d6.setStyle("-fx-background-color: #ffe6e6; ");
        } else  d6.setStyle("-fx-background-color: #ff0000; ");
    }


    public void A7(ActionEvent actionEvent) {
        if(a7.getStyle().equals("-fx-background-color: #ff0000; ")){
            a7.setStyle("-fx-background-color: #ffe6e6; ");
        } else  a7.setStyle("-fx-background-color: #ff0000; ");
    }
    public void B7(ActionEvent actionEvent) {
        if(b7.getStyle().equals("-fx-background-color: #ff0000; ")){
            b7.setStyle("-fx-background-color: #ffe6e6; ");
        } else  b7.setStyle("-fx-background-color: #ff0000; ");
    }
    public void C7(ActionEvent actionEvent) {
        if(c7.getStyle().equals("-fx-background-color: #ff0000; ")){
            c7.setStyle("-fx-background-color: #ffe6e6; ");
        } else  c7.setStyle("-fx-background-color: #ff0000; ");
    }
    public void D7(ActionEvent actionEvent) {
        if(d7.getStyle().equals("-fx-background-color: #ff0000; ")){
            d7.setStyle("-fx-background-color: #ffe6e6; ");
        } else  d7.setStyle("-fx-background-color: #ff0000; ");
    }
    public void E0(ActionEvent actionEvent) {
        if(e0.getStyle().equals("-fx-background-color: #ff0000; ")){
            e0.setStyle("-fx-background-color: #ffe6e6; ");
        } else  e0.setStyle("-fx-background-color: #ff0000; ");
    }
}
