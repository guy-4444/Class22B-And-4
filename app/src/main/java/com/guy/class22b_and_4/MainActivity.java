package com.guy.class22b_and_4;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;

import com.bumptech.glide.Glide;

public class MainActivity extends AppCompatActivity {

    private static final String LINK1 = "https://popmenucloud.com/cdn-cgi/image/width%3D3840%2Cheight%3D3840%2Cfit%3Dscale-down%2Cformat%3Dauto%2Cquality%3D60/kujhvwse/0b5a8372-9ace-4ed1-b74b-94197478996f.jpg";
    private static final String LINK2 = "https://veg-new.b-cdn.net/wp-content/uploads/dates-e1599424062845.jpg";
    private ImageView main_IMG_back1;
    private ImageView main_IMG_back2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        main_IMG_back1 = findViewById(R.id.main_IMG_back1);
        main_IMG_back2 = findViewById(R.id.main_IMG_back2);

        Glide
                .with(this)
                .load(LINK1)
                .placeholder(R.drawable.img_placeholder)
                .error(R.drawable.img_error)
                .into(main_IMG_back1);

        Glide
                .with(this)
                .load(LINK2)
                .placeholder(R.drawable.img_placeholder)
                .error(R.drawable.img_error)
                .into(main_IMG_back2);


        openCamera();
    }

    private void openCamera() {
        //
        //
        //
    }


}