import java.util.Scanner;
class vowel{
public static void main(String[]args)
{
Scanner tt=new Scanner(System.in);
char c;
System.out.println("enter the alphabet:");
c=tt.next().charAt(0);
if(c=='A'||c=='a'||c=='E'||c=='e'||c=='I'||c=='i'||c=='O'||c=='o'||c=='U'||c=='u')
{
System.out.println("vowel");
}
else{
System.out.println("invalid");
}
}
}
