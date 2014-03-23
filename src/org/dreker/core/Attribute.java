/*
 * Project page https://github.com/stav3ng3r/Dreker
 */
package org.dreker.core;

import java.util.List;

/**
 *
 * @author Stav
 */
public class Attribute {

    private String name;
    private double value;
    private double base;
    private double naturalLimit;
    private double augmentedLimit;
    private List<AttributeModifier> modifiers;

    public Attribute() {
    }

    public Attribute(String name, int value, int base, int naturalLimit, int augmentedLimit) {
        this.name = name;
        this.value = value;
        this.base = base;
        this.naturalLimit = naturalLimit;
        this.augmentedLimit = augmentedLimit;
    }

    public List<AttributeModifier> getModifiers() {
        return modifiers;
    }

    public void setModifiers(List<AttributeModifier> modifiers) {
        this.modifiers = modifiers;
    }

    public double getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public String getName() {
        return name;
    }
    
    public String getShortName(){
        return name.substring(0, 4);
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getNaturalLimit() {
        return naturalLimit;
    }

    public void setNaturalLimit(int naturalLimit) {
        this.naturalLimit = naturalLimit;
    }

    public double getAugmentedLimit() {
        return augmentedLimit;
    }

    public void setAugmentedLimit(int augmentedLimit) {
        this.augmentedLimit = augmentedLimit;
    }

}
