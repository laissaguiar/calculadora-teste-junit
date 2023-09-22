package testes;

public class testeSoma {
    public static void main(String[] args) {
         soma som = new soma();
         
         //teste 1: soma de numeros positivos
         int soma = som.somar(1,2);
         System.out.println(soma);
         
         //teste 2: soma de numero positivo e negativo
         soma = som.somar(1,-2);
        System.out.println(soma);
         
         //teste 3: soma soma de numeros negativos
         soma = som.somar(-1,-3);
         System.out.println(soma);
         
         //teste 4: soma de um numero positivo mais zero
          soma = som.somar(0,1);
         System.out.println(soma);
         
         //teste 5: soma de um numero negativo com zero
          soma = som.somar(0,-1);
         System.out.println(soma);
         
        
         
     }
}
