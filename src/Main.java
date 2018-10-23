public class Main {

    public static void main(String[] args) {

        int total = 0;


        // Se inicializa un contador para que sume desde el 0 hasta el 10000


        for(int i = 0; i < 1000; i++)
        {
            // Si el residuo de los numeros entre 3 o 5 = 0, entonces será multiplo
            if(i % 3 == 0 || i % 5 == 0)
            {
                // Con los simbolos +=, se sumarán automáticamente los múltiplos
                total += i;
            }
        }

        System.out.printf("La suma de los múltiplos entre 3 y 5 es %d", total);
    }
}
