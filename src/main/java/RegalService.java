import java.util.Random;

public class RegalService {

    private Random random = new Random();


    public Regal getRandomRegal(TipusRegal tipusRegal) {
        if (tipusRegal == TipusRegal.LLIBRE) {
            return getRandomLlibre();
        } else if (tipusRegal == TipusRegal.ROSA) {
            return getRandomRosa();
        }
        throw new IllegalArgumentException("Tipus de Regal no vàlid! ");
    }

    public Llibre getRandomLlibre() {
        TitolLlibre[] titols = TitolLlibre.values();
        int index = random.nextInt(titols.length);
        TitolLlibre llibreEscollit = titols[index];
        return new Llibre(llibreEscollit);
    }

    public Rosa getRandomRosa() {
        ColorRosa[] colors = ColorRosa.values();
        int index = random.nextInt(colors.length);
        ColorRosa rosaEscollida = colors[index];
        return new Rosa(rosaEscollida);
    }
}
