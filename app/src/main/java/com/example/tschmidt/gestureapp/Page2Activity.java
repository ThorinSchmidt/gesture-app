package com.example.tschmidt.gestureapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MotionEvent;

public class Page2Activity extends AppCompatActivity {

    float x1,x2,y1,y2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_page2);
    }

    @Override
    public boolean onTouchEvent(MotionEvent event) {
        switch (event.getAction()){
            case MotionEvent.ACTION_DOWN:
                x1 = event.getX();
                y1 = event.getY();
                break;
            case MotionEvent.ACTION_UP:
                x2 = event.getX();
                y2 = event.getY();
                if (x1 > x2){
                    Intent i = new Intent(Page2Activity.this, Page1Activity.class);
                    startActivity(i);
                    overridePendingTransition(R.anim.right_to_left_in, R.anim.right_to_left_out);
                }
                else{
                    Intent i = new Intent(Page2Activity.this, Page1Activity.class);
                    startActivity(i);
                    overridePendingTransition(R.anim.left_to_right_out, R.anim.left_to_right_in);
                }
                break;
        }
        return false;
    }
}
