import java.util.Scanner;

public class TestUserProfile {
    public static void main(String[] args)
    {
       String[] genres = {"Comedy", "Drama", "Action", "Mystery"};
       System.out.println("These are the Available genres: ");
       for(int i=0;i<genres.length;i++)
       {
           System.out.println("    "+genres[i]);
       }
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter your Name: ");
        String name=sc.nextLine();
       
        Scanner obj1=new Scanner(System.in);
        System.out.print("Genre: ");
        String genre=sc.nextLine();
     
        System.out.println("Your profile is succesfully created!");
        
        
    }
    
}