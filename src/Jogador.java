import java.util.Scanner;
import java.util.Random;

public class Jogador extends Criatura {

    private int ataqueForte = 120;
    private int ataqueBase = 40;
    private int risco = 50;
    
    public Jogador(String nome) {
        super(nome, 500);
    }

    @Override
    public void fraseDeApresentacao() {
        System.out.println("Estou aqui para defender o bem!");
    }
    @Override
    public void fraseDeMorte() {
        System.out.println("Meus amigos vão vingar minha morte.");
    }

    @Override
    public void fazAtaque(Criatura criatura) {
        System.out.println(String.format("Vez de %s Atacar.", 
        this.getNome()));

        Scanner scan = new Scanner (System.in);

        System.out.println("Escolha seu ataque: ");
        System.out.println(String.format("1- Faca %1 de dano. Taxa de risco = 0%", 
        this.ataqueBase));
        System.out.println(String.format("2 - Flecha %1 de dano. Taxa de risco = 50%", 
        this.ataqueForte));
        
        int escolha = scan.nextInt();

        if (escolha == 1) {
            criatura.tomaDano(this.ataqueBase);
        } else if (escolha == 2) {
         Random rd = new Random();
         int sorteio = rd.nextInt(0, 100);
         if (sorteio < risco) {
            System.out.println("Ataque Falhou.");
         } else {
            System.out.println("Acertou!");
            criatura.tomaDano(ataqueForte);
         }

        } else {
            criatura.tomaDano(0);
        }

    }
    
}
