import java.util.Scanner; 
class Count_Letter 
{ 
    public static void main(String args[]) 
    { 
        Scanner sc = new Scanner(System.in); 
        System.out .println("Enter a sentence"); 
        String s=sc.nextLine(); 
        int len = s.length(); 
        int count=0; 
        for(int i=0; i<len; i++) 
        { 
            char c= s.charAt(i); 
            if(c=='A' || c=='a') 
            { 
                count++; 
            } 
        } 
        System.out.println("No of letter a ="+count);     
    } 
} 
