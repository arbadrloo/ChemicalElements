public class NonMetalElement extends Element{

    public NonMetalElement(String symbol, String atomicNumber, double atomicWeight) {
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
    public double getAtomicWeight() {
        return super.getAtomicWeight();
    }
    @Override
    public String describeElement() {
        return "this is a Nonmetal element. Nonmetals are not good conductors of heat and electricity \n"
                + "Element Symbol: " + this.symbol + "\n"
                + "Element Atomic Number: " + this.atomicNumber + "\n"
                + "Element Atomic Weight: " + this.atomicWeight + "\n";
    }
}
