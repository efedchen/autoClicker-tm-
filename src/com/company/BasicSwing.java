package com.company;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class BasicSwing extends JFrame {

    protected double interval;
    protected String [] range ={"0.1","0.2","0.3","0.5","1","2",
            "3","4","5","6","7","8","9","10"};

    protected JPanel mainPanel = new JPanel();

    protected JButton startButton = new JButton("Start");
    protected JButton moveButton = new JButton("Move");
    protected JComboBox intervalJComboBox= new JComboBox (range);

    protected ActionListener actionListener = new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            intervalJComboBox.addActionListener(this);
            intervalJComboBox = (JComboBox)e.getSource();
                interval = (double)intervalJComboBox.getSelectedItem();
            startButton.addActionListener(this);
                
            moveButton.addActionListener(this);
        }
    }

    public static void main(String[] args) {
        new BasicSwing();
    }

    public BasicSwing(){
        super("AutoClicker(tm)");

        setSize(300,150);
        setResizable(false);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        mainPanel.add(moveButton);
        mainPanel.add(intervalJComboBox);
        mainPanel.add(startButton);

        add(mainPanel);
        setVisible(true);
    }
}
