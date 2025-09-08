package lab1;

/**
 * Solve the lab1.FizzBuzz challenge.
 */
class FizzBuzz {

    public static void main(String[] args) {
        int i = 1;
        while (i < 100){
            i = doFizzBuzz(i);
        }
    }

    public static int doFizzBuzz(int i) {
        boolean isFizz = i % 3 == 0;
        boolean isBuzz = i % 5 == 0;
        if (isFizz && isBuzz){
            System.out.println("Fizz Buzz");
        }
        else if (isFizz){
            System.out.println("Fizz");
        }
        else if (isBuzz){
            System.out.println("Buzz");
        }
        else{
            System.out.println(i);
        }
        i++;
        return i;
    }
}
