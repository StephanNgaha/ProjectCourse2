package sample;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.stage.Stage;

import java.net.URL;
import java.util.ResourceBundle;

public class ClassMates implements Initializable {

    @FXML private Button okBtn;




    @Override
    public void initialize(URL location, ResourceBundle resources) {

    }

    @FXML private void handleOkBtn(){
        ((Stage)okBtn.getScene().getWindow()).close();
    }
}
