import java.util.HashSet;
import java.util.Set;

public class number4 {
        public static int[] findIntersecion(int[] nums1, int[] nums2){
            Set<Integer> result = new HashSet<>();
            int a = 0;
            for (int i = 0; i < nums1.length; i++) {
                for (int j = 0; j < nums2.length; j++) {
                    if (nums1[i] == nums2[j]){
                        result.add(nums1[i]);
                    }

                }
            }
            int[] result1 = new int[result.size()];
            int h = 0;
            for(int num: result){
                result1[h]=num;
                h++;
            }
            return result1;
        }

        public static void main(String[] args) {
            int[] num1 = {1, 2, 3, 4, 5};
            int[] num2 = {3, 4, 4, 5, 6, 7};

            int[] result = findIntersecion(num1, num2);

            System.out.print("Intersection: ");
            for (int num : result) {
                System.out.print(num + " ");
            }

        }
}

