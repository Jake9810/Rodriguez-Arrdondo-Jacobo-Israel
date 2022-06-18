package com.example.test6;

import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class HelloController {
    @FXML
    private Label Pulsame1B;
    private Label Pulsame1A;
    private Label Pulsame2A;
    private Label Pulsame2B;

    @FXML
    protected void onPulsame1B() {Pulsame1B.setText("Boton 1B :)"); }
    @FXML
    protected void onPulsame1A(){Pulsame1A.setText("Boton 1A :D");}
    @FXML
    protected void onPulsame2A(){Pulsame2A.setText("Boton 2A :| ");}
    @FXML
    protected void onPulsame2B(){Pulsame2B.setText("Boton 2B :v");}
}