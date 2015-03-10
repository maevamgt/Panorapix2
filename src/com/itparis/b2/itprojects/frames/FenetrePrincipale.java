package com.itparis.b2.itprojects.frames;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JEditorPane;
import javax.swing.JSeparator;
import javax.swing.JTextPane;

import java.awt.Font;
import java.awt.Color;

import javax.swing.JTextArea;

import com.itparis.b2.itprojects.basics.User;
import com.jgoodies.forms.factories.DefaultComponentFactory;

import javax.swing.JFormattedTextField;
import javax.swing.SwingConstants;
import javax.swing.JButton;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

import javax.swing.JToggleButton;
import javax.swing.JProgressBar;
import javax.swing.ImageIcon;

import java.awt.Button;

import javax.swing.JScrollPane;
import javax.swing.JSpinner;
import javax.swing.JScrollBar;
import javax.swing.JTextField;
import javax.swing.JComboBox;

public class FenetrePrincipale extends JFrame {

	private JPanel contentPane;
	private JTextField txtComment;
	//private User user;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FenetrePrincipale frame = new FenetrePrincipale();
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
	public FenetrePrincipale() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1917, 1015);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(0, 0, 335, 137);
		panel.setBackground(Color.WHITE);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JTextPane txtpnHello = new JTextPane();
		txtpnHello.setEditable(false);
		txtpnHello.setEnabled(false);
		txtpnHello.setBackground(new Color(255, 255, 255));
		txtpnHello.setBounds(137, 16, 61, 32);
		txtpnHello.setForeground(Color.GRAY);
		txtpnHello.setFont(new Font("Calibri", Font.PLAIN, 20));
		txtpnHello.setText("Hello !");
		panel.add(txtpnHello);
		
		JTextPane txtpnJeanDupond = new JTextPane();
		txtpnJeanDupond.setBackground(new Color(255, 255, 255));
		txtpnJeanDupond.setEnabled(false);
		txtpnJeanDupond.setForeground(Color.GRAY);
		txtpnJeanDupond.setFont(new Font("Calibri", Font.PLAIN, 20));
		txtpnJeanDupond.setText("Jean DUPOND");
		txtpnJeanDupond.setBounds(137, 69, 156, 42);
		panel.add(txtpnJeanDupond);
		
		JEditorPane editorPane_19 = new JEditorPane();
		editorPane_19.setBackground(new Color(139, 0, 139));
		editorPane_19.setBounds(15, 16, 103, 105);
		panel.add(editorPane_19);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(0, 141, 335, 818);
		panel_1.setBackground(Color.WHITE);
		contentPane.add(panel_1);
		panel_1.setLayout(null);
		
		JFormattedTextField frmtdtxtfldLibrary = new JFormattedTextField();
		frmtdtxtfldLibrary.setBackground(new Color(255, 255, 255));
		frmtdtxtfldLibrary.setEnabled(false);
		frmtdtxtfldLibrary.setEditable(false);
		frmtdtxtfldLibrary.setFont(new Font("Arial", Font.PLAIN, 35));
		frmtdtxtfldLibrary.setForeground(new Color(169, 169, 169));
		frmtdtxtfldLibrary.setHorizontalAlignment(SwingConstants.CENTER);
		frmtdtxtfldLibrary.setText("Library");
		frmtdtxtfldLibrary.setBounds(15, 16, 305, 80);
		panel_1.add(frmtdtxtfldLibrary);
		
		JFormattedTextField frmtdtxtfldAdditions = new JFormattedTextField();
		frmtdtxtfldAdditions.setBackground(new Color(255, 255, 255));
		frmtdtxtfldAdditions.setEnabled(false);
		frmtdtxtfldAdditions.setEditable(false);
		frmtdtxtfldAdditions.setForeground(new Color(128, 128, 128));
		frmtdtxtfldAdditions.setFont(new Font("Calibri", Font.PLAIN, 20));
		frmtdtxtfldAdditions.setText("Recents additions");
		frmtdtxtfldAdditions.setBounds(15, 156, 305, 50);
		panel_1.add(frmtdtxtfldAdditions);
		
		JFormattedTextField frmtdtxtfldNewRepertory = new JFormattedTextField();
		frmtdtxtfldNewRepertory.setText("New repertory");
		frmtdtxtfldNewRepertory.setForeground(Color.GRAY);
		frmtdtxtfldNewRepertory.setFont(new Font("Calibri", Font.PLAIN, 20));
		frmtdtxtfldNewRepertory.setBounds(15, 221, 305, 50);
		panel_1.add(frmtdtxtfldNewRepertory);
		
		JFormattedTextField formattedTextField = new JFormattedTextField();
		formattedTextField.setText("New repertory");
		formattedTextField.setForeground(Color.GRAY);
		formattedTextField.setFont(new Font("Calibri", Font.PLAIN, 20));
		formattedTextField.setBounds(15, 278, 210, 50);
		panel_1.add(formattedTextField);
		
		JButton btnImport = new JButton("Import");
		btnImport.setBackground(new Color(150, 173, 35));
		btnImport.setForeground(new Color(255, 255, 255));
		btnImport.setFont(new Font("Calibri", Font.PLAIN, 25));
		btnImport.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		btnImport.setBounds(15, 646, 305, 73);
		panel_1.add(btnImport);
		
		JButton btnDisconnect = new JButton("Disconnect");
		btnDisconnect.setBackground(new Color(150, 173, 35));
		btnDisconnect.setForeground(new Color(255, 255, 255));
		btnDisconnect.setFont(new Font("Calibri", Font.PLAIN, 25));
		btnDisconnect.setBounds(15, 729, 305, 73);
		panel_1.add(btnDisconnect);
		
		JButton btnNewButton = new JButton("Add");
		btnNewButton.setBackground(new Color(65, 105, 225));
		btnNewButton.setFont(new Font("Calibri", Font.PLAIN, 18));
		btnNewButton.setBounds(251, 287, 69, 37);
		panel_1.add(btnNewButton);
		
		JButton button = new JButton("Add");
		button.setFont(new Font("Calibri", Font.PLAIN, 18));
		button.setBackground(new Color(65, 105, 225));
		button.setBounds(251, 112, 69, 37);
		panel_1.add(button);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBounds(373, 199, 1467, 770);
		panel_2.setBackground(new Color(255, 255, 255));
		contentPane.add(panel_2);
		panel_2.setLayout(null);
		
		JScrollBar scrollBar = new JScrollBar();
		scrollBar.setBounds(1441, 0, 26, 770);
		panel_2.add(scrollBar);
		
		JButton btnPanorama = new JButton("Panorama");
		btnPanorama.setForeground(Color.WHITE);
		btnPanorama.setFont(new Font("Calibri", Font.PLAIN, 25));
		btnPanorama.setBackground(new Color(65, 105, 225));
		btnPanorama.setBounds(549, 664, 291, 73);
		panel_2.add(btnPanorama);
		
		JEditorPane editorPane = new JEditorPane();
		editorPane.setBackground(new Color(0, 191, 255));
		editorPane.setBounds(275, 28, 169, 169);
		panel_2.add(editorPane);
		
		JEditorPane editorPane_2 = new JEditorPane();
		editorPane_2.setBackground(new Color(0, 191, 255));
		editorPane_2.setBounds(57, 28, 169, 169);
		panel_2.add(editorPane_2);
		
		JEditorPane editorPane_3 = new JEditorPane();
		editorPane_3.setBackground(new Color(0, 191, 255));
		editorPane_3.setBounds(493, 28, 169, 169);
		panel_2.add(editorPane_3);
		
		JEditorPane editorPane_7 = new JEditorPane();
		editorPane_7.setBackground(new Color(0, 191, 255));
		editorPane_7.setBounds(1152, 28, 169, 169);
		panel_2.add(editorPane_7);
		
		JEditorPane editorPane_8 = new JEditorPane();
		editorPane_8.setBackground(new Color(0, 191, 255));
		editorPane_8.setBounds(716, 28, 169, 169);
		panel_2.add(editorPane_8);
		
		JEditorPane editorPane_9 = new JEditorPane();
		editorPane_9.setBackground(new Color(0, 191, 255));
		editorPane_9.setBounds(934, 28, 169, 169);
		panel_2.add(editorPane_9);
		
		JEditorPane editorPane_4 = new JEditorPane();
		editorPane_4.setBackground(new Color(0, 191, 255));
		editorPane_4.setBounds(57, 254, 169, 169);
		panel_2.add(editorPane_4);
		
		JEditorPane editorPane_5 = new JEditorPane();
		editorPane_5.setBackground(new Color(0, 191, 255));
		editorPane_5.setBounds(275, 254, 169, 169);
		panel_2.add(editorPane_5);
		
		JEditorPane editorPane_6 = new JEditorPane();
		editorPane_6.setBackground(new Color(0, 191, 255));
		editorPane_6.setBounds(493, 254, 169, 169);
		panel_2.add(editorPane_6);
		
		JEditorPane editorPane_10 = new JEditorPane();
		editorPane_10.setBackground(new Color(0, 191, 255));
		editorPane_10.setBounds(716, 254, 169, 169);
		panel_2.add(editorPane_10);
		
		JEditorPane editorPane_11 = new JEditorPane();
		editorPane_11.setBackground(new Color(0, 191, 255));
		editorPane_11.setBounds(934, 254, 169, 169);
		panel_2.add(editorPane_11);
		
		JEditorPane editorPane_12 = new JEditorPane();
		editorPane_12.setBackground(new Color(0, 191, 255));
		editorPane_12.setBounds(1152, 254, 169, 169);
		panel_2.add(editorPane_12);
		
		JEditorPane editorPane_13 = new JEditorPane();
		editorPane_13.setBackground(new Color(0, 191, 255));
		editorPane_13.setBounds(57, 482, 169, 169);
		panel_2.add(editorPane_13);
		
		JEditorPane editorPane_14 = new JEditorPane();
		editorPane_14.setBackground(new Color(0, 191, 255));
		editorPane_14.setBounds(275, 482, 169, 169);
		panel_2.add(editorPane_14);
		
		JEditorPane editorPane_15 = new JEditorPane();
		editorPane_15.setBackground(new Color(0, 191, 255));
		editorPane_15.setBounds(493, 482, 169, 169);
		panel_2.add(editorPane_15);
		
		JEditorPane editorPane_16 = new JEditorPane();
		editorPane_16.setBackground(new Color(0, 191, 255));
		editorPane_16.setBounds(716, 482, 169, 169);
		panel_2.add(editorPane_16);
		
		JEditorPane editorPane_17 = new JEditorPane();
		editorPane_17.setBackground(new Color(0, 191, 255));
		editorPane_17.setBounds(934, 482, 169, 169);
		panel_2.add(editorPane_17);
		
		JEditorPane editorPane_18 = new JEditorPane();
		editorPane_18.setBackground(new Color(0, 191, 255));
		editorPane_18.setBounds(1152, 482, 169, 169);
		panel_2.add(editorPane_18);
		
		JTextPane txtpnImg_1 = new JTextPane();
		txtpnImg_1.setText("IMG_1");
		txtpnImg_1.setForeground(Color.GRAY);
		txtpnImg_1.setFont(new Font("Calibri", Font.PLAIN, 20));
		txtpnImg_1.setBounds(112, 196, 61, 32);
		panel_2.add(txtpnImg_1);
		
		JTextPane textPane_1 = new JTextPane();
		textPane_1.setText("IMG_2");
		textPane_1.setForeground(Color.GRAY);
		textPane_1.setFont(new Font("Calibri", Font.PLAIN, 20));
		textPane_1.setBounds(328, 196, 61, 32);
		panel_2.add(textPane_1);
		
		JTextPane txtpnImg_2 = new JTextPane();
		txtpnImg_2.setText("IMG_3");
		txtpnImg_2.setForeground(Color.GRAY);
		txtpnImg_2.setFont(new Font("Calibri", Font.PLAIN, 20));
		txtpnImg_2.setBounds(545, 196, 61, 32);
		panel_2.add(txtpnImg_2);
		
		JTextPane txtpnImg_3 = new JTextPane();
		txtpnImg_3.setText("IMG_4");
		txtpnImg_3.setForeground(Color.GRAY);
		txtpnImg_3.setFont(new Font("Calibri", Font.PLAIN, 20));
		txtpnImg_3.setBounds(769, 196, 61, 32);
		panel_2.add(txtpnImg_3);
		
		JTextPane txtpnImg_4 = new JTextPane();
		txtpnImg_4.setText("IMG_5");
		txtpnImg_4.setForeground(Color.GRAY);
		txtpnImg_4.setFont(new Font("Calibri", Font.PLAIN, 20));
		txtpnImg_4.setBounds(990, 196, 61, 32);
		panel_2.add(txtpnImg_4);
		
		JTextPane textPane_2 = new JTextPane();
		textPane_2.setText("IMG_2");
		textPane_2.setForeground(Color.GRAY);
		textPane_2.setFont(new Font("Calibri", Font.PLAIN, 20));
		textPane_2.setBounds(1204, 196, 61, 32);
		panel_2.add(textPane_2);
		
		JTextPane txtpnImg_5 = new JTextPane();
		txtpnImg_5.setText("IMG_6");
		txtpnImg_5.setForeground(Color.GRAY);
		txtpnImg_5.setFont(new Font("Calibri", Font.PLAIN, 20));
		txtpnImg_5.setBounds(112, 422, 61, 32);
		panel_2.add(txtpnImg_5);
		
		JTextPane txtpnImg_6 = new JTextPane();
		txtpnImg_6.setText("IMG_7");
		txtpnImg_6.setForeground(Color.GRAY);
		txtpnImg_6.setFont(new Font("Calibri", Font.PLAIN, 20));
		txtpnImg_6.setBounds(328, 422, 61, 32);
		panel_2.add(txtpnImg_6);
		
		JTextPane txtpnImg_7 = new JTextPane();
		txtpnImg_7.setText("IMG_8");
		txtpnImg_7.setForeground(Color.GRAY);
		txtpnImg_7.setFont(new Font("Calibri", Font.PLAIN, 20));
		txtpnImg_7.setBounds(553, 422, 61, 32);
		panel_2.add(txtpnImg_7);
		
		JTextPane txtpnImg_8 = new JTextPane();
		txtpnImg_8.setText("IMG_9");
		txtpnImg_8.setForeground(Color.GRAY);
		txtpnImg_8.setFont(new Font("Calibri", Font.PLAIN, 20));
		txtpnImg_8.setBounds(769, 422, 61, 32);
		panel_2.add(txtpnImg_8);
		
		JTextPane txtpnImg_9 = new JTextPane();
		txtpnImg_9.setText("IMG_10");
		txtpnImg_9.setForeground(Color.GRAY);
		txtpnImg_9.setFont(new Font("Calibri", Font.PLAIN, 20));
		txtpnImg_9.setBounds(990, 422, 71, 32);
		panel_2.add(txtpnImg_9);
		
		JTextPane txtpnImg_10 = new JTextPane();
		txtpnImg_10.setText("IMG_11");
		txtpnImg_10.setForeground(Color.GRAY);
		txtpnImg_10.setFont(new Font("Calibri", Font.PLAIN, 20));
		txtpnImg_10.setBounds(1204, 422, 71, 32);
		panel_2.add(txtpnImg_10);
		
		JTextPane txtpnImg_13 = new JTextPane();
		txtpnImg_13.setText("IMG_16");
		txtpnImg_13.setForeground(Color.GRAY);
		txtpnImg_13.setFont(new Font("Calibri", Font.PLAIN, 20));
		txtpnImg_13.setBounds(990, 650, 71, 32);
		panel_2.add(txtpnImg_13);
		
		JTextPane txtpnImg_14 = new JTextPane();
		txtpnImg_14.setText("IMG_17");
		txtpnImg_14.setForeground(Color.GRAY);
		txtpnImg_14.setFont(new Font("Calibri", Font.PLAIN, 20));
		txtpnImg_14.setBounds(1204, 650, 71, 32);
		panel_2.add(txtpnImg_14);
		
		JTextPane txtpnImg_11 = new JTextPane();
		txtpnImg_11.setText("IMG_12");
		txtpnImg_11.setForeground(Color.GRAY);
		txtpnImg_11.setFont(new Font("Calibri", Font.PLAIN, 20));
		txtpnImg_11.setBounds(112, 650, 71, 32);
		panel_2.add(txtpnImg_11);
		
		JTextPane txtpnImg_12 = new JTextPane();
		txtpnImg_12.setText("IMG_13");
		txtpnImg_12.setForeground(Color.GRAY);
		txtpnImg_12.setFont(new Font("Calibri", Font.PLAIN, 20));
		txtpnImg_12.setBounds(326, 650, 71, 32);
		panel_2.add(txtpnImg_12);
		
		JTextPane textPane_3 = new JTextPane();
		textPane_3.setText("IMG_17");
		textPane_3.setForeground(Color.GRAY);
		textPane_3.setFont(new Font("Calibri", Font.PLAIN, 20));
		textPane_3.setBounds(763, 650, 71, 32);
		panel_2.add(textPane_3);
		
		JTextPane textPane_4 = new JTextPane();
		textPane_4.setText("IMG_16");
		textPane_4.setForeground(Color.GRAY);
		textPane_4.setFont(new Font("Calibri", Font.PLAIN, 20));
		textPane_4.setBounds(549, 650, 71, 32);
		panel_2.add(textPane_4);
		
		JButton button_1 = new JButton("Add");
		button_1.setFont(new Font("Calibri", Font.PLAIN, 18));
		button_1.setBackground(new Color(65, 105, 225));
		button_1.setBounds(1339, 687, 71, 37);
		panel_2.add(button_1);
		
		JPanel panel_3 = new JPanel();
		panel_3.setBounds(373, 0, 1467, 183);
		panel_3.setBackground(new Color(255, 255, 255));
		contentPane.add(panel_3);
		panel_3.setLayout(null);
		
		JButton btnModify = new JButton("Modify");
		/*btnModify.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//récupération de l'information
				String comment = txtComment.getText();
				//traitement
				if(comment.equals("")){}
				else{
					
				}
			}
		});*/
		btnModify.setForeground(Color.WHITE);
		btnModify.setFont(new Font("Calibri", Font.PLAIN, 25));
		btnModify.setBackground(new Color(65, 105, 225));
		btnModify.setBounds(1255, 16, 197, 73);
		panel_3.add(btnModify);
		
		JButton btnDelete = new JButton("Delete");
		btnDelete.setForeground(Color.WHITE);
		btnDelete.setFont(new Font("Calibri", Font.PLAIN, 25));
		btnDelete.setBackground(new Color(255, 69, 0));
		btnDelete.setBounds(1255, 94, 197, 73);
		panel_3.add(btnDelete);
		
		JTextPane txtpnImg = new JTextPane();
		txtpnImg.setText("IMG_2");
		txtpnImg.setForeground(Color.GRAY);
		txtpnImg.setFont(new Font("Calibri", Font.PLAIN, 20));
		txtpnImg.setBounds(208, 4, 61, 32);
		panel_3.add(txtpnImg);
		
		JTextPane txtpnDate = new JTextPane();
		txtpnDate.setBackground(new Color(255, 255, 255));
		txtpnDate.setEnabled(false);
		txtpnDate.setEditable(false);
		txtpnDate.setText("Date :");
		txtpnDate.setForeground(Color.GRAY);
		txtpnDate.setFont(new Font("Calibri", Font.PLAIN, 20));
		txtpnDate.setBounds(204, 135, 61, 32);
		panel_3.add(txtpnDate);
		
		JTextPane textPane = new JTextPane();
		textPane.setText("01/01/2015");
		textPane.setForeground(Color.GRAY);
		textPane.setFont(new Font("Calibri", Font.PLAIN, 20));
		textPane.setBounds(262, 135, 110, 32);
		panel_3.add(textPane);
		
		JTextPane txtpnSize = new JTextPane();
		txtpnSize.setText("Size :");
		txtpnSize.setForeground(Color.GRAY);
		txtpnSize.setFont(new Font("Calibri", Font.PLAIN, 20));
		txtpnSize.setEnabled(false);
		txtpnSize.setEditable(false);
		txtpnSize.setBackground(Color.WHITE);
		txtpnSize.setBounds(387, 135, 48, 32);
		panel_3.add(txtpnSize);
		
		JTextPane txtpnKo = new JTextPane();
		txtpnKo.setBackground(new Color(255, 255, 255));
		txtpnKo.setEnabled(false);
		txtpnKo.setEditable(false);
		txtpnKo.setText("62,7 Ko");
		txtpnKo.setForeground(Color.GRAY);
		txtpnKo.setFont(new Font("Calibri", Font.PLAIN, 20));
		txtpnKo.setBounds(436, 135, 77, 32);
		panel_3.add(txtpnKo);
		
		JTextPane txtpnPlace = new JTextPane();
		txtpnPlace.setText("Place :");
		txtpnPlace.setForeground(Color.GRAY);
		txtpnPlace.setFont(new Font("Calibri", Font.PLAIN, 20));
		txtpnPlace.setEnabled(false);
		txtpnPlace.setEditable(false);
		txtpnPlace.setBackground(Color.WHITE);
		txtpnPlace.setBounds(517, 135, 61, 32);
		panel_3.add(txtpnPlace);
		
		JScrollBar scrollBar_1 = new JScrollBar();
		scrollBar_1.setBounds(1186, 41, 26, 48);
		panel_3.add(scrollBar_1);
		
		JPanel panel_4 = new JPanel();
		panel_4.setBounds(194, 41, 1018, 89);
		panel_3.add(panel_4);
		panel_4.setLayout(null);
		
		JScrollBar scrollBar_2 = new JScrollBar();
		scrollBar_2.setBounds(992, 0, 26, 89);
		panel_4.add(scrollBar_2);
		
		txtComment = new JTextField();
		txtComment.setBounds(0, 0, 1018, 89);
		panel_4.add(txtComment);
		txtComment.setHorizontalAlignment(SwingConstants.LEFT);
		txtComment.setForeground(new Color(128, 128, 128));
		txtComment.setText("Comment ...");
		txtComment.setColumns(10);
		
		JEditorPane editorPane_1 = new JEditorPane();
		editorPane_1.setBounds(15, 16, 162, 157);
		panel_3.add(editorPane_1);
		editorPane_1.setBackground(new Color(0, 191, 255));
	}
}
