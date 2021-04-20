package Padrões;
import java.awt.Color;
import java.awt.Font;

import javax.swing.JLabel;

public class NomeDosFilmes extends JLabel{
	private static final long serialVersionUID = 1L;
	
	public NomeDosFilmes(String texto) {
		super(texto);
		init();
}
	public void init() {
		this.setForeground(new Color(255,0, 0));
		this.setFont(new Font(null, Font.BOLD, 26));
		this.setHorizontalAlignment(JLabel.CENTER);
	}
}