public class Bloqueio extends Escudo {

    private int reducao;

    public Bloqueio(int reducao) {
        this.reducao = reducao;
    }

    @Override
    public int danoReduzido (int dano){
        if(this.reducao > dano){
            return 0;
        }
        return dano - this.reducao;
    }

    
}
