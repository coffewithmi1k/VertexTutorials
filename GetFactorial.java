public class GetFactorial {

    private static int getFactorial(int k){
        int result =1;
        for(int i=0;k>0;k--){
            result=result*k;
        }
        return result;
    }







    public static void main(String[]args){

        System.out.println(getFactorial(5));
    }
}
