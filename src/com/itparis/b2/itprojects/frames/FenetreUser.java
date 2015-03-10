package com.itparis.b2.itprojects.frames;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JEditorPane;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.Font;
import javax.swing.JFormattedTextField;

public class FenetreUser extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FenetreUser frame = new FenetreUser();
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
	public FenetreUser() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(373, 199, 799, 770);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JEditorPane editorPane = new JEditorPane();
		editorPane.setEnabled(false);
		editorPane.setBackground(new Color(139, 0, 139));
		editorPane.setBounds(58, 52, 205, 188);
		contentPane.add(editorPane);
		
		JButton btnModify = new JButton("Modify");
		btnModify.setForeground(Color.WHITE);
		btnModify.setFont(new Font("Calibri", Font.PLAIN, 25));
		btnModify.setBackground(new Color(65, 105, 225));
		btnModify.setBounds(80, 256, 166, 39);
		contentPane.add(btnModify);
		
		JFormattedTextField frmtdtxtfldName = new JFormattedTextField();
		frmtdtxtfldName.setText("Name");
		frmtdtxtfldName.setForeground(Color.GRAY);
		frmtdtxtfldName.setFont(new Font("Calibri", Font.PLAIN, 20));
		frmtdtxtfldName.setEnabled(false);
		frmtdtxtfldName.setEditable(false);
		frmtdtxtfldName.setBackground(Color.WHITE);
		frmtdtxtfldName.setBounds(366, 128, 305, 50);
		contentPane.add(frmtdtxtfldName);
		
		JFormattedTextField frmtdtxtfldFirstName = new JFormattedTextField();
		frmtdtxtfldFirstName.setText("First Name");
		frmtdtxtfldFirstName.setForeground(Color.GRAY);
		frmtdtxtfldFirstName.setFont(new Font("Calibri", Font.PLAIN, 20));
		frmtdtxtfldFirstName.setEnabled(false);
		frmtdtxtfldFirstName.setEditable(false);
		frmtdtxtfldFirstName.setBackground(Color.WHITE);
		frmtdtxtfldFirstName.setBounds(366, 213, 305, 50);
		contentPane.add(frmtdtxtfldFirstName);
		
		JFormattedTextField frmtdtxtfldBirthDate = new JFormattedTextField();
		frmtdtxtfldBirthDate.setText("Birth date");
		frmtdtxtfldBirthDate.setForeground(Color.GRAY);
		frmtdtxtfldBirthDate.setFont(new Font("Calibri", Font.PLAIN, 20));
		frmtdtxtfldBirthDate.setEnabled(false);
		frmtdtxtfldBirthDate.setEditable(false);
		frmtdtxtfldBirthDate.setBackground(Color.WHITE);
		frmtdtxtfldBirthDate.setBounds(100, 347, 570, 50);
		contentPane.add(frmtdtxtfldBirthDate);
		
		JFormattedTextField frmtdtxtfldLogin = new JFormattedTextField();
		frmtdtxtfldLogin.setText("Login");
		frmtdtxtfldLogin.setForeground(Color.GRAY);
		frmtdtxtfldLogin.setFont(new Font("Calibri", Font.PLAIN, 20));
		frmtdtxtfldLogin.setEnabled(false);
		frmtdtxtfldLogin.setEditable(false);
		frmtdtxtfldLogin.setBackground(Color.WHITE);
		frmtdtxtfldLogin.setBounds(100, 413, 570, 50);
		contentPane.add(frmtdtxtfldLogin);
		
		JFormattedTextField frmtdtxtfldEmailAdress = new JFormattedTextField();
		frmtdtxtfldEmailAdress.setText("Email adress");
		frmtdtxtfldEmailAdress.setForeground(Color.GRAY);
		frmtdtxtfldEmailAdress.setFont(new Font("Calibri", Font.PLAIN, 20));
		frmtdtxtfldEmailAdress.setEnabled(false);
		frmtdtxtfldEmailAdress.setEditable(false);
		frmtdtxtfldEmailAdress.setBackground(Color.WHITE);
		frmtdtxtfldEmailAdress.setBounds(100, 479, 570, 50);
		contentPane.add(frmtdtxtfldEmailAdress);
		
		JFormattedTextField frmtdtxtfldPassword = new JFormattedTextField();
		frmtdtxtfldPassword.setText("Password");
		frmtdtxtfldPassword.setForeground(Color.GRAY);
		frmtdtxtfldPassword.setFont(new Font("Calibri", Font.PLAIN, 20));
		frmtdtxtfldPassword.setEnabled(false);
		frmtdtxtfldPassword.setEditable(false);
		frmtdtxtfldPassword.setBackground(Color.WHITE);
		frmtdtxtfldPassword.setBounds(100, 545, 570, 50);
		contentPane.add(frmtdtxtfldPassword);
		
		JButton button = new JButton("Save");
		button.setForeground(Color.WHITE);
		button.setFont(new Font("Calibri", Font.PLAIN, 25));
		button.setBackground(new Color(150, 173, 35));
		button.setBounds(271, 628, 263, 70);
		contentPane.add(button);
	}
}
