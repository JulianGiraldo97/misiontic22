public class java {

    static int[] myarray = {1, 3, 4, 2, 7, 0};
    public static void main(String[] args) {
        // TODO code application logic here
   }

   //method to find the sum of two elements in an array that sum to 10
    public static void find10(int[] array, int n) {
         for (int i = 0; i < n; i++) {
              for (int j = 0; j < n; j++) {
                if (array[i] + array[j] == 10) {
                     System.out.println("The two elements that sum to 10 are: " + array[i] + " and " + array[j]);
                }
              }
         }
    }
}
