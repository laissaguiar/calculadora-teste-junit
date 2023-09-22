
package testes;

public class testeDivisao {
     public static void main(String[] args) {
        
        divisao div = new divisao();
        
        // teste 1: divisao de dois numeros positivos
         float divid = div.dividir(1, 2);
        System.out.println(divid);
        
        //teste 2: divisao de dois numeros negativos
        divid = div.dividir(-1, -2);
        System.out.println(divid);
        
        //teste 3: divisao de zero por algum numero
        divid = div.dividir(0, 1);
        System.out.println(divid);
        
        // teste 4: divisao de algum numero por zero
        divid = div.dividir(1, 0);
        System.out.println(divid);
        
        // teste 5: divisao de dividendo positivo e divisor negativo
         divid = div.dividir(5, -1);
        System.out.println(divid);
        
        // teste 6: divisao de dividendo negativo e divisor positivo
        divid = div.dividir(-1, 5);
        System.out.println(divid);
     }
}
