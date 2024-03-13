public class number1 {
        public static  int evaluateExpression(String expression) {
            int k = 0;
            int m =0;
            char op = '+';
            int result = 0;
            for (int i = 0; i < expression.length(); i++) {
                char a = expression.charAt(i);
                if (Character.isDigit(a)) {
                    m=(int)a;
                    k = k * 10 + (a-'0');
                }
                if (!Character.isDigit(a) || i + 1 == expression.length()) {

                    if (op == '+') {
                        result = result + k;

                    } else if (op == '-') {
                        result = result - k;

                    }
                    k=0;
                    op=a;
                }

            }
            return result;
        }
        public static void main(String[] args) {
            String expression = "5+20-8+5";
            int answer = evaluateExpression(expression);
            System.out.println(answer);
        }
}
