package com.example.libreriaapp;

import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

public class CartActivity extends AppCompatActivity {
    private CartAdapter adapter;
    private TextView txtTotal;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cart);

        RecyclerView rv = findViewById(R.id.recyclerCart);
        txtTotal = findViewById(R.id.txtTotal);
        Button btnClear = findViewById(R.id.btnClear);

        adapter = new CartAdapter(
                CartManager.getInstance().getLines(),
                line -> {
                    CartManager.getInstance().removeOne(line.book.getId());
                    refresh();
                }
        );

        rv.setLayoutManager(new LinearLayoutManager(this));
        rv.setAdapter(adapter);

        btnClear.setOnClickListener(v -> {
            CartManager.getInstance().clear();
            refresh();
        });

        refresh();
    }

    private void refresh() {
        adapter.submitList(CartManager.getInstance().getLines());
        txtTotal.setText("Total de ítems: " + CartManager.getInstance().getTotalItems());
    }
}
