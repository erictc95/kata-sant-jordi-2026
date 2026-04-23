public class Llibre implements Regal{

    private TitolLlibre titol;

    public Llibre(TitolLlibre titol) {
        this.titol = titol;
    }

    public TitolLlibre getTitol() {
        return titol;
    }

    public void setTitol(TitolLlibre titol) {
        this.titol = titol;
    }

    @Override
    public String getDescripcio() {
        return "Títol :" + getTitol();
    }
}
