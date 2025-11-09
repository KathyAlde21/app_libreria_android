package com.example.libreriaapp;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class CartManager {
    private static CartManager INSTANCE;

    public static class CartLine {
        public final Book book;
        public int qty;
        CartLine(Book book, int qty) { this.book = book; this.qty = qty; }
    }

    private final Map<String, CartLine> lines = new LinkedHashMap<>();

    private CartManager() {}

    public static CartManager getInstance() {
        if (INSTANCE == null) INSTANCE = new CartManager();
        return INSTANCE;
    }

    public void add(Book book) {
        CartLine line = lines.get(book.getId());
        if (line == null) lines.put(book.getId(), new CartLine(book, 1));
        else line.qty += 1;
    }

    public void removeOne(String bookId) {
        CartLine line = lines.get(bookId);
        if (line == null) return;
        if (line.qty <= 1) lines.remove(bookId);
        else line.qty -= 1;
    }

    public void clear() { lines.clear(); }

    public List<CartLine> getLines() { return new ArrayList<>(lines.values()); }

    public int getTotalItems() {
        int t = 0;
        for (CartLine l : lines.values()) t += l.qty;
        return t;
    }
}