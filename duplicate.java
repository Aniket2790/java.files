//write a java program to find a duplicate charater in a string

import java.util.Scanner;

public class duplicate{
public static void main(String[] args) {
    Scanner s1=new Scanner(System.in);
String Str=s1.nextLine();
 
 char[] ch=Str.toCharArray();

for(int i=0;i<Str.length();i++){

    for(int j=i+1;j<Str.length();j++){

        if(ch[i]==ch[j]){
            System.out.println("the duplicate characters  are:"+ch[j]);
            break;
        }
    }
}



}
   



}