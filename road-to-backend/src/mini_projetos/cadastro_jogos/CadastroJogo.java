package mini_projetos.cadastro_jogos;

import java.util.ArrayList;

public class CadastroJogo {

    private ArrayList<Jogo> jogos;

    public CadastroJogo(){
        jogos = new ArrayList<>();
    }

    public void adicionar(Jogo jogo){
        jogos.add(jogo);
    }

    public void listar(){
        for(Jogo jogo:jogos){
            System.out.println(jogo);
        }
    }

    public Jogo buscar(String jogoBuscado){
        for(Jogo jogo: jogos){
            if (jogo.getNome().equals(jogoBuscado)){
                return jogo;
            }
        }
        return null;
    }

}
