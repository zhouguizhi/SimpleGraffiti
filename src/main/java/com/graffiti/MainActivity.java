package com.graffiti;
import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    private Button btn_undo;
    private Button btn_do;
    private Button btn_red;
    private Button btn_blue;
    private Button btn_green;
    private Button btn_scral;
    private Button btn_eraser;
    private GraffitiView graffiti_view;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();
        initListener();
    }

    private void initListener() {
        btn_undo.setOnClickListener(this);
        btn_do.setOnClickListener(this);
        btn_red.setOnClickListener(this);
        btn_blue.setOnClickListener(this);
        btn_green.setOnClickListener(this);
        btn_scral.setOnClickListener(this);
        btn_eraser.setOnClickListener(this);
    }
    private void initView() {
        graffiti_view = (GraffitiView) findViewById(R.id.graffiti_view);
        btn_undo = (Button) findViewById(R.id.btn_undo);
        btn_do = (Button) findViewById(R.id.btn_do);
        btn_red = (Button) findViewById(R.id.btn_red);
        btn_blue = (Button) findViewById(R.id.btn_blue);
        btn_green = (Button) findViewById(R.id.btn_green);
        btn_scral = (Button) findViewById(R.id.btn_scral);
        btn_eraser = (Button) findViewById(R.id.btn_eraser);
    }
    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.btn_undo:
                graffiti_view.undo();
                return;
            case R.id.btn_do:
                graffiti_view.reundo();
                return;
            case R.id.btn_red:
                graffiti_view.resetPaintColor(Color.RED);
                return;
            case R.id.btn_green:
                graffiti_view.resetPaintColor(Color.GREEN);
                return;
            case R.id.btn_blue:
                graffiti_view.resetPaintColor(Color.BLUE);
                return;
            case R.id.btn_scral:
                graffiti_view. resetPaintWidth();
                break;
            case R.id.btn_eraser:
                graffiti_view.eraser();
                break;
        }
    }
}
