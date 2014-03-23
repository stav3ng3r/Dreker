/*
 * Project page https://github.com/stav3ng3r/Dreker
 */
package org.dreker.core;

import java.util.ArrayList;
import java.util.List;
import org.simpleframework.xml.Element;
import org.simpleframework.xml.ElementList;
import org.simpleframework.xml.Root;

/**
 *
 * @author Stav
 */

@Root(name = "character")
public class BaseCharacter {
    
    @ElementList(type = Attribute.class, inline = false, name = "attributes")
    private List<Attribute> attributes;
    @Element(required = false)
    private CharacterType type;

    public BaseCharacter() {       
    }

    public List<Attribute> getAttributes() {
        return attributes;
    }

    public void setAttributes(List<Attribute> attributes) {
        this.attributes = attributes;
    }

    public CharacterType getType() {
        return type;
    }

    public void setType(CharacterType type) {
        this.type = type;
    }
    
    public Attribute getBody(){
        for (Attribute attribute : attributes) {
            if(attribute.getName().equals("Body")) return attribute;
        }
        return null;
    }
    public Attribute getAgility(){
        for (Attribute attribute : attributes) {
            if(attribute.getName().equals("Agility")) return attribute;
        }
        return null;
    }
    public Attribute getReaction(){
        for (Attribute attribute : attributes) {
            if(attribute.getName().equals("Reaction")) return attribute;
        }
        return null;
    }
    public Attribute getStrength(){
        for (Attribute attribute : attributes) {
            if(attribute.getName().equals("Strength")) return attribute;
        }
        return null;
    }
    public Attribute getWillpower(){
        for (Attribute attribute : attributes) {
            if(attribute.getName().equals("Willpower")) return attribute;
        }
        return null;
    }
    public Attribute getLogic(){
        for (Attribute attribute : attributes) {
            if(attribute.getName().equals("Logic")) return attribute;
        }
        return null;
    }
    public Attribute getIntuition(){
        for (Attribute attribute : attributes) {
            if(attribute.getName().equals("Intuition")) return attribute;
        }
        return null;
    }
    public Attribute getCharisma(){
        for (Attribute attribute : attributes) {
            if(attribute.getName().equals("Christma")) return attribute;
        }
        return null;
    }
    public Attribute getEdge(){
        for (Attribute attribute : attributes) {
            if(attribute.getName().equals("Edge")) return attribute;
        }
        return null;
    }
    public Attribute getEssence(){
        for (Attribute attribute : attributes) {
            if(attribute.getName().equals("Essence")) return attribute;
        }
        return null;
    }
    public Attribute getMagic(){
        for (Attribute attribute : attributes) {
            if(attribute.getName().equals("Magic")) return attribute;
        }
        return null;
    }
    public Attribute getResonance(){
        for (Attribute attribute : attributes) {
            if(attribute.getName().equals("Resonance")) return attribute;
        }
        return null;
    }

}
