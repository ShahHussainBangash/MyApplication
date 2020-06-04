package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.GridView;
import android.os.Bundle;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {
    GridView gridView;

    String[] values = {
            "Shah hussain", "CSS3", "Android", "jQuery", "PHP", "MySpace",
            "HTML5", "Javascript", "MySQL", "Python", "Swift",
            "WordPress", "Facebook", "Youtube", "Twitter","Asad","rehan"
    } ;
    int[] images = {
            R.drawable.image1, R.drawable.image2, R.drawable.image1, R.drawable.image2,
            R.drawable.image1, R.drawable.image2, R.drawable.image1, R.drawable.image2,
            R.drawable.image1, R.drawable.image1, R.drawable.image1, R.drawable.image1,
            R.drawable.image1, R.drawable.image1, R.drawable.image1,R.drawable.image2,R.drawable.image2
    };
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        gridView = (GridView) findViewById(R.id.griview);

        GridAdapter gridAdapter = new GridAdapter(this, values, images);

        gridView.setAdapter(gridAdapter);
//        gridView.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Toast.makeText(getApplicationContext(),"Hello BUtton 1", Toast.LENGTH_SHORT).show();
//            }
//        });

    }
}
