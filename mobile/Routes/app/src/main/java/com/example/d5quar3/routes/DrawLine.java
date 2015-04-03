package com.example.d5quar3.routes;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import java.util.ArrayList;
import java.util.List;

public class DrawLine extends View {
    Paint paint = new Paint();
    Routes routes = new Routes();
    List<Integer> nodeLocationsX = new ArrayList<Integer>();
    List<Integer> nodeLocationsY = new ArrayList<Integer>();
    public DrawLine(Context context, AttributeSet attrs, int defStyle) {
        super(context, attrs, defStyle);
    }
    public DrawLine(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public DrawLine(Context context) {
        super(context);
    }

    @Override
    public void onDraw(Canvas canvas) {
        routes.getLocations();
        for(int i = 0; i < nodeLocationsX.size() - 1; i++) {
            for(int z = i + 1; z < nodeLocationsX.size(); z++) {
                paint.setColor(Color.BLACK);
                paint.setStrokeWidth(5);
                canvas.drawLine(nodeLocationsX.get(i), nodeLocationsY.get(i), nodeLocationsX.get(z), nodeLocationsY.get(z), paint);
            }
        }

    }
}
