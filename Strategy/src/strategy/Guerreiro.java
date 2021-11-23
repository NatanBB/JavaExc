package strategy;

public class Guerreiro extends Personagem {
    public Guerreiro() {
        super.setArma(new Machado());
    }

    @Override
    public void lutar() {
        System.out.println("O Guerreiro vai:");
        super.lutar();
    }
}