/*
 * Project page https://github.com/stav3ng3r/Dreker
 */

package org.dreker.core;

import org.simpleframework.xml.Attribute;
import org.simpleframework.xml.Element;
import org.simpleframework.xml.Root;

/**
 *
 * @author Stav
 */

@Root
public class PlayerCharacter {
    @Element(name = "info")
    private PlayerCharacterInfo pcinfo;
    
    @Attribute(name = "id")
    private int index;

    public PlayerCharacter() {
    }

    public PlayerCharacter(PlayerCharacterInfo pcinfo, int index) {
        this.pcinfo = pcinfo;
        this.index = index;
    }

    public PlayerCharacterInfo getPcinfo() {
        return pcinfo;
    }

    public void setPcinfo(PlayerCharacterInfo pcinfo) {
        this.pcinfo = pcinfo;
    }

    public int getIndex() {
        return index;
    }

    public void setIndex(int index) {
        this.index = index;
    }
    
    
    
}
