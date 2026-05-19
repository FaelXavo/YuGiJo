package karte;

/**
 * @author Rafael Xavier
 *
 *
 * Repräsentiert einen Helden (Karte) mit Namen, Typ, Beschreibung, Lebenspunkten
 * und statistischen Werten wie Angriff, Rüstung und Magieresistenz.
 *
 * Diese Klasse gibt Getter- und Setter-Methoden für alle Attribute sowie
 * einfache Spielmechaniken: angreifen, leiden und heilen.
 */
public class Held {
    private String name;
    private String typ;
    private String beschreibung;
    private int maxHP;
    private int currentHP;
    private int angrifswert;
    private int ruestung;
    private int magieresistenz;
    private String bild;

    /**
     * Erzeugt einen Helden mit allen angegebenen Eigenschaften.
     *
     * @param name Name des Helden.
     * @param typ Typ des Helden.
     * @param beschreibung Kurzbeschreibung des Helden.
     * @param maxHP Maximale Lebenspunkte des Helden.
     * @param angrifswert Angriffswert des Helden.
     * @param ruestung Rüstungswert des Helden, reduziert physischen Schaden.
     * @param magieresistenz Magieresistenz des Helden, reduziert magischen Schaden.
     * @param bild Dateipfad oder Dateiname des Heldenbildes.
     */
    public Held(String name, String typ, String beschreibung, int maxHP,
                int angrifswert, int ruestung, int magieresistenz, String bild) {

        this.name = name;
        this.typ = typ;
        this.beschreibung = beschreibung;
        this.maxHP = maxHP;
        this.currentHP = maxHP;
        this.angrifswert = angrifswert;
        this.ruestung = ruestung;
        this.magieresistenz = magieresistenz;
        this.bild = bild;
    }

    /**
     * Erzeugt einen Helden mit Werten und einem Namen.
     *
     * @param name Name des Helden.
     */
    public Held(String name) {
        this.name = name;
        this.typ = "Unbekannt";
        this.beschreibung = "Keine Beschreibung";
        this.maxHP = 100;
        this.currentHP = 100;
        this.angrifswert = 10;
        this.ruestung = 5;
        this.magieresistenz = 5;
        this.bild = "default.png";
    }

    // Getters

    /**
     * Gibt den Namen des Helden zurück.
     *
     * @return den Namen des Helden.
     */
    public String getName() {
        return name;
    }

    /**
     * Gibt den Typ des Helden zurück.
     *
     * @return den Typ des Helden.
     */
    public String getTyp() {
        return typ;
    }

    /**
     * Gibt die Beschreibung des Helden zurück.
     *
     * @return die Beschreibung des Helden.
     */
    public String getBeschreibung() {
        return beschreibung;
    }

    /**
     * Gibt die maximalen Lebenspunkte des Helden zurück.
     *
     * @return die maximalen Lebenspunkte des Helden.
     */
    public int getMaxLeben() {
        return maxHP;
    }

    /**
     * Gibt die aktuellen Lebenspunkte des Helden zurück.
     *
     * @return die aktuellen Lebenspunkte des Helden.
     */
    public int getAktLeben() {
        return currentHP;
    }

    /**
     * Gibt den Angriffswert des Helden zurück.
     *
     * @return den Angriffswert des Helden.
     */
    public int getAngrifswert() {
        return angrifswert;
    }

    /**
     * Gibt den Rüstungswert des Helden zurück.
     *
     * @return den Rüstungswert des Helden.
     */
    public int getRuestung() {
        return ruestung;
    }

    /**
     * Gibt die magische Resistenz des Helden zurück.
     *
     * @return die magische Resistenz des Helden.
     */
    public int getMagieresistenz() {
        return magieresistenz;
    }

    /**
     * Gibt den Dateinamen des Bildes des Helden zurück.
     *
     * @return den Dateinamen oder Pfad des Heldbildes.
     */
    public String getBild() {
        return bild;
    }

    // Setters

    /**
     * Setzt den Namen des Helden.
     *
     * @param name Neuer Name des Helden.
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Setzt den Typ des Helden.
     *
     * @param typ Neuer Typ/Kategorie des Helden.
     */
    public void setTyp(String typ) {
        this.typ = typ;
    }

    /**
     * Setzt die Beschreibung des Helden.
     *
     * @param beschreibung Neue Kurzbeschreibung des Helden.
     */
    public void setBeschreibung(String beschreibung) {
        this.beschreibung = beschreibung;
    }

    /**
     * Setzt die maximalen Lebenspunkte des Helden.
     *
     * @param maxHP Neue maximale Lebenspunkte des Helden.
     */
    public void setMaxLeben(int maxHP) {
        this.maxHP = maxHP;
    }

    /**
     * Setzt die aktuellen Lebenspunkte des Helden.
     *
     * @param currentHP Neue aktuellen Lebenspunkte des Helden.
     */
    public void setAktHP(int currentHP) {
        this.currentHP = currentHP;
    }

    /**
     * Setzt den Angriffswert des Helden.
     *
     * @param angrifswert Neuer Angriffswert des Helden.
     */
    public void setAngrifswert(int angrifswert) {
        this.angrifswert = angrifswert;
    }

    /**
     * Setzt den Rüstungswert des Helden.
     *
     * @param ruestung Neuer Rüstungswert des Helden.
     */
    public void setRuestung(int ruestung) {
        this.ruestung = ruestung;
    }

    /**
     * Setzt die magische Resistenz des Helden.
     *
     * @param magieresistenz Neue magische Resistenz des Helden.
     */
    public void setMagieresistenz(int magieresistenz) {
        this.magieresistenz = magieresistenz;
    }

    /**
     * Setzt die Bilddatei des Helden.
     *
     * @param bild Neuer Dateipfad oder Name des Heldbildes.
     */
    public void setBild(String bild) {
        this.bild = bild;
    }

    /**
     * Liefert eine String des Helden mit allen Attributen.
     *
     * @return eine String des Helden mit allen Attributen.
     */
    @Override
    public String toString() 
    {
        return "Held{" +
        "name= " + name + '|' +
        ", typ= " + typ + '|' + 
        ", beschreibung= " + beschreibung + '|' + 
        ", maxHP= " + maxHP + '|' + 
        ", currentHP= " + currentHP + '|' + 
        ", angrifswert= " + angrifswert + '|' + 
        ", ruestung= " + ruestung + '|' + 
        ", magieresistenz= " + magieresistenz + '|' + 
        ", = " + bild + '|' + 
        "}"; 
    }

    /**
     * Führt einen Angriff auf ein anderen Held aus.
     *
     * @param ziel Das Ziel des Angriffs, also der angegriffene Held.
     */
    public void angreifen(Held ziel)
    {
        ziel.leiden(this.angrifswert);
    }

    /**
     * Lässt den Helden Schaden erleiden und reduziert die aktuellen Lebenspunkte.
     * Lebenspunkte werden auf 0 begrenzt, falls sie negativ würden.
     *
     * @param schaden Anzahl an Schadenspunkten, die der Held erleidet.
     */
    public void leiden(int schaden)
    {
        this.currentHP -= schaden;
        if (this.currentHP < 0)
            this.currentHP = 0;
    }

    /**
     * Heilt den Helden um die Menge; die Lebenspunkte werden auf
     * maxHP begrenzt.
     *
     * @param heilung Anzahl an Lebenspunkten, um die der Held geheilt wird.
     */
    public void heilen(int heilung)
    {
        this.currentHP += heilung;
        if(this.currentHP > this.maxHP)
            this.currentHP = this.maxHP;
    }
}
