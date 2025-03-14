import java.util.Scanner;
import java.util.Random;

public class Jogador extends Criatura {

    private int ataqueForte = 120;
    private int ataqueBase = 40;

    public Jogador (String nome) {
        super(nome, 0);
    }

    @Override
    public void fraseDeApresentacao () {
        System.out.println("Vo mata vc");
    }

    @Override
    public void fraseDeMorte () {
        System.out.println("Morri");
    }

    @Override
    public void fazAtaque(Criatura criatura) {

        Scanner scan = new Scanner (System.in);

        System.out.println("Escolha sua arma");
        System.out.println(String.format("1- Faca %1 de dano.", 
        this.ataqueBase));
        System.out.println(String.format("2 - Flecha %1 de dano.", 
        this.ataqueForte));
        
        int escolha = scan.nextInt();

        if (escolha == 1) {
            criatura.tomaDano(this.ataqueBase);
        } else if (escolha == 2) {
         Random rd = new Random();
         int sorteio = rd.nextInt(0, 100);
         if (sorteio < 50) {
            System.out.println("Ataque Falhou");
         } else {
            System.out.println("Acertou!");
            criatura.tomaDano(ataqueForte);
         }

        } else {
            criatura.tomaDano(0);
        }


    }
    
}
