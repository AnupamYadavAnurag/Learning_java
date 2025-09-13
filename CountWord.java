import java.util.Scanner; 
class Count_Word 
{ 
    public static void main(String args[]) 
    { 
        Scanner sc = new Scanner(System.in); 
        System.out .println("Enter a sentence"); 
        String s=sc.nextLine(); 
        s = s.trim(); 
        int len = s.length(); 
        int space=0; 
        for(int i=0; i<len; i++) 
        { 
            char c= s.charAt(i); 
            if(c==' ') 
            { 
                space++; 
            } 
        } 
        System.out.println("No of word ="+(space+1));     
    } 
} 
