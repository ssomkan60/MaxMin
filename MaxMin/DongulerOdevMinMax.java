import java.util.Scanner;
public class DongulerOdevMinMax {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int n,j;
        int max=0, min=0;
        System.out.print("Girilecek Sayı Adedi:");
        n = input.nextInt();

        for (int i=1; i<=n; i++) {
            System.out.print(i + ".Sayıyı Giriniz:");
            j = input.nextInt();

            if(i==1){
                max = j;
                min = j;
            }
            if(j>max){
                max = j;
            }
            if(j<min){
                min = j;
            }
        }
        System.out.println("En Büyük Sayı:" +max);
        System.out.println("En Küçük Sayı:" +min);
    }
}
