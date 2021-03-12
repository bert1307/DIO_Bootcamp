/*Precisamos saber quanto uma determinada empresa deve pagar para seus
 colaboradores, porém temos apenas a quantidade de horas trabalhadas e o valor hora.
 Escreva um programa que leia o número de um colaborador, seu número de horas trabalhadas,
 o valor que recebe por hora e calcula o salário desse colaborador.
 Em seguida, apresente o número e o salário do colaborador, com duas casas decimais.*/

package DIO;

import java.util.Scanner;

public class TerceiroDesafio {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int numeroFunc = entrada.nextInt();
        int horasTrabalhadas = entrada.nextInt();
        double valorHora = entrada.nextDouble();
        double salary = horasTrabalhadas * valorHora;

        System.out.println("NUMBER = " + numeroFunc);
        System.out.printf(String.format("SALARY = U$ %.2f",salary));

    }
}