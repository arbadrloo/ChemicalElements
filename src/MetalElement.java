public class MetalElement extends Element{
        public MetalElement(String symbol, String atomicNumber, String description, float atomicWeight) {
        super(symbol, atomicNumber, atomicWeight);

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

    @Override
    public String describeElement() {
        return "this is a Metal element. metals are good conductors of heat and electricity \n"
                + "Element Symbol: " + this.symbol + "\n"
                + "Element Atomic Number: " + this.atomicNumber + "\n"
                + "Element Atomic Weight: " + this.atomicWeight + "\n";
    }
}
