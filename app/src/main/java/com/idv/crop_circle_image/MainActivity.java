package com.idv.crop_circle_image;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import de.hdodenhof.circleimageview.CircleImageView;

import static com.idv.crop_circle_image.R.drawable.sea;

public class MainActivity extends AppCompatActivity {
    private CircleImageView circleImageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        circleImageView=findViewById(R.id.circle_image_view);
        circleImageView.setImageDrawable(getDrawable(sea));
    }
}
