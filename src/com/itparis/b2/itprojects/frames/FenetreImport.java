package com.itparis.b2.itprojects.frames;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JEditorPane;
import javax.swing.JFormattedTextField;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollBar;
import javax.swing.JTextPane;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;
import javax.swing.JScrollPane;
import javax.swing.border.LineBorder;

public class FenetreImport extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FenetreImport frame = new FenetreImport();
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
	public FenetreImport() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(373, 199, 1000, 770);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		JFormattedTextField frmtdtxtfldFiles = new JFormattedTextField();
		frmtdtxtfldFiles.setBounds(48, 585, 897, 43);
		frmtdtxtfldFiles.setText("Files");
		getContentPane().add(frmtdtxtfldFiles);
		
		JFormattedTextField frmtdtxtfldName = new JFormattedTextField();
		frmtdtxtfldName.setBounds(48, 538, 447, 43);
		frmtdtxtfldName.setText("Name");
		getContentPane().add(frmtdtxtfldName);
		
		JFormattedTextField frmtdtxtfldFormat = new JFormattedTextField();
		frmtdtxtfldFormat.setBounds(498, 538, 447, 43);
		frmtdtxtfldFormat.setText("Format");
		getContentPane().add(frmtdtxtfldFormat);
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.WHITE);
		panel.setBounds(61, 61, 865, 470);
		getContentPane().add(panel);
		panel.setLayout(null);
		
		JButton button = new JButton("Import");
		button.setBounds(318, 631, 305, 73);
		panel.add(button);
		button.setForeground(Color.WHITE);
		button.setFont(new Font("Calibri", Font.PLAIN, 25));
		button.setBackground(new Color(150, 173, 35));
		
		JPanel panel_1 = new JPanel();
		panel_1.setBorder(new LineBorder(new Color(192, 192, 192)));
		panel_1.setBackground(Color.WHITE);
		panel_1.setBounds(44, 57, 894, 472);
		panel.add(panel_1);
		panel_1.setLayout(null);
		
		JScrollBar scrollBar = new JScrollBar();
		scrollBar.setBounds(875, 0, 19, 472);
		panel_1.add(scrollBar);
		
		JEditorPane editorPane = new JEditorPane();
		editorPane.setEditable(false);
		editorPane.setEnabled(false);
		editorPane.setBackground(new Color(0, 191, 255));
		editorPane.setBounds(71, 16, 169, 169);
		panel_1.add(editorPane);
		
		JTextPane textPane = new JTextPane();
		textPane.setText("IMG_1");
		textPane.setForeground(Color.GRAY);
		textPane.setFont(new Font("Calibri", Font.PLAIN, 20));
		textPane.setBounds(126, 184, 61, 32);
		panel_1.add(textPane);
		
		JEditorPane editorPane_1 = new JEditorPane();
		editorPane_1.setEditable(false);
		editorPane_1.setEnabled(false);
		editorPane_1.setBackground(new Color(0, 191, 255));
		editorPane_1.setBounds(255, 16, 169, 169);
		panel_1.add(editorPane_1);
		
		JTextPane textPane_1 = new JTextPane();
		textPane_1.setText("IMG_1");
		textPane_1.setForeground(Color.GRAY);
		textPane_1.setFont(new Font("Calibri", Font.PLAIN, 20));
		textPane_1.setBounds(310, 184, 61, 32);
		panel_1.add(textPane_1);
		
		JEditorPane editorPane_2 = new JEditorPane();
		editorPane_2.setEditable(false);
		editorPane_2.setEnabled(false);
		editorPane_2.setBackground(new Color(0, 191, 255));
		editorPane_2.setBounds(439, 16, 169, 169);
		panel_1.add(editorPane_2);
		
		JTextPane textPane_2 = new JTextPane();
		textPane_2.setText("IMG_1");
		textPane_2.setForeground(Color.GRAY);
		textPane_2.setFont(new Font("Calibri", Font.PLAIN, 20));
		textPane_2.setBounds(494, 184, 61, 32);
		panel_1.add(textPane_2);
		
		JEditorPane editorPane_3 = new JEditorPane();
		editorPane_3.setEditable(false);
		editorPane_3.setEnabled(false);
		editorPane_3.setBackground(new Color(0, 191, 255));
		editorPane_3.setBounds(623, 16, 169, 169);
		panel_1.add(editorPane_3);
		
		JTextPane textPane_3 = new JTextPane();
		textPane_3.setText("IMG_1");
		textPane_3.setForeground(Color.GRAY);
		textPane_3.setFont(new Font("Calibri", Font.PLAIN, 20));
		textPane_3.setBounds(678, 184, 61, 32);
		panel_1.add(textPane_3);
		
		JEditorPane editorPane_4 = new JEditorPane();
		editorPane_4.setEnabled(false);
		editorPane_4.setEditable(false);
		editorPane_4.setBackground(new Color(0, 191, 255));
		editorPane_4.setBounds(623, 232, 169, 169);
		panel_1.add(editorPane_4);
		
		JTextPane textPane_4 = new JTextPane();
		textPane_4.setText("IMG_1");
		textPane_4.setForeground(Color.GRAY);
		textPane_4.setFont(new Font("Calibri", Font.PLAIN, 20));
		textPane_4.setBounds(678, 400, 61, 32);
		panel_1.add(textPane_4);
		
		JEditorPane editorPane_5 = new JEditorPane();
		editorPane_5.setEnabled(false);
		editorPane_5.setEditable(false);
		editorPane_5.setBackground(new Color(0, 191, 255));
		editorPane_5.setBounds(439, 232, 169, 169);
		panel_1.add(editorPane_5);
		
		JTextPane textPane_5 = new JTextPane();
		textPane_5.setText("IMG_1");
		textPane_5.setForeground(Color.GRAY);
		textPane_5.setFont(new Font("Calibri", Font.PLAIN, 20));
		textPane_5.setBounds(494, 400, 61, 32);
		panel_1.add(textPane_5);
		
		JEditorPane editorPane_6 = new JEditorPane();
		editorPane_6.setEnabled(false);
		editorPane_6.setEditable(false);
		editorPane_6.setBackground(new Color(0, 191, 255));
		editorPane_6.setBounds(255, 232, 169, 169);
		panel_1.add(editorPane_6);
		
		JTextPane textPane_6 = new JTextPane();
		textPane_6.setText("IMG_1");
		textPane_6.setForeground(Color.GRAY);
		textPane_6.setFont(new Font("Calibri", Font.PLAIN, 20));
		textPane_6.setBounds(310, 400, 61, 32);
		panel_1.add(textPane_6);
		
		JEditorPane editorPane_7 = new JEditorPane();
		editorPane_7.setEnabled(false);
		editorPane_7.setEditable(false);
		editorPane_7.setBackground(new Color(0, 191, 255));
		editorPane_7.setBounds(71, 232, 169, 169);
		panel_1.add(editorPane_7);
		
		JTextPane textPane_7 = new JTextPane();
		textPane_7.setText("IMG_1");
		textPane_7.setForeground(Color.GRAY);
		textPane_7.setFont(new Font("Calibri", Font.PLAIN, 20));
		textPane_7.setBounds(126, 400, 61, 32);
		panel_1.add(textPane_7);
		
		JFormattedTextField frmtdtxtfldImport = new JFormattedTextField();
		frmtdtxtfldImport.setBackground(Color.WHITE);
		frmtdtxtfldImport.setEnabled(false);
		frmtdtxtfldImport.setEditable(false);
		frmtdtxtfldImport.setHorizontalAlignment(SwingConstants.CENTER);
		frmtdtxtfldImport.setForeground(Color.GRAY);
		frmtdtxtfldImport.setFont(new Font("Arial", Font.PLAIN, 25));
		frmtdtxtfldImport.setText("IMPORT");
		frmtdtxtfldImport.setBounds(325, 0, 298, 57);
		panel.add(frmtdtxtfldImport);

	}
}
