package strategy;

public class Rei extends Personagem {
    public Rei() {
        super.setArma(new Espada());
    }

    @Override
    public void lutar() {
        System.out.println("O Rei vai:");
        super.lutar();
    }
}