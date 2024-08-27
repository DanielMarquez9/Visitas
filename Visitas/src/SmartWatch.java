import java.util.ArrayList;

public class SmartWatch {
    public static int[] clearSteps(int[] steps) {
        ArrayList<Integer> filtrados = new ArrayList<>();
        for (int step : steps) {
            if (step >= 200 && step <= 100000) {
                filtrados.add(step);
            }
        }
        return filtrados.stream().mapToInt(i -> i).toArray();
    }

    public static double promedio(int[] steps) {
        int suma = 0;
        for (int step : steps) {
            suma += step;
        }
        return (double) suma / steps.length;
    }

    public static void main(String[] args) {
        int[] steps = new int[args.length];
        for (int i = 0; i < args.length; i++) {
            steps[i] = Integer.parseInt(args[i]);
        }
        int[] stepsFiltrados = clearSteps(steps);
        System.out.println("El promedio de pasos es: " + promedio(stepsFiltrados));
    }
}
