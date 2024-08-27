public class PromedioMultiplosDeTres {
    public static int suma(int[] numeros) {
        int suma = 0;
        for (int numero : numeros) {
            if (numero % 3 == 0) {
                suma += numero;
            }
        }
        return suma;
    }

    public static double promedio(int[] numeros) {
        int suma = suma(numeros);
        int count = 0;
        for (int numero : numeros) {
            if (numero % 3 == 0) {
                count++;
            }
        }
        return count == 0 ? 0 : (double) suma / count;
    }

    public static void main(String[] args) {
        int[] numeros = new int[args.length];
        for (int i = 0; i < args.length; i++) {
            numeros[i] = Integer.parseInt(args[i]);
        }
        System.out.println("La suma de los múltiplos de tres es: " + suma(numeros));
        System.out.println("El promedio de los múltiplos de tres es: " + promedio(numeros));
    }
}
