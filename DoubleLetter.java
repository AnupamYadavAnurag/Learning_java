import java.util.Scanner; 
class Double_Letter 
{ 
    public static void main(String args[]) 
    { 
        Scanner sc = new Scanner(System.in); 
        System.out .println("Enter a sentence"); 
        String s=sc.nextLine(); 
        s=s.toLowerCase(); 
        int len = s.length(); 
        int count =0; 
        for(int i=0; i<len-1; i++) 
        { 
             
            if(s.charAt(i)==s.charAt(i+1) ) 
            { 
                count++; 
            } 
        } 
        System.out.println("No of Double Letter ="+count);     
    } 
}
