

import java.util.Scanner;
class myworld
{
    public static void main(String[] args)
    {   
        Scanner s = new Scanner(System.in);
        System.out.print("Get a sword?(y/n)");
        char ans = s.next().charAt(0);
        
        boolean hasSword;
        int health=30;
        if (ans=='y')
            hasSword=true;
        else
            hasSword=false;
        if (hasSword)
        {
            System.out.println("You have a sword");
            System.out.println("Good Luck");
        }
        else
        {
            System.out.println("You do not have a sword");
            System.out.println("Good luck with your bare hands");
        }
        
            
        
        
    }
    public static void attack(boolean x)
    {
        if(x)
        {
            health=health-5;
        }
        
    
    }
}

    
