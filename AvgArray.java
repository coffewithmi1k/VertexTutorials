public class AvgArray {
    public static void main(String[]args) {
        int arr[] = new int[5];
        int arr2[] = new int[6];

        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (Math.random() * 6);
            //System.out.println(arr[i]);
            sum = sum + arr[i];
        }
        int sum2 = 0;
        for (int i = 0; i < arr2.length; i++) {

            arr2[i] = (int) (Math.random() * 6);
            //System.out.println(arr2[i]);
            sum2 = sum2 + arr2[i];
        }
        double avg1 = sum / arr.length;
        double avg2 = sum / arr2.length;
        //System.out.println(sum2);
        //System.out.println(sum);
        if (avg1 > avg2) {
            System.out.println("Elements from first massive are bigger");
        } else if (avg1 > avg2) {
            System.out.println("Elements of the second massive are bigger");
        } else {
            System.out.println("Massives are equal");
        }

    }
}
