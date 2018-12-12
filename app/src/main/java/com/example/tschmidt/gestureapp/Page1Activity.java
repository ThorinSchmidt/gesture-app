package com.example.tschmidt.gestureapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MotionEvent;

public class Page1Activity extends AppCompatActivity {

    float x1,x2,y1,y2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_page1);
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
                if (x1 < x2){
                    Intent i = new Intent(Page1Activity.this, Page2Activity.class);
                    startActivity(i);
                    overridePendingTransition(R.anim.left_to_right_out, R.anim.left_to_right_in);
                }
                else{
                    Intent i = new Intent(Page1Activity.this, Page2Activity.class);
                    startActivity(i);
                    overridePendingTransition(R.anim.right_to_left_in, R.anim.right_to_left_out);
                }
                break;
        }
        return false;
    }
}
