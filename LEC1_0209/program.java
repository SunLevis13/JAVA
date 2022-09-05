package LEC1_0209;

// /**
//  * program
//  */
// public class program {

//     public static void main(String[] args) {
//         System.out.println("bye my world");
//     }
// }

/**
 * Innerprogram
 */
// public class program {

//     public static void main(String[] args) {
//         int a = 123;
//         a= --a - a--;
//         // System.out.println(a=a-- - --a);
//         System.out.println(a);
//     }
// }

// public class program {
//     public static void main(String[] args) {

//         int[][] arr = new int[3][5];
       
//         for (int i = 0; i < arr.length; i++) {
//             for (int j = 0; j < arr[i].length; j++) {
//                 System.out.printf("%d ", arr[i][j]);
//             }
//             System.out.println();
//         }
//     }
// }

public class program {
    static void sayHi() {
        System.out.println("hi!");
    }
    static int sum(int a, int b) {
        return a+b;
    }  
    static double factor(int n) {
        if(n==1)return 1;
        return n * factor(n-1);
    }
    public static void main(String[] args) {
        sayHi(); // hi!
        System.out.println(sum(1, 3)); // 4
        System.out.println(factor(5)); // 120.0
    }}
