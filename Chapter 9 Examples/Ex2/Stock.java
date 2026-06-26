package stockm;

public class Stock {

    String symbol;
    String name;
    double previousClosingPrice;
    double currentPrice;

    // Constructor
    public Stock(String symbol, String name) {
        this.symbol = symbol;
        this.name = name;
    }

    // Calculate percentage change
    public double getChangePercent() {
        return ((currentPrice - previousClosingPrice)
                / previousClosingPrice) * 100;
    }
}
