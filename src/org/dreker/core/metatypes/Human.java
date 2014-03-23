/*
 * Project page https://github.com/stav3ng3r/Dreker
 */

package org.dreker.core.metatypes;

import java.util.ArrayList;
import java.util.List;
import org.dreker.core.Attribute;
import org.dreker.core.CharacterType;
import org.simpleframework.xml.Element;

/**
 *
 * @author Stav
 */
public class Human implements CharacterType{
    @Element(name = "characterType")
    private String typeName;

    public Human() {
        this.typeName = "Human";
    }

    @Override
    public String getTypeName() {
        return typeName;
    }

    @Override
    public void setTypeName(String typeName) {
        this.typeName = typeName;
    }

    @Override
    public List<Attribute> setStartingAttributes() {
        List<Attribute> attributes = new ArrayList<>();
        
        attributes.add(new Attribute("Body", 1, 1, 6, 9));
        attributes.add(new Attribute("Agility", 1, 1, 6, 9));
        attributes.add(new Attribute("Reaction", 1, 1, 6, 9));
        attributes.add(new Attribute("Strength", 1, 1, 6, 9));
        attributes.add(new Attribute("Willpower", 1, 1, 6, 9));
        attributes.add(new Attribute("Logic", 1, 1, 6, 9));
        attributes.add(new Attribute("Intuition", 1, 1, 6, 9));
        attributes.add(new Attribute("Charisma", 1, 1, 6, 9));
        attributes.add(new Attribute("Edge", 2, 1, 7, 7));
        attributes.add(new Attribute("Essence", 6, 0, 6, 6));
        attributes.add(new Attribute("Magic", 0, 0, 6, 6));
        attributes.add(new Attribute("Resonance", 0, 0, 6, 6));
        
        return attributes;
    }

    
}
