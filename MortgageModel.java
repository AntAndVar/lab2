package ca.yorku.eecs.mcalc;



public class MortgageModel {
    private double p;
    private int n;
    private double r;
    public MortgageModel (String a, String b, String c) {
        p = Double.parseDouble(a);
        n = Integer.parseInt(b) * 12;
        r = (Double.parseDouble(c) / 12) / 100;

    }
    public String computePayment() {
        double base = (1+r);
        double numerator = r*p;
        double denominator = 1 - Math.pow(base, -n);
        double output = numerator / denominator;
        return String.format("$%,.2f", output);
    }
    public static void main(String[] args) {
        MortgageModel myModel = new MortgageModel("700000", "20", "4.50");
        System.out.println(myModel.computePayment());

        myModel = new MortgageModel("300000", "20", "4.5");
        System.out.println(myModel.computePayment());
    }
}
