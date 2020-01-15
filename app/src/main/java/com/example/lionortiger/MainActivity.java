package com.example.lionortiger;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void imgViewIsClicked(View imgView){
        ImageView imageView = (ImageView) imgView;
        imageView.setTranslationX(-2000);
        imageView.setImageResource(R.drawable.lion);
        imageView.animate().translationXBy(2000).rotation(3600).alpha(1).setDuration(3000);
    }
}
