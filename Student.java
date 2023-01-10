import java.util.Scanner;

public class Student {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap so luong sinh vien: ");
        int size = sc.nextInt();
        double [] arr = new double[size];
        int cnt = 0;
        int i = 0;
        while (i < size) {
            System.out.println("Nhap diem sinh vien thu " + (i + 1) + ": ");
            arr[i] = sc.nextDouble();
            while (arr[i] > 10 || arr[i] < 0) {
                System.out.println("Ban can nhap lai diem sinh vien thu " + (i + 1) + ": ");
                arr[i] = sc.nextDouble();
            }
            i++;
        }
        System.out.println("Danh sach diem thi:");
        for(int j = 0; j < arr.length; j++) {
            System.out.print(arr[j] + " ");
            if (arr[j] >= 5) cnt ++;
        }
        System.out.println("\n" + "So sinh vien thi do: " + cnt);
        for(int j = 0; j < arr.length; j++) {
            if (arr[j] >= 5) System.out.print(arr[j] + " ");
        }
    }
}
