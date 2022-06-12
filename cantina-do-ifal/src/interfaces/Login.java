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
    
    public static void main(String[] args) {
        TelaFuncionario funcionario = new TelaFuncionario();
        funcionario.setTitle("Funcionario");
        funcionario.setVisible(true);
        funcionario.setBounds(10,10,400,600);
        funcionario.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
