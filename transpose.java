import java.util.*;
class transpose
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Rows and Column");
        int row = sc.nextInt();
        int column = sc.nextInt();
        int arg[][] = new int[row][column];
        System.out.println("Enter Matrix");
        for(int i = 0; i < row; i++)
        {
            for(int j = 0; j < column; j++)
            {
                arg[i][j] = sc.nextInt();
            }
        }
        System.out.println("The Above Matrix hasn't been transposed yet");
        for(int i = 0; i < row; i++)
        {
            for(int j = 0; j < column; j++)
            {
                System.out.print(arg[i][j] + "\t");
            }
            System.out.println();
        }
        System.out.println("Now Transposing");
        int transposed[][] = new int[column][row];
        for(int i = 0; i < column; i++)
        {
            for(int j = 0; j < row; j++)
            {
                transposed[i][j] = arg[j][i];
            }
        } 
        for(int i = 0; i < column; i++)
        {
            for(int j = 0; j < row; j++)
            {
                System.out.print(transposed[i][j] + "\t");
            }
            System.out.println();
        }
        sc.close();
    }
}
