import java.util.List;



public class number2 {
    public static int numberOfHappyStrings(List<String> strings){
        int result = 0;
        for (int i = 0; i <strings.size(); i++) {
            String component = strings.get(i);
            for (int j = 0; j < component.length()-1; j++) {
                if(component.charAt(j)==component.charAt(j+1)){
                    break;
                }
                if(j+1==component.length()-1){
                    result++;
                }

            }
        }
        return result;
    }
    public static void main(String[] args) {
        List<String> strings = List.of("abbcc", "abc", "abcabc", "cabcabb");
        int result = numberOfHappyStrings(strings);
        System.out.println("Number of happy strings: " + result);
    }
//}
}
