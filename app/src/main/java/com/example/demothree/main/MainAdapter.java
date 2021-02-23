package com.example.demothree.main;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import androidx.databinding.DataBindingUtil;

import com.example.demothree.ItemMenu;
import com.example.demothree.R;
import com.example.demothree.databinding.ItemMenuBinding;

import java.util.ArrayList;

public class MainAdapter extends BaseAdapter {
    private Context context;
    ArrayList<ItemMenu> itemMenus;

    public MainAdapter(Context context, ArrayList<ItemMenu> itemMenus) {
        this.context = context;
        this.itemMenus = itemMenus;
    }

    @Override
    public int getCount() {
        return itemMenus.size();
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View view, ViewGroup viewGroup) {
        ItemMenuBinding itemMenuBinding;
            LayoutInflater inflater = LayoutInflater.from(context);
            view = inflater.inflate(R.layout.item_menu, null, false);
            itemMenuBinding = DataBindingUtil.bind(view);
            view.setTag(itemMenuBinding);
            itemMenuBinding.setItemMenu(itemMenus.get(position));
        return itemMenuBinding.getRoot();
    }
}
