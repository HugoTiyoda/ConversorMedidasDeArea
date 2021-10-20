import java.util.Scanner;

public class Usuario extends   Metodos{


    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Defina o valor em metros quadrados(m²): ");
        double definido = entrada.nextDouble();

        System.out.println(Metodos.converterParaHect(definido) + " Hectare");
        System.out.println(Metodos.converterParaAlqP(definido) + " Alqueire Paulista");
        System.out.println(Metodos.converterParaAlqM(definido) + " Alqueire Mineiro");
        entrada.close();
    }




}
