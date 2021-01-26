public class pythagoreanTheoremTest{
    public static void main (String[] args){
        pythagoreanTheorem py = new pythagoreanTheorem();
        Double hypotenuse = py.calculateHypotenuse(2,6);
        Double hypotenuse1 = py.calculateHypotenuse(8,14);
        System.out.println(hypotenuse);
        System.out.println(hypotenuse1);
    }
}
