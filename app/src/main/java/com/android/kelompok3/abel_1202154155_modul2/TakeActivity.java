package com.android.kelompok3.abel_1202154155_modul2;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

/**
 * Created by Lenovo on 18/02/2018.
 */

import android.content.Intent;
import android.view.View;
import android.widget.Button;



public class TakeActivity extends AppCompatActivity {
    Button pilih;
    @Override

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        //Menghubungkan dengan manifest untuk merancang tataletaknya
        setContentView(R.layout.take_activity);
        pilih = (Button)findViewById(R.id.pesan);
        pilih.setOnClickListener(new View.OnClickListener() {

            @Override

            public void onClick(View view) {

                Intent a = new Intent(TakeActivity.this,Menu.class);
                startActivity(a);
            }

        });
    }
}