package atividades.atv12;

import java.util.ArrayList;

public class Main {
    static void main() {

        Frete fPadrao = new FretePadrao(5,10.00);
        Frete fExpresso = new FreteExpresso(2.5,12);
        Frete fInternacional = new FreteInternacional(8,20,60,45);

        ArrayList<Frete> listaFrete = new ArrayList<>();

        listaFrete.add(fPadrao);
        listaFrete.add(fExpresso);
        listaFrete.add(fInternacional);

        double freteTotal = 0;

        for(Frete f : listaFrete){
            System.out.println(f.calcularFrete());
             freteTotal += f.calcularFrete();
        }

        System.out.printf("Total do frete = R$%.2f\n", freteTotal);


    }
}
