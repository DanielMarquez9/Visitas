public class Visitas {
    public static double promedio(int[] visitas) {
        int suma = 0;
        for (int visita : visitas) {
            suma += visita;
        }
        return (double) suma / visitas.length;
    }

    public static void main(String[] args) {
        int[] visitas = new int[args.length];
        for (int i = 0; i < args.length; i++) {
            visitas[i] = Integer.parseInt(args[i]);
        }
        System.out.println("El promedio de visitas es: " + promedio(visitas));
    }
}

