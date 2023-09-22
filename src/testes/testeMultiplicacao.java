package testes;

public class testeMultiplicacao {
     public static void main(String[] args) {
        multiplicacao multiplic = new multiplicacao();
        
        // teste 1: multiplicacao de numeros positivos
        int multiplica = multiplic.multiplicar(6, 6);
        System.out.println(multiplica);
        
        // teste 2: multiplicacao de numeros negativos
        multiplica = multiplic.multiplicar(-6, -6);
        System.out.println(multiplica);
        
        //teste 3: multiplicacao por zero
        multiplica = multiplic.multiplicar(6, 0);
        System.out.println(multiplica);
        
        // teste 4: multiplicacao com numero negativo e positivo
         multiplica = multiplic.multiplicar(-6, 6);
        System.out.println(multiplica);
        
     }
}
