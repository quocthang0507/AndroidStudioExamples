package com.example.helloconstraint;

import android.content.res.ColorStateList;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    private int mCount = 0;
    private TextView mShowCount;
    private Button buttonCount, buttonZero;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mShowCount = findViewById(R.id.show_count);
        buttonCount = findViewById(R.id.button_count);
        buttonZero = findViewById(R.id.button_zero);
    }

    public void showToast(View view) {
        Toast toast = Toast.makeText(this, R.string.toast_message,
                Toast.LENGTH_SHORT);
        toast.show();
    }

    public void countUp(View view) {
        mCount++;
        mShowCount.setText(Integer.toString(mCount));
        if (mCount % 2 == 0) {
            buttonCount.setBackgroundTintList(ColorStateList.valueOf(getResources().getColor(R.color.gray)));
        } else {
            buttonCount.setBackgroundTintList(ColorStateList.valueOf(getResources().getColor(R.color.pink)));
        }
        buttonZero.setBackgroundTintList(ColorStateList.valueOf(getResources().getColor(R.color.pink)));
    }

    public void reset(View view) {
        mCount = 0;
        mShowCount.setText(Integer.toString(mCount));
        buttonZero.setBackgroundTintList(ColorStateList.valueOf(getResources().getColor(R.color.gray)));
    }
}