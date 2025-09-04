import java.util.Scanner; 
class Binary_Search 
{ 
    public static void main(String args[]) 
    { 
        Scanner sc = new Scanner(System.in); 
        int flag=0; 
        int a[]={5,9,15,30,45}; 
        System.out .println("Enter No. to be searched"); 
        int n=sc.nextInt(); 
        int low=0,high=a.length-1,mid=0; 
        while(low<=high) 
        { 
            mid=(low + high)/2; 
            if(a[mid]>n) 
            { 
                high=mid-1; 
            } 
            else if(a[mid]<n) 
            { 
                low=mid+1;
            }
            else
            {
             flag=1;
             break;
           }
        }
        if(flag==1)
        {
      System.out.println("No. found at position="+(mid+1));
        }
        else
        {
         System.out.println("No.not found");
        }  
    }
}
