package atividades.atv01;

public class Main {
    static void main() {

        atividades.atv01.Carro carro = new atividades.atv01.Carro("Onix", "Chevrolet", 2023, 4, "vermelho");
        atividades.atv01.Moto moto = new atividades.atv01.Moto("CG 160", "Honda", 2015, "Vermelha", 160);
        atividades.atv01.Caminhao caminhao = new atividades.atv01.Caminhao("FH 540", "Volvo", 2024, "Cinza", 30000);
        atividades.atv01.Bicicleta bicicleta = new atividades.atv01.Bicicleta("Java", "Siluro 3", 2013, 1, "azul", 29);

        System.out.println(carro);
        System.out.println(carro.ligar());
        System.out.println(carro.acelerar());
        System.out.println(carro.desligar());

        System.out.println(moto);
        System.out.println(moto.frear());
        System.out.println(moto.abastecer());
        System.out.println(moto.trocarMarcha());

        System.out.println(caminhao);
        System.out.println(caminhao.estacionar());
        System.out.println(caminhao.carregarCarga());
        System.out.println(caminhao.descarregarCarga());


        System.out.println(bicicleta);
        System.out.println(bicicleta.parar());
        System.out.println(bicicleta.pedalar());
        System.out.println(bicicleta.trocarMarcha());


    }
}
