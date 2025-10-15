package com.example.libreriaapp;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;

public class BookDetailActivity extends AppCompatActivity {
    public static final String EXTRA_BOOK_ID = "extra_book_id";
    public static final String EXTRA_TITLE = "extra_title";
    public static final String EXTRA_DESCRIPTION = "extra_description";
    public static final String EXTRA_COVER_RES_ID = "extra_cover_res_id";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_book_detail);

        ImageView ivDetailCover = findViewById(R.id.ivDetailCover);
        TextView tvDetailTitle = findViewById(R.id.tvDetailTitle);
        TextView tvDetailDescription = findViewById(R.id.tvDetailDescription);
        findViewById(R.id.btnAddToCartDetail).setOnClickListener(v -> {
            // Aquí podrías integrar lógica real del carrito más adelante
            Toast.makeText(this, "Agregado al carrito desde detalle", Toast.LENGTH_SHORT).show();
        });

        // Recibir datos del Intent
        String title = getIntent().getStringExtra(EXTRA_TITLE);
        String description = getIntent().getStringExtra(EXTRA_DESCRIPTION);
        int coverResId = getIntent().getIntExtra(EXTRA_COVER_RES_ID, R.drawable.ic_launcher_background);

        // Mostrar datos
        if (title != null) tvDetailTitle.setText(title);
        if (description != null) tvDetailDescription.setText(description);
        ivDetailCover.setImageResource(coverResId);
    }
}