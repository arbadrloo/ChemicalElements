public abstract class Element {
    protected String symbol;
    protected String atomicNumber;
    protected float atomicWeight;

    public Element(String symbol, String atomicNumber, float atomicWeight) {
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

    public float getAtomicWeight() {
        return atomicWeight;
    }
    public abstract String describeElement();
}
