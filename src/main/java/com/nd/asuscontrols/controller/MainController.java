package com.nd.asuscontrols.controller;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;

public class MainController {
    @FXML
    public TextField inputField;

    @FXML
    public Button printButton;

    @FXML
    public Label outLabel;

    public void printInput(MouseEvent mouseEvent) {
        outLabel.setText("Out: " + inputField.getText());
    }
}
