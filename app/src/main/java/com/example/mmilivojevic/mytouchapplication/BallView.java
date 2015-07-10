package com.example.mmilivojevic.mytouchapplication;

import android.annotation.TargetApi;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.os.Build;
import android.util.AttributeSet;
import android.widget.ImageView;

/**
 * Created by mmilivojevic on 7/10/15.
 */
public class BallView extends ImageView {

    private Paint paint;
    float x = 500;
    float y = 500;

    private void initalizer() {
        this.paint = new Paint();
    }

    public BallView(Context context) {
        super(context);
        this.initalizer();
    }

    public BallView(Context context, AttributeSet attrs) {
        super(context, attrs);
        this.initalizer();
    }

    public BallView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        this.initalizer();
    }

    @TargetApi(Build.VERSION_CODES.LOLLIPOP)
    public BallView(Context context, AttributeSet attrs, int defStyleAttr, int defStyleRes) {
        super(context, attrs, defStyleAttr, defStyleRes);
        this.initalizer();
    }

    @Override
    protected void onDraw(Canvas canvas) {

        canvas.drawCircle(this.x, this.y, 150, paint);

        super.onDraw(canvas);
    }


    public void updateBallCenter(float x, float y) {
        this.x = x;
        this.y = y;
        invalidate();
    }
}
