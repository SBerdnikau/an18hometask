import java.util.Scanner;

public class Main {
   public static void main(String[] args) {
        //1. Написать программу для вывода названия поры года по номеру месяца. При решении используйте оператор switch-case
         Scanner scanner = new Scanner(System.in);

        while (true){
            System.out.println("Введите номер месяца или \"exit\" для выхода: ");
            String month = scanner.nextLine();

            if (month.equals("exit") ) {
               break;
            }

            switch (month){
                case "1" :
                    System.out.println("Зима");
                     break;
                case "2" :
                    System.out.println("Зима");
                    break;
                case "3" :
                    System.out.println("Весна");
                    break;
                case "4" :
                    System.out.println("Весна");
                    break;
                case "5" :
                    System.out.println("Весна");
                    break;
                case  "6" :
                    System.out.println("Лето");
                    break;
                case "7" :
                    System.out.println("Лето");
                    break;
                case "8" :
                    System.out.println("Лето");
                    break;
                case "9" :
                    System.out.println("Осень");
                    break;
                case "10" :
                    System.out.println("Осень");
                    break;
                case "11" :
                    System.out.println("Осень");
                    break;
                case "12" :
                    System.out.println("Зима");
                    break;
                default:
                    System.out.println("Такой пары года нет, даём тебе еще попытачку.");
            }
        }

        //2. Написать программу для вывода названия поры года по номеру месяца. При решении используйте оператор if-else-if.
        Scanner scanner2 = new Scanner(System.in);

        while (true) {
            System.out.println("Введите номер месяца или \"exit\" для выхода: ");
            String month2 = scanner2.nextLine();

            if (month2.equals("exit")) {
                break;
            }

            if (month2.equals("12") || month2.equals("1") || month2.equals("2")) {
                System.out.println("Зима");
            }else if (month2.equals("3") || month2.equals("4") || month2.equals("5") ) {
                System.out.println("Весна");
            } else if (month2.equals("6") || month2.equals("7") || month2.equals("8")  ) {
                System.out.println("Лето");
            }else if (month2.equals("9") || month2.equals("10") || month2.equals("11") ) {
                System.out.println("Осень");
            }else {
                System.out.println("Такой пары года нет, даём тебе еще попытачку.");
            }
        }

        //3. Напишите программу, которая будет принимать на вход число и на выход будет выводить сообщение четное число или нет.
        // Для определения четности числа используйте операцию получения остатка от деления - операция выглядит так: '% 2')
        Scanner scanner3 = new Scanner(System.in);

        while (true) {
            System.out.println("Введите чило или \"exit\" для выхода: ");
            String input1 = scanner3.nextLine();

            if (input1.equals("exit")) {
               break;
            }

            int number = Integer.parseInt(input1);

            if (number % 2 == 0) {
                System.out.println(number + " чётное число.");
            } else {
                System.out.println(number + " не чётное число.");
            }
        }

        //  4. Для введенного числа t (температура на улице) вывести Если t>–5, то вывести «Тепло».
        //  Если –5>= t > –20, то вывести «Нормально». Если –20>= t, то вывести «Холодно».
        Scanner scanner4 = new Scanner(System.in);

        while (true) {
            System.out.println("Введите  температуру на улице или \"exit\" для выхода: ");
            String intput2 = scanner4.nextLine();

            if (intput2.equals("exit")) {
               break;
            }

            int t = Integer.parseInt(intput2);

            if (t > -5 ){
                System.out.println("Тепло");
            } else if (-5 >= t && t > -20) {
                System.out.println("Нормольно");
            } if (-20 >= t ) {
                System.out.println("Холодно");
            }
        }

}
}
