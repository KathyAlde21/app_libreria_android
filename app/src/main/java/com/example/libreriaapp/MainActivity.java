package com.example.libreriaapp;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.Arrays;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        RecyclerView recyclerView = findViewById(R.id.recyclerView);

        // Lista de tres libros de ejemplo
        List<Book> sampleBooks = Arrays.asList(
                new Book("1", "Yo Robot", "Colección de 9 relatos interconectados que exploran la relación entre humanos y robots", R.drawable.book1),
                new Book("2", "La Metamorfosis", "Reflexión sobre la deshumanización de una persona que no se ajusta al molde preestablecido por la sociedad", R.drawable.book2),
                new Book("3", "Don Quijote de la Mancha", " El tema de la locura es central en la obra, conflicto permanente entre el héroe y la realidad que se le presenta.", R.drawable.book3)
        );

        //Configurar el adapter con acciones de agregar y ver detalle
        BookAdapter adapter = new BookAdapter(sampleBooks, new BookAdapter.OnBookActions() {
            @Override
            public void onAddToCart(Book book) {
                // Agrega el libro al carrito global
                CartManager.getInstance().add(book);

                // Muestra mensaje de confirmación
                Toast.makeText(MainActivity.this,
                        "Agregado al carrito: " + book.getTitle(),
                        Toast.LENGTH_SHORT).show();

                // Abre la actividad del carrito
                Intent intent = new Intent(MainActivity.this, CartActivity.class);
                startActivity(intent);
            }

            @Override
            public void onOpenDetail(Book book) {
                // Abre la actividad de detalle con los datos del libro
                Intent i = new Intent(MainActivity.this, BookDetailActivity.class);
                i.putExtra("id", book.getId());
                i.putExtra("title", book.getTitle());
                i.putExtra("desc", book.getDescription());
                i.putExtra("cover", book.getCoverRes());
                startActivity(i);
            }
        });

        // Configurar RecyclerView
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(adapter);
    }
}