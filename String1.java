import java.util.Scanner;
class String1
{
    public void input()
    {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter string");
        String pt= sc.nextLine();
        System.out.println(pt);
    }
    public static void main(String[] args)
    {
        String1 sf=new String1();
        sf.input();
    }
}