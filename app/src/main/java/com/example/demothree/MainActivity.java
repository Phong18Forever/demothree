package com.example.demothree;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import android.os.Bundle;

import com.example.demothree.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {
    private ItemMenu itemMenu;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_main);
        ActivityMainBinding mainBinding = DataBindingUtil.setContentView(this, R.layout.activity_main);
        itemMenu = new ItemMenu();
        itemMenu.setItemName("Từ Vựng");
        mainBinding.setItemMenu(itemMenu);
    }
}