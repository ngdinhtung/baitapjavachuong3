
import java.util.Scanner;

public class bai3_MaTran {
    static class MaTran {
        public int n;
        public int A[][];
        public int kt = 1;

        public void nhap() {
            Scanner sc = new Scanner(System.in);
            do {
                System.out.println("Nhập vào bậc của ma trận: ");
                n = sc.nextInt();
            } while (n < 0);
            A = new int[n][n];
            System.out.println("Nhập vào các phần tử của ma trận A: ");
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    System.out.print("A[" + (i + 1) + "][" + (j + 1) + "] = ");
                    A[i][j] = sc.nextInt();
                }
            }
        }

        public void xuat() {
            System.out.println("Ma trận A: ");
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    System.out.print(A[i][j] + "\t");
                }
                System.out.println("\n");
            }
        }

        public void donvi() {

            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    if ((i == j && A[i][j] != 1) || (i != j && A[i][j] != 0)) {
                        kt = 0;
                    } else {
                        kt = 1;
                    }
                }
            }
            if (kt == 1)
                System.out.println("Đây là ma trận đơn vị. ");
            else
                System.out.println("Đây không là ma trận đơn vị. ");

        }

        public static void main(String[] args) {
            MaTran s1 = new MaTran();
            s1.nhap();
            s1.donvi();
            s1.xuat();

        }
    }
}
