package com.example.ienovo.glideexample;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

import com.bumptech.glide.Glide;
import com.bumptech.glide.load.resource.bitmap.CenterCrop;
import com.bumptech.glide.load.resource.bitmap.RoundedCorners;
import com.bumptech.glide.load.resource.drawable.DrawableTransitionOptions;
import com.bumptech.glide.request.RequestOptions;



import static com.bumptech.glide.request.RequestOptions.bitmapTransform;
import static com.example.ienovo.glideexample.R.drawable.*;

public class MainActivity extends AppCompatActivity {
    ImageView image1,image2,image3,image4,image5;
    String[] url = { "http://homepages.cae.wisc.edu/~ece533/images/airplane.png",
            "http://homepages.cae.wisc.edu/~ece533/images/cat.png",
            "http://homepages.cae.wisc.edu/~ece533/images/fruits.png",
            "http://homepages.cae.wisc.edu/~ece533/images/girl.png",
            "http://homepages.cae.wisc.edu/~ece533/images/pool.png",
    };
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        image1 = (ImageView)findViewById(R.id.img);
        image2 = (ImageView)findViewById(R.id.img1);
        image3 = (ImageView)findViewById(R.id.img2);
        image4 = (ImageView)findViewById(R.id.img3);
        image5 = (ImageView)findViewById(R.id.img4);

        Glide.with(MainActivity.this)
                .load(url[0])
                .transition(DrawableTransitionOptions.withCrossFade(2000))
                .into(image1);

          image1.setOnClickListener(new View.OnClickListener() {
              @Override
              public void onClick(View v) {
                  Toast.makeText(MainActivity.this,"This is an Aeroplane",Toast.LENGTH_LONG).show();
              }
          });

        Glide.with(MainActivity.this)
                .load(url[1])
                .transition(DrawableTransitionOptions.withCrossFade(2000))
                .into(image2);

        image2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this,"This is a cat",Toast.LENGTH_LONG).show();
            }
        });

        Glide.with(MainActivity.this)
                .load(url[2])
                .transition(DrawableTransitionOptions.withCrossFade(2000))
                .into(image3);

        image3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this,"This is fruits",Toast.LENGTH_LONG).show();
            }
        });



        Glide.with(MainActivity.this)
                .load(url[3])
                .transition(DrawableTransitionOptions.withCrossFade(2000))
                .into(image4);

        image4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this,"This is girl",Toast.LENGTH_LONG).show();
            }
        });


        Glide.with(MainActivity.this)
                .load(url[4])
                .transition(DrawableTransitionOptions.withCrossFade(2000))
                .into(image5);

        image5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this,"This is a pool",Toast.LENGTH_LONG).show();
            }
        });





    }


}
