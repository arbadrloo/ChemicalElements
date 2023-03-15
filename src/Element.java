public abstract class Element {
    protected String symbol;
    protected String atomicNumber;
    protected double atomicWeight;

    public Element(String symbol, String atomicNumber, double atomicWeight) {
        this.symbol = symbol;
        this.atomicNumber = atomicNumber;
        this.atomicWeight = atomicWeight;
    }

    public String getSymbol() {
        return symbol;
    }

    public String getAtomicNumber() {
        return atomicNumber;
    }

    public double getAtomicWeight() {
        return atomicWeight;
    }
    public abstract String describeElement();
}
