import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("=== Calculator ===");
        System.out.println("  1. Akar Kuadrat ");
        System.out.println("  2. Pangkat      ");
        System.out.println("  3. Logaritma    ");
        System.out.println("  4. Faktorial    ");
        System.out.println("  5. Keluar       ");
        System.out.println("  Pilih operasi (1/2/3/4/5):     ");

        int pilihan = scanner.nextInt();

        if (pilihan == 5){
            System.out.println("Terimakasih , Program Telah Berakhir");
        }


        switch (pilihan){
            case 1:
                AkarKuadrat();
                break;
            case 2:
                Pangkat();
                break;
            case 3:
                Logaritma();
            case 4:
                Faktorial();
                break;
            default:
                System.out.println("Pilih Angka yang tersedia");


        }
        scanner.close();
    }
    private static void AkarKuadrat (){
    Scanner scanner = new Scanner(System.in);
      System.out.println("Masukkan Angka :");
      double Angka = scanner.nextDouble();

      double Hasil = Math.sqrt(Angka);
        System.out.println("Hasil Akar Kuadrat dari\n" +Angka+ "\nAdalah\n" +Hasil);
    }
    private static void Pangkat (){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Masukkan Angka :");
        double Angka = scanner.nextDouble();

        System.out.println("Masukkan Pangkat :");
        double Pangkat = scanner.nextDouble();

        double Hasil = Math.pow(Angka,Pangkat);
        System.out.println("Hasil Pangkat dari\n" + Pangkat + "\nAdalah\n" +Hasil);
    }
    private static void Logaritma (){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Masukkan Angka :");
        double Angka = scanner.nextDouble();

        double Hasil = Math.log(Angka);
        System.out.println("Hasil Logaritma dari\n" +Angka+ "\nAdalah\n" +Hasil);
    }
    private static void Faktorial (){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Masukkan Angka :");
        int Angka = scanner.nextInt();

        int Hasil = Angka * (Angka-1);
        System.out.println("Hasil Logaritma dari\n" +Angka+ "\nAdalah\n" +Hasil);
    }

}
