public class Jogo {

    public static void main(String[] args) {
        
        Criatura jogador = new Terrivel();
        Criatura inimigo = new Malignus();
        Criatura jogador1 = new Jogador("Fernanda", 600);
        
        System.out.println("Bem vindos a grande batalha!");
        jogador.fraseDeApresentacao();
        inimigo.fraseDeApresentacao();

        while(true){
            jogador.fazAtaque(inimigo);
            if(inimigo.estaVivo()){
                inimigo.fazAtaque(jogador);
            }
            
            jogador.mostraVida();
            inimigo.mostraVida();
            
            if(!jogador.estaVivo()){
                jogador.fraseDeMorte();
                System.out.println(inimigo.getNome() + " venceu!");
                break;
            }
            
            if(!inimigo.estaVivo()){
                inimigo.fraseDeMorte();
                System.out.println(jogador.getNome() + " venceu!");
                break;
            }
        }
    }
}