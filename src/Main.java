import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ConsultaAPI consulta = new ConsultaAPI();
        Scanner lectura = new Scanner(System.in);
        System.out.println("Bienvenido al conversor de monedas");

        int salir = 1;
        while (salir != 0){

            try{
                System.out.println("Opciones: \nARS: Argentina\nUSD: Dolar estado unidense\nMXN: Mexico\nEUR: Euro");
                System.out.println("Selecciona la moneda que tienes: ");
                String moneda = lectura.nextLine();
                System.out.println("Selecciona la moneda a la que quieres convertir: ");
                String toMoneda = lectura.nextLine();
                System.out.println("Se convertira " + moneda + " a " + toMoneda);

                System.out.println("Escribe la cantidad a convertir: ");
                double dinero = lectura.nextFloat();

                Moneda cambio = consulta.buscaMoneda(moneda,toMoneda);

                double resultado = cambio.conversion_rate() * dinero;
                System.out.println(dinero + " " + moneda + " a " + toMoneda + " es igual a " + resultado);

                //GeneradorDeArchivo generador = new GeneradorDeArchivo();
                //generador.guardarJson(pelicula);
                System.out.println("¿Quieres realizar alguna otra operacion? '1' Si --- '0' No");
                salir = lectura.nextInt();
            }
            catch(RuntimeException e){
                System.out.println(e.getMessage());
                System.out.println("Finalizando la aplicacion");
                salir = 0;
            }
        }
    }
}