import java.util.Scanner;

public class Applic {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        input_Data(console);



    }
    public static void input_Data(Scanner console){
        System.out.println("Введите коэфициент а:");
        int a = console.nextInt();
        System.out.println("Введите коэфициент b:");
        int b = console.nextInt();
        System.out.println("Введите коэфициент c:");
        int c = console.nextInt();
        System.out.println(a + "x^2 + " + b + "x + " + c + " = 0 , продолжить решение? Y/N");
        String continium = console.next();
        if (continium.equals("Y")){
            // продолжаем вычисление
            System.out.println("продолжаем вычисление");
        }else if (continium.equals("N")){
            // Заново ввод данных
            input_Data(console);
        }else {
            System.out.println("Программа завершена!!!");
        }
    }
}
