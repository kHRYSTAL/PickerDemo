package me.khrystal.activities;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import me.khrystal.R;
import me.khrystal.widget.WheelPopWindow;


public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private Button mButton;
    private WheelPopWindow popWindow;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mButton = (Button)findViewById(R.id.btn);
        mButton.setOnClickListener(this);
        List<String> data = new ArrayList<>();
        for (int i = 0; i < 100; i++) {
            data.add(""+i);
        }
        popWindow = new WheelPopWindow(this,data);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.btn:
                Toast.makeText(this,"Click",Toast.LENGTH_SHORT).show();
                popWindow.showAtLocation(v, Gravity.BOTTOM, 0, 0);
                break;
        }
    }
}
