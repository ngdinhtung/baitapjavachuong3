import java.util.Scanner;

public class bai2_ThoiGian {

    public static void main(String[] args) {

        ThoiGian time[] = null;
        int n, max;
        double sum = 0;
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("Nhập số lượng thành tích : ");
            n = sc.nextInt();
        } while (n <= 0 || n >= 50);

        time = new ThoiGian[n];
        System.out.println("Nhập thời gian chạy của các vđv: (giờ_phút_giây)");
        System.out.println("------------------");
        for (int i = 0; i < n; i++) {
            System.out.println("Vận động viên thứ " + (i + 1) + ": ");
            time[i] = new ThoiGian();
            time[i].nhap();
            sum += time[i].chuyen();
            System.out.println("------------------");

        }
        max = time[0].chuyen();
        System.out.println("Danh sách thành tích tính bằng giây của các vđv đã nhập: ");
        for (int i = 0; i < n; i++) {
            System.out.print("Vận động viên thứ " + (i + 1) + ": ");
            time[i].xuat();
        }

        for (int i = 0; i < n; i++) {
            if (time[i].chuyen() < max) {
                max = time[i].chuyen();
            }
        }
        System.out.println("----------------");
        System.out.println("Thời gian nhanh nhất của các vđv: " + max + " giây.");
        System.out.println("Thời gian trung bình của các vđv: " + sum / n + " giây.");

    }
}

class ThoiGian {
    private int gio;
    private int phut;
    private int giay;
    Scanner sc = new Scanner(System.in);

    public void khoitao(int gio, int phut, int giay) {
        this.gio = 0;
        this.phut = 0;
        this.giay = 0;
    }

    public void nhap() {

        gio = sc.nextInt();
        phut = sc.nextInt();
        giay = sc.nextInt();
    }

    public int chuyen() {
        return 3600 * gio + 60 * phut + giay;
    }

    public void xuat() {
        System.out.println(chuyen() + " giây.");
    }

}