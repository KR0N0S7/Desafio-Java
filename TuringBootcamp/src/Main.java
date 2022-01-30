import java.time.LocalDate;

import Dominio.Bootcamp;
import Dominio.Curso;
import Dominio.Dev;
import Dominio.Mentoria;

public class Main {

	public static void main(String[] args) {

		Curso curso1 = new Curso();
		curso1.setTitulo("Curso Java");
		curso1.setDescricao("Criado por James Gosling");
		curso1.setCargaHoraria(8);
		
		Curso curso2 = new Curso();
		curso2.setTitulo("Curso Python");
		curso2.setDescricao("Criado por Guido van Rossum");
		curso2.setCargaHoraria(17);
		
		Mentoria mentoria1 = new Mentoria();
		mentoria1.setTitulo("Mentoria Java");
		mentoria1.setDescricao("Primeiros passos da programacao");
		mentoria1.setData(LocalDate.now());
		
		/*System.out.println(curso1);
		System.out.println(curso2);
		System.out.println(mentoria1);*/
		
		Bootcamp bootcamp = new Bootcamp();
		bootcamp.setNome("Bootcamp Web Developer");
		bootcamp.setDescricao("Preparatório básico para desenvolvimento Web");
		bootcamp.getConteudos().add(curso1);
		bootcamp.getConteudos().add(curso2);
		bootcamp.getConteudos().add(mentoria1);
		
		Dev devRodrigo = new Dev();
		devRodrigo.setNome("Rodrigo");
		devRodrigo.inscreverBootcamp(bootcamp);
		devRodrigo.progredir();
		devRodrigo.progredir();
		
		System.out.println("Conteúdos inscritos: " + devRodrigo.getConteudosInscritos());
		System.out.println("Conteúdos concluídos: " + devRodrigo.getConteudosConcluidos());
		System.out.println("Xp: " + devRodrigo.calcularTotalXp());
		
		System.out.println("-------------------------------");
		Dev devRoberta = new Dev();
		devRoberta.setNome("Roberta");
		devRoberta.inscreverBootcamp(bootcamp);
		devRoberta.progredir();
		
		System.out.println("Conteúdos inscritos: " + devRoberta.getConteudosInscritos());
		System.out.println("Conteúdos concluídos: " + devRoberta.getConteudosConcluidos());
		System.out.println("Xp: " + devRoberta.calcularTotalXp());
	}

}
