public class BmiService {
    public float calculate(int weight, int height) {
        // Округление результата до десятых с помощью Math.round, умножения и деления на 10
        float result = (float) Math.round(10 * weight / Math.pow(height * 0.01, 2)) / 10;
        return result;
    }
}