package q8;

import java.util.Arrays;

public class Tax {
    public static final int SINGLE_FILER = 0;
    public static final int MARRIED_JOINTLY_OR_QUALIFYING_WIDOW = 1;
    public static final int MARRIED_SEPARATELY = 2;
    public static final int HEAD_OF_HOUSEHOLD = 3;

    private int filingStatus;
    private double[][] brackets;
    private double[] rates;
    private double taxableIncome;

    // Constructor with parameters
    public Tax(int filingStatus, double[][] brackets, double[] rates, double taxableIncome) {
        this.filingStatus = filingStatus;
        this.brackets = brackets;
        this.rates = rates;
        this.taxableIncome = taxableIncome;
    }

    // Getter and setter methods for each field
    public int getFilingStatus() {
        return filingStatus;
    }

    public void setFilingStatus(int filingStatus) {
        this.filingStatus = filingStatus;
    }

    public double[][] getBrackets() {
        return brackets;
    }

    public void setBrackets(double[][] brackets) {
        this.brackets = brackets;
    }

    public double[] getRates() {
        return rates;
    }

    public void setRates(double[] rates) {
        this.rates = rates;
    }

    public double getTax() {
        if (taxableIncome <= brackets[0][0]) {
            return taxableIncome * rates[0];
        } else if (taxableIncome > brackets[0][0] && taxableIncome <= brackets[1][0]) {
            return taxableIncome * rates[0] + (brackets[1][0] - brackets[0][0]) * rates[1];
        } else if (taxableIncome > brackets[1][0] && taxableIncome <= brackets[2][0]) {
            return taxableIncome * rates[0] + (brackets[2][0] - brackets[1][0]) * rates[1] +
                   (brackets[3][0] - brackets[2][0]) * rates[2];
        } else if (taxableIncome > brackets[2][0] && taxableIncome <= brackets[3][0]) {
            return taxableIncome * rates[0] + (brackets[3][0] - brackets[2][0]) * rates[1] +
                   (brackets[4][0] - brackets[3][0]) * rates[2] + (brackets[5][0] - brackets[4][0]) * rates[3];
        } else {
            return taxableIncome * rates[0] + (brackets[5][0] - brackets[4][0]) * rates[2] +
                   (brackets[6][0] - brackets[5][0]) * rates[3] + (brackets[7][0] - brackets[6][0]) * rates[4];
        }
    }

    // Test program to print the 2001 and 2009 tax tables
    public static void main(String[] args) {
        double[][] brackets2001 = {{50000, 7365}, {87000, 9405}, {153000, 11505}, {179000, 13505}};
        double[] rates2001 = {0.15, 0.275, 0.305, 0.355};
        double taxableIncome2001 = 60000;

        Tax tax2001 = new Tax(SINGLE_FILER, brackets2001, rates2001, taxableIncome2001);
        System.out.println("Tax table for 2001:");
        System.out.printf("Filing status: %d\n", tax2001.getFilingStatus());
        System.out.printf("Brackets: %s\n", Arrays.toString(tax2001.getBrackets()));
        System.out.printf("Rates: %s\n", Arrays.toString(tax2001.getRates()));
        System.out.printf("Taxable income: %.2f\n", tax2001.getTax());

        double[][] brackets2009 = {{50000, 7365}, {87000, 9405}, {153000, 11505}, {179000, 13505}};
        double[] rates2009 = {0.15, 0.275, 0.305, 0.355};
        double taxableIncome2009 = 60000;

        Tax tax2009 = new Tax(SINGLE_FILER, brackets2009, rates2009, taxableIncome2009);
        System.out.println("\nTax table for 2009:");
        System.out.printf("Filing status: %d\n", tax2009.getFilingStatus());
        System.out.printf("Brackets: %s\n", Arrays.toString(tax2009.getBrackets()));
        System.out.printf("Rates: %s\n", Arrays.toString(tax2009.getRates()));
        System.out.printf("Taxable income: %.2f\n", tax2009.getTax());
    }
}
