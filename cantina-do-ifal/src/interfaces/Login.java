package interfaces;

import javax.swing.JFrame;

public class Login {
    public static void loginWindow() {
        TelaLogin login = new TelaLogin();
        login.setTitle("Login");
        login.setVisible(true);
        login.setBounds(10,10,400,600);
        login.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    
    public static void principal(){
        TelaPrincipal principal = new TelaPrincipal();
        principal.setTitle("Pricipal");
        principal.setVisible(true);
        principal.setBounds(10,10,400,600);
        principal.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
