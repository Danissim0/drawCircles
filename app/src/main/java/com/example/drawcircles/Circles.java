package com.example.drawcircles;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.View;

import androidx.annotation.Nullable;

import java.util.ArrayList;

public class Circles extends View {

    float x, y, r = 101;
    int j = 0;
    ArrayList<Float> listX = new ArrayList<>();
    ArrayList<Float> listY = new ArrayList<>();
    Paint p = new Paint();

    public Circles(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
        p.setColor(Color.BLUE);
        p.setStyle(Paint.Style.FILL);
    }

    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        for (int i = 0; i < listX.size(); i++){
            canvas.drawCircle(listX.get(i), listY.get(i), r, p);
        }
        invalidate();
        if (listX.size() > 5) {
            listX.remove(0);
            listY.remove(0);
        }
    }
}
