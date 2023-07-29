import java.util.*;
class stamp
{
    public static void main(String[] args) {
        String s1="Java";
        char ch[]={'s','t','r','i','n','g','s'};
        String s2=new String(ch);
        String s3=new String("exm");
        Scanner sc=new Scanner(System.in);
        String s4=sc.nextLine();
        String s5=sc.next();
        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);
        System.out.println(s4.indexOf("ng"));
        System.out.println(s5);
        sc.close();
    }
}
