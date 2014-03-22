	/*
 * Project page https://github.com/stav3ng3r/Dreker
 */
package org.dreker.core;

import org.simpleframework.xml.Element;

/**
 *
 * @author Stav
 */
public class PlayerCharacterInfo {

    @Element(required = false)
    private String name;
    @Element(required = false)
    private String playerName;
    @Element(required = false)
    private String alias;
    @Element(required = false)
    private String age;
    @Element(required = false)
    private String sex;
    @Element(required = false)
    private String ethnicity;
    @Element(required = false)
    private String height;
    @Element(required = false)
    private String weight;
    @Element(required = false)
    private double streetCred;
    @Element(required = false)
    private double notoriety;
    @Element(required = false)
    private double publicAwareness;
    @Element(required = false)
    private String notes;
    @Element(required = false)
    private double karmaLeft;
    @Element(required = false)
    private double karmaTotal;
    @Element(required = false)
    private double nuyen;

    public PlayerCharacterInfo() {
    }

    public PlayerCharacterInfo(String name, String playerName, String alias, String age, String sex, String ethnicity, String height, String weight, double streetCred, double notoriety, double publicAwareness, String notes, double karmaLeft, double karmaTotal, double nuyen) {
        this.name = name;
        this.playerName = playerName;
        this.alias = alias;
        this.age = age;
        this.sex = sex;
        this.ethnicity = ethnicity;
        this.height = height;
        this.weight = weight;
        this.streetCred = streetCred;
        this.notoriety = notoriety;
        this.publicAwareness = publicAwareness;
        this.notes = notes;
        this.karmaLeft = karmaLeft;
        this.karmaTotal = karmaTotal;
        this.nuyen = nuyen;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPlayerName() {
        return playerName;
    }

    public void setPlayerName(String playerName) {
        this.playerName = playerName;
    }

    public String getAlias() {
        return alias;
    }

    public void setAlias(String alias) {
        this.alias = alias;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getEthnicity() {
        return ethnicity;
    }

    public void setEthnicity(String ethnicity) {
        this.ethnicity = ethnicity;
    }

    public String getHeight() {
        return height;
    }

    public void setHeight(String height) {
        this.height = height;
    }

    public String getWeight() {
        return weight;
    }

    public void setWeight(String weight) {
        this.weight = weight;
    }

    public double getStreetCred() {
        return streetCred;
    }

    public void setStreetCred(double streetCred) {
        this.streetCred = streetCred;
    }

    public double getNotoriety() {
        return notoriety;
    }

    public void setNotoriety(double notoriety) {
        this.notoriety = notoriety;
    }

    public double getPublicAwareness() {
        return publicAwareness;
    }

    public void setPublicAwareness(double publicAwareness) {
        this.publicAwareness = publicAwareness;
    }

    public String getNotes() {
        return notes;
    }

    public void setNotes(String notes) {
        this.notes = notes;
    }

    public double getKarmaLeft() {
        return karmaLeft;
    }

    public void setKarmaLeft(double karmaLeft) {
        this.karmaLeft = karmaLeft;
    }

    public double getKarmaTotal() {
        return karmaTotal;
    }

    public void setKarmaTotal(double karmaTotal) {
        this.karmaTotal = karmaTotal;
    }

    public double getNuyen() {
        return nuyen;
    }

    public void setNuyen(double nuyen) {
        this.nuyen = nuyen;
    }

}
