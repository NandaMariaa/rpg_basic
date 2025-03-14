public abstract class Inimigo extends Criatura {

    int ataque;
    
    public Inimigo(String nome, int vida, int ataque) {
        super(nome, vida);
        this.ataque = ataque;
    }
    
    @Override
    public void fazAtaque( Criatura criatura ){
        criatura.tomaDano( this.ataque );
    }

}
