package biodata;

import java.util.Scanner;

public class Main {
  public static void main(String[] args){
    Person person = new Person();

    Pendidikan pendidikan = new Pendidikan();

    Scanner sc = new Scanner(System.in);

    
    boolean isContinue;
    
    do{
      isContinue = true;

      System.out.println("==============Menu============");
      System.out.println("1. Biodata");
      System.out.println("2. Riwayat Pendidikan");
      System.out.println("3. Keluar");
      System.out.print("Pilih menu : ");
      int menu = sc.nextInt();
      sc.nextLine();
      
      switch (menu) {
        case 1:
          System.out.print("Nama Depan : ");
          String firstName = sc.nextLine();
      
          System.out.print("Nama Belakang : ");
          String lastName = sc.next();
          
          sc.nextLine();
      
          System.out.print("Domisili : ");
          String domisili = sc.nextLine();
          
          System.out.print("Tahun Lahir : ");
          int tahunLahir = sc.nextInt();
          
          person.setFirstName(firstName);
          person.setLastName(lastName);
          person.setDomisili(domisili);
          person.setTahunLahir(tahunLahir);
  
          System.out.println("================================Biodata================================ ");
          System.out.println("Nama Lengkap: " + person.getNamaLengkap());
          System.out.println("Domisili: " + person.getDomisili());
          System.out.println("Usia: " + person.getAge() + " tahun");
          continue;
        case 2:
          System.out.print("SD: ");
          String sd = sc.nextLine();
  
          pendidikan.setSd(sd);
  
          System.out.print("Lulus tahun: ");
          int tahunLulusSd = sc.nextInt();
          sc.nextLine();
  
          pendidikan.setTahunLulusSd(tahunLulusSd);
          
          System.out.print("SMP: ");
          String smp = sc.nextLine();
          
          pendidikan.setSmp(smp);
  
          System.out.print("Lulus tahun: ");
          int tahunLulusSmp = sc.nextInt();
          sc.nextLine();
  
          pendidikan.setTahunLulusSmp(tahunLulusSmp);
          
          System.out.print("SMA: ");
          String sma = sc.nextLine();
  
          pendidikan.setSma(sma);
  
          System.out.print("Lulus tahun: ");
          int tahunLulusSma = sc.nextInt();
          sc.nextLine();
  
          pendidikan.setTahunLulusSma(tahunLulusSma);
          
  
          System.out.println("================================Pendidikan================================");
          System.out.println("SD: " + pendidikan.getSd() + " Lulus tahun: " + pendidikan.getTahunLulusSd());
          System.out.println("SMP: " + pendidikan.getSmp() + " Lulus tahun: " + pendidikan.getTahunLulusSmp());
          System.out.println("SMA: " + pendidikan.getSma() + " Lulus tahun: " + pendidikan.getTahunLulusSma());
          continue;
        case 3:
          System.out.println("Yakin keluar? (y/n)");
          String keluar = sc.next();
          if(keluar.equalsIgnoreCase("y")){
            System.exit(0);
          }
          
      }
    }while(isContinue);

    sc.close();
  }

}
