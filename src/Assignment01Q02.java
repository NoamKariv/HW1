public class Assignment01Q02 {
    public static void main(String[] args) {
        double actualPi = Math.PI;
        double approxPi = 0;
        double input = Double.parseDouble(args[0]);
        double denominator = 1.0;
        for (int i = 1; i <= input; i++) {
            approxPi += Math.pow(-1, i + 1) * (1.0 / denominator);
            denominator += 2.0;
        }
        approxPi *= 4.0;
        System.out.println(approxPi + " " + actualPi);
    }
}
