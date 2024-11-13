public class App {
    public static void main(String[] args) throws Exception {
        // Metodos de impresion de mis metodos binarySearch y getFibonacci
        System.out.println("Binary Search: " + binarySearch(new int[] { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 }, 5));
        System.out.println("Fibonacci: " + getFibonacci(10));
    }

    // Metodos de impresion de mis metodos binarySearch y getFibonacci
    public static void printArray(int arr[]) {
        int n = arr.length;
        for (int i = 0; i < n; ++i)
            System.out.print(arr[i] + " ");
        System.out.println();
    }

    // Ejercicio de Buqueda Binaria
    public static int binarySearch(int[] arr, int x) {
        int l = 0, r = arr.length - 1;
        while (l <= r) {
            int m = l + (r - l) / 2;
            if (arr[m] < x) {
                l = m + 1;
            } else if (arr[m] > x) {
                r = m - 1;
            } else {
                return m;
            }
            return -1;
        }
        return r;
    }

    public static int getFibonacci(int n) {
        if (n < 2)
            return n;
        return getFibonacci(n - 1) + getFibonacci(n - 2);
    }
    // Ejercicio Brubuja O(n2)
    // Inserccion o(n2)
    // Seleccion o(n2)
    // Shell o(n2)
    // Quick o(n log n)
    // Merge o(n log n)
    // Heap o(n log n)
}
