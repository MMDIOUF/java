package ism.gestion.controllers;


import java.io.IOException;

import ism.gestion.App;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.layout.AnchorPane;

public class HomeController {

    @FXML
    private AnchorPane anchorContent;

    @FXML
    void handleDeconnexion(ActionEvent event) throws IOException {
        App.setRoot("connexion");
    }

    @FXML
    void handleLoadViewClasse(ActionEvent event) throws IOException {
        loadView("classe");
    }


    
    @FXML
    void handleLoadViewEtudiant(ActionEvent event) throws IOException {
       loadView("etudiant");
    }

    @FXML
    void handleLoadViewInscription(ActionEvent event) throws IOException {
       loadView("inscription");
    }


    @FXML
    void handleLoadViewProfesseur(ActionEvent event) {

    }

    @FXML
    void handleLoadViewReinscription(ActionEvent event) throws IOException {
       loadView("reinscription");
    }
    void loadView(String fxml) throws IOException{
        AnchorPane root= (AnchorPane) App.loadFXML(fxml);
        anchorContent.getChildren().clear();
        anchorContent.getChildren().add(root);
    }

}
