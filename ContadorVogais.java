package com.java.business;

import java.util.ArrayList;

import javax.swing.JOptionPane;

import java.util.List;

/*
 * classe responsável por contar vogais não repetidas após as consoantes
 * 
 */
public class ContadorVogais {

	private static final ContadorVogais instance = new ContadorVogais();

	private ContadorVogais() {
	}

	public static ContadorVogais getInstance() {
		return instance;
	}

	public static void main(String args[]) throws Exception {

		String texto = JOptionPane.showInputDialog(null, "Digite um texto");
		if (texto != null && !texto.isEmpty()) {
			String retorno = retornaUltimaVogal(texto);
			JOptionPane.showMessageDialog(null, "A última vogal após a última consoante é: " + retorno +", ");
		} else {
			JOptionPane.showMessageDialog(null, "Texto inválido, insira novamente.");
			texto = JOptionPane.showInputDialog(null, "Digite um texto");
		}

	}

	/*
	 * método responsável por percorrer o texto e retornar a vogal solicitada.
	 */
	public static String retornaUltimaVogal(String texto) throws Exception {

		String vogais = "aeiou";
		String vogal = "";
		List<String> letras = new ArrayList<String>();
		for (int indiceTexto = 0; indiceTexto < texto.length(); indiceTexto++) {
			String letra = String.valueOf(texto.charAt(indiceTexto));
			
			if (vogais.contains(letra)) {
				if (!letras.contains(letra)) {
					letras.add(letra);
					vogal = letra;
				}

			}

		}
		return vogal;

	}

}
