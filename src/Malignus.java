public abstract class Malignus extends Inimigo {

    public Malignus() {
        super("Maligus", 500, 50);
    }

    @Override 
    public void fraseDeApresentacao () {
        System.out.println("Vou te mata");
    }

    @Override 
    public void fraseDeMorte () {
        System.out.println("No ceu tem pão ?");
    }
    
}
