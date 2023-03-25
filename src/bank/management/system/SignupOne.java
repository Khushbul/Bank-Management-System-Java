
package bank.management.system;

import java.awt.*;
import javax.swing.*;
import java.util.*;
import java.awt.event.*;
import com.toedter.calendar.JDateChooser;

public class SignupOne extends JFrame implements ActionListener {
    
    SignupOne(){
        
        setLayout(null);
        
        Random ran = new Random();
        long  random= Math.abs((ran.nextLong()%9000L)+1000L);
        
        JLabel formno = new JLabel("APPLICATION FORM NO. " + random);
        formno.setFont(new Font("Railway", Font.BOLD, 38));
        formno.setBounds(140, 20, 600, 40);
        add(formno);
        
        JLabel personalDetails = new JLabel("Page 1: Personal Details");
        personalDetails.setFont(new Font("Railway", Font.BOLD, 22));
        personalDetails.setBounds(290, 80, 400, 30);
        add(personalDetails);
        
        JLabel name = new JLabel("Name: ");
        name.setFont(new Font("Railway", Font.BOLD, 20));
        name.setBounds(100, 140, 100, 30);
        add(name);
        
        JTextField nameTextField = new JTextField();
        nameTextField.setFont(new Font("Railway", Font.BOLD, 16));
        nameTextField.setBounds(300, 140, 400, 30);
        nameTextField.addActionListener(this);
        add(nameTextField);
        
        JLabel fname = new JLabel("Fathers Name: ");
        fname.setFont(new Font("Railway", Font.BOLD, 20));
        fname.setBounds(100, 190, 200, 30);
        add(fname);
        
        JTextField fnameTextField = new JTextField();
        fnameTextField.setFont(new Font("Railway", Font.BOLD, 16));
        fnameTextField.setBounds(300, 190, 400, 30);
        fnameTextField.addActionListener(this);
        add(fnameTextField);
        
        JLabel dob = new JLabel("Date Of Birth: ");
        dob.setFont(new Font("Railway", Font.BOLD, 20));
        dob.setBounds(100, 240, 200, 30);
        add(dob);
        
        JDateChooser dateChooser = new JDateChooser();
        dateChooser.setBounds(300, 240, 200, 30);
        add(dateChooser);
        
        JLabel gender = new JLabel("Gender: ");
        gender.setFont(new Font("Railway", Font.BOLD, 20));
        gender.setBounds(100, 290, 200, 30);
        add(gender);
        
        JLabel emial = new JLabel("Email: ");
        emial.setFont(new Font("Railway", Font.BOLD, 20));
        emial.setBounds(100, 340, 200, 30);
        add(emial);
        
        JTextField emailTextField = new JTextField();
        emailTextField.setFont(new Font("Railway", Font.BOLD, 16));
        emailTextField.setBounds(300, 340, 400, 30);
        emailTextField.addActionListener(this);
        add(emailTextField);
        
        
        JLabel marital = new JLabel("Marital Status: ");
        marital.setFont(new Font("Railway", Font.BOLD, 20));
        marital.setBounds(100, 390, 200, 30);
        add(marital);
        
        JLabel address = new JLabel("Address: ");
        address.setFont(new Font("Railway", Font.BOLD, 20));
        address.setBounds(100, 440, 200, 30);
        add(address);
        
        
        JTextField addressTextField = new JTextField();
        addressTextField.setFont(new Font("Railway", Font.BOLD, 16));
        addressTextField.setBounds(300, 440, 400, 30);
        addressTextField.addActionListener(this);
        add(addressTextField);
        
        
        JLabel city = new JLabel("City: ");
        city.setFont(new Font("Railway", Font.BOLD, 20));
        city.setBounds(100, 490, 200, 30);
        add(city);
        
        
        JTextField cityTextField = new JTextField();
        cityTextField.setFont(new Font("Railway", Font.BOLD, 16));
        cityTextField.setBounds(300, 490, 400, 30);
        cityTextField.addActionListener(this);
        add(cityTextField);
        
        
        JLabel state = new JLabel("State: ");
        state.setFont(new Font("Railway", Font.BOLD, 20));
        state.setBounds(100, 540, 200, 30);
        add(state);
        
        
        JTextField stateTextField = new JTextField();
        stateTextField.setFont(new Font("Railway", Font.BOLD, 16));
        stateTextField.setBounds(300, 540, 400, 30);
        stateTextField.addActionListener(this);
        add(stateTextField);
        
        
        JLabel pincode = new JLabel("Pin Code: ");
        pincode.setFont(new Font("Railway", Font.BOLD, 20));
        pincode.setBounds(100, 590, 200, 30);
        add(pincode);
        
        
        JTextField pincodeTextField = new JTextField();
        pincodeTextField.setFont(new Font("Railway", Font.BOLD, 16));
        pincodeTextField.setBounds(300, 590, 400, 30);
        pincodeTextField.addActionListener(this);
        add(pincodeTextField);
        
        
        
        
        getContentPane().setBackground(Color.WHITE);
        
        //Creation of Frame
        setSize(850,800);
        setLocation(350,10);
        setVisible(true);
    
    
    }
    
    @Override
    public void actionPerformed(ActionEvent ae){
    
    }
    
    
    public static void main(String args[]){
        new SignupOne();
    }
}
