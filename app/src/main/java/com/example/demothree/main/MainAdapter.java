package com.example.demothree.main;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.databinding.DataBindingUtil;
import androidx.recyclerview.widget.RecyclerView;

import com.example.demothree.ItemMenu;
import com.example.demothree.R;
import com.example.demothree.databinding.ItemMenuBinding;

import java.util.ArrayList;

public class MainAdapter extends RecyclerView.Adapter<MainAdapter.AdaterHolder> {
    private Context context;
    ArrayList<ItemMenu> itemMenus;
    private LayoutInflater layoutInflater;

    public MainAdapter(Context context, ArrayList<ItemMenu> itemMenus) {
        this.context = context;
        this.itemMenus = itemMenus;
    }

    @NonNull
    @Override
    public AdaterHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        if (layoutInflater == null) {
            layoutInflater = LayoutInflater.from(parent.getContext());
        }
        ItemMenuBinding menuBinding = ItemMenuBinding.inflate(layoutInflater, parent, false);
        return new AdaterHolder(menuBinding);
    }

    @Override
    public void onBindViewHolder(@NonNull AdaterHolder holder, int position) {
        ItemMenu itemMenu = itemMenus.get(position);
        holder.bind(itemMenu);

        final ItemMenuBinding binding = holder.getItemMenuBinding();
        binding.setMenuItemClick(new MainItemListener() {
            @Override
            public void mainItemClick() {
                Toast.makeText(context, itemMenu.getItemName(), Toast.LENGTH_SHORT).show();
            }
        });
    }

    @Override
    public int getItemCount() {
        return itemMenus.size();
    }


    class AdaterHolder extends RecyclerView.ViewHolder {
        private ItemMenuBinding itemMenuBinding;

        public AdaterHolder(ItemMenuBinding binding) {
            super(binding.getRoot());
            itemMenuBinding = binding;
        }

        public void bind(ItemMenu itemMenu) {
            this.itemMenuBinding.setItem(itemMenu);
        }

        public ItemMenuBinding getItemMenuBinding(){
            return itemMenuBinding;
        }
    }
}
