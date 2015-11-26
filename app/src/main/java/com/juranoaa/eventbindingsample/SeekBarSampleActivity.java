package com.juranoaa.eventbindingsample;

import android.app.Activity;
import android.os.Bundle;
import android.widget.SeekBar;
import android.widget.Toast;

public class SeekBarSampleActivity extends Activity {
    private SeekBar seekBar = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_seek_bar_sample);

        seekBar = (SeekBar) findViewById(R.id.seek_bar);
        seekBar.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                Toast.makeText(SeekBarSampleActivity.this,
                        "onProgressChangeOnSeekBar() invoked. progess: " + progress + ", fromUser: " + fromUser,
                        Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {
                Toast.makeText(SeekBarSampleActivity.this,
                        "onTouchStartOnSeekBar() invoked.", Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {
                Toast.makeText(SeekBarSampleActivity.this,
                        "onTouchStopOnSeekBar() invoked.", Toast.LENGTH_SHORT).show();
            }
        });
    }
}
