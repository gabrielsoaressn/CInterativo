package view.viewApp;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import view.gestorView.GestorForm;
import view.profView.ProfForm;
import view.viewAluno.AlunoForm;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JCheckBox;

public class App extends JFrame {

	private JPanel contentPane;
	private JTextField textUser;
	private JPasswordField passwordField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					App frame = new App();
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
	public App() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 461, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton cadastroButton = new JButton("Cadastrar");
		
		JButton loginButton = new JButton("Login");

		
		textUser = new JTextField();
		textUser.setBounds(116, 42, 215, 20);
		contentPane.add(textUser);
		textUser.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("Usu\u00E1rio");
		lblNewLabel.setBounds(114, 27, 46, 14);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Senha");
		lblNewLabel_1.setBounds(114, 67, 46, 14);
		contentPane.add(lblNewLabel_1);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(116, 84, 215, 20);
		contentPane.add(passwordField);
		JCheckBox gestorBox = new JCheckBox("Gestor");
		JCheckBox alunoBox = new JCheckBox("Aluno");
		JCheckBox profBox = new JCheckBox("Professor");
		
		//Ac�es
		loginButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if(alunoBox.isSelected()) {
					Aluno();
				}
				if(profBox.isSelected()) {
					Professor();
				}
				if(gestorBox.isSelected()) {
					gestor();
				}
				
			}
		});
		loginButton.setBounds(174, 151, 103, 23);
		contentPane.add(loginButton);
		
		cadastroButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				cadastroForm tela = new cadastroForm();
				tela.setVisible(true);
			}
		});
		cadastroButton.setBounds(174, 185, 103, 23);
		contentPane.add(cadastroButton);
		
		alunoBox.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				gestorBox.setSelected(false);
				profBox.setSelected(false);
			}
		});
		alunoBox.setBounds(116, 110, 63, 23);
		contentPane.add(alunoBox);
		
		profBox.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				gestorBox.setSelected(false);
				alunoBox.setSelected(false);
			}
		});
		profBox.setBounds(180, 111, 71, 23);
		contentPane.add(profBox);
		
		
		gestorBox.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				alunoBox.setSelected(false);
				profBox.setSelected(false);
			}
		});
		gestorBox.setBounds(267, 111, 63, 23);
		contentPane.add(gestorBox);
		
		
	}
	public boolean checkLogin(String login, String senha) {
		return login.equals("teste") && senha.equals("123");
	}

	
	private void Aluno(){
		if(checkLogin(textUser.getText(),new String(passwordField.getPassword()))) {
			AlunoForm tela = new AlunoForm();
			tela.setVisible(true);
			dispose();
		}else {
			JOptionPane.showMessageDialog(null,"dados invalidos!" );
		}
	}
	
	private void Professor() {
		if(checkLogin(textUser.getText(),new String(passwordField.getPassword()))) {
			ProfForm tela = new ProfForm();
			tela.setVisible(true);
			dispose();
		}else {
			JOptionPane.showMessageDialog(null,"dados invalidos!" );
		}
	}
	private void gestor() {
		if(checkLogin(textUser.getText(),new String(passwordField.getPassword()))) {
			GestorForm tela = new GestorForm();
			tela.setVisible(true);
			dispose();
		}else {
			JOptionPane.showMessageDialog(null,"dados invalidos!" );
		}
	}
}