package spiel;

import karte.Held;

/**
 * Klasse zum Starten des Spiels "Prince of Darkness".
 *
 */
public class StartSpiel {

  /**
   * Anfang der Anwendung. Erstellt zwei Helden und öffnet
   * das Window (PrinceOfDarkness).
   */
  public static void main(String[] args) {
    Held kitty = new Held("Kitty", "D�mon", "Dschinn der 4. Kategorie", 10, 100, 0, 90);
    Held muffin = new Held("Monstermuffins", "D�mon", "B�ses Lebensmittel", 50, 149, 0, 1);
    new PrinceOfDarkness("Prince of Darkness", kitty, muffin);
  }
}