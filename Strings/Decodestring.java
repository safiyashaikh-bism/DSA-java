
import java.util.Stack;

public class Decodestring {
    public static void main(String[] args) {
        String s="3[a]2[bc]";
        System.out.println(decodestring(s));
    }
    static String decodestring(String s)
    {
        Stack<Integer> countstack=new Stack<>();
        Stack<String> stringstack=new Stack<>();
        String current="";
        int k=0;
        for(int i=0;i<s.length();i++)
        {
            char ch=s.charAt(i);
            if(Character.isDigit(ch))
            {
                k=k*10+(ch-'0');

            }
            else if(ch=='[')
            {
                countstack.push(k);
                stringstack.push(current);
                k=0;
                current="";
            }
            else if(Character.isLetter(ch))
            {
                current=current+ch;

            }
            else if(ch==']')
            {
                int repeat=countstack.pop();
                String previous = stringstack.pop();
                current=previous+current.repeat(repeat);

            }
        }
        return current;
    }
}
