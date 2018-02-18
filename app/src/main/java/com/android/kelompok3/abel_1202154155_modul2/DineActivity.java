package com.android.kelompok3.abel_1202154155_modul2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.Toast;

/**
 * Created by Lenovo on 18/02/2018.
 */


public class DineActivity extends AppCompatActivity implements AdapterView.OnItemSelectedListener {

    private String noMejaH = "";
    private static final String TAG = MainActivity.class.getSimpleName();
    Button btpilih;

    @Override

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.dine_activity);
        btpilih = (Button)findViewById(R.id.pilih);

        //Membuat spinner (Sejenis untuk membuat urutan dan itu sebagai dropdown list ketika banyak pilihan)
        Spinner spinner = (Spinner)findViewById(R.id.noMeja);
        if (spinner != null) {
            spinner.setOnItemSelectedListener(this);

        }




        //Membuat ArrayAdapter dengan string array dan default spinner layout
        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this,R.array.labels_array,
                android.R.layout.simple_spinner_item);



        //Menentukan tata letak yang akan digunakan saat daftar pilihan muncul.
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_item);


        //Menerapkan si adapter ke Spinnernya
        if (spinner != null){

            spinner.setAdapter(adapter);

        }
        btpilih.setOnClickListener(new View.OnClickListener() {

            @Override

            public void onClick(View view) {

                Intent a = new Intent(DineActivity.this,Menu.class);
                Toast.makeText(DineActivity.this, "Meja No "+noMejaH+" Terpilih", Toast.LENGTH_LONG).show();
                startActivity(a);

            }

        });

    }
    @Override
    public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {

        noMejaH = adapterView.getItemAtPosition(i).toString();
    }

    @Override

    public void onNothingSelected(AdapterView<?> adapterView) {
        Log.d(TAG, getString(R.string.nothing_selected));
    }
}
