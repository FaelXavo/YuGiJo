package karte;

/**
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
     */
    public Held(String name, String typ, String beschreibung, int maxHP,
                int angrifswert, int ruestung, int magieresistenz) {

        this.name = name;
        this.typ = typ;
        this.beschreibung = beschreibung;
        this.maxHP = maxHP;
        this.currentHP = currentHP;
        this.angrifswert = angrifswert;
        this.ruestung = ruestung;
        this.magieresistenz = magieresistenz;
        this.bild = bild;
    }

    /**
     * Erzeugt einen Helden mit Werten und einem Namen.
     *
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
     */
    public String getName() {
        return name;
    }

    /**
     * Gibt den Typ des Helden zurück.
     */
    public String getTyp() {
        return typ;
    }

    /**
     * Gibt die Beschreibung des Helden zurück.
     */
    public String getBeschreibung() {
        return beschreibung;
    }

    /**
     * Gibt die maximalen Lebenspunkte des Helden zurück.
     */
    public int getMaxLeben() {
        return maxHP;
    }

    /**
     * Gibt die aktuellen Lebenspunkte des Helden zurück.
     */
    public int getAktLeben() {
        return currentHP;
    }

    /**
     * Gibt den Angriffswert des Helden zurück.
     */
    public int getAngrifswert() {
        return angrifswert;
    }

    /**
     * Gibt den Rüstungswert des Helden zurück.
     */
    public int getRuestung() {
        return ruestung;
    }

    /**
     * Gibt die magische Resistenz des Helden zurück.
     */
    public int getMagieresistenz() {
        return magieresistenz;
    }

    /**
     * Gibt den Dateinamen des Bildes des Helden zurück.
     */
    public String getBild() {
        return bild;
    }

    // Setters

    /**
     * Setzt den Namen des Helden.
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Setzt den Typ des Helden.
     */
    public void setTyp(String typ) {
        this.typ = typ;
    }

    /**
     * Setzt die Beschreibung des Helden.
     */
    public void setBeschreibung(String beschreibung) {
        this.beschreibung = beschreibung;
    }

    /**
     * Setzt die maximalen Lebenspunkte des Helden.
     */
    public void setMaxLeben(int maxHP) {
        this.maxHP = maxHP;
    }

    /**
     * Setzt die aktuellen Lebenspunkte des Helden.
     */
    public void setAktHP(int currentHP) {
        this.currentHP = currentHP;
    }

    /**
     * Setzt den Angriffswert des Helden.
     */
    public void setAngrifswert(int angrifswert) {
        this.angrifswert = angrifswert;
    }

    /**
     * Setzt den Rüstungswert des Helden.
     */
    public void setRuestung(int ruestung) {
        this.ruestung = ruestung;
    }

    /**
     * Setzt die magische Resistenz des Helden.
     */
    public void setMagieresistenz(int magieresistenz) {
        this.magieresistenz = magieresistenz;
    }

    /**
     * Setzt die Bilddatei des Helden.
     */
    public void setBild(String bild) {
        this.bild = bild;
    }

    /**
     * Liefert eine String des Helden mit allen Attributen.
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
     */
    public void angreifen(Held ziel)
    {
        ziel.leiden(this.angrifswert);
    }

    /**
     * Lässt den Helden Schaden erleiden und reduziert die aktuellen Lebenspunkte.
     * Lebenspunkte werden auf 0 begrenzt, falls sie negativ würden.
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
     */
    public void heilen(int heilung)
    {
        this.currentHP += heilung;
        if(this.currentHP > this.maxHP)
            this.currentHP = this.maxHP;
    }
}