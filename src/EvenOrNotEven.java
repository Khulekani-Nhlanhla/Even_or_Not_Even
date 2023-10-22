
public class EvenOrNotEven {
    public static void main(String[] args) {
        System.out.println("This program calculates if a number is even or odd!The range is between 1 and 100");

        int randomGeneratedNumber = (int) (Math.random() * (100 - 1 + 1));
        System.out.println("The number generated is "+ randomGeneratedNumber);

        if (randomGeneratedNumber % 2 == 0){
            System.out.println("This number is even! ");
        }else {
            System.out.println("This number is odd! ");
        }

    }
}
