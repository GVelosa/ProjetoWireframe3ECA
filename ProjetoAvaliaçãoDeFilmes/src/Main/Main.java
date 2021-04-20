package Main;
import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.GridLayout;

import javax.swing.*;

import Padrões.AppNome;
import Padrões.AreaDeTexto;
import Padrões.NomeDosFilmes;
import Padrões.StarRater;
import Padrões.SubTitulos;
import Padrões.Textos;

public class Main {
	public static void main(String[] args) {
		try {
		UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
		}catch (Exception e) {
			e.printStackTrace();
		}
		JFrame janela = new JFrame("App Avaliação");
		
		JPanel cabeca = new JPanel(new BorderLayout());
		JPanel corpoDeAbas = new JPanel(new BorderLayout());
		JPanel primeiraAba = new JPanel(new BorderLayout());
		JPanel primeiraAba2 = new JPanel(new GridLayout(5,0));
		JPanel segundaAba = new JPanel(new BorderLayout());
		JPanel segundaAba2 = new JPanel(new FlowLayout());
		JPanel terceiraAba = new JPanel(new BorderLayout());
		JPanel terceiraAba2 = new JPanel(new BorderLayout());
		
		JLabel Anotacoes = new SubTitulos("Anotações");
		JLabel AppNome = new AppNome("NomeDoApp");		
		JLabel nomeDoFilme = new NomeDosFilmes("Coraline");
		JLabel nomeDoFilme2 = new NomeDosFilmes("Coraline");
		JLabel nomeDoFilme3 = new NomeDosFilmes("Coraline");	
		JLabel introduçãoCoraline = new Textos("Filme de 2009 dirigido e escrito por Henry Selick ");
		JLabel SinopseParte1 = new Textos("Em sua nova casa, Coraline sente-se entediada,");
		JLabel SinopseParte2 = new Textos("até que encontra uma porta secreta que a leva a uma versão diferente");
		JLabel SinopseParte3 = new Textos("— e melhor — de sua vida. Esse mundo aparentemente perfeito acabará ficando");
		JLabel SinopseParte4 = new Textos("perigoso demais, e Coraline precisará ter coragem e esperteza");
		JLabel SinopseParte5 = new Textos("para escapar e salvar sua família no mundo real.");
		JLabel genero = new SubTitulos("Genero");
		JLabel generos = new Textos("Aventura e fantasia");
		JLabel avaliacao = new SubTitulos("Avaliação");
		
		JTabbedPane abas = new JTabbedPane();
		
		String[] Assistido = {"Assistido", "Assistindo", "Na Lista", "Dropado"};
		
		JTextArea descricao = new AreaDeTexto("Filme legal");
			
		primeiraAba.add(new StarRater(60, 60),BorderLayout.SOUTH);
		primeiraAba.add(new JLabel(new ImageIcon("src/250px-Coraline_poster.jpg")), BorderLayout.WEST);
		primeiraAba.add(nomeDoFilme, BorderLayout.NORTH);
		primeiraAba.add(primeiraAba2, BorderLayout.CENTER);
		primeiraAba2.add(genero);
		primeiraAba2.add(generos);
		primeiraAba2.add(avaliacao);
		primeiraAba2.add(new StarRater(5, 4));
		primeiraAba2.add(introduçãoCoraline);
	
		
		segundaAba2.add(SinopseParte1);
		segundaAba2.add(SinopseParte2);
		segundaAba2.add(SinopseParte3);
		segundaAba2.add(SinopseParte4);
		segundaAba2.add(SinopseParte5);
		segundaAba.add(new StarRater(60, 60),BorderLayout.SOUTH);
		segundaAba.add(segundaAba2, BorderLayout.CENTER);
		segundaAba.add(nomeDoFilme2, BorderLayout.NORTH);
		
		terceiraAba.add(nomeDoFilme3, BorderLayout.NORTH);
		terceiraAba.add(terceiraAba2, BorderLayout.CENTER);
		terceiraAba.add(new JLabel(new ImageIcon("src/Coraline.jpg")), BorderLayout.WEST);
		terceiraAba2.add(Anotacoes, BorderLayout.NORTH);
		terceiraAba2.add(descricao, BorderLayout.CENTER);
		terceiraAba2.add(new JComboBox<String>(Assistido), BorderLayout.SOUTH);
		terceiraAba.add(new JButton("Salvar"), BorderLayout.SOUTH);
		
		cabeca.add(AppNome, BorderLayout.NORTH);
		corpoDeAbas.add(abas);
		
		abas.add("Avaliação", primeiraAba);
		abas.add("Sinopse", segundaAba);
		abas.add("Comentarios", terceiraAba);
		
		janela.add(cabeca, BorderLayout.NORTH);
		janela.add(abas, BorderLayout.CENTER);
		
		janela.setSize(900, 700);
		janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		janela.setVisible(true);
		janela.setLayout(new BorderLayout());
	}
}
