public class Terrivel extends Inimigo {

    public Terrivel() {
        super("Terrível", 1000, 25, new Esquiva(20));
    }

    @Override
    public void fraseDeApresentacao() {
        System.out.println("Eu sou terrível!");
    }

    @Override
    public void fraseDeMorte() {
        System.out.println("Socoooorrrorororo");
    }
    
}
