import java.util.*;

public class TiketBus {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String nama,ans;
        char answer;
        int jumlahTujuan;

        do {
            int total=0;

            System.out.println("                    * PENJUALAN TIKET BUS *                    ");
            garis();
            System.out.printf("%-11s : %-10s : %-10s : %-10s : %-9s\n", "Kode Tujuan", "Tujuan", "Kode Kelas", "Kelas", "Harga");
            garis();
            System.out.printf("%-11s : %-10s : %-10s : %-10s : %9s\n", "BDG", "BANDUNG", "1", "Eksekutif", "Rp100.000");
            System.out.printf("%-11s : %-10s : %-10s : %-10s : %9s\n", "", "", "2", "Bisnis", "Rp80.000");
            System.out.printf("%-11s : %-10s : %-10s : %-10s : %9s\n", "", "", "3", "Ekonomi", "Rp45.000");
            garis();
            System.out.printf("%-11s : %-10s : %-10s : %-10s : %9s\n", "SMG", "SEMARANG", "1", "Eksekutif", "Rp100.000");
            System.out.printf("%-11s : %-10s : %-10s : %-10s : %9s\n", "", "", "2", "Bisnis", "Rp80.000");
            System.out.printf("%-11s : %-10s : %-10s : %-10s : %9s\n", "", "", "3", "Ekonomi", "Rp45.000");
            garis();
            System.out.printf("%-11s : %-10s : %-10s : %-10s : %9s\n", "SBY", "SURABAYA", "1", "Eksekutif", "Rp100.000");
            System.out.printf("%-11s : %-10s : %-10s : %-10s : %9s\n", "", "", "2", "Bisnis", "Rp80.000");
            System.out.printf("%-11s : %-10s : %-10s : %-10s : %9s\n", "", "", "3", "Ekonomi", "Rp45.000");
            garis();

            System.out.print("\n" + "Nama Pembeli  : ");
            nama = in.nextLine();
            System.out.print("Banyak Tujuan : ");
            jumlahTujuan = in.nextInt();
            String[] namaDest = new String[jumlahTujuan];
            String[] dest = new String[jumlahTujuan];
            String[] kelas = new String[jumlahTujuan];
            int[] kodeKelas = new int[jumlahTujuan];
            int[] jumlahBeli = new int[jumlahTujuan];
            int[] harga = new int[jumlahTujuan];
            int[] subTotal = new int[jumlahTujuan];

            for (int i = 0; i < jumlahTujuan; i++) {
                System.out.println("___________________");
                System.out.println("Tujuan ke-" + (i + 1));
                System.out.print("Kode Tujuan : ");
                dest[i] = in.next();
                System.out.print("Kode Kelas  : ");
                kodeKelas[i] = in.nextInt();
                System.out.print("Jumlah Beli : ");
                jumlahBeli[i] = in.nextInt();

                if (dest[i].equals("BDG")) {
                    namaDest[i] = "BANDUNG";
                    switch (kodeKelas[i]) {
                        case 1:
                            kelas[i] = "Eksekutif";
                            harga[i] = 100000;
                            break;
                        case 2:
                            kelas[i] = "Bisnis";
                            harga[i] = 80000;
                            break;
                        case 3:
                            kelas[i] = "Ekonomi";
                            harga[i] = 45000;
                            break;
                        default:
                            namaDest[i] = "Kode Salah";
                            kelas[i] = "Kode Salah";
                            harga[i] = 0;
                            break;
                    }
                } else if (dest[i].equals("SMG")) {
                    namaDest[i] = "SEMARANG";
                    switch (kodeKelas[i]) {
                        case 1:
                            kelas[i] = "Eksekutif";
                            harga[i] = 100000;
                            break;
                        case 2:
                            kelas[i] = "Bisnis";
                            harga[i] = 80000;
                            break;
                        case 3:
                            kelas[i] = "Ekonomi";
                            harga[i] = 45000;
                            break;
                        default:
                            namaDest[i] = "Kode Salah";
                            kelas[i] = "Kode Salah";
                            harga[i] = 0;
                            break;
                    }
                } else if (dest[i].equals("SBY")) {
                    namaDest[i] = "SURABAYA";
                    switch (kodeKelas[i]) {
                        case 1:
                            kelas[i] = "Eksekutif";
                            harga[i] = 100000;
                            break;
                        case 2:
                            kelas[i] = "Bisnis";
                            harga[i] = 80000;
                            break;
                        case 3:
                            kelas[i] = "Ekonomi";
                            harga[i] = 45000;
                            break;
                        default:
                            namaDest[i] = "Kode Salah";
                            kelas[i] = "Kode Salah";
                            harga[i] = 0;
                            break;
                    }
                } else {
                    namaDest[i] = "Kode Salah";
                    kelas[i] = "Kode Salah";
                    harga[i] = 0;
                }
                subTotal[i] = harga[i] * jumlahBeli[i];
                total += subTotal[i];
            }

            System.out.println();
            System.out.println("\n" + "                    * STRUK PEMBAYARAN TIKET BUS *                    " + "\n");
            System.out.println("Nama Pembeli : " + nama + "\n");
            garis2();
            System.out.printf("%-4s : %-11s : %-10s : %-10s : %-10s : %-11s\n", "No.", "Tujuan", "Kelas", "Harga", "Beli", "Subtotal");
            garis2();

            for (int i = 0; i < jumlahTujuan; i++) {
                System.out.printf("%-4s : %-11s : %-10s : %-10s : %-10s : %10s\n", (i + 1), namaDest[i], kelas[i], "Rp" + harga[i], jumlahBeli[i], "Rp" + subTotal[i]);
            }
            garis2();
            System.out.printf("%57s %12s\n", "total", "Rp" + total);

            System.out.println("\n"+"Ingin melakukan pembelian tiket bus lagi? [Y/N]");
            ans=in.next();in.nextLine();
            answer=ans.charAt(0);
        }
        while(answer=='y' || answer=='Y');

    }

    static void garis(){
        System.out.println("______________________________________________________________");
    }

    static void garis2(){
        System.out.println("______________________________________________________________________");
    }
    
}
