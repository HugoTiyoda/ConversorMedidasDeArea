public class Metodos {
    static Integer hectare = 10000;
    static Integer alqueirePaulista = 24200;
    static Integer alqueireMineiro = 48400;

    static String converterParaHect(double input) {

        double paraHectare = input / hectare;
        String resultado = Double.toString(paraHectare);
        boolean inteiro = resultado.endsWith(".0");

        return inteiro ? resultado.replace(".0", "") : resultado;
    }

    static String converterParaAlqP(double input) {

        double paraAlqP = input / alqueirePaulista;
        String resultado = String.format("%.2f", paraAlqP);
        boolean ehInteiro = resultado.endsWith(",00");

        return ehInteiro ? resultado.replace(",00", "") : resultado;
    }

    static String converterParaAlqM(double input) {

        double paraAlqM = input / alqueireMineiro;
        String resultado = String.format("%.2f", paraAlqM);
        boolean ehInteiro = resultado.endsWith(",00");

        return ehInteiro ? resultado.replace(",00", "") : resultado;
    }

}
