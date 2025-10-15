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

        RecyclerView rvBooks = findViewById(R.id.rvBooks);

        // Datos de ejemplo
        List<Book> bookList = Arrays.asList(
                new Book(1, "Yo Robot", "Colección de 9 relatos interconectados que exploran la relación entre humanos y robots", R.drawable.book1),
                new Book(2, "La Metamorfosis", "Reflexión sobre la deshumanización de una persona que no se ajusta al molde preestablecido por la sociedad", R.drawable.book2),
                new Book(3, "Don Quijote de la Mancha", " El tema de la locura es central en la obra, conflicto permanente entre el héroe y la realidad que se le presenta.", R.drawable.book3)
        );

        BookAdapter adapter = new BookAdapter(
                bookList,
                book -> Toast.makeText(MainActivity.this, book.getTitle() + " agregado al carrito", Toast.LENGTH_SHORT).show(),
                book -> {
                    // Navegar a la pantalla de detalle
                    Intent intent = new Intent(MainActivity.this, BookDetailActivity.class);
                    intent.putExtra(BookDetailActivity.EXTRA_TITLE, book.getTitle());
                    intent.putExtra(BookDetailActivity.EXTRA_DESCRIPTION, book.getDescription());
                    intent.putExtra(BookDetailActivity.EXTRA_COVER_RES_ID, book.getCoverResId());
                    startActivity(intent);
                }
        );

        rvBooks.setLayoutManager(new LinearLayoutManager(this));
        rvBooks.setAdapter(adapter);
    }
}