import java.util.Stack;

public class stack_evaluate_postfix {


        public static int evaluatePostFix(String exp){

            Stack<Integer> stack = new Stack<Integer> ();
            int len=exp.length();
            int counter=0;
            while (counter<len){
                while (Character.isDigit(exp.charAt(counter))){
                    Integer i = Character.getNumericValue(exp.charAt(counter));
                    stack.push(i);
                    System.out.println("Pushing  => "+i);
                    counter++;
                }

                Character operation=exp.charAt(counter++);
                Integer v2=stack.pop();
                Integer v1=stack.pop();
                switch(operation){
                    case '+':
                        stack.push(v1+v2);
                        break;
                    case '-':
                        stack.push(v1-v2);
                        break;
                    case 'x':
                        stack.push(v1*v2);
                        break;
                    case '/':
                        stack.push(v1/v2);
                        break;
                    default:
                        System.out.println("Unknow operation : "+ operation);
                }
            }

            System.out.println(stack.peek());
            return stack.pop();
        }


        public static void main(String[] args){
            evaluatePostFix("942+x677+7/+x");
        }
}
