package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Modality;
import javafx.stage.Stage;

import java.io.IOException;

public class AdminLogin implements ActorsLogin, ControlledScenes {
    @FXML private TextField userName;
    @FXML private PasswordField password;
    @FXML private Button enterASAdmin;
    @FXML private Button yesBtn;
    @FXML private Button abandonBtn;
   private ScenesController myController;
   private String passwordRecFxmlFileName="passwordRecovery.fxml";

    @Override
    public void login(ActionEvent event) throws IOException {
        myController.setScenes(SchoolAppFramework.adminSceneID);
    }
    @Override
    public void passwordRecovering(ActionEvent event) throws IOException {
        myController.popUpStage(passwordRecFxmlFileName);
    }

    @Override
    public void abandonAction(ActionEvent event) {
        myController.setScenes(SchoolAppFramework.loginSceneID);
    }


    @Override
    public void setScreenParent(ScenesController screenController) {
        myController=screenController;
    }
}
