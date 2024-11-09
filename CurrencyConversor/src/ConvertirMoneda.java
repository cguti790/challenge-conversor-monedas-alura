import java.util.Scanner;

public class ConvertirMoneda {

    public static void convertir(String monedaBase, String monedaObjetivo, ConsultarMoneda consulta, Scanner scanner) {

        double cantidad;
        double cantidadConvertida;

        Monedas monedas = consulta.buscaMoneda(monedaBase, monedaObjetivo);
        System.out.println("La tasa de conversión de hoy es: "+ monedaBase + " = " + monedas.conversion_rate()+" "+monedaObjetivo);
        System.out.println("Ingresa la cantidad de "+monedaBase+":");
        cantidad = Double.parseDouble(scanner.nextLine());
        cantidadConvertida = cantidad*monedas.conversion_rate();
        System.out.println(cantidad+" "+monedaBase +" = "+cantidadConvertida+" "+monedas.target_code());
    }
    public static void convertirOtraMoneda(ConsultarMoneda consulta, Scanner scanner) {
        System.out.println("Ingresa la moneda base");
        String monedaBase = scanner.nextLine().toUpperCase();
        System.out.println("Ingresa la moneda objetivo");
        String monedaObjetivo = scanner.nextLine().toUpperCase();
        convertir(monedaBase,monedaObjetivo,consulta,scanner);

    }

}


