package test;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.Toolkit;

import javax.swing.JFrame;
import javax.swing.WindowConstants;

import karte.Held;
import karte.Karte;

/**
  * GUI-Klasse zum testweisen Anzeigen einer Karte
  *
  * Erstellt eine kleine JFrame-Anwendung, die eine einzelne Karte zur
  * Darstellung eines Helden zeigt.
  */
public class KarteGUI extends JFrame {
  // Anfang Attribute
  /**
   * Test Held, dessen Daten auf der Karte angezeigt werden.
   */
  Held h = new Held("Kitty", "Daemon", "Mistvieh", 25, 75, 50, 50, "./src/kitty.jpg");

  /**
   * Karte Komponente, die den Held anzeigt.
   */
  Karte k = new Karte(h);
  // Ende Attribute

  /**
   * Erzeugt das Testfenster und positioniert es zentriert auf dem Bildschirm.
   * Initialisiert die GUI und fügt die Karte in das Content Pane ein.
   */
  public KarteGUI (String title) {
    super (title);
    setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
    int frameWidth = 300; 
    int frameHeight = 500;
    setSize(frameWidth, frameHeight);
    Dimension d = Toolkit.getDefaultToolkit().getScreenSize();
    int x = (d.width - getSize().width) / 2;
    int y = (d.height - getSize().height) / 2;
    setLocation(x, y);
    Container cp = getContentPane();
    cp.setLayout(new BorderLayout());
    cp.add(k, BorderLayout.CENTER);
    // Anfang Komponenten
    // Ende Komponenten
    setResizable(true);
    setVisible(true);
  }

  // Anfang Methoden
  // Ende Methoden

  /**
   * Startet die Testanwendung.
   */
  public static void main(String[] args) {
    new KarteGUI("KarteGUI");
  }
}