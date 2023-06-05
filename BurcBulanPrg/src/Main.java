import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int month , day ;
        System.out.print("1-Aralık 2-Ocak 3-Şubat\n4-Mart 5-Nisan 6-Mayıs\n7-Haziran 8-Temmuz 9-Ağustos\n10-Eylül 11-Ekim 12-Kasım\n\nLütfen doğdunuz ayı seçiniz :"); month=input.nextInt();
        System.out.print("Lütfen Doğdunuz Günü Yazınız :"); day=input.nextInt();
            switch (month){
                case 1 :
                    if (day>=22){
                        System.out.println("Burcunuz Oğlak");
                    }else{
                        System.out.println("Burcunuz Yay");
                        break;
                    }


                    case 2:
                        if (day>=22){
                            System.out.println("Burcunuz Kova");
                        }else {
                            System.out.println("Burcunuz Oğlak");
                            break;
                        }

                        case 3:
                    if (day>=20){
                        System.out.println("Burcunuz Balık");
                    }else {
                        System.out.println("Burcunuz Kova");
                        break;
                    }


                case 4:
                    if (day>=22){
                        System.out.println("Burcunuz Koç");
                    }else {
                        System.out.println("Burcunuz Balık");
                        break;
                    }


                case 5:
                    if (day>=21){
                        System.out.println("Burcunuz Boğa");
                    }else {
                        System.out.println("Burcunuz Koç");
                        break;
                    }


                case 6:
                    if (day>=22){
                        System.out.println("Burcunuz İkizler");
                    }else {
                        System.out.println("Burcunuz Boğa");
                        break;
                    }


                case 7:
                    if (day>=23){
                        System.out.println("Burcunuz Yengeç");
                    }else {
                        System.out.println("Burcunuz İkizler");
                        break;
                    }


                case 8:
                    if (day>=23){
                        System.out.println("Burcunuz Aslan");
                    }else {
                        System.out.println("Burcunuz Yengeç");
                        break;
                    }


                case 9:
                    if (day>=22){
                        System.out.println("Burcunuz Kova");
                    }else {
                        System.out.println("Burcunuz Oğlak");
                        break;
                    }


                case 10:
                    if (day>=23){
                        System.out.println("Burcunuz Başak");
                    }else {
                        System.out.println("Burcunuz Aslan");
                        break;
                    }


                case 11:
                    if (day>=23){
                        System.out.println("Burcunuz Terazi");
                    }else {
                        System.out.println("Burcunuz Başak");
                        break;
                    }

                case 12:
                    if (day>=23){
                        System.out.println("Burcunuz Akrep");
                    }else {
                        System.out.println("Burcunuz Terazi");
                        break;
                    }

                case 13:
                    if (day>=22){
                        System.out.println("Burcunuz Yay");
                    }else {
                        System.out.println("Burcunuz Akrep");
                        break;
                    }
            }
    }

}