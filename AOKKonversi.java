import java.util.*;
public class AOKKonversi {
    public static void main(String[] args) {
        Scanner in =new Scanner(System.in);
        int n = 1;

        do {
            System.out.printf("=====Program Konversi Bilangan!=====\n--- Program ini mengkonversi bilangan bulat.\n");
            System.out.printf("1. Biner ke Desimal\t\t\n");
            System.out.printf("2. Biner ke Hexadesimal\t\t\t\n");
            System.out.printf("3. Desimal ke Biner\t\t\n");
            System.out.printf("4. Desimal ke Hexadesimal\t\t\n");
            System.out.printf("5. Hexadesimal ke Desimal\t\t\n");
            System.out.printf("6. Hexadesimal ke Biner\t\t\n");
            System.out.printf("9. Exit\n");
            System.out.printf("Pilihan Anda (0-9): ");
            n = in.nextInt();
            
            if(n==1){
                System.out.println("=====Program Biner ke Desimal=====");
                System.out.printf("Masukkan bilangan: ");
                String b = in.next();
                int bind =  Integer.parseInt(b,2);
                System.out.printf("Hasil: %d\n----------\n", bind);
            }

            else if(n==2){
                System.out.println("=====Program Biner ke Hexadesimal=====");
                System.out.printf("Masukkan bilangan: ");
                String b = in.next();
                int bind = Integer.parseInt(b,2);
                String binh = Integer.toHexString(bind);
                System.out.printf("Hasil: %s\n----------\n", binh);
            }

            else if(n==3){
                System.out.println("=====Program Desimal ke Biner=====");
                System.out.printf("Masukkan bilangan: ");
                int d = in.nextInt();
                String decb = Integer.toBinaryString(d);
                System.out.printf("Hasil: %s\n----------\n", decb);
            }

            else if(n==4){
                System.out.println("=====Program Desimal ke Hexadesimal=====");
                System.out.printf("Masukkan bilangan: ");
                int d = in.nextInt();
                String dech = Integer.toHexString(d);
                System.out.printf("Hasil: %s\n----------\n", dech); 
            }

            else if(n==5){
                System.out.println("=====Program Hexadesimal ke Desimal=====");
                System.out.printf("Masukkan bilangan: ");
                String h = in.next();
                int hexd = Integer.parseInt(h,16);
                System.out.printf("Hasil: %d\n----------\n", hexd);
            }

            else if(n==6){
                System.out.println("=====Program Hexadesimal ke Biner=====");
                System.out.printf("Masukkan bilangan: ");
                String h = in.next();
                int hexb = Integer.parseInt(h,16);
                String hbin = Integer.toBinaryString(hexb);
                System.out.printf("Hasil: %s\n----------\n", hbin);
            }

            else if(n==9){
                break;
            }

            else{
                System.out.println("Pilihan tidak valid!");
            }
        } while (n!=9);
    }
}
