package interfaces;

import javax.swing.*;

import database.Selection;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;


public class TelaLogin extends JFrame implements ActionListener{
	private boolean logged = false;
    Container tela = getContentPane();
    JLabel email = new JLabel("Email:");
    JLabel senha = new JLabel("Senha:");
    JTextField caixaEmail = new JTextField();
    JPasswordField caixaSenha = new JPasswordField();
    JButton entrar = new JButton("LOGIN");

    TelaLogin(){
        setLayoutAdm();
        setCaixas();
        addTela();
        ActionEvent();
    }
    public void setLayoutAdm(){
        tela.setLayout(null);
    }
    public void setCaixas(){
        email.setBounds(100,150,100,30);
        senha.setBounds(100,200,100,30);
        caixaEmail.setBounds(150,150,100,30);
        caixaSenha.setBounds(150,200,100,30);
        entrar.setBounds(150,300,100,30);
    }
    public void addTela(){
        tela.add(email);
        tela.add(senha);
        tela.add(caixaEmail);
        tela.add(caixaSenha);
        tela.add(entrar);
    }
    public void ActionEvent(){
        entrar.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == entrar){
            String emailTexto;
            String senhaTexto;
            emailTexto = caixaEmail.getText();
            senhaTexto = caixaSenha.getText();
            
            // Login
            Selection selectionFuncionario = new Selection();
            List<String[]> dados = selectionFuncionario.SelectFuncionario();
            String email;
            String senha;
            
            // Checa se o email e a senha são válidos
            for (int i=0; i < dados.size(); i++) {
            	String[] login_func = dados.get(i);
            	
            	if (login_func[0].equals(emailTexto) && login_func[1].equals(senhaTexto)) {
            		email = login_func[0];
            		senha = login_func[1];
            		
            		this.logged = true;
            		break;
            	}
            }
            
            if (this.logged){
                Login login = new Login();
                login.funcionario();
                this.logged = false;
                dispose();
                
                
            }else{
                JOptionPane.showMessageDialog(this, "Digite um valor valido");
            }
            //Acrescentar verificação no SQL
        }
    }
    
}
