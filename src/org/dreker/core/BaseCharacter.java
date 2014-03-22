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
        attributes = new ArrayList<>();
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

}
