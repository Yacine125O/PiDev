/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import service.UserService ;


public class New_ReclamController implements Initializable {

    @FXML
    private TextField sujet;
    @FXML
    private TextField reclamation;
    @FXML
    private Button env_rec;
    @FXML
    private Button retour;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void sujet_action(ActionEvent event) {
    }

    @FXML
    private void reclamation_action(ActionEvent event) {
    }

    @FXML
    private void add_rec(ActionEvent event) {
        String sujet = sujet.getText();
        String prenom = textFieldPrenom.getText();

        Personne p = new Personne(id, nom, prenom);
        PersonneService service = new PersonneService();
        service.ajouter(p);

        try {

            FXMLLoader loader = new FXMLLoader(getClass().getResource("DetailsWindow.fxml"));
            Parent root = loader.load();
            DetailsWindowController controller =  loader.getController();
            controller.setTextFieldID(p.getId()+"");
            controller.setTextFieldNom(p.getNom());
            controller.setTextFieldPrenom(p.getPrenom());
            
            textFieldID.getScene().setRoot(root);
            
            

        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }

    @FXML
    private void retour(ActionEvent event) {
    }
    
}
