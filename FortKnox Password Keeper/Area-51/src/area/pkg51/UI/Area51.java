/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package area.pkg51.UI;
import java.security.Security;
import org.bouncycastle.jce.provider.BouncyCastleProvider;
/**
 *
 * @author SilverPanda
 */
public class Area51 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Security.addProvider(new BouncyCastleProvider());
        getStarted.go();
    }
    
}
