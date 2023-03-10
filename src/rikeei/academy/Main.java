package rikeei.academy;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập a:");
        double a = scanner.nextDouble();
        System.out.println("Nhập b:");
        double b = scanner.nextDouble();
        System.out.println("Nhập c:");
        double c=scanner.nextDouble();

        PhuongTrinhBac2 phuongTrinhBac2=new PhuongTrinhBac2(a,b,c);
        System.out.println("Phương trình có delta= "+phuongTrinhBac2.getDelta());
        if (phuongTrinhBac2.getDelta()>0){
            System.out.println("Phương trình có nghiệm 10: "+phuongTrinhBac2.getR1()+" " +
                    "và nghim 2: "+phuongTrinhBac2.getR2());
        } else if (phuongTrinhBac2.getDelta()==0) {
            System.out.println("Phương trình có 1 nghiệm duy nhất: "+phuongTrinhBac2.getR1());
        }else System.out.println("Phương trình vô nghiệm");
    }
}