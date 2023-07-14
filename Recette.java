import javax.swing.*; // Importe les classes nécessaires pour l'interface graphique Swing
import java.awt.*; // Importe les classes nécessaires pour la gestion de la fenêtre et des composants graphiques
import java.awt.event.*; // Importe les classes nécessaires pour la gestion des événements
import java.io.IOException; // Importe la classe IOException pour la gestion des exceptions liées à l'entrée/sortie
import java.util.ArrayList;
import java.util.List;

public class Recette extends JFrame{

    private List<String> listeDynamique = new ArrayList<String>();

    public Recette(){
        setTitle("Recette"); // Définit le titre de la fenêtre
        setDefaultCloseOperation(EXIT_ON_CLOSE); // Définit l'action de fermeture de la fenêtre
        setSize(500, 300); // Définit la taille de la fenêtre (largeur, hauteur)
        setResizable(true); // Autorise le redimensionnement de la fenêtre
        setLocationRelativeTo(null); // Centre la fenêtre sur l'écran

        JPanel panel = new JPanel(new GridBagLayout()); // Crée un panneau avec un gestionnaire de disposition GridBagLayout
        GridBagConstraints constraints = new GridBagConstraints(); // Crée des contraintes pour le placement des composants dans la grille
    }


}
