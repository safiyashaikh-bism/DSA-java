public class CompareVersionNumbers {
    public static void main(String[] args) {
        String version1="1.2.3";
        String version2="1.2.10";
        System.out.println(compare(version1,version2));
    }
    static int compare(String version1,String version2)
    {
        String[] part1=version1.split("\\.");
        String[] part2=version2.split("\\.");
        int n=Math.max(part1.length,part2.length);
        for(int i=0;i<n;i++)
        {
            int num1 = 0;
            int num2 = 0;

            if (i < part1.length) {
                   num1 = Integer.parseInt(part1[i]);
            }

            if (i < part2.length) {
                    num2 = Integer.parseInt(part2[i]);
            }
            if (num1 > num2) {
                return 1;
            }

            if (num1 < num2) {
                return -1;
            }
        }
        return 0;

    }
}
