import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);


        double x,total4=1,total5=1,i=1;
        System.out.print("Bir sayı giriniz: ");
        x=input.nextDouble();


        while (i<=x){
            total4*=4;
            total5*=5;
            System.out.println("4un kuveti: "+total4);
            System.out.println("5in kuvveti: "+total5);
            i++;
        }

        

    }

}
