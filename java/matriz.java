public class matriz {

    static String[] myarray = {"a", "b", "c", "d", "d", "c", "b", "a"};
    static int n=8;
    
    public static void maiun(String[] args) {
        esSimetrica(myarray, n);
    }

    // determinar si una matriz es simetrica
    public static boolean esSimetrica(String[] array, int n) {
        boolean simetrica = true;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (array[i].equals(array[j]) && i != j) {
                    simetrica = false;
                }
            }
        }
        return simetrica;
    }
    // determinar si una matriz es simetrica retornar Symmetric or not Symmetric
    public static String esSimetricaRetornar(String[] array, int n) {
        boolean simetrica = true;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (array[i].equals(array[j]) && i != j) {
                    simetrica = false;
                }
            }
        }
        if (simetrica) {
            return "Symmetric";
        } else {
            return "Not Symmetric";
        }
    }

    //encontrar los dos elemntos de un arreglo que sumen 10
    public static void encontrar10(String[] array, int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (array[i].equals(array[j]) && i != j) {
                    System.out.println("Los elementos que suman 10 son: " + array[i] + " y " + array[j]);
                }
            }
        }
    }

}
