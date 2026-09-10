package atividades.atv09;

import java.util.ArrayList;

public class Main {
    static void main() {
        Funcionario v1 = new Vendedor("Kaique","1234567889",20000,1500);
        Funcionario d1 = new Desenvolvedor("Carlos Lima","0987654433",7000);
        Funcionario g1 = new Gerente("Mariana Souza","1234566778",10000);

        ArrayList<Funcionario> funcionarios = new ArrayList<>();
        funcionarios.add(v1);
        funcionarios.add(d1);
        funcionarios.add(g1);

        double totalFolha = 0;
        for(Funcionario f:funcionarios){
            f.exibirHolerite();
            totalFolha += f.calcularRemuneracaoTotal();
        }

        System.out.printf("Remuneração total dos funcionários = R$%.2f\n" ,totalFolha);
    }
}
