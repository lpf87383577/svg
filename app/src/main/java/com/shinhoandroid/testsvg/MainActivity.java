package com.shinhoandroid.testsvg;

import android.graphics.drawable.AnimatedVectorDrawable;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.VectorDrawable;
import android.os.Build;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ImageView imageView = findViewById(R.id.img);
        Drawable drawable = imageView.getDrawable();
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
            VectorDrawable vectorDrawable = (VectorDrawable) drawable;
            imageView.setImageDrawable(vectorDrawable);
        } else {
            BitmapDrawable bitmapDrawable = (BitmapDrawable) drawable;
            imageView.setImageDrawable(bitmapDrawable);
        }
    }

    public void getAnim(View view) {
        ImageView imageView = (ImageView) view;
        if(Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP){
            ((AnimatedVectorDrawable) imageView.getDrawable()).start();
        }
    }

    public void getAnim2(View view) {
        ImageView imageView = (ImageView) view;
        if(Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP){
            ((AnimatedVectorDrawable) imageView.getDrawable()).start();
        }
    }
}
