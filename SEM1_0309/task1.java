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
    
    public static void main(int a, int b) {
        
        int a=1,b=2;
        int c = a * b;
        String res = String.format('%d * %d = %d\n', a,b,c);
        System.out.printf('%d * %d = %d\n', a,b,c);
        System.out.println(res);
    }
}
