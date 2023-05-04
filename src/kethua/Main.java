package kethua;

public class Main {
    public static void main(String[] args) {
        // Tao doi tuong Ke toan
        KeToan kt1 = new KeToan("KT1", "Kế toán 1");
//        System.out.println(kt1);

        // Tao doi tuong IT
        IT it1 = new IT("IT 1", "Nhan vien IT1");
//        System.out.println(it1);

        // Taọ 1 mảng có thể lưu trữ được nhân viên hoặc IT ??
        NhanVien arr[] = new NhanVien[3];
        arr[0] = kt1;
        arr[1] = it1;
        arr[2] = new IT("IT2", "IT2");

        // Duyet va in thong tin
        for (int i = 0; i < arr.length; i++){
            System.out.println(arr[i].toString());
        }

    }
}
