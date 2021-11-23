package strategy;

public class Rainha extends Personagem {
    public Rainha() {
        super.setArma(new ArcoeFlecha());
    }

    @Override
    public void lutar() {
        System.out.println("A Rainha vai:");
        super.lutar();
    }
}