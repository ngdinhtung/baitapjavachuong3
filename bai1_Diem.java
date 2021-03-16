import java.util.Scanner;

public class bai1_Diem {
    public static void main(String[] args) {
        Diem diem = new Diem();
        diem.nhap();
        diem.xuat();
        diem.diemDoixung();
        diem.KhoangCach();
        diem.Kiemtra();
    }
}

class Diem {
    int x, y;
    int x1, y1;
    double distance, s;
    Scanner sc = new Scanner(System.in);

    public void nhap() {
        System.out.println("Nhập vào hoành độ là x: ");
        x = sc.nextInt();
        System.out.println("Nhập vào tung độ là y: ");
        y = sc.nextInt();
    }

    public void xuat() {
        System.out.println("Tọa độ của điểm (" + x + "," + y + ")");
    }

    public void diemDoixung() {
        x1 = x;
        y1 = -y;
        System.out.println("Tọa độ của điểm đối xứng (" + x1 + "," + y1 + ")");
    }

    public void KhoangCach() {
        distance = Math.sqrt(Math.pow((x1 - x), 2) + Math.pow((y1 - y), 2));
        System.out.println("Khoảng cách giữa hai điểm là: " + distance);
    }

    public void Kiemtra() {
        if (x == 0 || y == 0) {
            System.out.println("Điểm này nằm trên trục tọa độ");
        } else {
            System.out.println("Điểm này không nằm trên trục tọa độ");
            s = 0.5 * distance * x;
            System.out.println("Diện tich tam giác là: " + s);
        }
    }
}
