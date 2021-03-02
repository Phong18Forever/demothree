package com.example.demothree.custom;

import android.os.Build;
import android.widget.ImageButton;
import android.widget.ImageView;

import androidx.databinding.BindingAdapter;

public class CustomSetter {
    @BindingAdapter("imgSrc")
    public static void setImgSrc(ImageView view, int resId){
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
            view.setImageDrawable(view.getContext().getDrawable(resId));
        }
    }
}
