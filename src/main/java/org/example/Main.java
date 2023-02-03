package org.example;

import java.awt.*;
import java.awt.event.ActionEvent;
import javax.swing.*;
import java.awt.event.ActionListener;
import javax.swing.JLabel;

// Aplicatie creata de Dragu Eduard//

public class Main extends JFrame implements ActionListener {

    JLabel label;
    JRadioButton radioButtons [] = new JRadioButton[5];
    JButton btnNext, btnResult;
    ButtonGroup bg;
    int count = 0, current = 0, x = 1, y = 1, now =0;
    int m[] = new int[10];

    Main (String s){
        super(s);
        label = new JLabel();
        add(label);
        bg = new ButtonGroup();
        for(int i=0; i<5; i++) {
            radioButtons[i] = new JRadioButton();
            add(radioButtons[i]);
            bg.add(radioButtons[i]);

        }
        btnNext = new JButton("Next");
        btnResult = new JButton("Result");
        btnResult.setVisible(false);
        btnResult.addActionListener(this);
        btnNext.addActionListener(this);
        add(btnNext);
        add(btnResult);
        setData();
        label.setBounds(30,40,600,20);
        radioButtons[0].setBounds(50,80,450,20);
        radioButtons[1].setBounds(50,110,200,20);
        radioButtons[2].setBounds(50,140,200,20);
        radioButtons[3].setBounds(50,170,200,20);
        btnNext.setBounds(100,240,100,30);
        btnResult.setBounds(270,240,100,30);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null);
        setLocation(250,100);
        setVisible(true);
        setSize(800,350);

    }

    void setData(){
        radioButtons[4].setSelected(true);
        if(current==0){
            label.setText("Question 1: Ce avion nu a mai zburat comercial din 2003?");
            radioButtons[0].setText("Concorde");
            radioButtons[1].setText("Boeing 747");
            radioButtons[2].setText("Airbus 380");
            radioButtons[3].setText("McDonnell Douglas MD80");

        }
        if(current==1){
            label.setText("Question 2: Cine a fost primul care a observat bacteriile și protozoarele folosind un microscop primitiv?");
            radioButtons[0].setText("Robert Hooke");
            radioButtons[1].setText("Matthias Jakob Schleiden");
            radioButtons[2].setText("Louis Pasteur");
            radioButtons[3].setText("Antonie van Leeuwenhoek");

        }
        if(current==2){
            label.setText("Question 3: Cum se numește prima fosilă ancestrală umană descoperită în anul 1974?");
            radioButtons[0].setText("Lucy");
            radioButtons[1].setText("Otzi");
            radioButtons[2].setText("Timothy");
            radioButtons[3].setText("MD-80");

        }
        if(current==3){
            label.setText("Question 4: Două tipuri de organisme care obțin beneficii unul de la celălalt se numesc:");
            radioButtons[0].setText("Mutualism");
            radioButtons[1].setText("Parasitism");
            radioButtons[2].setText("Amensalism");
            radioButtons[3].setText("Comensalism");

        }
        if(current==4){
            label.setText("Question 5: Când a fost brevetat primul plastic fabricat din materiale artificiale?");
            radioButtons[0].setText("1945");
            radioButtons[1].setText("1909");
            radioButtons[2].setText("2003");
            radioButtons[3].setText("2003");

        }
        if(current==5){
            label.setText("Question 6: Studiul polenului și al sporilor este cunoscut sub numele de:");
            radioButtons[0].setText("Paleobotanică");
            radioButtons[1].setText("Pomologie");
            radioButtons[2].setText("Palinologie");
            radioButtons[3].setText("Paleontologie");

        }
        if(current==6){
            label.setText("Question 7: Care dintre aceste gaze se solidifică pentru a forma gheață uscată?");
            radioButtons[0].setText("Heliu");
            radioButtons[1].setText ("Dioxid de carbon");
            radioButtons[2].setText("Sulf");
            radioButtons[3].setText("Fosfor");

        }
        if(current==7){
            label.setText("Question 8: Cine a inventat cupola geodezică?");
            radioButtons[0].setText("R. Buckminaster Fuller");
            radioButtons[1].setText("Samuel Fuller");
            radioButtons[2].setText("Samuel Morse");
            radioButtons[3].setText("Albert Enstein");

        }
        if(current==8){
            label.setText("Question 9: Cum se numește studiul ciupercilor?");
            radioButtons[0].setText("Virusologie");
            radioButtons[1].setText("Bacteriologie");
            radioButtons[2].setText("Fiziologie");
            radioButtons[3].setText("Micologie");

        }
        if(current==9){
            label.setText("Question 10: Cum se numește în Sistemul Internațional de Unități (SI) o unitate de flux magnetic?");
            radioButtons[0].setText("Weber");
            radioButtons[1].setText("Tesla");
            radioButtons[2].setText("Ampere");
            radioButtons[3].setText("Coulomb");

        }
        label.setBounds(30,40,600,20);
        for(int i=0,j=0; i<=90; i+=30, j++){
            radioButtons[j].setBounds(50,80+i,200,20);
            }



    }
    boolean checkAns() {
        if (current == 0) {
            return (radioButtons[0].isSelected());
        }
        if (current == 1) {
            return (radioButtons[3].isSelected());
        }
        if (current == 2) {
            return (radioButtons[0].isSelected());
        }
        if (current == 3) {
            return (radioButtons[0].isSelected());
        }
        if (current == 4) {
            return (radioButtons[1].isSelected());
        }
        if (current == 5) {
            return (radioButtons[2].isSelected());
        }
        if (current == 6) {
            return (radioButtons[1].isSelected());
        }
        if (current == 7) {
            return (radioButtons[0].isSelected());
        }
        if (current == 8) {
            return (radioButtons[3].isSelected());
        }
        if (current == 9) {
            return (radioButtons[0].isSelected());
        }

            return false;
    }
    public static void main(String[] args) {
       new Main ("Simple Quiz App");

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() ==btnNext){
            if(checkAns())
                count = count +1;
            current++;
            setData();
            if(current==9){
                btnNext.setEnabled(false);
                btnResult.setVisible(true);
                btnResult.setText("Result");


            }
        }

        if(e.getActionCommand().equals("Result")){
            if(checkAns())
                count = count +1;
            current++;
            JOptionPane.showMessageDialog(this, "Correct Answers are"+count);
            System.exit(0);
        }
    }
}