package com.itparis.b2.itprojects.frames;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import java.awt.Color;

import javax.swing.JTextPane;

import java.awt.Font;

import javax.swing.JEditorPane;
import javax.swing.JOptionPane;
import javax.swing.JScrollBar;
import javax.swing.JButton;
import javax.swing.JFormattedTextField;
import javax.swing.SwingConstants;
import javax.swing.JSlider;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

import javax.swing.JTextField;

public class FenetreEdition extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JFrame mainFrame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FenetreEdition frame = new FenetreEdition();
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
	public FenetreEdition() {
		//mainFrame = new JFrame();
		//mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1917, 1015);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JPanel panel = new JPanel();
		panel.setLayout(null);
		panel.setBackground(Color.WHITE);
		panel.setBounds(0, 0, 335, 137);
		contentPane.add(panel);

		JTextPane textPane = new JTextPane();
		textPane.setBackground(new Color(255, 255, 255));
		textPane.setEditable(false);
		textPane.setEnabled(false);
		textPane.setText("Hello !");
		textPane.setForeground(Color.GRAY);
		textPane.setFont(new Font("Calibri", Font.PLAIN, 20));
		textPane.setBounds(137, 16, 61, 32);
		panel.add(textPane);

		JTextPane textPane_1 = new JTextPane();
		textPane_1.setBackground(new Color(255, 255, 255));
		textPane_1.setEnabled(false);
		textPane_1.setText("Jean DUPOND");
		textPane_1.setForeground(Color.GRAY);
		textPane_1.setFont(new Font("Calibri", Font.PLAIN, 20));
		textPane_1.setBounds(137, 69, 156, 42);
		panel.add(textPane_1);

		JEditorPane editorPane = new JEditorPane();
		editorPane.setBackground(new Color(139, 0, 139));
		editorPane.setBounds(15, 16, 103, 105);
		panel.add(editorPane);

		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(255, 255, 255));
		panel_1.setBounds(0, 140, 53, 819);
		contentPane.add(panel_1);
		panel_1.setLayout(null);

		JButton button = new JButton(">");
		button.setEnabled(false);
		button.setBounds(0, 328, 53, 52);
		panel_1.add(button);
		button.setForeground(Color.WHITE);
		button.setBackground(Color.GRAY);

		JPanel panel_2 = new JPanel();
		panel_2.setLayout(null);
		panel_2.setBackground(Color.WHITE);
		panel_2.setBounds(61, 189, 1467, 770);
		contentPane.add(panel_2);

		JEditorPane editorPane_1 = new JEditorPane();
		editorPane_1.setEnabled(false);
		editorPane_1.setEditable(false);
		editorPane_1.setBackground(new Color(0, 191, 255));
		editorPane_1.setBounds(330, 30, 796, 636);
		panel_2.add(editorPane_1);

		JButton btnQuit = new JButton("Quit");
		/*btnQuit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (JOptionPane.showConfirmDialog(mainFrame,
						"message\n Attention", "erreur",
						JOptionPane.WARNING_MESSAGE) == 1) // Affichage d'un
															// message
					//enregistrement en XML
					System.exit(0); // Close program
				mainFrame.dispose(); // Close window
				mainFrame.setVisible(false); // Hide window

			}
		});
*/
		btnQuit.setForeground(Color.WHITE);
		btnQuit.setFont(new Font("Calibri", Font.PLAIN, 25));
		btnQuit.setBackground(new Color(150, 173, 35));
		btnQuit.setBounds(584, 681, 305, 73);
		panel_2.add(btnQuit);

		JButton btnPrevious = new JButton("Previous ");
		btnPrevious.setForeground(new Color(255, 255, 255));
		btnPrevious.setBackground(new Color(128, 128, 128));
		btnPrevious.setBounds(96, 280, 115, 52);
		panel_2.add(btnPrevious);

		JButton btnNext = new JButton("Next");
		btnNext.setForeground(Color.WHITE);
		btnNext.setBackground(Color.GRAY);
		btnNext.setBounds(1218, 280, 115, 52);
		panel_2.add(btnNext);

		JPanel panel_3 = new JPanel();
		panel_3.setLayout(null);
		panel_3.setBackground(Color.WHITE);
		panel_3.setBounds(1560, 0, 335, 958);
		contentPane.add(panel_3);

		JFormattedTextField frmtdtxtfldEdition = new JFormattedTextField();
		frmtdtxtfldEdition.setText("Edition");
		frmtdtxtfldEdition.setHorizontalAlignment(SwingConstants.CENTER);
		frmtdtxtfldEdition.setForeground(new Color(169, 169, 169));
		frmtdtxtfldEdition.setFont(new Font("Arial", Font.PLAIN, 35));
		frmtdtxtfldEdition.setEnabled(false);
		frmtdtxtfldEdition.setEditable(false);
		frmtdtxtfldEdition.setBackground(Color.WHITE);
		frmtdtxtfldEdition.setBounds(15, 16, 305, 80);
		panel_3.add(frmtdtxtfldEdition);

		JButton btnReturnToOriginal = new JButton("Return to original");
		btnReturnToOriginal.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		btnReturnToOriginal.setForeground(Color.WHITE);
		btnReturnToOriginal.setFont(new Font("Calibri", Font.PLAIN, 25));
		btnReturnToOriginal.setBackground(new Color(150, 173, 35));
		btnReturnToOriginal.setBounds(15, 869, 305, 73);
		panel_3.add(btnReturnToOriginal);

		JButton btnSave = new JButton("Save");
		btnSave.setForeground(Color.WHITE);
		btnSave.setFont(new Font("Calibri", Font.PLAIN, 25));
		btnSave.setBackground(new Color(150, 173, 35));
		btnSave.setBounds(15, 788, 305, 73);
		panel_3.add(btnSave);

		JButton btnToClip = new JButton("To clip");
		btnToClip.setForeground(Color.WHITE);
		btnToClip.setFont(new Font("Calibri", Font.PLAIN, 25));
		btnToClip.setBackground(new Color(65, 105, 225));
		btnToClip.setBounds(15, 111, 305, 59);
		panel_3.add(btnToClip);

		JButton btnRotateRedress = new JButton("Rotate / Redress");
		btnRotateRedress.setForeground(Color.WHITE);
		btnRotateRedress.setFont(new Font("Calibri", Font.PLAIN, 25));
		btnRotateRedress.setBackground(new Color(65, 105, 225));
		btnRotateRedress.setBounds(15, 182, 305, 59);
		panel_3.add(btnRotateRedress);

		JButton btnResize = new JButton("Resize");
		btnResize.setForeground(Color.WHITE);
		btnResize.setFont(new Font("Calibri", Font.PLAIN, 25));
		btnResize.setBackground(new Color(65, 105, 225));
		btnResize.setBounds(15, 257, 305, 59);
		panel_3.add(btnResize);

		JButton btnResize_1 = new JButton("Layers / Filters");
		btnResize_1.setForeground(Color.WHITE);
		btnResize_1.setFont(new Font("Calibri", Font.PLAIN, 25));
		btnResize_1.setBackground(new Color(65, 105, 225));
		btnResize_1.setBounds(15, 478, 305, 59);
		panel_3.add(btnResize_1);

		JButton btnRotateRedress_1 = new JButton("Colors");
		btnRotateRedress_1.setForeground(Color.WHITE);
		btnRotateRedress_1.setFont(new Font("Calibri", Font.PLAIN, 25));
		btnRotateRedress_1.setBackground(new Color(65, 105, 225));
		btnRotateRedress_1.setBounds(15, 403, 305, 59);
		panel_3.add(btnRotateRedress_1);

		JButton btnExposure = new JButton("Exposure");
		btnExposure.setForeground(Color.WHITE);
		btnExposure.setFont(new Font("Calibri", Font.PLAIN, 25));
		btnExposure.setBackground(new Color(65, 105, 225));
		btnExposure.setBounds(15, 332, 305, 59);
		panel_3.add(btnExposure);

		JButton btnPrint = new JButton("Print");
		btnPrint.setForeground(Color.WHITE);
		btnPrint.setFont(new Font("Calibri", Font.PLAIN, 25));
		btnPrint.setBackground(new Color(150, 173, 35));
		btnPrint.setBounds(15, 706, 305, 73);
		panel_3.add(btnPrint);

		JPanel panel_4 = new JPanel();
		panel_4.setLayout(null);
		panel_4.setBackground(Color.WHITE);
		panel_4.setBounds(350, 0, 1176, 183);
		contentPane.add(panel_4);

		JButton button_2 = new JButton("Delete");
		button_2.setForeground(Color.WHITE);
		button_2.setFont(new Font("Calibri", Font.PLAIN, 25));
		button_2.setBackground(new Color(255, 69, 0));
		button_2.setBounds(964, 47, 197, 73);
		panel_4.add(button_2);

		JTextPane textPane_2 = new JTextPane();
		textPane_2.setText("IMG_2");
		textPane_2.setForeground(Color.GRAY);
		textPane_2.setFont(new Font("Calibri", Font.PLAIN, 20));
		textPane_2.setBounds(208, 4, 61, 32);
		panel_4.add(textPane_2);

		JTextPane textPane_3 = new JTextPane();
		textPane_3.setText("Date :");
		textPane_3.setForeground(Color.GRAY);
		textPane_3.setFont(new Font("Calibri", Font.PLAIN, 20));
		textPane_3.setEnabled(false);
		textPane_3.setEditable(false);
		textPane_3.setBackground(Color.WHITE);
		textPane_3.setBounds(204, 135, 61, 32);
		panel_4.add(textPane_3);

		JTextPane textPane_4 = new JTextPane();
		textPane_4.setText("01/01/2015");
		textPane_4.setForeground(Color.GRAY);
		textPane_4.setFont(new Font("Calibri", Font.PLAIN, 20));
		textPane_4.setBounds(262, 135, 110, 32);
		panel_4.add(textPane_4);

		JTextPane textPane_5 = new JTextPane();
		textPane_5.setText("Size :");
		textPane_5.setForeground(Color.GRAY);
		textPane_5.setFont(new Font("Calibri", Font.PLAIN, 20));
		textPane_5.setEnabled(false);
		textPane_5.setEditable(false);
		textPane_5.setBackground(Color.WHITE);
		textPane_5.setBounds(387, 135, 48, 32);
		panel_4.add(textPane_5);

		JTextPane textPane_6 = new JTextPane();
		textPane_6.setText("62,7 Ko");
		textPane_6.setForeground(Color.GRAY);
		textPane_6.setFont(new Font("Calibri", Font.PLAIN, 20));
		textPane_6.setEnabled(false);
		textPane_6.setEditable(false);
		textPane_6.setBackground(Color.WHITE);
		textPane_6.setBounds(436, 135, 77, 32);
		panel_4.add(textPane_6);

		JTextPane textPane_7 = new JTextPane();
		textPane_7.setText("Place :");
		textPane_7.setForeground(Color.GRAY);
		textPane_7.setFont(new Font("Calibri", Font.PLAIN, 20));
		textPane_7.setEnabled(false);
		textPane_7.setEditable(false);
		textPane_7.setBackground(Color.WHITE);
		textPane_7.setBounds(517, 135, 61, 32);
		panel_4.add(textPane_7);

		JEditorPane editorPane_2 = new JEditorPane();
		editorPane_2.setBackground(new Color(0, 191, 255));
		editorPane_2.setBounds(15, 16, 162, 157);
		panel_4.add(editorPane_2);

		textField = new JTextField();
		textField.setText("Comment ...");
		textField.setHorizontalAlignment(SwingConstants.LEFT);
		textField.setForeground(Color.GRAY);
		textField.setColumns(10);
		textField.setBounds(208, 40, 741, 89);
		panel_4.add(textField);
	}
}
