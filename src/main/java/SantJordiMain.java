import java.util.Scanner;

public class SantJordiMain {

    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        RegalService regalService = new RegalService();

        System.out.println("Escull un tipus de regal (LLIBRE o ROSA):");
        TipusRegal tipus = TipusRegal.valueOf(scanner.next().toUpperCase());

        Regal regal = regalService.getRandomRegal(tipus);
        System.out.println(regal.getDescripcio());
    }
}
