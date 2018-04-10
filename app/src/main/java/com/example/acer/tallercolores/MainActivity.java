package com.example.acer.tallercolores;
import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.ContextMenu;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.SeekBar;
import android.widget.TextView;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity implements SeekBar.OnSeekBarChangeListener {
    int seekR, seekB,seekG,seekA;
    SeekBar id_seekBarR,id_seekBarG,id_seekBarB,id_seekBarA;
    View viewColor;
    TextView seekNum1;
    TextView seekNum2;
    TextView seekNum3;
    TextView seekNum4;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        id_seekBarR=(SeekBar) findViewById(R.id.id_seekR);
        id_seekBarB=(SeekBar) findViewById(R.id.id_seekB);
        id_seekBarG=(SeekBar) findViewById(R.id.id_seekG);
        id_seekBarA=(SeekBar) findViewById(R.id.id_seekA);
        viewColor = (View) findViewById(R.id.view);
        seekNum1 = (TextView) findViewById(R.id.id_seekNum1);
        seekNum2 = (TextView) findViewById(R.id.id_seekNum2);
        seekNum3 = (TextView) findViewById(R.id.id_seekNum3);
        seekNum4 = (TextView) findViewById(R.id.id_seekNum4);

        id_seekBarR.setOnSeekBarChangeListener(this);
        id_seekBarB.setOnSeekBarChangeListener(this);
        id_seekBarG.setOnSeekBarChangeListener(this);
        id_seekBarA.setOnSeekBarChangeListener(this);
    }
    public void UpdateBackground(){

        seekR = id_seekBarR.getProgress();
        seekB = id_seekBarB.getProgress();
        seekG = id_seekBarG.getProgress();
        seekA = id_seekBarA.getProgress();

        int color = Color.argb(seekR,seekG,seekB,seekA);
        viewColor.setBackgroundColor(color);
    }
    @Override
    public void onProgressChanged(SeekBar seekBar, int i, boolean b) {

        int NumberR,NumberG,NumberB,NumberA;
        UpdateBackground();
        NumberR=id_seekBarR.getProgress();
        seekNum1.setText(String.valueOf(NumberR));
        NumberG=id_seekBarG.getProgress();
        seekNum2.setText(String.valueOf(NumberG));
        NumberB=id_seekBarB.getProgress();
        seekNum3.setText(String.valueOf(NumberB));
        NumberA=id_seekBarA.getProgress();
        seekNum4.setText(String.valueOf(NumberA));

    }

    @Override
    public void onStartTrackingTouch(SeekBar seekBar) {

    }

    @Override
    public void onStopTrackingTouch(SeekBar seekBar) {

    }

}
