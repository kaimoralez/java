package fundamentos.arrays;

public class ex01 {
    static void main() {

        int[] numeros = {10,20,30};
        System.out.println(numeros[3]);
        //O array tem tamanho 3, então seus indices são 0,1 e 2.

        int[][] matriz = new int[2][];
        matriz[0] = new int[3];
        matriz[1] = new int[5];
        // Um array multimencional é um array de arrays e
        // podemos instanciar as linhas com tamanhos diferentes...

        String[] linguagens = {"Java", "Python", "C#"};
        int tamanho = linguagens.length();
        System.out.println(tamanho);
        //Length é uma propriedade então não deve ter parênteses
        //o correto seria apenas linguagens.length

        int[] valores = {1,2,3,4};
        for(int v:valores){
            System.out.println(v + "");
        }
        //É um uso for-each para percorrer e imprimir todos os elementos do array
    }
}
