package Padrões;
import java.awt.Color;
import java.awt.Font;

import javax.swing.JLabel;

public class Textos extends JLabel {
	private static final long serialVersionUID = 1L;

	public Textos(String texto) {
		super(texto);
		init();
}
	public void init() {
		this.setForeground(new Color(0, 0, 0));
		this.setFont(new Font(null, Font.PLAIN, 18));
		this.setHorizontalAlignment(JLabel.CENTER);
	}
}
