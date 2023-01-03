import java.util.Scanner;
public class hesaplar {
    Scanner input = new Scanner(System.in);
    double t1Hedef, t2Hedef, t2, t1, yapilan, kalanGun ;
    double adetHedef, birimOrt;
    double verimTL, verimAdet, saat;
    double ayTam, ayGun;



   public void veriler() {

       System.out.print("T1 hedefimiz kaç? : ");
       this.t1=input.nextDouble();

       System.out.print("T2'miz kaç? :");
       this.t2=input.nextDouble();

       System.out.print("Bugüne Kadar Yapılan TL'miz Kaç? :");
       this.yapilan = input.nextDouble();

       System.out.print("Ayın tamamlanmasına kaç gün kaldı? : ");
       this.kalanGun = input.nextDouble();

       System.out.print("Birim Ortalama Fiyatımız Nedir? : ");
       this.birimOrt=input.nextDouble();

       System.out.print("Bugün kaç saat çalışıyoruz? : ");
       this.saat= input.nextDouble();

       System.out.print("Dün ayın kaçıydı? : ");
       this.ayTam = input.nextDouble();

       System.out.print("Bu ayın gün sayısı? : ");
       this.ayGun= input.nextDouble();
    }

    public void islemler() {
        System.out.println("\n");
        System.out.println("T1 Hedefimiz : " + (this.t1Hedef=(this.t1-this.yapilan)/this.kalanGun));
        System.out.println("T2 Hedefimiz : " + (this.t2Hedef=(this.t2-this.yapilan)/this.kalanGun));
        System.out.println("Adet Hedefimiz : " + (this.adetHedef = this.t2Hedef/this.birimOrt));
        System.out.println("TL Verimliliğimiz : " + (this.verimTL = this.t2Hedef/this.saat));
        System.out.println("Adet Verimliliğimiz : " + (this.verimAdet = this.adetHedef/this.saat));
        System.out.println("T1 Tamamlanan : " + (this.t1/this.ayGun));
        System.out.println("T2 Tamamlanan : " + (this.t2/this.ayGun));
        System.out.println("Ay Tamamlanan : " + (this.ayTam/this.ayGun));
    }

}
