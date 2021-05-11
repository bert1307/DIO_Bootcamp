/*Você receberá dois valores inteiros. Faça a leitura e em seguida
 calcule o produto entre estes dois valores. Atribua esta operação à variável PROD,
 mostrando esta de acordo com a mensagem de saída esperada (exemplo abaixo).*/

package DIO;

import java.util.Scanner;

public class SegundoDesafio {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int a = entrada.nextInt();
        int b = entrada.nextInt();
        int PROD = a * b;

        System.out.println("PROD = " + PROD);
    }
}
