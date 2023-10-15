package com.chatApp.appScreens;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LoginScreen extends JFrame {
	private JTextField email;
	private JPasswordField password;
	private JButton loginButton;
	private JButton exitButton;
	private JLabel emailLabel;
	private JLabel passwordLabel;
	private JPanel buttonsPanel;
	private JPanel emailPanel;
	private JPanel passwordPanel;

	public LoginScreen(){
		this.setTitle("chatApp Login");
		this.setBounds(0, 0, 800, 600);

		this.setupEmailPanel();
		this.setupPasswordPanel();
		this.setupButtonsPanel();

		JPanel panel = new JPanel();
		panel.add(this.emailPanel);
		panel.add(this.passwordPanel);
		panel.add(this.buttonsPanel);
		panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));
		this.add(panel);

		this.setVisible(true);
	}

	public void setupEmailPanel(){
		this.emailPanel = new JPanel();
		this.setupEmailLabel();
		this.setupEmailField();
	}

	public void setupPasswordPanel(){
		this.passwordPanel = new JPanel();
		this.setupPasswordLabel();
		this.setupPasswordField();
	}

	public void setupButtonsPanel(){
		this.buttonsPanel = new JPanel();
		this.setupExitButton();
		this.setupLoginButton();
	}

	public void setupLoginButton(){
		this.loginButton = new JButton("login");
		this.loginButton.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent actionEvent) {
				captureEmail();
				capturePassword();
			}
		});
		this.buttonsPanel.add(loginButton);
	}

	public void setupExitButton(){
		this.exitButton = new JButton("exit");
		this.exitButton.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent actionEvent) {
				exit();

			}
		});
		this.buttonsPanel.add(exitButton);
	}

	public void setupEmailLabel(){
		this.emailLabel = new JLabel("Email");
		this.emailLabel.setLabelFor(this.email);
		this.emailLabel.setPreferredSize(new Dimension(250, 20));
		this.emailPanel.add(this.emailLabel);
	}

	public void setupEmailField(){
		this.email = new JTextField();
		this.email.setPreferredSize(new Dimension(250, 20));
		this.emailPanel.add(this.email);
	}

	public void setupPasswordLabel(){
		this.passwordLabel = new JLabel("Password");
		this.passwordLabel.setLabelFor(this.password);
		this.passwordLabel.setPreferredSize(new Dimension(250, 20));
		this.passwordPanel.add(this.passwordLabel);
	}

	public void setupPasswordField(){
		this.password = new JPasswordField();
		this.password.setPreferredSize(new Dimension(250, 20));
		this.passwordPanel.add(this.password);
	}

	public void exit(){
		System.exit(0);
	}

	public void captureEmail(){
		System.out.println("this is the user's email: " + this.email.getText());
	}

	public void capturePassword(){
		System.out.println("this is the user's password: " + this.password.getPassword());
	}


}
