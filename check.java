import java.util.*;
public class Check
{
public static void main(String args[])
{
Scanner s=new Scanner(System.in);
char a;
String s1=s.nextLine();
a=s1.charAt(0);
if(a>=65 && a<=90 || a>=97 && a<=122)
{
System.out.println("alphabet");
}
else
{
System.out.println("not alphabet");
}
}
}
