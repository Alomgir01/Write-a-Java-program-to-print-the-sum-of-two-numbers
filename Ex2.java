import java.util.Scanner;
class Ex2
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.printf("Enter two number: ");
        int a=input.nextInt();
        int b=input.nextInt();
        int sum= a+b;
        System.out.println(+sum);
    }
}
