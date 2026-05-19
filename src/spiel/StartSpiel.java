package spiel;

import karte.Held;

/**
 * Klasse zum Starten des Spiels "Prince of Darkness".
 *
 */
public class StartSpiel {

  /**
   * Anfang der Anwendung. Erstellt zwei Helden und öffnet
   * das Window.
   *
    * @param args Ausführung der Anwendung.
   */
  public static void main(String[] args) {
    Held kitty = new Held("Kitty", "D�mon", "Dschinn der 4. Kategorie", 100, 40, 0, 90, 
    		"./src/kitty.jpg");
    Held muffin = new Held("BesterLehrerBoss", "D�mon", "B�ses Lebensmittel", 200, 80, 0, 1, 
    		"./src/FinalBoss.png");
    new PrinceOfDarkness("Prince of Darkness", kitty, muffin);
  }
}