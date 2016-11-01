package com.example.rm30966.menuapp;

import android.content.res.Configuration;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_canvas);

        imgRosto = (ImageView) findViewById(R.id.imgRosto);
        desenhar();
    }

    public void desenhar()
    {
        Paint pY = new Paint();
        pY.setColor(Color.YELLOW);

        Paint pB = new Paint();
        pB.setColor(Color.BLACK);

        Bitmap bmp = new Bitmap.createBitmap(100,100,Bitmap.Config.ARGB_8888);

        Canvas c = new Canvas(bmp);

        c.drawCircle(50,50,30,pY);
        c.drawLine(40,70,60,70, pB);

        c.drawCircle(40,40,5,pB);
        c.drawCircle(60,40,5,pB);
    }
}
