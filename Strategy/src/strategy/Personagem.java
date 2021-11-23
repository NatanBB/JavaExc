package strategy;

public abstract class Personagem {
    private Arma arma;

    public Arma getArma() {
        return arma;
    }

    public void setArma(Arma arma) {
        this.arma = arma;
    }

    public void lutar() {
        arma.usarArma();
    }
}