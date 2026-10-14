public class AddStrings {
    public static void main(String[] args) {
        String num1="27";
        String num2="35";
        System.out.println(addstrings(num1,num2));
    }
    static String addstrings(String num1,String num2)
    {
        StringBuilder result=new StringBuilder();
        int i=num1.length()-1;
        int j=num2.length()-1;
        int carry=0;
        while(i>=0||j>=0||carry>0)
        {
            int digit1=0;
            int digit2=0;
            if(i>=0)
            {
                digit1=num1.charAt(i)-'0';
            }
            if(j>=0)
            {
                digit2=num2.charAt(j)-'0';
            }
            int sum=digit1+digit2+carry;
            int digit=sum%10;
            carry=sum/10;
            result.append(digit);
            i--;
            j--;
        }
        return result.reverse().toString();
    }
}
