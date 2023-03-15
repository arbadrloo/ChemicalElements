public class MetalElement extends Element{
    private String description;

    public MetalElement(String symbol, String atomicNumber, String description, float atomicWeight) {
        super(symbol, atomicNumber, atomicWeight);
        this.description = description;
    }

    @Override
    public String getSymbol() {
        return super.getSymbol();
    }

    @Override
    public String getAtomicNumber() {
        return super.getAtomicNumber();
    }

    @Override
    public float getAtomicWeight() {
        return super.getAtomicWeight();
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String describeElement() {
        return "Element Symbol: " + this.symbol + "\n"
                + "Element Atomic Number: " + this.atomicNumber + "\n"
                + "Element Atomic Weight: " + this.atomicWeight + "\n"
                + "Details: " + this.description;
    }
}
