package org.practice.StaticElements;

public class ToyotaCars {
    NonStaticInner nonStaticInner = new NonStaticInner();
    private int x = 10;

    public static class Brand {
        private static String brandName = "Toyota";

        public static void tagLine() {

            System.out.println("Reliable car i suppose");
        }
    }

    public class NonStaticInner {
        public void model(String model) {
            System.out.println("Model of car, "+ model);
            System.out.println("Brand name, "+ Brand.brandName);
            System.out.println("Value of x , "+ x);
        }
    }

    public NonStaticInner getNonStaticInner() {
        return nonStaticInner;
    }
}
