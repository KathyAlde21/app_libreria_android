package com.example.libreriaapp;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import java.util.List;
public class BookAdapter extends RecyclerView.Adapter<BookAdapter.BookViewHolder>{
    private List<Book> books;
    private OnItemClickListener itemClickListener;
    private OnAddToCartListener listener;

    public interface OnAddToCartListener {
        void onAddToCart(Book book);
    }

    public BookAdapter(List<Book> books, OnAddToCartListener cartListener, OnItemClickListener itemListener) {
        this.books = books;
        this.listener = cartListener;
        this.itemClickListener = itemListener;
    }

    @NonNull
    @Override
    public BookViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.item_book, parent, false);
        return new BookViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull BookViewHolder holder, int position) {
        Book book = books.get(position);
        holder.ivBookCover.setImageResource(book.getCoverResId());
        holder.tvTitle.setText(book.getTitle());
        holder.tvDescription.setText(book.getDescription());

        holder.btnAddToCart.setOnClickListener(v -> {
            if (listener != null) {
                listener.onAddToCart(book);
            }
        });

        // Hacer que todo el ítem sea cliqueable para ir al detalle
        holder.itemView.setOnClickListener(v -> {
            if (itemClickListener != null) {
                itemClickListener.onItemClick(book);
            }
        });
    }

    @Override
    public int getItemCount() {
        return books.size();
    }

    static class BookViewHolder extends RecyclerView.ViewHolder {
        ImageView ivBookCover;
        TextView tvTitle;
        TextView tvDescription;
        Button btnAddToCart;

        public BookViewHolder(@NonNull View itemView) {
            super(itemView);
            ivBookCover = itemView.findViewById(R.id.ivBookCover);
            tvTitle = itemView.findViewById(R.id.tvTitle);
            tvDescription = itemView.findViewById(R.id.tvDescription);
            btnAddToCart = itemView.findViewById(R.id.btnAddToCart);
        }
    }
}