package com.bam.customrecycleradapter;

import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public abstract class CustomViewHolder extends RecyclerView.ViewHolder{

    protected ViewGroup parent;
    protected View view;

    public CustomViewHolder(View view, @NonNull ViewGroup parent) {
        super(view);
        this.parent = parent;
        this.view = view;
    }

    abstract <T> void setItem(T item);
    abstract CustomViewHolder create(View view, ViewGroup parent);

}
