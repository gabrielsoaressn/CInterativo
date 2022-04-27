package view.viewAluno;

import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JRadioButton;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.LayoutStyle.ComponentPlacement;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JComboBox;
import javax.swing.JTextField;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.DefaultComboBoxModel;
import javax.swing.SwingConstants;
import javax.swing.JTextArea;

public class alunoEvent extends JPanel {
	private JTable table;
	private final ButtonGroup buttonGroup = new ButtonGroup();

	/**
	 * Create the panel.
	 */
	public alunoEvent() {
		setBackground(Color.LIGHT_GRAY);
		
		JLabel lblNewLabel = new JLabel("Professor");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 12));
		
		JLabel lblDisciplina = new JLabel("Disciplina");
		lblDisciplina.setFont(new Font("Tahoma", Font.BOLD, 12));
		
		JLabel lblNota = new JLabel("Nota");
		lblNota.setFont(new Font("Tahoma", Font.BOLD, 12));
		
		JLabel lblComentario = new JLabel("Coment\u00E1rio");
		lblComentario.setFont(new Font("Tahoma", Font.BOLD, 12));
		
		JRadioButton nota1 = new JRadioButton("1");
		nota1.setBackground(Color.LIGHT_GRAY);
		buttonGroup.add(nota1);
		
		JRadioButton nota2 = new JRadioButton("2");
		nota2.setBackground(Color.LIGHT_GRAY);
		buttonGroup.add(nota2);
		
		JRadioButton nota3 = new JRadioButton("3");
		nota3.setBackground(Color.LIGHT_GRAY);
		buttonGroup.add(nota3);
		
		JRadioButton nota4 = new JRadioButton("4");
		nota4.setBackground(Color.LIGHT_GRAY);
		buttonGroup.add(nota4);
		
		JRadioButton nota5 = new JRadioButton("5");
		nota5.setBackground(Color.LIGHT_GRAY);
		buttonGroup.add(nota5);
		
		JComboBox profBox = new JComboBox();
		profBox.setModel(new DefaultComboBoxModel(new String[] {"<Selecione o profesor>"}));
		
		JComboBox disBox = new JComboBox();
		disBox.setModel(new DefaultComboBoxModel(new String[] {"<Seleciona a disciplina>"}));
		
		JButton btnVolta = new JButton("Voltar");
		
		JButton bntSair = new JButton("Sair");
		
		JTextArea txtrArtur = new JTextArea();
		txtrArtur.setWrapStyleWord(true);
		txtrArtur.setToolTipText("escreva seu comentario aqui");
		txtrArtur.setLineWrap(true);
		GroupLayout groupLayout = new GroupLayout(this);
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.TRAILING)
				.addGroup(Alignment.LEADING, groupLayout.createSequentialGroup()
					.addGap(231)
					.addComponent(lblComentario, GroupLayout.PREFERRED_SIZE, 80, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(266, Short.MAX_VALUE))
				.addGroup(groupLayout.createSequentialGroup()
					.addGroup(groupLayout.createParallelGroup(Alignment.TRAILING)
						.addGroup(Alignment.LEADING, groupLayout.createSequentialGroup()
							.addGap(30)
							.addComponent(txtrArtur, GroupLayout.DEFAULT_SIZE, 531, Short.MAX_VALUE))
						.addGroup(Alignment.LEADING, groupLayout.createSequentialGroup()
							.addGap(21)
							.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
								.addGroup(groupLayout.createSequentialGroup()
									.addComponent(lblNota, GroupLayout.PREFERRED_SIZE, 99, GroupLayout.PREFERRED_SIZE)
									.addPreferredGap(ComponentPlacement.UNRELATED)
									.addComponent(nota1, GroupLayout.DEFAULT_SIZE, 45, Short.MAX_VALUE)
									.addGap(18)
									.addComponent(nota2, GroupLayout.DEFAULT_SIZE, 47, Short.MAX_VALUE)
									.addGap(18)
									.addComponent(nota3, GroupLayout.DEFAULT_SIZE, 47, Short.MAX_VALUE)
									.addGap(18)
									.addComponent(nota4, GroupLayout.DEFAULT_SIZE, 45, Short.MAX_VALUE)
									.addGap(18)
									.addComponent(nota5, GroupLayout.DEFAULT_SIZE, 52, Short.MAX_VALUE)
									.addGap(127))
								.addGroup(groupLayout.createSequentialGroup()
									.addComponent(lblNewLabel, GroupLayout.PREFERRED_SIZE, 99, GroupLayout.PREFERRED_SIZE)
									.addPreferredGap(ComponentPlacement.RELATED)
									.addComponent(profBox, 0, 437, Short.MAX_VALUE)
									.addPreferredGap(ComponentPlacement.RELATED))
								.addGroup(groupLayout.createSequentialGroup()
									.addComponent(lblDisciplina, GroupLayout.PREFERRED_SIZE, 99, GroupLayout.PREFERRED_SIZE)
									.addPreferredGap(ComponentPlacement.RELATED)
									.addComponent(disBox, 0, 0, Short.MAX_VALUE)
									.addPreferredGap(ComponentPlacement.RELATED))))
						.addGroup(groupLayout.createSequentialGroup()
							.addContainerGap(439, Short.MAX_VALUE)
							.addComponent(btnVolta)
							.addPreferredGap(ComponentPlacement.UNRELATED)
							.addComponent(bntSair)))
					.addGap(16))
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(44)
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblNewLabel, GroupLayout.PREFERRED_SIZE, 14, GroupLayout.PREFERRED_SIZE)
						.addComponent(profBox, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(23)
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblDisciplina, GroupLayout.PREFERRED_SIZE, 14, GroupLayout.PREFERRED_SIZE)
						.addComponent(disBox, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(25)
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblNota, GroupLayout.PREFERRED_SIZE, 14, GroupLayout.PREFERRED_SIZE)
						.addComponent(nota1)
						.addComponent(nota2)
						.addComponent(nota3)
						.addComponent(nota4)
						.addComponent(nota5))
					.addGap(27)
					.addComponent(lblComentario, GroupLayout.PREFERRED_SIZE, 14, GroupLayout.PREFERRED_SIZE)
					.addGap(26)
					.addComponent(txtrArtur, GroupLayout.PREFERRED_SIZE, 94, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(btnVolta)
						.addComponent(bntSair))
					.addContainerGap(24, Short.MAX_VALUE))
		);
		setLayout(groupLayout);
		
		table = new JTable();

	}
}
