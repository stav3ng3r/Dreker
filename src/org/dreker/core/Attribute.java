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
    private int value;
    private int naturalLimit;
    private int augmentedLimit;
    private List<AttributeModifier> modifiers;

    public Attribute() {
    }

    public Attribute(String name, int value, int naturalLimit, int augmentedLimit) {
        this.name = name;
        this.value = value;
        this.naturalLimit = naturalLimit;
        this.augmentedLimit = augmentedLimit;
    }

    public List<AttributeModifier> getModifiers() {
        return modifiers;
    }

    public void setModifiers(List<AttributeModifier> modifiers) {
        this.modifiers = modifiers;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNaturalLimit() {
        return naturalLimit;
    }

    public void setNaturalLimit(int naturalLimit) {
        this.naturalLimit = naturalLimit;
    }

    public int getAugmentedLimit() {
        return augmentedLimit;
    }

    public void setAugmentedLimit(int augmentedLimit) {
        this.augmentedLimit = augmentedLimit;
    }

}
