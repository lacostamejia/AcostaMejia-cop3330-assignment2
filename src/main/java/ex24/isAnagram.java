package ex24;

import java.util.Arrays;

public class isAnagram extends App_ex24{


    public boolean isAnagram(char [] s1, char [] s2, int length_1, int length_2) {

        Arrays.sort(s1);
        Arrays.sort(s2);

        int j = 0;

        if (length_1 == length_2) {

            for (int i = 0; i < length_1; i++) {

                if (s1[i] == s2[i]) {
                    j++;
                }
            }
            if (length_1 == j) {
                return true;
            }
        }
        return false;
    }
}
