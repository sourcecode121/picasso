package com.example.picasso;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageView;

import com.squareup.picasso.Picasso;

public class MainActivity extends AppCompatActivity {

    private ImageView imageView1;
    private ImageView imageView2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        imageView1 = (ImageView) findViewById(R.id.image_1);
        imageView2 = (ImageView) findViewById(R.id.image_2);

        Picasso picasso = Picasso.with(this);
        picasso.setIndicatorsEnabled(true);

        picasso.load(R.drawable.yoda)
                .resize(700, 700)
                .centerCrop()
                .into(imageView1);

        picasso.load(R.drawable.vader)
                .transform(new CustomTransformation())
                .into(imageView2);
    }
}
