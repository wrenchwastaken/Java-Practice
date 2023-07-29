
class insertionsort
{
    public static void printArray(int arr[])
    {
        for(int i=0;i<arr.length;i++)
      {
        System.out.print(arr[i]+"\t");
      }
      System.out.println(); 
    }
    public static void main(String[] args) 
    {
     int arr[]={25,34,48,21,4,5};
     //insertion sort
     for(int i=0;i<arr.length;i++)
     {
        int current=arr[i];
        int j=i-1;
        while(j>=0 && current<arr[j])
        {
            arr[j+1]=arr[j];
            j--;
        }
        //placement
        arr[j+1]=current;
     }
     printArray(arr);
    }
}