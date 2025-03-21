public abstract class Inimigo extends Criatura {

    int ataque;

    Escudo escudo;
    
    public Inimigo(String nome, int vida, int ataque, Escudo escudo) {
        super(nome, vida);
        this.ataque = ataque;
        this.escudo = escudo;
    }
    
    @Override
    public void fazAtaque( Criatura criatura ){
        criatura.tomaDano( this.ataque );
    }

    @Override
    public void tomaDano ( int dano ) {
        int novoDano = this.escudo.danoReduzido(dano);
        super.tomaDano(novoDano);
    }


}
