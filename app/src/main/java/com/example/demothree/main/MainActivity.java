package com.example.demothree.main;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import com.example.demothree.ItemMenu;
import com.example.demothree.R;
import com.example.demothree.databinding.ActivityMainBinding;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private ArrayList<ItemMenu> menus = new ArrayList<>();
    private RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ActivityMainBinding mainBinding = DataBindingUtil.setContentView(this, R.layout.activity_main);
        fakeListViewData(menus); //^^

        recyclerView = findViewById(R.id.recyclerHero);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(new MainAdapter(MainActivity.this, menus));
    }

    private ArrayList<ItemMenu> fakeListViewData(ArrayList<ItemMenu> menus) {
        menus.add(new ItemMenu("AAA", R.mipmap.ic_launcher));
        menus.add(new ItemMenu("BBB", R.mipmap.ic_launcher));
        menus.add(new ItemMenu("CCC", R.mipmap.ic_launcher));
        menus.add(new ItemMenu("DDD", R.mipmap.ic_launcher));
        return menus;
    }
}