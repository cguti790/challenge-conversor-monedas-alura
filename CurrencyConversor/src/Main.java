import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ConsultarMoneda consulta =  new ConsultarMoneda();

        int opcion = 0;

        while(opcion != 8){
            System.out.println("*****************\n"
            + "Bienvenido al conversor de monedas!\n\n" +
                    "Opciones:\n"+

                    "1. Dolar a Peso Argentino\n" +
                    "2. Peso Argentino A Dollar\n" +
                    "3. Dolar a Real Brasilero\n" +
                    "4. Real Brasilero a Dollar\n" +
                    "5. Dollar a Peso Colombiano\n" +
                    "6. Peso Colombiano a Dollar\n" +
                    "7. Convertir otra moneda\n" +
                    "8. Salir\n"+
                    "Ingresa la opción de conversion que quieres realizar:");
            opcion = scanner.nextInt();
            scanner.nextLine();

            switch (opcion){
                case 1:
                    ConvertirMoneda.convertir("USD", "ARS", consulta, scanner);
                    break;
                case 2:
                    ConvertirMoneda.convertir("ARS", "USD", consulta, scanner);
                    break;
                case 3:
                    ConvertirMoneda.convertir("USD", "BRL", consulta, scanner);
                    break;
                case 4:
                    ConvertirMoneda.convertir("BRL", "USD", consulta, scanner);
                    break;
                case 5:
                    ConvertirMoneda.convertir("USD", "COP", consulta, scanner);
                    break;
                case 6:
                    ConvertirMoneda.convertir("COP", "USD", consulta, scanner);
                    break;
                case 7:
                    ConvertirMoneda.convertirOtraMoneda(consulta, scanner);
                    break;
                case 8:
                    System.out.println("Cerrando el Conversor");
                    break;
            }

        }



    }
}
