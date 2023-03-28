
package bank.management.system;

import java.awt.*;
import java.awt.event.*;
import java.util.Locale;
import javax.swing.*;


public class Transactions extends JFrame implements ActionListener{
    
    JButton deposite,exit,withdrawl,fastaash,minisatetement,pinchange,balanceenquiry;
    String pinnumber;
    
    Transactions(String pinnumber){
        
        this.pinnumber = pinnumber;
        
        setLayout(null);
        
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/atm.jpg"));
        Image i2 = i1.getImage().getScaledInstance(900, 900, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(0, 0, 900, 900);
        add(image);
        
        JLabel text = new JLabel("Please select your transaction");
        text.setBounds(210, 300, 700, 35);
        text.setForeground(Color.WHITE);
        text.setFont(new Font("System", Font.BOLD, 16));
        image.add(text);
        
        deposite = new JButton("Deposite");
        deposite.setBounds(170, 415, 150, 30);
        deposite.addActionListener(this);
        image.add(deposite);
        
        withdrawl = new JButton("Cash Withdrawl");
        withdrawl.setBounds(355, 415, 150, 30);
        withdrawl.addActionListener(this);
        image.add(withdrawl);
        
        fastaash = new JButton("Fast Cash");
        fastaash.setBounds(170, 450, 150, 30);
        fastaash.addActionListener(this);
        image.add(fastaash);
        
        minisatetement = new JButton("Mini Statement");
        minisatetement.setBounds(355, 450, 150, 30);
        minisatetement.addActionListener(this);
        image.add(minisatetement);
        
        pinchange = new JButton("Pin Change");
        pinchange.setBounds(170, 485, 150, 30);
        pinchange.addActionListener(this);
        image.add(pinchange);
        
        balanceenquiry = new JButton("Balance Inquery");
        balanceenquiry.setBounds(355, 485, 150, 30);
        balanceenquiry.addActionListener(this);
        image.add(balanceenquiry);
        
        exit = new JButton("Exit");
        exit.setBounds(355, 520, 150, 30);
        exit.addActionListener(this);
        image.add(exit);

        
        setSize(900,900);
        setLocation(300,0);
        //setUndecorated(true);
        setVisible(Boolean.TRUE);
    }
    
    @Override
    public void actionPerformed(ActionEvent ae) {
        if(ae.getSource()==exit){
            System.exit(0);
        } else if (ae.getSource()==deposite){
            setVisible(false);
            new Deposit(pinnumber).setVisible(true); 
        } else if (ae.getSource()==withdrawl){
            setVisible(false);
            new Withdrawl(pinnumber).setVisible(true);
        }
    }
    
    public static void main(String[] args) {
        new Transactions("");
        
    }

    
}
