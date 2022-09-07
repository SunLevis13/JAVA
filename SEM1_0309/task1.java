// Реализовать функцию возведения числа а в степень b. a, b ∈ Z. Сводя количество выполняемых действий к минимуму. 
// Пример 1: а = 3, b = 2, ответ: 9 
// Пример 2: а = 2, b = -2, ответ: 0.25
// Пример 3: а = 3, b = 0, ответ: 1
// Пример 4: а = 0, b = 0, ответ: не определено
// Пример 5
// входные данные находятся в файле input.txt в виде
// b 3
// a 10
// Результат нужно сохранить в файле output.txt
// 1000

public class task1 {
    
    static int pow(int value, int powValue) {
        if (value == 0) 
        System.out.println("не определено");
        return (int) Math.pow(value, powValue);
                    
        }
    
    static double powd(double value, double powValue) {
        return (double) Math.pow(value, powValue);
    }
   
    public static void main(String[] args) {
        
        System.out.println(pow(3, 2)); // 9
        System.out.println(powd(2, -2)); // 0.25
        System.out.println(pow(3, 0)); // 1
        System.out.println(pow(0, 0)); // 1
    }}
