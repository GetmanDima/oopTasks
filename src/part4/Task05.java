package part4;

public class Task05 {

    public static void main(String[] args) {
        System.out.println(BMI("205 pounds", "73 inches"));
        System.out.println(BMI("55 kilos", "1.65 meters"));
        System.out.println(BMI("154 pounds", "2 meters"));
    }

    private static String BMI(String w, String h) {
        String[] wArr = w.split(" ");
        String[] hArr = h.split(" ");

        double wVal = Double.parseDouble(wArr[0]);
        double hVal = Double.parseDouble(hArr[0]);

        String wUnit = wArr[1];
        String hUnit = hArr[1];

        if (wUnit.equals("pounds")) {
            wVal *= 0.453592;
        }

        if (hUnit.equals("inches")) {
            hVal *= 0.0254;
        }

        double bmi = Math.round(wVal / (hVal * hVal) * 10.0)/10.0;

        if (bmi <= 18.5) {
            return bmi + " Underweight";
        } else if (bmi <= 24.9) {
            return bmi + " Normal weight";
        }

        return bmi + " Overweight";
    }
}
