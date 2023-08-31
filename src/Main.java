import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        //задача 1
        /*
        String str = in.nextLine();
        int x = Integer.parseInt(str);
        if(x>7)
        {
            System.out.println("Привет");
        }
        else {

        }
        */
        /*
         //задача 2

        System.out.println("Введите имя: ");
        String str = in.nextLine();
        if(str.equals("Вячеслав"))
        {
            System.out.println("привет, " + str );
        }
        else {
            System.out.println("Нет такого имени");
        }
        */
        //задача 3
        int[] array = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 12, 13, 15, 16, 18, 21, 25, 30 };
        for(int i=0;i<array.length;i++)
        {
                if(array[i]%3==0) System.out.print(array[i] +" ");
        }
    }
}