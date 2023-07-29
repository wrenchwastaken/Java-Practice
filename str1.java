class str1
{
    public static void main(String[] args) {
        String s1="sachin";
        String s2="Sachin";
        String s3="kitty";
        String s4="SACHIN";
        System.out.println(s1==s2);
        System.out.println(s1==s3);
        System.out.println(s1==s4);
        System.out.println(s1.equals(s4));
        System.out.println(s1.equalsIgnoreCase(s4));
    }
}