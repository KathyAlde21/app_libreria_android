package com.example.libreriaapp;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class BookDetailActivity extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_book_detail);

        // Referencias a los elementos de la interfaz
        ImageView img = findViewById(R.id.imgCoverDetail);
        TextView title = findViewById(R.id.txtTitleDetail);
        TextView desc = findViewById(R.id.txtDescDetail);

        // Obtener datos de la actividad anterior
        String t = getIntent().getStringExtra("title");
        String d = getIntent().getStringExtra("desc");
        int cover = getIntent().getIntExtra("cover", 0);

        // Mostrar datos
        if (t != null) title.setText(t);
        if (d != null) desc.setText(d);
        if (cover != 0) img.setImageResource(cover);
    }
}