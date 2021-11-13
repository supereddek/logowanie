package com.company;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Map;

public class MainWindow extends JFrame implements ActionListener {

    JPanel panel;
    JLabel userLabel, passwordLabel;
    JTextField userNameInput;
    JPasswordField userPasswordInput;
    JButton loginButton, resetButton;
    static Map<String, String> PASSWORDS = Map.of(
            "admin", "admin",
            "user", "haslo",
            "asia", "123");

    public static void main(String[] args) {
	// write your code here
        MainWindow frame = new MainWindow("Logowanie");
        System.out.println(PASSWORDS);

    }

    public MainWindow(String title) throws HeadlessException {
        super(title);
        // User Label
        userLabel = new JLabel();
        userLabel.setText("Nazwa użytkownika :");
        userNameInput = new JTextField();

        // Password
        passwordLabel = new JLabel();
        passwordLabel.setText("Hasło :");
        userPasswordInput = new JPasswordField();

        // Login and cancel
        loginButton = new JButton("Login");
        resetButton = new JButton("Reset");

        panel = new JPanel(new GridLayout(3, 1));
        //JPanel panel = new JPanel(null);

        panel.add(userLabel);
        panel.add(userNameInput);
        panel.add(passwordLabel);
        panel.add(userPasswordInput);
        panel.add(loginButton);
        panel.add(resetButton);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Adding the listeners
        loginButton.addActionListener(this);
        resetButton.addActionListener(this);
        add(panel, BorderLayout.CENTER);
        setTitle("Logowanie");
        setSize(400, 180);
        this.getContentPane().setBackground(Color.BLUE);
        setVisible(true);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        //Login button
       if(e.getSource() == this.loginButton) {
           String nameInput = userNameInput.getText();
           String passwordInput = String.valueOf(userPasswordInput.getPassword());

           if (PASSWORDS.containsKey(nameInput) && PASSWORDS.get(nameInput).equals( passwordInput)){
               panel.setBackground(Color.GREEN);
           } else {
               panel.setBackground(Color.RED);
           }
       }

       if(e.getSource() == this.resetButton) {
           userNameInput.setText("");
           userPasswordInput.setText("");
           panel.setBackground(Color.WHITE);
       }


    }
}
