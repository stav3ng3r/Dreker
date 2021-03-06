/*
 * Project page https://github.com/stav3ng3r/Dreker
 */
package org.dreker;

import java.io.File;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.dreker.core.Attribute;
import org.dreker.core.PlayerCharacter;
import org.dreker.core.PlayerCharacterInfo;
import org.dreker.core.metatypes.Human;
import org.simpleframework.xml.Serializer;
import org.simpleframework.xml.core.Persister;

/**
 *
 * @author Stav
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Serializer serializer = new Persister();
        PlayerCharacterInfo info = new PlayerCharacterInfo("Scarlet Red", "stav3ng3r", "Fedora", "22", "Female", "Caucasian", "1.6", "69", 2, 1, 1, null, 25, 0, 15000);
        PlayerCharacter pc = new PlayerCharacter(new  Human());
        pc.setPcinfo(info);
        
        File result = new File("example.xml");
        try {
            serializer.write(pc, result);
            //PlayerCharacter pc = serializer.read(PlayerCharacter.class, result);
            //System.out.println(pc.getAttributes().get(0).getValue());
        } catch (Exception ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

}
