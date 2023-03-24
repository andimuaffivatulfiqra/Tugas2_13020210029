/*13020210029 Andi Muaffivatul Fiqra */
/*Rabu 22/03/23, 23:40 */
import java.util.Scanner;


public class PrintXWhile {
    
    public static void main(String[] args) {
        int Sum;
        int x;
        Scanner masukan=new Scanner(System.in);
       
        Sum = 0;    
        System.out.print ("Masukkan nilai x (int), akhiri dg 999 : ");
        x = masukan.nextInt();      
        while (x != 999)    {
            Sum = Sum + x; 
            System.out.print("Masukkan nilai x (int), akhiri dg 999 : ");
            x = masukan.nextInt();  /* First Elmt*/
        }
        System.out.println("Hasil penjumlahan = "+ Sum);   
    }
}