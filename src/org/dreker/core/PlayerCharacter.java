/*
 * Project page https://github.com/stav3ng3r/Dreker
 */
package org.dreker.core;

import java.util.Random;
import org.simpleframework.xml.Attribute;
import org.simpleframework.xml.Element;

/**
 *
 * @author Stav
 */

public class PlayerCharacter extends BaseCharacter {

    @Element(name = "npc")
    private boolean npc = false;

    @Element(name = "info")
    private PlayerCharacterInfo pcinfo;

    @Attribute(name = "id")
    private int index;

    public PlayerCharacter() {
    }
    
    public PlayerCharacter(CharacterType type){
        super.setType(type);
        super.setAttributes(super.getType().setStartingAttributes());
        this.index = new Random().nextInt(1000)+1;
    }

    public boolean isNpc() {
        return npc;
    }

    public void setNpc(boolean npc) {
        this.npc = npc;
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
