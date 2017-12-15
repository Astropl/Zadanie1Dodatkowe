import java.util.Scanner;

public class Zadanie1dodatkowe
{
    /*
    Zadanie 1. Napisać program służący wyszukiwania liczb parzystych
w podanym przez użytkownika przedziale. Użytkownik na wejściu
podać ma początek i koniec przedziału
     */
    public static void main(String[] args)
    {
        int parzyste;
        Scanner sc = new Scanner(System.in);

        System.out.println(" Podaj poczatek przedziału");
        int start = sc.nextInt();
        System.out.println("Podaj koniec przedziału");
        int end = sc.nextInt();
        for (int i =1;i<end;i++)
        {
            parzyste = (i%2);
            if (parzyste == 0)
            {
                System.out.println("Parzysta to :" + i);
            }
            else
            {
                //System.out.println(" A to nie parzysta :" + i);
            }
        }


    }
}
