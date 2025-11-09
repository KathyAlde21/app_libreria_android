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

public class CartAdapter extends RecyclerView.Adapter<CartAdapter.CartVH> {
    public interface OnCartActions {
        void onRemoveOne(CartManager.CartLine line);
    }

    private List<CartManager.CartLine> items;
    private final OnCartActions listener;

    public CartAdapter(List<CartManager.CartLine> items, OnCartActions listener) {
        this.items = items;
        this.listener = listener;
    }

    static class CartVH extends RecyclerView.ViewHolder {
        ImageView img;
        TextView title, qty;
        Button btnRemoveOne;

        CartVH(@NonNull View itemView) {
            super(itemView);
            img = itemView.findViewById(R.id.imgCartCover);
            title = itemView.findViewById(R.id.txtCartTitle);
            qty = itemView.findViewById(R.id.txtCartQty);
            btnRemoveOne = itemView.findViewById(R.id.btnRemoveOne);
        }
    }

    @NonNull
    @Override
    public CartVH onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_cart, parent, false);
        return new CartVH(v);
    }

    @Override
    public void onBindViewHolder(@NonNull CartVH holder, int position) {
        CartManager.CartLine line = items.get(position);
        holder.img.setImageResource(line.book.getCoverRes());
        holder.title.setText(line.book.getTitle());
        holder.qty.setText("Cantidad: " + line.qty);
        holder.btnRemoveOne.setOnClickListener(v -> {
            if (listener != null) listener.onRemoveOne(line);
        });
    }

    @Override
    public int getItemCount() { return items.size(); }

    public void submitList(List<CartManager.CartLine> newItems) {
        this.items = newItems;
        notifyDataSetChanged();
    }
}