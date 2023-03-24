/* 13020210029 Andi Muaffivatul Fiqra */
/*Rabu 22/03/23, 13:28 */
import java.util.Scanner;

public class PrintIterasi {

    public static void main(String[] args) {

        int N;
        int i;
        Scanner masukan=new Scanner(System.in);
        System.out.print ("Nilai N >0 = "); /* Inisialisasi*/
        N = masukan.nextInt();
        i = 1; 
        System.out.print ("Print i dengan ITERATE : \n");
        for (;;){
                System.out.println(i); /* Proses */
                if (i == N)
                break;
                else {
                i++;
            }
        }
    }
}