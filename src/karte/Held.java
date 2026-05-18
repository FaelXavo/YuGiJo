package karte;

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

    //Konstruktoren
    public Held(String name, String typ, String beschreibung, int maxHP, int currentHP,
                int angrifswert, int ruestung, int magieresistenz, String bild) {

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
    public String getName() {
        return name;
    }

    public String getTyp() {
        return typ;
    }

    public String getBeschreibung() {
        return beschreibung;
    }

    public int getMaxHP() {
        return maxHP;
    }

    public int getCurrentHP() {
        return currentHP;
    }

    public int getAngrifswert() {
        return angrifswert;
    }

    public int getRuestung() {
        return ruestung;
    }

    public int getMagieresistenz() {
        return magieresistenz;
    }

    public String getBild() {
        return bild;
    }

    // Setters
    public void setName(String name) {
        this.name = name;
    }

    public void setTyp(String typ) {
        this.typ = typ;
    }

    public void setBeschreibung(String beschreibung) {
        this.beschreibung = beschreibung;
    }

    public void setMaxHP(int maxHP) {
        this.maxHP = maxHP;
    }

    public void setCurrentHP(int currentHP) {
        this.currentHP = currentHP;
    }

    public void setAngrifswert(int angrifswert) {
        this.angrifswert = angrifswert;
    }

    public void setRuestung(int ruestung) {
        this.ruestung = ruestung;
    }

    public void setMagieresistenz(int magieresistenz) {
        this.magieresistenz = magieresistenz;
    }

    public void setBild(String bild) {
        this.bild = bild;
    }

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

    public void angreifen(Held ziel)
    {
        ziel.leiden(this.angrifswert);
    }

    public void leiden(int schaden)
    {
        this.currentHP -= schaden;
        if (this.currentHP < 0)
            this.currentHP = 0;
    }

    public void heilen(int heilung)
    {
        this.currentHP += heilung;
        if(this.currentHP > this.maxHP)
            this.currentHP = this.maxHP;
    } 
}