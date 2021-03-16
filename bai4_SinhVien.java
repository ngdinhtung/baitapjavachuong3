
import java.util.Scanner;

public class bai4_SinhVien {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String hoten;
        int ngaysinh, thangsinh, namsinh, n;
        String lop;
        double toan, ly, hoa;
        System.out.println("Nhập số sinh viên: ");
        n = sc.nextInt();
        sc.nextLine();
        SinhVien a[] = new SinhVien[n];
        for (int i = 0; i < n; i++) {
            a[i] = new SinhVien();
            System.out.println("Nhập tên sinh viên thứ " + (i + 1) + ": ");
            hoten = sc.nextLine();
            a[i].setHoten(hoten);
            System.out.println("Nhập ngày, tháng, năm sinh: ");
            ngaysinh = sc.nextInt();
            a[i].setNgaySinh(ngaysinh);
            thangsinh = sc.nextInt();
            a[i].setThangSinh(thangsinh);
            namsinh = sc.nextInt();
            sc.nextLine();
            a[i].setNamSinh(namsinh);
            System.out.println("Nhập lớp: ");
            lop = sc.nextLine();
            a[i].setLop(lop);
            System.out.println("Nhập điểm Toán, Lý, Hóa: ");
            toan = sc.nextDouble();
            a[i].setToan(toan);
            ly = sc.nextDouble();
            a[i].setLy(ly);
            hoa = sc.nextDouble();
            a[i].setHoa(hoa);
            sc.nextLine();
            a[i].getTb();
            System.out.println("----------");
        }
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (a[i].getTb() < a[j].getTb()) {
                    SinhVien temp = new SinhVien();
                    temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
        }
        System.out.println("---------------------------------------------");
        System.out.println("Thông tin sinh viên sau khi sắp xếp là: ");
        for (int i = 0; i < n; i++) {
            System.out.println("Tên sinh viên: " + a[i].getHoten());
            System.out
                    .println("Ngày sinh: " + a[i].getNgaySinh() + "/" + a[i].getThangSinh() + "/" + a[i].getNamSinh());
            System.out.println("Lớp: " + a[i].getLop());
            System.out.println("Điểm Toán: " + a[i].getToan());
            System.out.println("Điểm Lý: " + a[i].getLy());
            System.out.println("Điểm Hóa: " + a[i].getHoa());
            System.out.println("Điểm TB: " + a[i].getTb());
            System.out.println("------------------------------------");
        }
    }
}

class SinhVien {
    private String hoten;
    private int ngaysinh, thangsinh, namsinh;
    private String lop;
    private double toan, ly, hoa;

    public SinhVien() {
    }

    public SinhVien(String hoten, int ngaysinh, int thangsinh, int namsinh, String lop, double toan, double ly,
            double hoa) {
        this.hoten = hoten;
        this.ngaysinh = ngaysinh;
        this.thangsinh = thangsinh;
        this.namsinh = namsinh;
        this.lop = lop;
        this.toan = toan;
        this.ly = ly;
        this.hoa = hoa;
    }

    public String getHoten() {
        return hoten;
    }

    public void setHoten(String hoten) {
        this.hoten = hoten;
    }

    public int getNgaySinh() {
        return ngaysinh;
    }

    public void setNgaySinh(int ngaysinh) {
        this.ngaysinh = ngaysinh;
    }

    public int getThangSinh() {
        return thangsinh;
    }

    public void setThangSinh(int thangsinh) {
        this.thangsinh = thangsinh;
    }

    public int getNamSinh() {
        return namsinh;
    }

    public void setNamSinh(int namsinh) {
        this.namsinh = namsinh;
    }

    public String getLop() {
        return lop;
    }

    public void setLop(String lop) {
        this.lop = lop;
    }

    public double getToan() {
        return toan;
    }

    public void setToan(double toan) {
        this.toan = toan;
    }

    public double getLy() {
        return ly;
    }

    public void setLy(double ly) {
        this.ly = ly;
    }

    public double getHoa() {
        return hoa;
    }

    public void setHoa(double hoa) {
        this.hoa = hoa;
    }

    public double getTb() {
        return (toan + ly + hoa) / 3;
    }

}
