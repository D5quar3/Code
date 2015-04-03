package com.example.d5quar3.routes;

import android.app.Activity;
import java.util.ArrayList;
import java.util.List;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;

public class Routes extends Activity {
    DrawLine drawLine;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_routes);
        changeButtonColor();
        drawLine = new DrawLine(this, null, 0);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.routes, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();
        if (id == R.id.action_settings) {
            return true;
        }
        return super.onOptionsItemSelected(item);
    }

    public void getLocations() {
        final ImageView nodeOneObject   = (ImageView) findViewById(R.id.node1);
        final ImageView nodeTwoObject   = (ImageView) findViewById(R.id.node2);
        final ImageView nodeThreeObject = (ImageView) findViewById(R.id.node3);

        int nodeOneX = nodeOneObject.getLeft();
        drawLine.nodeLocationsX.add(nodeOneX);
        int nodeOneY = nodeOneObject.getTop();
        drawLine.nodeLocationsY.add(nodeOneY);

        int nodeTwoX = nodeTwoObject.getLeft();
        drawLine.nodeLocationsX.add(nodeTwoX);
        int nodeTwoY = nodeTwoObject.getTop();
        drawLine.nodeLocationsY.add(nodeTwoY);

        int nodeThreeX = nodeThreeObject.getLeft();
        drawLine.nodeLocationsX.add(nodeThreeX);
        int nodeThreeY = nodeThreeObject.getTop();
        drawLine.nodeLocationsY.add(nodeThreeY);
    }

    public void changeButtonColor() {
        final ImageView nodeOne = (ImageView) findViewById(R.id.node1);
        nodeOne.setClickable(true);
        nodeOne.setOnClickListener(new View.OnClickListener(){
           @Override
              public void onClick(View v) {
                  nodeOne.setImageResource(R.drawable.green);
              }
            });

        final ImageView nodeTwo = (ImageView) findViewById(R.id.node2);
        nodeTwo.setClickable(true);
        nodeTwo.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                nodeTwo.setImageResource(R.drawable.green);
            }
        });

        final ImageView nodeThree = (ImageView) findViewById(R.id.node3);
        nodeThree.setClickable(true);
        nodeThree.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                nodeThree.setImageResource(R.drawable.green);
            }
        });
    }
}
