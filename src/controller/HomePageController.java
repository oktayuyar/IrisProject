/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.net.URL;
import java.util.ResourceBundle;

import implement.SetosaDAOImpl;
import implement.VersicolorDAOImpl;
import implement.VirginicaDAOImpl;
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
import model.FlowerAv;
import model.FlowerStd;

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
    private final double e=2.718281828459;
    private final double pi=3.1416;
    
	SetosaDAOImpl s=new SetosaDAOImpl();
	VersicolorDAOImpl vc=new VersicolorDAOImpl();
	VirginicaDAOImpl vg=new VirginicaDAOImpl();
    /**
     * Initializes the controller class.
     * @param url
     * @param rb
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
    	// setosaHesapla() fonksiyonunda olasığı hesaplamak için 
    	//setosanın ortalama ve standart sapma değerlerini çekiyoruz 
    	s.getSetosaAv(1);
    	s.getSetosaStd(1);
    	s.deneme();
    	//Setosanın standart sapmalarını bu şekilde  hesaplıyoruz
    	// s.getSetosaValues("Iris-Setosa","cyaprak_boyu"); 
    	// s.StandartSapmaHesapla(s.cyboyOrt,s.values);
    	
    	// versicolorHesapla() fonksiyonunda olasığı hesaplamak için
    	//versicolorun ortalama ve standart sapma değerlerini çekiyoruz
    	vc.getVersicolorAv(2);
    	vc.getVersicolorStd(2);
    
    	// virginicaHesapla() fonksiyonunda olasığı hesaplamak için 
    	//virginicanın ortalama ve standart sapma değerlerini çekiyoruz
    	vg.getVirginicaAv(3);
    	vg.getVirginicaStd(3);
    	
        cbox_setosa.setDisable(true);
        cbox_versicolor.setDisable(true);
        cbox_virginica.setDisable(true);
    }    

    @FXML
    private void ara(KeyEvent event) {
    }

    @FXML
    private void arab(KeyEvent event) {
    }

    @FXML
    private void btnHesapla(ActionEvent event) {
        cy_boy=Double.parseDouble(edtcanakboyu.getText());
        cy_en=Double.parseDouble(edtcanakeni.getText());
        ty_boy=Double.parseDouble(edttacboyu.getText());
        ty_en=Double.parseDouble(edttaceni.getText());
        
        setosaHesapla();
        versicolorHesapla();
        virginicaHesapla();

        türBelirleme();
    }
    // setosanın olasılığını hesapladığımız fonksiyon
    private void setosaHesapla(){
    	double  s1,s2,s3,s4;
        double us1=Math.pow(cy_boy-s.cyboyOrt,2)/2*Math.pow(s.cyboyStd,2);
        s1 =(1/Math.sqrt(2*pi*s.cyboyStd))*Math.pow(e, us1);
        
        
        double us2=Math.pow(cy_en-s.cyenOrt,2)/2*Math.pow(s.cyenStd,2);
        s2 =(1/Math.sqrt(2*pi*s.cyenStd))*Math.pow(e, us2);
       
                
        double us3=Math.pow(ty_boy-s.tyboyOrt,2)/2*Math.pow(s.tyboyStd,2);
        s3 =(1/Math.sqrt(2*pi*s.tyboyStd))*Math.pow(e, us3);
        
        
        double us4=Math.pow(ty_en-s.tyenOrt,2)/2*Math.pow(s.tyenStd,2);
        s4=(1/Math.sqrt(2*pi*s.tyenStd))*Math.pow(e, us4);
        
        sSetosa= s1*s2*s3*s4;
        System.out.println("sSetosa "+sSetosa);
    }
    // versicolorun olasılığını hesapladığımız fonksiyon
    private void versicolorHesapla() {
    	double  vc1,vc2,vc3,vc4;
        double us1=Math.pow(cy_boy-vc.cyboyOrt,2)/2*Math.pow(vc.cyboyStd,2);
        vc1 =(1/Math.sqrt(2*pi*vc.cyboyStd))*Math.pow(e, us1);
        
        
        double us2=Math.pow(cy_en-vc.cyenOrt,2)/2*Math.pow(vc.cyenStd,2);
        vc2 =(1/Math.sqrt(2*pi*vc.cyenStd))*Math.pow(e, us2);
       
                
        double us3=Math.pow(ty_boy-vc.tyboyOrt,2)/2*Math.pow(vc.tyboyStd,2);
        vc3 =(1/Math.sqrt(2*pi*vc.tyboyStd))*Math.pow(e, us3);
        
        
        double us4=Math.pow(ty_en-vc.tyenOrt,2)/2*Math.pow(vc.tyenStd,2);
        vc4=(1/Math.sqrt(2*pi*vc.tyenStd))*Math.pow(e, us4);
        
        sVersicolor=vc1*vc2*vc3*vc4;
        System.out.println("sVersicolor "+sVersicolor);
    }
 // virginicanın olasılığını hesapladığımız fonksiyon
    private void virginicaHesapla() {
    	double vg1,vg2,vg3,vg4;
        double us1=Math.pow(cy_boy-vg.cyboyOrt,2)/2*Math.pow(vg.cyboyStd,2);
        vg1 =(1/Math.sqrt(2*pi*vg.cyboyStd))*Math.pow(e, us1);
        
        
        double us2=Math.pow(cy_en-vg.cyenOrt,2)/2*Math.pow(vg.cyenStd,2);
        vg2 =(1/Math.sqrt(2*pi*vg.cyenStd))*Math.pow(e, us2);
        
                
        double us3=Math.pow(ty_boy-vg.tyboyOrt,2)/2*Math.pow(vg.tyboyStd,2);
        vg3 =(1/Math.sqrt(2*pi*vg.tyboyStd))*Math.pow(e, us3);
        
        
        double us4=Math.pow(ty_en-vg.tyenOrt,2)/2*Math.pow(vg.tyenStd,2);
        vg4=(1/Math.sqrt(2*pi*vg.tyenStd))*Math.pow(e, us4);
        
        sVirginica=vg1*vg2*vg3*vg4;
        System.out.println("sVirginica "+sVirginica);
    }
 // En büyük olasılık hangi türe aitse o türün altındaki checkboxın seçildiği fonksiyon
    private void türBelirleme() {
        if(sSetosa>sVersicolor & sSetosa>sVirginica)
            cbox_setosa.setSelected(true);
        else if(sVersicolor>sSetosa & sVersicolor>sVirginica)
            cbox_versicolor.setSelected(true);
        else if(sVirginica>sSetosa & sVirginica>sVersicolor)
            cbox_virginica.setSelected(true); 
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
