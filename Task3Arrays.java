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
//  System.out.println(a);
        System.out.println();
        System.out.println("Here your first Array list");
        System.out.println();
        int[] array = new int[a];
        for(int i=0;i<array.length;i++){
            array[i]=(int)(Math.random()*a);
            System.out.print(array[i]+" ");
        }

    }
}
