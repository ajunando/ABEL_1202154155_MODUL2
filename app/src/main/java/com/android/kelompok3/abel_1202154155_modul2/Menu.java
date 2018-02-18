package com.android.kelompok3.abel_1202154155_modul2;

/**
 * Created by Lenovo on 18/02/2018.
 */

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import java.util.ArrayList;



public class Menu extends AppCompatActivity {

    private RecyclerView recyclerView;
    private DaftarMenu adapter;
    private RecyclerView.LayoutManager layoutManager;
    private ArrayList<String> Menu;
    private ArrayList<String> Price;
    private ArrayList<Integer> Gambar;

    //array menu

    private String[] menu = {"Nasi Goreng", "Mie rebus Spesial", "tempe goreng", "Sate Madura", "Nasi Wagyu", "Mie Goreng Biasa"};

    //array harga

    private String[] price = {"15.000", "10.000", "5.000", "25.000", "30.000", "5.000"};

    //array gambar

    private int[] image = {R.drawable.nasgor, R.drawable.miekuah, R.drawable.tempe, R.drawable.satmar, R.drawable.naswag,

            R.drawable.migor};

    @Override

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.daftarmenu);
        Menu = new ArrayList<>();
        Price = new ArrayList<>();
        Gambar = new ArrayList<>();
        recyclerView= findViewById(R.id.recyclerview);
        DaftarItem();



        //Menggunakan Layout Manager, Dan Membuat List Secara Vertical
        //Layout Manager mengatur tampilan dari komponen di dalam kontainer.
        layoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setHasFixedSize(true);
        adapter = new DaftarMenu(Menu, Price, Gambar);

        //Memasang Adapter pada RecyclerView
        //sebuah library yang digunakan sebagai tempat untuk menampilkan banyak data, mirip seperti ListView
        recyclerView.setAdapter(adapter);
    }



    private void DaftarItem() {
        for (int w=0; w<menu.length; w++){
            Gambar.add(image[w]);
            Menu.add(menu[w]);
            Price.add(price[w]);
        }

    }

}