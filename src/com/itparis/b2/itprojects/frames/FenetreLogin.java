package com.itparis.b2.itprojects.frames;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextPane;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JFormattedTextField;
import javax.swing.JCheckBox;
import javax.swing.JButton;

public class FenetreLogin extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FenetreLogin frame = new FenetreLogin();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public FenetreLogin() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 686, 802);
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JTextPane txtpnHeyFriendWhile = new JTextPane();
		txtpnHeyFriendWhile.setEditable(false);
		txtpnHeyFriendWhile.setText("Hey, friend. While your were gone, we ate those chips you had on your desk. Hope that's okay.");
		txtpnHeyFriendWhile.setForeground(Color.BLACK);
		txtpnHeyFriendWhile.setFont(new Font("Calibri", Font.PLAIN, 40));
		txtpnHeyFriendWhile.setEnabled(false);
		txtpnHeyFriendWhile.setBackground(Color.WHITE);
		txtpnHeyFriendWhile.setBounds(68, 34, 529, 246);
		contentPane.add(txtpnHeyFriendWhile);
		
		JFormattedTextField frmtdtxtfldEmailAddress = new JFormattedTextField();
		frmtdtxtfldEmailAddress.setText("Login");
		frmtdtxtfldEmailAddress.setForeground(Color.GRAY);
		frmtdtxtfldEmailAddress.setFont(new Font("Calibri", Font.PLAIN, 20));
		frmtdtxtfldEmailAddress.setEnabled(false);
		frmtdtxtfldEmailAddress.setEditable(false);
		frmtdtxtfldEmailAddress.setBackground(Color.WHITE);
		frmtdtxtfldEmailAddress.setBounds(95, 339, 458, 63);
		contentPane.add(frmtdtxtfldEmailAddress);
		
		JFormattedTextField frmtdtxtfldPassword = new JFormattedTextField();
		frmtdtxtfldPassword.setText("Password");
		frmtdtxtfldPassword.setForeground(Color.GRAY);
		frmtdtxtfldPassword.setFont(new Font("Calibri", Font.PLAIN, 20));
		frmtdtxtfldPassword.setEnabled(false);
		frmtdtxtfldPassword.setEditable(false);
		frmtdtxtfldPassword.setBackground(Color.WHITE);
		frmtdtxtfldPassword.setBounds(95, 438, 458, 63);
		contentPane.add(frmtdtxtfldPassword);
		
		JCheckBox chckbxRememberMe = new JCheckBox("       Remember me");
		chckbxRememberMe.setEnabled(false);
		chckbxRememberMe.setSelected(true);
		chckbxRememberMe.setForeground(Color.GRAY);
		chckbxRememberMe.setFont(new Font("Calibri", Font.PLAIN, 20));
		chckbxRememberMe.setBackground(Color.WHITE);
		chckbxRememberMe.setBounds(135, 525, 403, 29);
		contentPane.add(chckbxRememberMe);
		
		JTextPane txtpnForgotMyPassword = new JTextPane();
		txtpnForgotMyPassword.setText("Forgot your password ? ");
		txtpnForgotMyPassword.setForeground(new Color(0, 128, 128));
		txtpnForgotMyPassword.setFont(new Font("Calibri", Font.PLAIN, 20));
		txtpnForgotMyPassword.setEditable(false);
		txtpnForgotMyPassword.setBackground(Color.WHITE);
		txtpnForgotMyPassword.setBounds(27, 688, 212, 32);
		contentPane.add(txtpnForgotMyPassword);
		
		JButton btnLogin = new JButton("Login");
		btnLogin.setForeground(Color.WHITE);
		btnLogin.setFont(new Font("Calibri", Font.PLAIN, 25));
		btnLogin.setBackground(new Color(150, 173, 35));
		btnLogin.setBounds(202, 587, 258, 61);
		contentPane.add(btnLogin);
	}

}
