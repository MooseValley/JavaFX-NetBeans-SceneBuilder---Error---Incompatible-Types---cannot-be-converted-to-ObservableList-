/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package comboboxes;

import java.net.URL;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.ResourceBundle;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;

/**
 *
 * @author MichaelO
 */
public class FXMLDocumentController implements Initializable {
    
    private static final String[] NAMES_ARRAY = {"Moose", "Frankie", "Bella"};
    
    @FXML
    private Label label;
    @FXML
    private Button button;
    @FXML
    private ComboBox<String> simpleComboBox;
    @FXML
    private Button getValueButton;
    @FXML
    private Button setDefaultValueButton;
    @FXML
    private Button resetButton;
    
    @FXML
    private void handleButtonAction(ActionEvent event) {
        System.out.println("You clicked me!");
        label.setText("Hello World!");
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) 
    {
        ObservableList<String> namesObservableList = FXCollections.observableArrayList (NAMES_ARRAY);

        // error: incompatible types: ObservableList<String> cannot be converted to ObservableList<CAP#1>
        // simpleComboBox.setItems(studentObservableList);
        // where CAP#1 is a fresh type-variable:

        simpleComboBox.getItems().addAll (namesObservableList);
    }    

    @FXML
    private void getValueButtonHandler(ActionEvent event) {
    }

    @FXML
    private void setDefaultValueButtonHandler(ActionEvent event) {
    }

    @FXML
    private void resetButtonHandler(ActionEvent event) {
    }
    
}
