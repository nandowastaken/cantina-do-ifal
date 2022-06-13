package interfaces;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TelaFuncionario extends JFrame implements ActionListener{
    Container tela = getContentPane();
    JLabel cadastrarItens = new JLabel("Cadastro:");
    JLabel acrescentarItem = new JLabel("Acrescentar:");
    JLabel resumoItem = new JLabel("Resumo:");
    JLabel label1 = new JLabel("Nome:");
    JLabel label2 = new JLabel("Desc:");
    JLabel label3 = new JLabel("Compra:");
    JLabel label4 = new JLabel("Revenda:");
    JLabel label5 = new JLabel("Quantidade:");
    JLabel label6 = new JLabel("Nome:");
    JLabel label7 = new JLabel("Quantidade:");
    JLabel label8 = new JLabel("Criterio:");
    // Caixas cadastro
    JTextField nomeAdd = new JTextField();
    JTextField descAdd = new JTextField();
    JTextField preco_compraAdd = new JTextField();
    JTextField preco_vendaAdd = new JTextField();
    JTextField quantidade_compradaAdd = new JTextField();
    // Caixas acrescentar item
    JTextField nomeAcre = new JTextField();
    JTextField qtdAcre = new JTextField();
    // Caixas resumo
    JTextField criterioRes = new JTextField();
    //Botões
    JButton cadastrar = new JButton("cadastrar");
    JButton acrescentar = new JButton("acrescentar");
    JButton resumo = new JButton("resumo");
    JButton lucrouPrejuizo = new JButton("Liquido");
    JButton itensQtdBaixa = new JButton("Qtd baixa");

    TelaFuncionario(){
        setLayoutAdm();
        setCaixas();
        addTela();
        ActionEvent();
    }

    public void setLayoutAdm(){
        tela.setLayout(null);
    }

    public void setCaixas(){
        cadastrarItens.setBounds(10,10,100,20);
        acrescentarItem.setBounds(10,170,100,20);
        resumoItem.setBounds(10,250,100,20);
        nomeAdd.setBounds(170,20,200,20);
        label1.setBounds(100,20,100,20);
        descAdd.setBounds(170,45,200,20);
        label2.setBounds(100,45,100,20);
        preco_compraAdd.setBounds(170,70,200,20);
        label3.setBounds(100,70,100,20);
        preco_vendaAdd.setBounds(170,95,200,20);
        label4.setBounds(100,95,100,20);
        quantidade_compradaAdd.setBounds(170,120,200,20);
        label5.setBounds(100,120,100,20);
        nomeAcre.setBounds(170,185,200,20);
        label6.setBounds(100,185,100,20);
        qtdAcre.setBounds(170,210,200,20);
        label7.setBounds(100,210,205,20);
        criterioRes.setBounds(170,270,200,20);
        label8.setBounds(100,270,100,20);
        cadastrar.setBounds(170,145,200,20);
        acrescentar.setBounds(170,235,200,20);
        resumo.setBounds(170,295,200,20);
        lucrouPrejuizo.setBounds(100,500,100,20);
        itensQtdBaixa.setBounds(200,500,100,20);
    }

    public void addTela(){
        tela.add(cadastrarItens);
        tela.add(acrescentarItem);
        tela.add(resumoItem);
        tela.add(nomeAdd);
        tela.add(descAdd);
        tela.add(preco_compraAdd);
        tela.add(preco_vendaAdd);
        tela.add(quantidade_compradaAdd);
        tela.add(nomeAcre);
        tela.add(qtdAcre);
        tela.add(criterioRes);
        tela.add(cadastrar);
        tela.add(acrescentar);
        tela.add(resumo);
        tela.add(lucrouPrejuizo);
        tela.add(itensQtdBaixa);
        tela.add(label1);
        tela.add(label2);
        tela.add(label3);
        tela.add(label4);
        tela.add(label5);
        tela.add(label6);
        tela.add(label7);
        tela.add(label8);
    }

    public void ActionEvent(){
        cadastrar.addActionListener(this);
        acrescentar.addActionListener(this);
        resumo.addActionListener(this);
        itensQtdBaixa.addActionListener(this);
        lucrouPrejuizo.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e){
        if(e.getSource() == cadastrar){
            String nome;
            String desc;
            String preco_compra;
            String preco_venda;
            String quantidade_comprada;

            nome = nomeAdd.getText();
            desc = descAdd.getText();
            quantidade_comprada = quantidade_compradaAdd.getText();
            preco_compra = preco_compraAdd.getText();
            preco_venda = preco_vendaAdd.getText();

            JOptionPane.showMessageDialog(this, "É essa peça que você queria?");
        }else if(e.getSource() == acrescentar){
            String nome;
            String qtd;


            qtd = qtdAcre.getText();
            nome = nomeAcre.getText();

            JOptionPane.showMessageDialog(this, "É essa peça que você queria?");
        }else if(e.getSource() == resumo){
            String criterio;

            criterio = criterioRes.getText();

            JOptionPane.showMessageDialog(this, "É essa peça que você queria?");
        }else if(e.getSource() == itensQtdBaixa){
            JOptionPane.showMessageDialog(this, "É essa peça que você queria?");
        }else if(e.getSource() == lucrouPrejuizo){
            JOptionPane.showMessageDialog(this, "É essa peça que você queria?");
        }
    }
}
