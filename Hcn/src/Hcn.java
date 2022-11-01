import java.util.Scanner;

public class Hcn {
    public static void main(String[] args) {
        float chieudai;
        float chieurong;
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhap chieu dai");
        chieudai = scanner.nextFloat();
        System.out.println("nhap chieu rong");
        chieurong = scanner.nextFloat();
        float dientich = chieudai*chieurong;
        System.out.println("dien tich la" +dientich);
    }
}
