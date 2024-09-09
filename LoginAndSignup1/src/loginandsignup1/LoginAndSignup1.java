
package loginandsignup1;

import com.formdev.flatlaf.FlatLightLaf;


public class LoginAndSignup1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        
        FlatLightLaf.setup();
        
        Login LoginFrame = new Login(); 
        LoginFrame.setVisible(true);
        LoginFrame.pack();
        LoginFrame.setLocationRelativeTo(null);
    
}
}