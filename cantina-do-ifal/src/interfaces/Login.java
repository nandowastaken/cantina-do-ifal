package interfaces;

import javax.swing.JFrame;

public class Login {
    public static void main(String[] args){
        TelaLogin login = new TelaLogin();
        login.setTitle("Login");
        login.setVisible(true);
        login.setBounds(10,10,400,600);
        login.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
