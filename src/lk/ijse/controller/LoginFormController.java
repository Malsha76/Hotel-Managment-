package lk.ijse.controller;

import com.jfoenix.controls.JFXPasswordField;
import com.jfoenix.controls.JFXTextField;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Hyperlink;
import javafx.stage.Stage;

import java.io.IOException;


public class LoginFormController {

    public JFXPasswordField txtPassword;
    public JFXTextField TxtUserName;
    public Hyperlink txtAlert;

    public void LoginClickOnAction(ActionEvent actionEvent) throws IOException {
        String password = txtPassword.getText();
        String userName = TxtUserName.getText();

        if (password.equals("123") && userName.equals("admin")) {
            Parent root = FXMLLoader.load(getClass().getResource("../view/AdminDashboardForm.fxml"));
            Stage stage = (Stage) ((Node) actionEvent.getSource()).getScene().getWindow();
            Scene scene = new Scene(root);
            stage.setScene(scene);
            stage.setResizable(false);
            stage.show();

        } else if (password.equals("123") && userName.equals("recip")) {
            Parent root = FXMLLoader.load(getClass().getResource("../view/RecipDashboardForm.fxml"));
            Stage stage = (Stage) ((Node) actionEvent.getSource()).getScene().getWindow();
            Scene scene = new Scene(root);
            stage.setScene(scene);
            stage.setResizable(false);
            stage.show();
        }

        else {
            txtAlert.setText("Error !");
        }
    }
}
