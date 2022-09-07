// На вход некоторому исполнителю подаётся два числа (a, b). У исполнителя есть две команды
// - команда 1 (к1): увеличить в с раза, а умножается на c
// - команда 2 (к2): увеличить на d, к a прибавляется d
// написать программу, которая выдаёт набор команд, позволяющий число a превратить в число b или сообщить, что это невозможно
// Пример 1: а = 1, b = 7, c = 2, d = 1
// Ответ: 3

public class task2 {

    static int solve(int start, int end,int com1, int com2) {
        int[] ways = new int[end + 1];
        ways[start] = 1;
        for (int index = start + com1; index <= end; index++) {
            if (index % 2 == 0) {
                ways[index] = ways[index / com2] + ways[index - com1];
            } else {
                ways[index] = ways[index - com1];
            }

        }
        System.out.println(print(ways));
        return ways[end];
    }
    static String print (int[] items){
        StringBuilder sb = new StringBuilder();
        for(Integer item  : items){
            sb.append(String.format("%d ",item));
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        System.out.println(solve(2,30,2,3));
        
    }
}
