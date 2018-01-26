import java.util.InputMismatchException;
import java.util.Scanner;

public class Task3Arrays {



    public static int getSizeOfArray(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter first number");
        int m=0;
        try {

            int n = scan.nextInt();
            if(n>3) {
                m = n;
                System.out.println("Lilia go Home! Have a nice weekend!");
                return m;


            }
            else {
                System.out.println("Bad Ass!!! Now Let's go from the Begining");
                return getSizeOfArray();
            }
        }

        catch (InputMismatchException e) {


            getSizeOfArray();

        }


return m;
    }

    public static void main(String[]args){

int a = getSizeOfArray();

    }
}
