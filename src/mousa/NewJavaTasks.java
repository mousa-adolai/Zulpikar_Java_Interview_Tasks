package mousa;

public class NewJavaTasks {

    public static void main(String[] args) {
        swapNumbers(23,32);
    }

    public static int[] concat(int[] arr1, int[] arr2) {
        int[] result = new int[arr1.length + arr2.length];
        int j = 0;
        for (int i : arr1) {
            result[j++] = i;
        }
        for (int i : arr2) {
            result[j++] = i;
        }
        return result;
    }

    public static void divisibleBy15() {
        String divBy15 = "Divisible by 15: ";
        String divBy5 = "Divisible by 5: ";
        String divBy3 = "Divisible by 3: ";
        for (int i = 1; i <= 100; i++) {
            if (i % 15 == 0) {
                divBy15 += i + " ";
            } else if (i % 5 == 0) {
                divBy5 += i + " ";
            } else if (i % 3 == 0) {
                divBy3 += i + " ";
            }
        }
        System.out.println(divBy15 + "\n" + divBy5 + "\n" + divBy3);
    }

    public static String oddOrEven(int num) {
        return num % 2 == 0 ? "Even" : "Odd";
    }

    public static void swapNumbers(int x , int y) {
        System.out.println("x = " + x + " " + "y = " + y);

        x += y; //x = 15
        y = x - y; //y = 10
        x -= y; //x = 5

        System.out.println("POST SWAP");
        System.out.println("x = " + x + " " + "y = " + y);
    }

    public static void FINRA() {
        for (int i = 1; i <= 30; i++) {
            if (i % 15 == 0) {
                System.out.print("FINRA ");
            } else if (i % 5 == 0) {
                System.out.print("RA ");
            } else if (i % 3 == 0) {
                System.out.print("FIN ");
            } else {
                System.out.print(i + " ");
            }
        }
    }

    public static int divideWithoutDivision(int divisor, int dividend) {
        int quotient = 0;

        if (divisor == 0) {
            throw new ArithmeticException("Divisor can not be zero");
        }
        while (dividend >= divisor) {
            dividend -= divisor;
            quotient++;
        }

        return quotient;

    }
}
