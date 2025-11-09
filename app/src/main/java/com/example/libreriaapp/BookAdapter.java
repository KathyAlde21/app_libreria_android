package com.example.libreriaapp;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import java.util.List;

public class BookAdapter extends RecyclerView.Adapter<BookAdapter.BookVH>{

    public interface OnBookActions {
        void onAddToCart(Book book);
        void onOpenDetail(Book book);
    }

    private final List<Book> items;
    private final OnBookActions listener;


    public BookAdapter(List<Book> items, OnBookActions listener) {
        this.items = items;
        this.listener = listener;
    }
    static class BookVH extends RecyclerView.ViewHolder {
        ImageView imgCover;
        TextView txtTitle, txtDescription;
        Button btnAdd;

        public BookVH(@NonNull View itemView) {
            super(itemView);
            imgCover = itemView.findViewById(R.id.imgCover);
            txtTitle = itemView.findViewById(R.id.txtTitle);
            txtDescription = itemView.findViewById(R.id.txtDescription);
            btnAdd = itemView.findViewById(R.id.btnAdd);
        }
    }

    //---------------------------------------------------------------------------------//
    @NonNull
    @Override
    public BookVH onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.item_book, parent, false);
        return new BookVH(view);
    }

    @Override
    public void onBindViewHolder(@NonNull BookVH holder, int position) {
        Book book = items.get(position);
        // Configurar los datos del libro en el ViewHolder
        holder.imgCover.setImageResource(book.getCoverRes());

        // Configurar los datos del libro en el ViewHolder
        holder.txtTitle.setText(book.getTitle());
        holder.txtDescription.setText(book.getDescription());

        // Hacer que sea cliqueable el ítem para ir al detalle
        holder.itemView.setOnClickListener(v -> {
            if (listener != null) {
                listener.onOpenDetail(book);
            }
        });
        holder.btnAdd.setOnClickListener(v -> {
            if (listener != null) {
                listener.onAddToCart(book);
            }
        });
    }

    @Override
    public int getItemCount() {
        return items.size();
    }
}