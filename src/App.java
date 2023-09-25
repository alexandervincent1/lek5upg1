import java.util.Scanner;
public class App {
    public static void main(String[] args) {
        try (Scanner tangentbord = new Scanner(System.in)){
        
        int[] persnr = {8,4,6,3,9};
        int antal_celler = persnr.length;
        System.out.println(persnr[0]+" "+persnr[1]+" "+persnr[2]+" "+persnr[3]+" "+persnr[4]);
        System.out.println(antal_celler);
        double medelvärdet = persnr[0]+persnr[1]+persnr[2]+persnr[3]+persnr[4];
        medelvärdet = medelvärdet/antal_celler;
        System.out.println(medelvärdet);

        int[] persnr2 = {18,14,16,13,19};
        double medelvärdet2 = persnr2[0]+persnr2[1]+persnr2[2]+persnr2[3]+persnr2[4];
        medelvärdet = medelvärdet *antal_celler;
        medelvärdet2 = medelvärdet+medelvärdet2;
        System.out.println(medelvärdet2);
        medelvärdet2 = medelvärdet2-medelvärdet;
        medelvärdet2 = medelvärdet2/antal_celler;
        System.out.println(medelvärdet2);

        int[] persn1_2 = new int[5];
        persn1_2[0] = persnr2[0]+persnr[0];
        persn1_2[1] = persnr2[1]+persnr[1];
        persn1_2[2] = persnr2[2]+persnr[2];
        persn1_2[3] = persnr2[3]+persnr[3];
        persn1_2[4] = persnr2[4]+persnr[4];
        System.out.println(persn1_2[0]+" "+persn1_2[1]+" "+persn1_2[2]+" "+persn1_2[3]+" "+persn1_2[4]);

        int[] tangentbordfält = new int[4];
        tangentbordfält[0] = tangentbord.nextInt();
        tangentbordfält[1] = tangentbord.nextInt();
        tangentbordfält[2] = tangentbord.nextInt();
        tangentbordfält[3] = tangentbord.nextInt();
        System.out.println(tangentbordfält[0]+tangentbordfält[1]+ tangentbordfält[2]+tangentbordfält[3]);



        }
    }
}
