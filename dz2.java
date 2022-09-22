// // Задание 1
// // Напишите программу, записывающую 100 раз слово ”ТЕST” в файл. Слова должны /n 
// чередоваться по формату – четная итерация большими буквами, /n 
// нечетные – маленькими Пример: TESTtestTESTtestTEST…
public class dz2 {
    public static void main(String[] args) {
        StringBuilder t = new StringBuilder();
        for (int i = 0; i < 100; i++) {
            if (i % 2 == 0) {
                
                t.append("TEST".toUpperCase()); 
            }
            else {
                t.append("test".toLowerCase());
            }          
        }
        System.out.println(t); 
    }
}