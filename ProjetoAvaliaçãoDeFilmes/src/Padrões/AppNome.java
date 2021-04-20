package Padrões;
import java.awt.Color;
import java.awt.Font;

import javax.swing.JLabel;

public class AppNome extends JLabel{
	private static final long serialVersionUID = 1L;
	
	public AppNome(String texto) {
		super(texto);
		init();
}
	public void init() {
		this.setForeground(new Color(12,63, 205));
		this.setFont(new Font(null, Font.BOLD, 26));
		this.setHorizontalAlignment(JLabel.CENTER);
	}
}
