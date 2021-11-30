package mousa;

import java.util.Arrays;

public class OrderedOrders {
    static String actual = "DC501GCCA098911";
    static String expected = "CD015ACCG011899";

    public static void main(String[] args){
        String firstPart = actual.substring(0,2);
        String secondPart = actual.substring(2,5);
        String thirdPart = actual.substring(5,9);
        String fourthPart = actual.substring(9);

        char[] firstPartArr = firstPart.toCharArray();
        Arrays.sort(firstPartArr);
        char[] secondPartArr = secondPart.toCharArray();
        Arrays.sort(secondPartArr);
        char[] thirdPartArr = thirdPart.toCharArray();
        Arrays.sort(thirdPartArr);
        char[] fourthPartArr = fourthPart.toCharArray();
        Arrays.sort(fourthPartArr);

        actual = "";

        for(char c:firstPartArr){
            actual+=c;
        }
        for(char c:secondPartArr){
            actual+=c;
        }
        for(char c:thirdPartArr){
            actual+=c;
        }
        for(char c:fourthPartArr){
            actual+=c;
        }

        System.out.println(actual);
    }

}
