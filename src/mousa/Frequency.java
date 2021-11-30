package mousa;

public class Frequency {
    static String test = "AAABBCDD";

    public static void main(String[] args){
        String noDuplicates = ""; //ABCD

        for(char c: test.toCharArray()){
            if(!noDuplicates.contains(c+"")){
                noDuplicates+=c;
            }
        }

        String result = "";
        int count = 0;

        for(int i = 0; i < noDuplicates.length(); i++){
            char selected = noDuplicates.charAt(i);
            count = 0;
            for(int j = 0; j < test.length(); j++){
                if(selected == test.charAt(j)){
                    count++;
                }
            }
            result += ""+selected+count;

        }

        System.out.println("result = " + result);

    }
}
