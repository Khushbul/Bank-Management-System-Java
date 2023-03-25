
package bank.management.system;

import java.awt.*;
import javax.swing.*;
import java.util.*;
import java.awt.event.*;
import com.toedter.calendar.JDateChooser;

public class SignupTwo extends JFrame implements ActionListener {
    
    long random;
    JTextField nameTextField, fnameTextField, emailTextField, addressTextField, cityTextField, stateTextField, pincodeTextField;
    JDateChooser dateChooser;
    JRadioButton male, female, married, unmarried, other;
    JButton next;
    JComboBox religion, category, income, education, occupation;
    
    SignupTwo(){
        
        setLayout(null);
        
        setTitle("NEW ACCOUNT APPLICATION FORM - PAGE 2");

        
        JLabel additionalDetails = new JLabel("Page 2: Additional Details");
        additionalDetails.setFont(new Font("Railway", Font.BOLD, 22));
        additionalDetails.setBounds(290, 80, 400, 30);
        add(additionalDetails);
        
        JLabel religion_name = new JLabel("Religion: ");
        religion_name.setFont(new Font("Railway", Font.BOLD, 20));
        religion_name.setBounds(100, 140, 100, 30);
        add(religion_name);
        
        String valReligion[]={"Muslim","Hindu","Sikh","Christian","Other"};
        religion = new JComboBox(valReligion);
        religion.setBounds(300, 140, 400, 30);
        religion.setBackground(Color.WHITE);
        add(religion);
        
       
        
        JLabel catname = new JLabel("Category: ");
        catname.setFont(new Font("Railway", Font.BOLD, 20));
        catname.setBounds(100, 190, 200, 30);
        add(catname);
        
        String valCategory[]={"Genaral","OBC","SC","ST","Other"};
        category = new JComboBox(valCategory);
        category.setBounds(300, 190, 400, 30);
        category.setBackground(Color.WHITE);
        add(category);

        
        JLabel dob = new JLabel("Income: ");
        dob.setFont(new Font("Railway", Font.BOLD, 20));
        dob.setBounds(100, 240, 200, 30);
        add(dob);
        
        String valIncome[]={"Null","< 1,50,000","< 2,50,000","< 5,00,000","Upto 10,00,000"};
        income = new JComboBox(valIncome);
        income.setBounds(300, 240, 400, 30);
        income.setBackground(Color.WHITE);
        add(income);

        JLabel gender = new JLabel("Education: ");
        gender.setFont(new Font("Railway", Font.BOLD, 20));
        gender.setBounds(100, 290, 200, 30);
        add(gender);
        
        String eduVal[]={"Non-Graduation","Graduate","Post-Graduate","Doctorate","Others"};
        education = new JComboBox(eduVal);
        education.setBounds(300, 315, 400, 30);
        education.setBackground(Color.WHITE);
        add(education);
        
        JLabel EduName = new JLabel("Qualification: ");
        EduName.setFont(new Font("Railway", Font.BOLD, 20));
        EduName.setBounds(100, 315, 200, 30);
        add(EduName);
        
        JLabel marital = new JLabel("Occupation: ");
        marital.setFont(new Font("Railway", Font.BOLD, 20));
        marital.setBounds(100, 390, 200, 30);
        add(marital);

        String occuVal[]={"Salaried","Self-Employed","Bussiness","Student","Retired","Others"};
        occupation = new JComboBox(occuVal);
        occupation.setBounds(300, 390, 400, 30);
        occupation.setBackground(Color.WHITE);
        add(occupation);
        
        
       
        
        JLabel address = new JLabel("Pan Number: ");
        address.setFont(new Font("Railway", Font.BOLD, 20));
        address.setBounds(100, 440, 200, 30);
        add(address);
        
        
        addressTextField = new JTextField();
        addressTextField.setFont(new Font("Railway", Font.BOLD, 16));
        addressTextField.setBounds(300, 440, 400, 30);
        addressTextField.addActionListener(this);
        add(addressTextField);
        
        
        JLabel city = new JLabel("Adhar No: ");
        city.setFont(new Font("Railway", Font.BOLD, 20));
        city.setBounds(100, 490, 200, 30);
        add(city);
        
        
        cityTextField = new JTextField();
        cityTextField.setFont(new Font("Railway", Font.BOLD, 16));
        cityTextField.setBounds(300, 490, 400, 30);
        cityTextField.addActionListener(this);
        add(cityTextField);
        
        
        JLabel state = new JLabel("Senior Citygen: ");
        state.setFont(new Font("Railway", Font.BOLD, 20));
        state.setBounds(100, 540, 200, 30);
        add(state);
        
        
        stateTextField = new JTextField();
        stateTextField.setFont(new Font("Railway", Font.BOLD, 16));
        stateTextField.setBounds(300, 540, 400, 30);
        stateTextField.addActionListener(this);
        add(stateTextField);
        
        
        JLabel pincode = new JLabel("Existing Account: ");
        pincode.setFont(new Font("Railway", Font.BOLD, 20));
        pincode.setBounds(100, 590, 200, 30);
        add(pincode);
        
        
        pincodeTextField = new JTextField();
        pincodeTextField.setFont(new Font("Railway", Font.BOLD, 16));
        pincodeTextField.setBounds(300, 590, 400, 30);
        pincodeTextField.addActionListener(this);
        add(pincodeTextField);
        
        next = new JButton("Next");
        next.setBackground(Color.BLACK);
        next.setForeground(Color.WHITE);
        next.setFont(new Font("Railway", Font.BOLD, 16));
        next.setBounds(620, 660, 80, 30);
        next.addActionListener(this);
        add(next);
        
        getContentPane().setBackground(Color.WHITE);
        
        //Creation of Frame
        setSize(850,800);
        setLocation(350,10);
        setVisible(true);
    
    
    }
    
    @Override
    public void actionPerformed(ActionEvent ae){
        
        String formno = "" + random;
        String name = nameTextField.getText();
        String fname = fnameTextField.getText();
        String dob = ((JTextField)dateChooser.getDateEditor().getUiComponent()).getText();
        String gender = null;
        if (male.isSelected()){
        gender = "Male";
        } else if (female.isSelected()){
        gender = "Female";
        }
        String email = emailTextField.getText();
        String marital = null;
        if (married.isSelected()){
            marital = "Married";
        } else if (unmarried.isSelected()){
            marital = "Unmarried";
        } else if (other.isSelected()) {
            marital = "Other";
        }
        String address = addressTextField.getText();
        String city = cityTextField.getText();
        String state = stateTextField.getText();
        String pin = pincodeTextField.getText();
        
        try {
            if (name.equals("")){
                JOptionPane.showMessageDialog(null, "name is Required");
            } else {
                Conn c = new Conn();
                String query = "insert into signup values('"+formno+"', '"+name+"', '"+fname+"', '"+dob+"', '"+gender+"', '"+email+"', '"+marital+"', '"+address+"', '"+city+"', '"+pin+"', '"+state+"')";
                c.s.executeUpdate(query);
            }
        } catch (Exception e){
            System.err.println(e);
        }
    
    }
    
    
    public static void main(String args[]){
        new SignupTwo();
    }
}
