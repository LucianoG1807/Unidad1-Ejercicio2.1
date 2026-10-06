public class main {
    static void main(String[] args) {

        PiezaIndustrial pieza1 = new PiezaIndustrial(
                "01234A",
                149.6,
                150
        );

        System.out.println(pieza1.esAceptable());
        System.out.println(" ");

        PiezaIndustrial pieza2 = new PiezaIndustrial(
                "01234B",
                135,
                150
        );

        System.out.println(pieza2.esAceptable());
    }
}
