import java.util.*;
public class Vowel
{
public static void main(String args[])
{
Scanner s=new Scanner(System.in);
char a;
String s1=s.nextLine();
a=s1.charAt(0);
if(a=='a' || a=='e' || a=='i' || a=='o' || a=='u')
{
System.out.println("vowel");
}
else
{
System.out.println("consonant");
}
}
}
