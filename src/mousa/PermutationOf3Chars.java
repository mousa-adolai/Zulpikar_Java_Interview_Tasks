package mousa;

import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Set;

public class PermutationOf3Chars {

   /*
    Given an array of 3 characters print all permutation combinations from the given characters
    */

        public static void main(String[] args){
            PermutationOf3Chars p3 = new PermutationOf3Chars();
            p3.printPermutation(new char[]{'c','a','t'});
        }

        public void printPermutation(char[] ch) {
            for (String s : permutation(ch)) {
                System.out.println(s);
            }
        }

        public Set<String> permutation(char[] ch) {
            String str = Arrays.toString(ch).replace(", ", "").replace("[", "").replace("]", "");
            Set<String> set = new LinkedHashSet<>();

            if (str.length() == 1) {
                set.add(str);
            } else {
                for (int i = 0; i < str.length(); i++) {
                    String a3 = str.substring(0, i) + str.substring(i + 1);
                    char[] ch2 = a3.toCharArray();
                    for (String permutation : permutation(ch2)) {
                        set.add(str.charAt(i) + permutation);
                    }
                }

            }

            return set;
        }

    }

//    public static void main(String[] args) {
//
//        char[] a = {'a', 'b','c'};
//
//        String permutation = "";
//
//        for(int i = 0; i< a.length; i++){
//
//            permutation += ""+a[0]+a[1]+a[2]+"\n";
//            permutation += ""+a[0]+a[2]+a[1]+"\n";
//
//            char temp =a[0];
//            a[0]=a[1];
//            a[1]=a[2];
//            a[2]=temp;
//
//
//        }
//
//
//        System.out.println(permutation);
//
//    }



