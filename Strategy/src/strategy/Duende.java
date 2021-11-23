package strategy;

public class Duende extends Personagem {
    public Duende() {
        super.setArma(new Faca());
    }

    @Override
    public void lutar() {
        System.out.println("O Duende vai:");
        super.lutar();
    }
}