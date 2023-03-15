public class ElementArray {
    public static void main(String[] args) {
        MetalElement[] metals = {new MetalElement("Fe", "26", 55.845),
        new MetalElement("Cu", "29", 63.546),
        new MetalElement("Zn", "30", 30),
        new MetalElement("Ag", "47", 107.8682)};
        NonMetalElement[] nonmetals = {new NonMetalElement("C", "6", 12.011),
        new NonMetalElement("O", "8", 15.999),
        new NonMetalElement("N", "7", 14.007),
        new NonMetalElement("F", "9", 18.998)};
        for (Element element:metals
             ) {
            System.out.println(element.describeElement());
        }
        for (Element element:nonmetals
        ) {
            System.out.println(element.describeElement());
        }


    }
}
