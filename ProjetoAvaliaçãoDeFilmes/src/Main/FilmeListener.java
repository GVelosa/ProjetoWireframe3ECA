package Main;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;
import javax.swing.JTextArea;


public class FilmeListener implements ActionListener{

	private JTextArea notas;
	
	public FilmeListener(JTextArea descricao) {
		this.notas =descricao;
	}
	public void actionPerformed(ActionEvent e) {
		
		JOptionPane.showMessageDialog(null, notas);
	}

}
