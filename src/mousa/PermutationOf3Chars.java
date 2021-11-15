package mousa;

public class PermutationOf3Chars {

    public static void main(String[] args) {

        char[] a = {'a', 'b','c'};

        String permutation = "";

        for(int i = 0; i< a.length; i++){

            permutation += ""+a[0]+a[1]+a[2]+"\n";
            permutation += ""+a[0]+a[2]+a[1]+"\n";

            char temp =a[0];
            a[0]=a[1];
            a[1]=a[2];
            a[2]=temp;


        }


        System.out.println(permutation);

    }

}

