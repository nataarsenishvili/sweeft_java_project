public class number5 {
    public static int lenOfLongSubArr(int[] array, int k) {
        int left = 0;
        int right = 0;
        int sum = 0;
        int maxCount = 0;

        while (right < array.length) {

            sum += array[right];

            while (sum > k) {

                sum -= array[left];
                left++;
            }

            maxCount = Math.max(maxCount, right - left + 1);

            right++;
        }

        return maxCount;
    }

    public static void main(String[] args) {
        int[] array = {6, 2, 2, 3, 4, 1};
        int k = 8;

        int result = lenOfLongSubArr(array, k);

        System.out.println("Result: " + result);
    }
}

