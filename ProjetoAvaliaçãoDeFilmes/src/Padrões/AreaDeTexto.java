package Padrões;
import javax.swing.JTextArea;

public class AreaDeTexto extends JTextArea{

private static final long serialVersionUID = 1L;
	
	public AreaDeTexto (String Texto){
		super (Texto);
		init();
		}
	public void init() {
		this.setColumns(30);
		this.setRows(10);
		this.setBorder(BorderFactory.criar());
	}
}

