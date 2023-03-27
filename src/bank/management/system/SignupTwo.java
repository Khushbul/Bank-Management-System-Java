
package bank.management.system;

import java.awt.*;
import javax.swing.*;
//import java.util.*;
import java.awt.event.*;
//import com.toedter.calendar.JDateChooser;

public class SignupTwo extends JFrame implements ActionListener {
    
    JTextField panTextField, adharTextField;
    JRadioButton syes, sno, exyes, exno;
    JButton next;
    JComboBox religion, category, income, education, occupation;
    String formno;
    
    SignupTwo(String formno){
        this.formno = formno;
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
        
        
        JLabel panno = new JLabel("Pan Number: ");
        panno.setFont(new Font("Railway", Font.BOLD, 20));
        panno.setBounds(100, 440, 200, 30);
        add(panno);
        
        
        panTextField = new JTextField();
        panTextField.setFont(new Font("Railway", Font.BOLD, 16));
        panTextField.setBounds(300, 440, 400, 30);
        panTextField.addActionListener(this);
        add(panTextField);
        
        
        JLabel adharno = new JLabel("Adhar No: ");
        adharno.setFont(new Font("Railway", Font.BOLD, 20));
        adharno.setBounds(100, 490, 200, 30);
        add(adharno);
        
        
        adharTextField = new JTextField();
        adharTextField.setFont(new Font("Railway", Font.BOLD, 16));
        adharTextField.setBounds(300, 490, 400, 30);
        adharTextField.addActionListener(this);
        add(adharTextField);
        
        
        JLabel SCityGen = new JLabel("Senior Citygen: ");
        SCityGen.setFont(new Font("Railway", Font.BOLD, 20));
        SCityGen.setBounds(100, 540, 200, 30);
        add(SCityGen);
        
        
        syes = new JRadioButton("YES");
        syes.setBounds(300, 540, 60, 30);
        syes.setBackground(Color.WHITE);
        add(syes);
        
        sno = new JRadioButton("No");
        sno.setBounds(450, 540, 60, 30);
        sno.setBackground(Color.WHITE);
        add(sno);
        
        ButtonGroup sgroup = new ButtonGroup();
        sgroup.add(syes);
        sgroup.add(sno);
        
        JLabel exname = new JLabel("Existing Account: ");
        exname.setFont(new Font("Railway", Font.BOLD, 20));
        exname.setBounds(100, 590, 200, 30);
        add(exname);
        
        exyes = new JRadioButton("YES");
        exyes.setBounds(300, 590, 60, 30);
        exyes.setBackground(Color.WHITE);
        add(exyes);
        
        exno = new JRadioButton("No");
        exno.setBounds(450, 590, 60, 30);
        exno.setBackground(Color.WHITE);
        add(exno);
        
        ButtonGroup exgroup = new ButtonGroup();
        exgroup.add(exyes);
        exgroup.add(exno);
        
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
        getContentPane().setBackground(Color.WHITE);
    
    
    }
    
    @Override
    public void actionPerformed(ActionEvent ae){
        
     
        String sreligion = (String) religion.getSelectedItem();
        String scategory = (String) category.getSelectedItem();
        String sincome  = (String) income.getSelectedItem();
        String seducation = (String) education.getSelectedItem();
        String soccupation = (String) occupation.getSelectedItem();
        
        String seniorcitizen = null;
        if (syes.isSelected()){
        seniorcitizen = "Yes";
        } else if (sno.isSelected()){
        seniorcitizen = "No";
        }
        String existingaccount = null;
        if (exyes.isSelected()){
            existingaccount = "Yes";
        } else if (exno.isSelected()){
            existingaccount = "No";
        }
        
        String span = panTextField.getText();
        String saadhar = adharTextField.getText();
        
        
        try {
                Conn c = new Conn();
                String query = "insert into signuptwo values('"+formno+"', '"+sreligion+"', '"+scategory+"', '"+sincome+"', '"+seducation+"', '"+soccupation+"', '"+span+"', '"+saadhar+"', '"+seniorcitizen+"', '"+existingaccount+"')";
                c.s.executeUpdate(query);
                
                setVisible(false);
                new SignupThree(formno).setVisible(true);
                
        } catch (Exception e){
            System.err.println(e);
        }
    
    }
    
    
    public static void main(String args[]){
        new SignupTwo("");
    }
}
