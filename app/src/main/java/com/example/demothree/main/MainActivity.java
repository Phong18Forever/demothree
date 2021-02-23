package com.example.demothree.main;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;
import android.os.Bundle;
import com.example.demothree.ItemMenu;
import com.example.demothree.R;
import com.example.demothree.databinding.ActivityMainBinding;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private ArrayList<ItemMenu> menus = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ActivityMainBinding mainBinding = DataBindingUtil.setContentView(this, R.layout.activity_main);

        fakeListViewData(menus); //^^

        MainAdapter mainAdapter = new MainAdapter(MainActivity.this, menus);
        mainBinding.setAdapter(mainAdapter);
    }

    private ArrayList<ItemMenu> fakeListViewData(ArrayList<ItemMenu> menus) {
        menus.add(new ItemMenu("AAA"));
        menus.add(new ItemMenu("BBB"));
        menus.add(new ItemMenu("CCC"));
        return menus;
    }
}