package service;

// Create a class called FlamesCheckService
// FlamesCheckService has a method findFlames to find the flames between two names
// char findFlames(String name1, String name2) takes two strings as arguments
// Your task is to calculate the flames value and return the corresponding character as output 
// You must return only the following values ['f','l','a','m','e','s']
// change the return value at the end of the method corresponding to your return value


public class Flames {   
    public static void main(String args[])
    {
        String name1 = "alpha";
        String name2 = "delta";
        
        name1 = name1.toLowerCase();
        name2 = name2.toLowerCase();
 
        String sb1 = new String(name1);// converting to string builder
        String sb2 = new String(name2);
       
        int m=sb1.length();
        int n=sb2.length();
        for(int i=0; i<m;i++)
        {
            for(int j=0; j<n;j++)
            {
                if(sb1.charAt(i) == sb2.charAt(j))
                {
                    sb1.replace(i, i+1, "0"); // replacing matching characters into "0"
                    sb2.replace(j,j+1,"0");
                }
            }
        }
 
 
        int x1=0;
        int y1=0;
        String s1="";
        String s2="";
        s1 = sb1.toString();
        s2 = sb2.toString();
            for(int i=0;i<s1.length();i++){ //length of string to remove 0 and find the length
                if(s1.charAt(i)!='0'){
                    System.out.print(" "+s1.charAt(i));
                    x1 +=1;
                    
                 }
            }
            System.out.println();
            System.out.println("First String: "+x1);
    
            for(int i=0;i<s2.length();i++){
            if(s2.charAt(i)!='0'){
                System.out.print(" "+s2.charAt(i));
                y1 +=1;
                
                }
            } 
            System.out.println();
            System.out.println("Second String: "+y1);
       
        
        int x = x1+y1; // total length of remaining characters in both the strings
        System.out.println("Length is: "+x);
 
     
        String flames = "flames";
        StringBuilder sb3 = new StringBuilder(flames);
        
        char flameResult = 0;
        
        while(sb3.length()!=1)
        {
            int y = x%sb3.length(); 
            String temp;
            
            if(y!=0)
            {
                temp = sb3.substring(y)+sb3.substring(0, y-1); // taking substring (counting purpose)
                
            }
            else
            {
                temp = sb3.substring(0, sb3.length()-1); // taking substring (counting purpose)
                
            }
            sb3 = new StringBuilder(temp);
            relationIs = sb3.charAt(0);
            
        }
        System.out.println(flameResult);
 
 
        switch(flameResult)
        {
            case 'f':
                System.out.println("Friends");
                break;
            case 'l':
                System.out.println("Love");
                break;
            case 'a':
                System.out.println("Affection");
                break;
            case 'm':
                System.out.println("Marriage");
                break;
            case 'e':
                System.out.println("Enemies");
                break;
            case 's':
                System.out.println("Sibling");
                break;
                
        }
    }
   }
