
package valor.pesos.dolares.y.euros;

import java.util.Scanner;

public class ValorPesosDolaresYEuros {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        
        double  pesos, dolares, euros, tasaDolar, tasaEuro;
        
        System.out.println("ingrese la cantidad en pesos: ");
        pesos = entrada.nextDouble();
        
        tasaDolar = 3.687;
        tasaEuro = 4.350;
        
        dolares = (pesos / tasaDolar);
        euros = (pesos / tasaEuro);
        
        System.out.println("el valor en dolares es: " + dolares);
        System.out.println("el valor en euros es: " + euros);
        
        
        
        
        
        
        
        
    }
    
}
