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

    }

    public void setLayoutAdm(){
        tela.setLayout(null);
    }

    public void setCaixas(){
        cadastrarItens.setBounds(10,10,100,30);
        acrescentarItem.setBounds(10,110,100,30);
        resumoItem.setBounds(10,180,100,30);
        nomeAdd.setBounds(110,10,100,30);
        descAdd.setBounds(220,10,100,30);
        preco_compraAdd.setBounds(110,40,100,30);
        preco_vendaAdd.setBounds(220,40,100,30);
        quantidade_compradaAdd.setBounds(110,70,100,30);
        nomeAcre.setBounds(110,110,100,30);
        qtdAcre.setBounds(220,110,100,30);
        criterioRes.setBounds(110,180,100,30);
        cadastrar.setBounds(220,70,100,30);
        acrescentar.setBounds(110,140,210,30);
        resumo.setBounds(220,180,100,30);
        lucrouPrejuizo.setBounds(100,500,100,30);
        itensQtdBaixa.setBounds(200,500,100,30);
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
    }


    @Override
    public void actionPerformed(ActionEvent e){

    }
}
