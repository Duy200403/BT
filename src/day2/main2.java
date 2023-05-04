package day2;
import java.util.Scanner;

public class main2 {
        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);

            System.out.print("Nhap do dai day nho cua hinh thang: ");
            double dayNho = input.nextDouble();

            System.out.print("Nhap do dai day lon cua hinh thang: ");
            double dayLon = input.nextDouble();

            System.out.print("Nhap do dai duong cheo thu nhat cua hinh thang: ");
            double duongCheo1 = input.nextDouble();

            System.out.print("Nhap do dai duong cheo thu hai cua hinh thang: ");
            double duongCheo2 = input.nextDouble();

            HinhThangCan hinhThangCan = new HinhThangCan(dayNho, dayLon, duongCheo1, duongCheo2);

            double chuVi = hinhThangCan.tinhChuVi();
            double dienTich = hinhThangCan.tinhDienTich();

            System.out.println("Chu vi cua hinh thang la: " + chuVi);
            System.out.println("Dien tich cua hinh thang la: " + dienTich);
        }
    }

