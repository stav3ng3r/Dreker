/*
 * Project page https://github.com/stav3ng3r/Dreker
 */
package org.dreker.core;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Stav
 */
public interface CharacterType {

    public String getTypeName();

    public void setTypeName(String typeName);

    public List<Attribute> setStartingAttributes();

}
