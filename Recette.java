import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.jar.Attributes.Name;

public class Recette extends JFrame {
    private JPanel panel;
    private JButton addButton;
    private int rowCount; 

    public Recette() {
        rowCount = 0;

        setTitle("Recette"); // Définit le titre de la fenêtre
        setDefaultCloseOperation(EXIT_ON_CLOSE); // Définit l'action de fermeture de la fenêtre
        setSize(500, 300); // Définit la taille de la fenêtre (largeur, hauteur)
        setResizable(true); // Autorise le redimensionnement de la fenêtre
        setLocationRelativeTo(null); // Centre la fenêtre sur l'écran

        GridBagConstraints constraints = new GridBagConstraints();
        panel = new JPanel(new GridBagLayout());

        JLabel NomIngredients = new JLabel("Nom");
        constraints.gridx = 1;
        constraints.gridy = 0;
        constraints.fill = GridBagConstraints.BOTH;
        constraints.weightx = 1.0;
        constraints.gridwidth = 1;
        constraints.insets = new Insets(5, 5, 5, 5);
        panel.add(NomIngredients, constraints);

        JLabel QuantiteIngredients = new JLabel("Quantité");
        constraints.gridx = 2;
        panel.add(QuantiteIngredients, constraints);

        addButton = new JButton("+");
        addButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                addRow(constraints);
            }
        });

        addRow(constraints); // Ajoute la première ligne par défaut

        getContentPane().add(panel, BorderLayout.CENTER);
        getContentPane().add(addButton, BorderLayout.SOUTH);

        setVisible(true);
    }

    private void addRow(GridBagConstraints constraints) {
        constraints.fill = GridBagConstraints.HORIZONTAL;
        constraints.gridx = 0;
        constraints.gridy = rowCount;

        JLabel NumberIngredient = new JLabel("Ingrédient " + (rowCount + 1) + " : ");
        constraints.gridx = 0;
        constraints.gridy = (rowCount + 1);
        panel.add(NumberIngredient, constraints);

        JTextField NameIngredientField = new JTextField();
        constraints.gridx = 1;
        panel.add(NameIngredientField, constraints);

        JTextField QuantityIngredientField = new JTextField();
        constraints.gridx = 2;
        panel.add(QuantityIngredientField, constraints);

        rowCount++;

        revalidate(); // Actualise l'interface graphique pour refléter les changements
    }
}
