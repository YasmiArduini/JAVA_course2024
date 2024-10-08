package cursoJava2024;

import java.util.Scanner;

public class Notas4Bimestre {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("=============================");
		System.out.println("FECHAMENTO DE NOTAS 4BIMESTRE");
		System.out.println("=============================");
		System.out.println("Matemática:");
		double mat = sc.nextDouble();
		System.out.println("Português:");
		double por = sc.nextDouble();
		System.out.println("História:");
		double his = sc.nextDouble();
		System.out.println("Inglês:");
		double ing = sc.nextDouble();
		System.out.println("Artes:");
		double art = sc.nextDouble();
		System.out.println("Biologia:");
		double bio = sc.nextDouble();
		System.out.println("Física:");
		double fis = sc.nextDouble();
		System.out.println("Filosofia:");
		double fil = sc.nextDouble();
		System.out.println("Educaçao Financeira:");
		double edf = sc.nextDouble();
		System.out.println("Geografia:");
		double geo = sc.nextDouble();
		System.out.println("Quimica:");
		double qui = sc.nextDouble();
		System.out.println("Tecnologia e Robotica:");
		double tec = sc.nextDouble();
		int nota = (int) ((mat + por + his + ing + art + bio + fis + fil + edf + geo + qui + tec) /5);
		if (nota < 20) {
			System.out.println("Você foi reprovado!");
		}else {
			System.out.println("Você foi aprovado!");
		}
	}
	}