/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.geometry.Rectangle2D;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;
import javafx.scene.input.KeyEvent;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author oktay
 */
public class HomePageController implements Initializable {

    @FXML
    private AnchorPane anaPanel;
    @FXML
    private ImageView imgLoad;
    @FXML
    private TextField ara;
    @FXML
    private TextField edtcanakboyu;
    @FXML
    private TextField edtcanakeni;
    @FXML
    private TextField edttacboyu;
    @FXML
    private TextField edttaceni;
    @FXML
    private Button btn;
    @FXML
    private CheckBox cbox_setosa;
    @FXML
    private CheckBox cbox_versicolor;
    @FXML
    private CheckBox cbox_virginica;
    @FXML
    private Button minimize;
    @FXML
    private Button close;
    @FXML
    private Button btn_temizle;
    
    Stage stage;
    Rectangle2D rec2;
    Double w, h, initX, initY;
    
    private double cy_boy,cy_en,ty_boy,ty_en,sSetosa,sVirginica,sVersicolor;
    private double  s1,s2,s3,s4,vc1,vc2,vc3,vc4,vg1,vg2,vg3,vg4;;
    private final double e=2.718281828459;
    private final double pi=3.1416;

    
    /**
     * Initializes the controller class.
     * @param url
     * @param rb
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
    
    }    

    @FXML
    private void ara(KeyEvent event) {
    }

    @FXML
    private void arab(KeyEvent event) {
    }

    @FXML
    private void btnHesapla(ActionEvent event) {
        
 
    }

    @FXML
    private void aksiminimize(ActionEvent event) {
        stage = (Stage) minimize.getScene().getWindow();
        if (stage.isMaximized()) {
            w = rec2.getWidth();
            h = rec2.getHeight();
            stage.setMaximized(false);
            stage.setHeight(h);
            stage.setWidth(w);
            stage.centerOnScreen();
            Platform.runLater(() -> {
                stage.setIconified(true);
            });
        } else {
            stage.setIconified(true);
        }
    }


    @FXML
    private void aksiClose(ActionEvent event) {
        Platform.exit();
        System.exit(0);
    }

    @FXML
    private void btnTemizle(ActionEvent event) {
        cbox_setosa.setSelected(false);
        cbox_versicolor.setSelected(false);
        cbox_virginica.setSelected(false);
        
        edtcanakboyu.setText("");
        edtcanakeni.setText("");
        edttacboyu.setText("");
        edttaceni.setText("");
    }
    @FXML
    private void moveDragged(MouseEvent evt) {
        Stage st = (Stage) anaPanel.getScene().getWindow();
        st.setX(evt.getScreenX() - initX);
        st.setY(evt.getScreenY() - initY);
    }

    @FXML
    private void movePressed(MouseEvent evt) {
        Stage st = (Stage) anaPanel.getScene().getWindow();
        initX = evt.getSceneX();
        initY = evt.getSceneY();
    }

}
