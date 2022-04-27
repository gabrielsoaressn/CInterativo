package view.viewAluno;

import javax.swing.JPanel;
import java.awt.Color;
import javax.swing.JScrollPane;
import javax.swing.JTable;

public class alunoView extends JPanel {
	private JTable table;

	/**
	 * Create the panel.
	 */
	public alunoView() {
		setBackground(Color.LIGHT_GRAY);
		setLayout(null);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(86, 44, 263, 208);
		add(scrollPane);
		
		table = new JTable();
		scrollPane.setViewportView(table);

	}

}
