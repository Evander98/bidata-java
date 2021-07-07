package biodata;

import java.time.LocalDate;

public class Person {
  private String firstName;
  private String lastName;
  private String domisili;
  private int tahunLahir;

  public String getFirstName() {
    return firstName;
  }
  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }

  public String getLastName() {
    return lastName;
  }
  public void setLastName(String lastName) {
    this.lastName = lastName;
  }

  public String getDomisili() {
    return domisili;
  }
  public void setDomisili(String domisili) {
    this.domisili = domisili;
  }

  public int getTahunLahir() {
    return tahunLahir;
  }
  public void setTahunLahir(int tahunLahir) {
    this.tahunLahir = tahunLahir;
  }

  public String getNamaLengkap() {
    return firstName + " " + lastName;
  }  

  public int getAge(){
    LocalDate localDate = LocalDate.now();

    int year = localDate.getYear();
    
    return year - tahunLahir;
  }

}
