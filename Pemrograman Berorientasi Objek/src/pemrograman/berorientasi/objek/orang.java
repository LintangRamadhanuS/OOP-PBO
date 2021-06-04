package pemrograman.berorientasi.objek;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author MOKLET-1
 */
public class orang {
      // ini attrjbut
  int umur;
  String naleng, asal;
  
  //ini methodnya
  void greeting(){
    System.out.println("halo");
  }
  
  void biodata(String nama, int age, String asal_kota){
    naleng = nama;
    umur = age;
    asal = asal_kota;
  }
  
  void perkenalan(){
    greeting();
    System.out.printf("perkenalkan nama saya %s \numur saya %d tahun \nsaya dari kota %s  ", naleng, umur, asal);
  }
}

