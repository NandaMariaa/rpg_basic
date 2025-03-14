public abstract class Criatura {

    private String nome;
    private int vida;

    public Criatura (String nome, int vida) {
        this.nome = nome;
        this.vida = vida;
        
    }

    public abstract void fraseDeApresentacao ();
    public abstract void fraseDeMorte ();
    public abstract void fazAtaque (Criatura criatura);

    public boolean estaVivo () {

        if (vida > 0) {
            return true;
        } else {
            return false;
        }

    }

    public void tomaDano ( int dano ) {
        if ( dano > this.vida ) {
            this.vida = 0;
        } else {
            this.vida -= dano;
        }
        //System.out.println(String.format("%s recebeu %1 de dano.", 
        //this.nome, dano));
    }

    public void mostraVida () {
        //System.out.println(String.format("%s tem %1 pontos de vida.", 
        //this.nome, vida));
    }


}