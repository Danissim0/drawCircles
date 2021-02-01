package com.example.drawcircles;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Circles circles = new Circles(this, null);
        circles.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                Circles c = (Circles) v;
                c.listX.add(event.getX());
                c.listY.add(event.getY());
                return false;
            }
        });
        setContentView(circles);
    }
}