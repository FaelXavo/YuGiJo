package karte;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

public class Karte extends JPanel {
    /*
     * Attribute:
     * private Held held: Referenz auf das Objekt Held, wovon die Daten auf der Karte angezeigt werden.
     * private JLabel [Blabla]: GUI-Komponenten für alles auf der Karte
     *
     */
    private Held held;
    private JLabel lblHeldname;
    private JLabel lblTyp;
    private JLabel lblBild;
    private JLabel lblBeschreibung;
    private JLabel lblLeben;
    private JLabel lblRuestung;
    private JLabel lblMagieresistenz;
    private JLabel lblAngriff;

    /*
     * Konstruktor:
     * Setzt das übergebene Held-Objekt als Datenübertragung.
     * Ruft die Methode initializeGUI() auf, um alle GUI-Komponenten zu erstellen.
     * Ruft die Methode updateGUI() auf, um die Daten zu übergeben.
     */
    public Karte(Held held) {
        this.held = held;
        initializeGUI();
        updateGUI();
    }

    /*
     * GUI-Aufbau (initializeGUI):
     * Layout: BorderLayout mit rotem Hintergrund (255, 0, 0) für die Karte.
     * NORTH: Zeigt Heldname und Typ in einer dunkleren Zeile.
     * CENTER: Hier Bild.
     * SOUTH: Besteht aus zwei Teilen:
     * oben ist die Beschreibung und unten das unterPanel (unten) mit
     * vier Zeilen für Leben, Rüstung, Magieresistenz und Angriff.
     *
     * Alle Labels werden initialisiert und mit Schriftart, Farbe und Rändern konfiguriert.
     */
    private void initializeGUI() {
        setLayout(new BorderLayout(0, 0));
        setBackground(new Color(255, 0, 0)); // Rot

        /* NORTH (Name und Typ)
         * oberPanel verwendet BorderLayout, damit Name links und Typ rechts stehen. 
         */
        JPanel oberPanel = new JPanel();
        oberPanel.setLayout(new BorderLayout());
        oberPanel.setBackground(new Color(139, 0, 0));
        oberPanel.setBorder(new EmptyBorder(5, 5, 5, 5));

        lblHeldname = new JLabel("Heldname");
        lblHeldname.setFont(new Font("Arial", Font.BOLD, 14));
        lblHeldname.setForeground(Color.YELLOW);
        lblHeldname.setBackground(new Color(139, 0, 0));
        oberPanel.add(lblHeldname, BorderLayout.WEST);

        lblTyp = new JLabel("Typ");
        lblTyp.setFont(new Font("Arial", Font.BOLD, 14));
        lblTyp.setForeground(Color.YELLOW);
        lblTyp.setBackground(new Color(139, 0, 0));
        oberPanel.add(lblTyp, BorderLayout.EAST);

        add(oberPanel, BorderLayout.NORTH);

        /* CENTER (Bild)
         * midPanel enthält das Bild.
         */
        JPanel midPanel = new JPanel();
        midPanel.setLayout(new BorderLayout());
        midPanel.setBackground(new Color(139, 0, 0));
        midPanel.setBorder(new EmptyBorder(5, 5, 5, 5));

        lblBild = new JLabel("");
        lblBild.setHorizontalAlignment(JLabel.CENTER);
        midPanel.add(lblBild, BorderLayout.CENTER);

        add(midPanel, BorderLayout.CENTER);

        /* Beschreibung (oberer Teil von SOUTH)
         * JLabel für die Beschreibung.
         */
        JPanel descriptionPanel = new JPanel();
        descriptionPanel.setLayout(new BorderLayout());
        descriptionPanel.setBackground(new Color(139, 0, 0));
        descriptionPanel.setBorder(new EmptyBorder(5, 5, 5, 5));

        lblBeschreibung = new JLabel("Beschreibung ohne Zeilenumbrüche");
        lblBeschreibung.setFont(new Font("Arial", Font.PLAIN, 12));
        lblBeschreibung.setForeground(Color.YELLOW);
        lblBeschreibung.setBackground(new Color(139, 0, 0));
        descriptionPanel.add(lblBeschreibung, BorderLayout.CENTER);

        add(descriptionPanel, BorderLayout.SOUTH);

        /* Stats (unterer Teil von SOUTH)
         * unterPanel als GridLayout für Leben, Rüstung, Magieresistenz, Angriff.
         */
        JPanel unterPanel = new JPanel();
        unterPanel.setLayout(new GridLayout(4, 1));
        unterPanel.setBackground(new Color(139, 0, 0));
        unterPanel.setBorder(new EmptyBorder(5, 5, 5, 5));

        lblLeben = new JLabel("Leben: 0");
        lblLeben.setFont(new Font("Arial", Font.BOLD, 12));
        lblLeben.setForeground(Color.YELLOW);
        lblLeben.setBackground(new Color(139, 0, 0));
        unterPanel.add(lblLeben);

        lblRuestung = new JLabel("Rüstung: 0");
        lblRuestung.setFont(new Font("Arial", Font.BOLD, 12));
        lblRuestung.setForeground(Color.YELLOW);
        lblRuestung.setBackground(new Color(139, 0, 0));
        unterPanel.add(lblRuestung);

        lblMagieresistenz = new JLabel("Magieresistenz: 0");
        lblMagieresistenz.setFont(new Font("Arial", Font.BOLD, 12));
        lblMagieresistenz.setForeground(Color.YELLOW);
        lblMagieresistenz.setBackground(new Color(139, 0, 0));
        unterPanel.add(lblMagieresistenz);

        lblAngriff = new JLabel("Angriff: 0");
        lblAngriff.setFont(new Font("Arial", Font.BOLD, 12));
        lblAngriff.setForeground(Color.YELLOW);
        lblAngriff.setBackground(new Color(139, 0, 0));
        unterPanel.add(lblAngriff);

        /* Zusammensetzen des South-Bereichs
         * southWrapper verbindet descriptionPanel (oben) und unterPanel (unten).
         */
        JPanel southWrapper = new JPanel();
        southWrapper.setLayout(new BorderLayout());
        southWrapper.setBackground(new Color(139, 0, 0));
        southWrapper.add(descriptionPanel, BorderLayout.NORTH);
        southWrapper.add(unterPanel, BorderLayout.SOUTH);

        remove(descriptionPanel);
        add(southWrapper, BorderLayout.SOUTH);
    }

    /*
     * updateGUI:
     * Überträgt die Daten des Held-Objekts auf die GUI-Komponenten.
     * Lädt das Bild für lblBild.
     */
    private void updateGUI() {
        if (held != null) {
            lblHeldname.setText(held.getName());
            lblTyp.setText(held.getTyp());
            lblBeschreibung.setText(held.getBeschreibung());
            lblLeben.setText("Leben: " + held.getMaxLeben());
            lblRuestung.setText("Rüstung: " + held.getRuestung());
            lblMagieresistenz.setText("Magieresistenz: " + held.getMagieresistenz());
            lblAngriff.setText("Angriff: " + held.getAngrifswert());

            /* Bild laden
             * Versucht ein ImageIcon zu erstellen.
             * Bei exception kommt eine Fehlermeldung.
             */
            try {
                lblBild.setIcon(new ImageIcon(held.getBild()));
            } catch (Exception e) {
                lblBild.setText("Bild nicht gefunden");
            }
        }
    }

    /*
     * Getter für das Objekt.
     */
    public Held getHeld() {
        return held;
    }

    /*
     * Setter für das Held-Objekt
     */
    public void setHeld(Held held) {
        this.held = held;
        updateGUI();
    }
}