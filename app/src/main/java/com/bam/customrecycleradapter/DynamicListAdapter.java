package com.bam.customrecycleradapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bam.customrecycleradapter.listeners.ItemOnClickListener;

import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.util.List;

public class DynamicListAdapter<T> extends RecyclerView.Adapter<CustomViewHolder> {

    private List<T> __items;
    private int itemXml;
    private ItemOnClickListener __itemOnClickListener;
    private CustomViewHolder __viewHolder;


    public void setItemXml(int itemXml) {
        this.itemXml = itemXml;
    }

    public void setItems(List<T> items) {
        __items = items;
    }

    public void setViewHolder(CustomViewHolder viewHolder) {
        __viewHolder = viewHolder;
    }

    @NonNull
    @Override
    public CustomViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(itemXml, parent, false);

        return __viewHolder.create(view, parent);
    }

    @Override
    public void onBindViewHolder(@NonNull CustomViewHolder holder, int position) {
        holder.setItem(__items.get(position));
        holder.itemView.setOnClickListener(v ->
                __itemOnClickListener.click(position));
    }

    @Override
    public int getItemCount() {
        return __items.size();
    }


    public void observe(ItemOnClickListener listener){
        __itemOnClickListener = listener;
    }

}
