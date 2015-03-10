package com.itparis.b2.itprojects.frames;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JEditorPane;
import java.awt.Color;
import javax.swing.JScrollBar;
import javax.swing.JTextPane;
import java.awt.Font;
import javax.swing.JFormattedTextField;

public class FenetreInscription extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FenetreInscription frame = new FenetreInscription();
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
	public FenetreInscription() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1675, 1015);
		contentPane = new JPanel();
		contentPane.setForeground(new Color(0, 0, 0));
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JEditorPane editorPane = new JEditorPane();
		editorPane.setBounds(0, 0, 1895, 298);
		editorPane.setBackground(Color.BLUE);
		contentPane.add(editorPane);
		
		JScrollBar scrollBar = new JScrollBar();
		scrollBar.setBounds(1869, 331, 26, 628);
		contentPane.add(scrollBar);
		
		JTextPane txtpnJoinPanorapix = new JTextPane();
		txtpnJoinPanorapix.setBounds(63, 301, 530, 61);
		txtpnJoinPanorapix.setText("Join Panorapix !");
		txtpnJoinPanorapix.setForeground(new Color(0, 0, 0));
		txtpnJoinPanorapix.setFont(new Font("Calibri", Font.BOLD, 30));
		txtpnJoinPanorapix.setEnabled(false);
		txtpnJoinPanorapix.setBackground(Color.WHITE);
		contentPane.add(txtpnJoinPanorapix);
		
		JFormattedTextField frmtdtxtfldName = new JFormattedTextField();
		frmtdtxtfldName.setText("Name*");
		frmtdtxtfldName.setForeground(Color.GRAY);
		frmtdtxtfldName.setFont(new Font("Calibri", Font.PLAIN, 20));
		frmtdtxtfldName.setBackground(Color.WHITE);
		frmtdtxtfldName.setBounds(134, 364, 1216, 50);
		contentPane.add(frmtdtxtfldName);
		
		JFormattedTextField frmtdtxtfldFistName = new JFormattedTextField();
		frmtdtxtfldFistName.setText("Fist name*");
		frmtdtxtfldFistName.setForeground(Color.GRAY);
		frmtdtxtfldFistName.setFont(new Font("Calibri", Font.PLAIN, 20));
		frmtdtxtfldFistName.setBackground(Color.WHITE);
		frmtdtxtfldFistName.setBounds(134, 430, 1216, 50);
		contentPane.add(frmtdtxtfldFistName);
		
		JFormattedTextField frmtdtxtfldFistName_1 = new JFormattedTextField();
		frmtdtxtfldFistName_1.setText("Login*");
		frmtdtxtfldFistName_1.setForeground(Color.GRAY);
		frmtdtxtfldFistName_1.setFont(new Font("Calibri", Font.PLAIN, 20));
		frmtdtxtfldFistName_1.setBackground(Color.WHITE);
		frmtdtxtfldFistName_1.setBounds(134, 562, 1216, 50);
		contentPane.add(frmtdtxtfldFistName_1);
		
		JFormattedTextField frmtdtxtfldBirthDate = new JFormattedTextField();
		frmtdtxtfldBirthDate.setText("Birth date ");
		frmtdtxtfldBirthDate.setForeground(Color.GRAY);
		frmtdtxtfldBirthDate.setFont(new Font("Calibri", Font.PLAIN, 20));
		frmtdtxtfldBirthDate.setBackground(Color.WHITE);
		frmtdtxtfldBirthDate.setBounds(134, 496, 1216, 50);
		contentPane.add(frmtdtxtfldBirthDate);
		
		JFormattedTextField frmtdtxtfldConfirmPassword = new JFormattedTextField();
		frmtdtxtfldConfirmPassword.setText("Confirm password*");
		frmtdtxtfldConfirmPassword.setForeground(Color.GRAY);
		frmtdtxtfldConfirmPassword.setFont(new Font("Calibri", Font.PLAIN, 20));
		frmtdtxtfldConfirmPassword.setBackground(Color.WHITE);
		frmtdtxtfldConfirmPassword.setBounds(134, 760, 1216, 50);
		contentPane.add(frmtdtxtfldConfirmPassword);
		
		JFormattedTextField frmtdtxtfldPassword = new JFormattedTextField();
		frmtdtxtfldPassword.setText("Password*");
		frmtdtxtfldPassword.setForeground(Color.GRAY);
		frmtdtxtfldPassword.setFont(new Font("Calibri", Font.PLAIN, 20));
		frmtdtxtfldPassword.setBackground(Color.WHITE);
		frmtdtxtfldPassword.setBounds(134, 694, 1216, 50);
		contentPane.add(frmtdtxtfldPassword);
		
		JFormattedTextField frmtdtxtfldEmailAddress = new JFormattedTextField();
		frmtdtxtfldEmailAddress.setText("Email address*");
		frmtdtxtfldEmailAddress.setForeground(Color.GRAY);
		frmtdtxtfldEmailAddress.setFont(new Font("Calibri", Font.PLAIN, 20));
		frmtdtxtfldEmailAddress.setBackground(Color.WHITE);
		frmtdtxtfldEmailAddress.setBounds(134, 628, 1216, 50);
		contentPane.add(frmtdtxtfldEmailAddress);
	}
}
