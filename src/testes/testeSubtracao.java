package testes;

public class testeSubtracao {
     public static void main(String[] args) {
        subtracao sub = new subtracao();
        
        // teste 1: subtracao de numeros positivos 
        int subtrai = sub.subtrair(5,4);
        System.out.println(subtrai);
        
        // teste 2: subtracao de numeros negativos
        subtrai = sub.subtrair(-1,-2);
        System.out.println(subtrai);
        
        // teste 3: subtracao de numero positivo e com numero zero
        subtrai = sub.subtrair(1,0);
        System.out.println(subtrai);
        
        
        // teste 4: subtracao de numero zero por numero positivo
        subtrai = sub.subtrair(0,2);
        System.out.println(subtrai);
        
        // teste 5: subtracao de numero negativo e numero positivo
        subtrai = sub.subtrair(-1,7);
        System.out.println(subtrai);
        
         // teste 6: subtracao de numero positivo e numero negativo
        subtrai = sub.subtrair(1,-7);
        System.out.println(subtrai);
}
}
