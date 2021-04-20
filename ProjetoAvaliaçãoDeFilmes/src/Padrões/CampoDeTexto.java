package Padrões;

import java.awt.Dimension;

import javax.swing.JTextField;


public class CampoDeTexto extends JTextField {
	private static final long serialVersionUID = 1L;
	
	public CampoDeTexto (){
		super ();
		init();
	}
	public void init() {
		this.setPreferredSize(new Dimension(200, 30));
		this.setBorder(BorderFactory.criar());
		
	 {

	 }
	}
}