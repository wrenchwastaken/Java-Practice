class deleting 
{
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("tony");
        System.out.println(sb);
        sb.insert(0, 'S');
        System.out.println(sb);
        sb.delete(0, 1);
        System.out.println(sb);
    }
}