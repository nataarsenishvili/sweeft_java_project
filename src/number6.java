import java.util.HashSet;
import java.util.Set;

public class number6 {
        public static boolean isValidSequence(int[] array, int[] sequence){
            Set<Integer> newset = new HashSet<>();
            for (int num : array) {
                for (int num1 : sequence) {
                    if (num == num1) {
                        newset.add(num);
                    }
                }
            }
            int[] result1 = new int[newset.size()];
            int h = 0;
            for(int num2: newset){
                result1[h]=num2;
                h++;
            }
            for (int i = 0; i <result1.length ; i++) {
                if(result1[i] == sequence[i]){
                    return true;
                }
            }
            return false;


        }

        public static void main(String[] args) {
            int[] array = {5,1,22,25,6,-1,8,10};
            int [] sequence = {1,6,-1,10};
            System.out.println(isValidSequence(array, sequence));
        }
}

