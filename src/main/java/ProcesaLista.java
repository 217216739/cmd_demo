public class ProcesaLista {

    public static void main(String args[] ){

        if(args.length == 0) {
            System.out.println("Faltan argumentos");
            System.exit(1);  //Este valor es un codigo de error que se pasa al sistema operativo
        }

        int suma = 0;
        int media = 0;
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        for (var i = 0; i < args.length; i++){
            int x = 0;

            try {
                x = Integer.parseInt(args[i]); //Con esto lo convertimos a numeros enteros
            }catch (NumberFormatException ex){
                System.out.println("Error en formato de numeros ");
                System.exit(2);
            }

            min = Math.min(min, x);
            max = Math.max(max, x);
            suma += x;


        }

        System.out.println("Suma = " + suma);
        System.out.println("Min = " + min);
        System.out.println("Max = " + max);
        System.out.println("Media = " + (suma/ args.length));

    }
}
