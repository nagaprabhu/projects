import java.util.Stack;

public class stack_check_parantheses {
    public static Boolean check(String expr){

        Stack<Character> stack =  new Stack<Character>();
        int len=expr.length();
        int counter=0;
        while(counter<len){
            Character c = expr.charAt(counter);
            if (c == ')'){ if (stack.empty() || stack.peek() != '('){System.out.println(')');return false;} else {stack.pop();}}
            if (c == '}'){ if (stack.empty() || stack.peek() != '{'){System.out.println('}');return false;} else {stack.pop();}}
            if (c == ']'){ if (stack.empty() || stack.peek() != '['){System.out.println(']');return false;} else {stack.pop();}}
            if (c=='(' || c=='[' || c=='{'){stack.push(c); System.out.println("Pushed "+ c);}
            counter++;
        }
        if (stack.empty()){return true;}else{return false;}
    }


    public static void main(String[] args){
        Boolean b = check("((({{{{}}}}[][][])))");
        System.out.println(b);
    }
}
