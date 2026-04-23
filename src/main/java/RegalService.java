public class RegalService {



    public Regal getRandomRegal(TipusRegal tipusRegal) {
        if (tipusRegal == TipusRegal.LLIBRE) {
            return getRandomLlibre();
        } else if (tipusRegal == TipusRegal.ROSA) {
            return getRandomRosa();
        }
        throw new IllegalArgumentException("Tipus de Regal no vàlid! ");
    }

    public Llibre getRandomLlibre() {

    }

    public Rosa getRandomRosa() {

    }
}
