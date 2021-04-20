package Main;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;
import javax.swing.JTextArea;
import javax.swing.JTextField;

import Padrões.StarRater;


public class FilmeListener implements ActionListener{

	private JTextField filme;
	private JTextArea sinopse;
	private JRadioButton streaming;
	private JCheckBox assistido;

	
	public FilmeListener(JTextField filme, JTextArea sinopse, JRadioButton streaming,JCheckBox assistido) {
		this.filme =filme;
		this.sinopse =sinopse;
		this.assistido =assistido;
		this.streaming = streaming;

	}
	public void actionPerformed(ActionEvent e) {
		
		JOptionPane.showMessageDialog(null, filme);
		JOptionPane.showMessageDialog(null, sinopse);
		JOptionPane.showMessageDialog(null, assistido);
		JOptionPane.showMessageDialog(null, streaming);
}

}
