public class MultiplosDeTres {
    public static int suma(int[] numeros) {
        int suma = 0;
        for (int numero : numeros) {
            if (numero % 3 == 0) {
                suma += numero;
            }
        }
        return suma;
    }

    public static void main(String[] args) {
        int[] numeros = new int[args.length];
        for (int i = 0; i < args.length; i++) {
            numeros[i] = Integer.parseInt(args[i]);
        }
        System.out.println("La suma de los múltiplos de tres es: " + suma(numeros));
    }
}
