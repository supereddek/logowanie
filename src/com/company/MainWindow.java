package com.company;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;

public class MainWindow extends JFrame {

    public static void main(String[] args) {
	// write your code here
        MainWindow frame = new MainWindow("Logowanie");
        frame.setVisible(true);
    }

    public MainWindow(String title) throws HeadlessException {
        super(title);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(800, 600);
        JPanel contentPanel = new JPanel();
        contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
        setContentPane(contentPanel);
        contentPanel.setLayout(null);
        JButton logBtn = new JButton("Zaloguj");
        JButton cancBtn = new JButton("Anuluj");

        logBtn.setBounds(300- 90, 400, 90, 23);
        contentPanel.add(logBtn);
        cancBtn.setBounds(500, 400, 90, 23);
        contentPanel.add(cancBtn);


    }
}
