
/* <Desafio 1>
        Crie um programa que leia um número e mostre os números pares até esse número, inclusive ele mesmo.

        Entrada
        Você receberá 1 valor inteiro N, onde N > 0.

        Saída
        Exiba todos os números pares até o valor de entrada, sendo um em cada linha. */
        
        import java.util.Scanner;
        import java.io.IOException;  
      
        public class NumeroPar {
            public static void main(String[] args) throws IOException {

                Scanner entrada = new Scanner(System.in);
        
                int numero = entrada.nextInt();
        
                for (int i = 1; i <= numero; i++) {
                    if (i % 2 == 0) {
                        System.out.println(i);
                    }
                }
            }
        }
            
        
        