package com.example.panjibs.ootd;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
//menampilkan daftar menu utama
public class Menu extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);
        //menampilkan isi dari main activity yaitu penerapan baju
        ImageButton showindex = (ImageButton) findViewById(R.id.InputBaju);
        showindex.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Menu.this, MainActivity.class);
                startActivity(intent);
            }
        });
        //menampilkan pembuat dari aplikasi
        ImageButton showcredit = (ImageButton) findViewById(R.id.Credit);
        showcredit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Menu.this, Credit.class);
                startActivity(intent);
            }
        });


    }
}
