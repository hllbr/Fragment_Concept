package com.hllbr.fragmentkotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        /*
        Fragment parça olarak ifade edilebilir.
        bir aktivitenin içerisinde birden fazla fragment kullanabiliyoruz birden fazla activiteye duyulan ihtiyacı ortadan kaldırabiliriz.
        Activitelerin yaşam döngüsü olduğu gibi fragmentlerinde yaşam döngüleri bulunmaktadır.
        burada en çok göze çarpan durum onAttach bir yere bağlandıktan sonra görünümler oluşturuyor

         */

    }
    fun fragment1(view : View){
        /*
        Fragment çağırmak için fragment yöneticisini çağırmak gerekiyor.
        yapılacak işlemleri başlatmak için fragmentTransaction denilen bir yapı oluşturuyoruz.
        bu yapı özelliklerini alt satırlarda görüldüğü gibi fragmentManager içersinde bulunan beginTransaction yapısından alıyor.
        bu yapıyı kurarak bu fragment ile ilgili değişiklikler yapacağımızı belirtmiş oluyoruz.
        add dersek ekler replace dersek yerine ekleyecek transaction içersinde
         */
        val fragmentManager = supportFragmentManager
        val fragmentTransaction = fragmentManager.beginTransaction()
        val firstFragment = BlankFragment()
        fragmentTransaction.add(R.id.frameLayout,firstFragment).commit()
    }
    fun fragment2(view : View){
        val fragmentManager = supportFragmentManager
        val fragmentTransaction = fragmentManager.beginTransaction()
        val secondFragment = BlankFragment2()
        fragmentTransaction.add(R.id.frameLayout,secondFragment).commit()
    }
    /*
    Yapı bu şekilde kurulduğunda sürekli olarak üzerine yazma işlemi olacak ve yazılar yada gösterilmek istenilen nesneler birbirleri üzerine bindirilecekler.
    bu programlama açısından bir problem teşkil etmekte.¿
     */
}