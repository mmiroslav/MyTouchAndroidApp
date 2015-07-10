package com.example.mmilivojevic.mytouchapplication;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.text.TextPaint;
import android.util.AttributeSet;
import android.view.View;


/**
 * TODO: document your custom view class.
 */
public class MyView extends View {

    private Paint paint;

    public MyView(Context context) {
        super(context);
        this.paint = new Paint();
    }




    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);

        // TODO: consider storing these as member variables to reduce
        // allocations per draw cycle.
        int x = getWidth();
        int y = getHeight();
        int radius;
        radius = 170;
        this.paint.setStyle(Paint.Style.FILL);
        this.paint.setColor(Color.WHITE);
        canvas.drawPaint(paint);
        // Use Color.parseColor to define HTML colors
        this.paint.setColor(Color.parseColor("#CD5C5C"));
        canvas.drawCircle(x / 2, y / 2, radius, paint);
    }
}
