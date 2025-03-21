public class Malignus extends Inimigo {

    public Malignus() {
        super("Maligus", 500, 50, new Bloqueio(30));
    }

    @Override 
    public void fraseDeApresentacao () {
        System.out.println("A lamina que não se vê, é a mais mortifera.");
    }

    @Override 
    public void fraseDeMorte () {
        System.out.println("No ceu tem pão ?");
    }
    
}
