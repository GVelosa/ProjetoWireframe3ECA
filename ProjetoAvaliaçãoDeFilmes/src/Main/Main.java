package Main;
import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.util.List;

import javax.swing.*;

import Padrões.AreaDeTexto;
import Padrões.CampoDeTexto;
import Padrões.RadioGroup;
import Padrões.StarRater;
import Padrões.SubTitulos;

public class Main {
	public static void main(String[] args) {
		try {
		UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
		}catch (Exception e) {
			e.printStackTrace();
		}
		JFrame janela = new JFrame("App Avaliação");
		
		new RadioGroup(List.of("Netflix", "Prime Video", "Disney+"));
		JRadioButton netflix = new JRadioButton("Netflix");
		JRadioButton primeVideo = new JRadioButton("Prime Video");
		JRadioButton disneyPlus = new JRadioButton("DisneyPlus");
		ButtonGroup streamings = new ButtonGroup();
		
		JCheckBox checkBox = new JCheckBox("Assistido");
		
		JPanel cabeca = new JPanel(new BorderLayout());
		JPanel corpoDeAbas = new JPanel(new BorderLayout());
		JPanel primeiraAba = new JPanel(new BorderLayout());
		JPanel primeiraAba2 = new JPanel(new GridLayout(8,0));
		JPanel primeiraAba3 = new JPanel(new GridLayout(9,0));
		JPanel segundaAba = new JPanel(new FlowLayout());
		JLabel streaming = new SubTitulos("Onde assistir");
		
		streamings.add(netflix);
		streamings.add(primeVideo);
		streamings.add(disneyPlus);

		JLabel nomeDoFilme = new SubTitulos("Nome do filme");	
		JLabel genero = new SubTitulos("Genero");
		JLabel sinopse = new SubTitulos("Sinopse");
		JLabel avaliacao = new SubTitulos("Avaliação");
		
		JTabbedPane abas = new JTabbedPane();
		
		String[] generos = {"Fantasia", "Ação", "Aventura", "Romance"};
		
		JTextArea Sinopse = new AreaDeTexto("");
		JTextField filmeNome = new CampoDeTexto();
		
		JButton Salvar = new JButton("Salvar");
			
		primeiraAba.add(new JLabel(new ImageIcon("src/250px-Coraline_poster.jpg")), BorderLayout.WEST);
	
		primeiraAba.add(primeiraAba2, BorderLayout.CENTER);
		primeiraAba.add(primeiraAba3, BorderLayout.EAST);
		primeiraAba2.add(nomeDoFilme);
		primeiraAba2.add(filmeNome);
		primeiraAba2.add(sinopse);
		primeiraAba2.add(Sinopse);
		primeiraAba2.add(genero);
		primeiraAba2.add(new JComboBox<String>(generos));
		primeiraAba3.add(streaming);
		primeiraAba3.add(netflix);
		primeiraAba3.add(primeVideo);
		primeiraAba3.add(disneyPlus);
		primeiraAba3.add(checkBox);
		primeiraAba3.add(avaliacao);
		primeiraAba3.add(new StarRater(5, 4));
		primeiraAba3.add(Salvar);

		
		
		FilmeListener listener = new FilmeListener(filmeNome, Sinopse, netflix,checkBox);
		Salvar.addActionListener(listener);
		primeiraAba.add(Salvar, BorderLayout.SOUTH);
		
		corpoDeAbas.add(abas);
		
		abas.add("Cadastrar", primeiraAba);
		abas.add("Cadastrados", segundaAba);
		
		janela.add(cabeca, BorderLayout.NORTH);
		janela.add(abas, BorderLayout.CENTER);
		
		janela.setSize(650, 400);
		janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		janela.setVisible(true);
		janela.setLayout(new BorderLayout());
	}
}
