
import java.util.*;

public class ValidParanthesis {
    public static void main(String[] args) {
        String s="()";
        System.out.println(valid(s));
    }
    static boolean valid(String s)
    {
        Stack<Character> stack=new Stack<>();
        for(int i=0;i<s.length();i++)
        {
            char ch=s.charAt(i);
            if (ch == '(' || ch == '[' || ch == '{') 
            {
                stack.push(ch);
            }
            else
            {
                if(stack.isEmpty())
                {
                    return false;
                }
                char top=stack.pop();
                if (ch == ')' && top != '(') {
                    return false;
                }

                 if (ch == ']' && top != '[') {
                    return false;
                }

                if (ch == '}' && top != '{') {
                    return false;
                }

            }
        }
        return stack.isEmpty();
    }  
}
