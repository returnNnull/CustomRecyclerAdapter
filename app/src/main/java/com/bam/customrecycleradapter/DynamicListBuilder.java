package com.bam.customrecycleradapter;

import java.util.List;

public class DynamicListBuilder<T> {

    private final DynamicListAdapter<T> __dynamicListAdapter;


    public DynamicListBuilder() {
        __dynamicListAdapter = new DynamicListAdapter<>();
    }

    public DynamicListBuilder<T> setItems(List<T> items){
        __dynamicListAdapter.setItems(items);
        return this;
    }

    public DynamicListBuilder<T> setHolder(CustomViewHolder holder){
        __dynamicListAdapter.setViewHolder(holder);
        return this;
    }

    public DynamicListBuilder<T> setItemXml(int xml){
        __dynamicListAdapter.setItemXml(xml);
        return this;
    }

    public DynamicListAdapter<T> create(){
        return __dynamicListAdapter;
    }
}
