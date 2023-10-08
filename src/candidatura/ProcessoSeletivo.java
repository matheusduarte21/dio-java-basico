package candidatura;

import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class ProcessoSeletivo {
	
	public static void main(String[] args) {
		System.out.println("Processo Seletivo!");
		
		String [] candidatos = {
				"FELIPE","MARCIA", "JULIA", "PAULO", "AUGUSTO"};
		for(String candidato: candidatos) {
			entrandoEmContato(candidato);
		}
	
	}
	
	static void entrandoEmContato(String candidato) {
		int tentativasRealizadas = 1;
		boolean continuarTentando = true;
		boolean atendeu = false;
		
		do {
			atendeu = atender();
			continuarTentando = !atendeu;
			if(continuarTentando) {
				tentativasRealizadas++;
			}else {
				System.out.println("CONTATO REALIZADO COM SUCESSO");
			}
		}while(continuarTentando && tentativasRealizadas <3);
		
		if(atendeu) {
			System.out.println("CONSEGUIMOS CONTATO COM " + candidato + " na" + tentativasRealizadas);
		}else {
			System.out.println(" não CONSEGUIMOS CONTATO COM " + candidato + " na" + tentativasRealizadas);

		}
		
	}
	
	static boolean atender() {
		return new Random().nextInt(3)==1;
	}
	
	static void imprimir() {
		String [] candidatos = {
				"FELIPE","MARCIA", "JULIA", "PAULO", "AUGUSTO"};
		System.out.println("imprindo a lista de candidatos informando indice do elemento");
		
		for(int indice = 0; indice < candidatos.length; indice++) {
			System.out.println("O candidato de N:"+(indice+1)+ " é o "+ candidatos[indice]);
		}
		System.out.println("Forma abreviada da interação com for each");
		
		for(String candidato: candidatos) {
			System.out.println("O candidato selecionado foi " + candidato);
		}
	}
	
	static void selecaoCandidatos() {
		String [] candidatos = {
		"FELIPE","MARCIA", "JULIA", "PAULO", "AUGUSTO",
		"MONICA", "GABRIEL", "MIRELLA", "DANIELA","JORGE"
		};
		
		int candidatosSelecionados = 0;
		int candidatosAtual =0;
		while(candidatosSelecionados < 5 && candidatosAtual < candidatos.length) {
			double salarioBase = 2000.0;
			String candidato = candidatos[candidatosAtual];
			double  salarioPretendido = ValorPretendido();
			
			System.out.println("O candidato" + candidato + "Solicitou este valor de salário" + salarioPretendido);
			if(salarioBase >= salarioPretendido) {
				candidatosSelecionados++;
			}
			candidatosAtual++;
		}
		
	}
	
	static double ValorPretendido() {
		return ThreadLocalRandom.current().nextDouble(1800, 2000);
	}
	
	
	static void analisarCandidato(double salarioPretendido) {
		double salarioBase = 2000.0;
		if(salarioBase > salarioPretendido) {
			System.out.println("LIGAR PARA O CANDIDATO");
		}
		else if(salarioBase == salarioPretendido) {
			System.out.println("LIGAR PARA O CANDIDATO COM CONTRA PROPOSTA");
		}
		else {
			System.out.println("AGUARDANDO O RESULTADO DOS CANDIDATOS");
		}
	}
}
