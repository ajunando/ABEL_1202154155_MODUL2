package com.android.kelompok3.abel_1202154155_modul2;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by Lenovo on 18/02/2018.
 */

public class DetailMenu extends AppCompatActivity {

    @Override

    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.detail_menu);

        //Menyetting agar tombol button di view

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);



        //menerima value yang dikirimkan dari activity sebelumnya berupa sebuah key value

        String menu = getIntent().getStringExtra("menu");
        String price = getIntent().getStringExtra("price");
        String komposisi = getIntent().getStringExtra("komposisi");
        Integer image = getIntent().getIntExtra("image", 0);



        //mendefinisikan TextView dan ImageView dengan id

        TextView txtMenu = findViewById(R.id.namaMenu);
        TextView txtPrice = findViewById(R.id.price);
        TextView txtkomposisi = findViewById(R.id.listkomposisi);
        ImageView images = findViewById(R.id.imageMenu);

        //menyetting key valuenya yang sudah dibuat diatas

        txtMenu.setText(menu);
        txtPrice.setText(price);
        txtkomposisi.setText(komposisi);
        images.setImageResource(image);

    }



    @Override

    public boolean onSupportNavigateUp() {
        //dipanggil setiap kali pengguna memilih untuk button back dalam hierarki aktivitas sebelumnya
        onBackPressed();
        return true;
    }
}