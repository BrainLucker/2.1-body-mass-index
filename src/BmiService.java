public class BmiService {
    public float calculate(int weight, int height) {
        float result = (float) Math.round(10 * weight / Math.pow(height * 0.01, 2)) / 10;
        return result;
    }
}