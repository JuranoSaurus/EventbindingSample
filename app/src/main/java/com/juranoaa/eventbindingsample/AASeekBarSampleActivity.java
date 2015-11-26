package com.juranoaa.eventbindingsample;

import android.app.Activity;
import android.widget.SeekBar;
import android.widget.Toast;

import org.androidannotations.annotations.EActivity;
import org.androidannotations.annotations.SeekBarProgressChange;
import org.androidannotations.annotations.SeekBarTouchStart;
import org.androidannotations.annotations.SeekBarTouchStop;

@EActivity(R.layout.activity_seek_bar_sample)
public class AASeekBarSampleActivity extends Activity {

    /** 자동으로 메소드명 추론이 되지 않았다. */
    @SeekBarProgressChange(R.id.seek_bar)
    void onProgressChangeOnSeekBar(SeekBar seekBar, int progress, boolean fromUser) {
        Toast.makeText(AASeekBarSampleActivity.this,
                "onProgressChangeOnSeekBar() invoked. progess: " + progress + ", fromUser: " + fromUser,
                Toast.LENGTH_SHORT).show();
    }

    @SeekBarTouchStart(R.id.seek_bar)
    void onTouchStartOnSeekBar(SeekBar seekBar) {
        Toast.makeText(AASeekBarSampleActivity.this,
                "onTouchStartOnSeekBar() invoked.", Toast.LENGTH_SHORT).show();
    }

    @SeekBarTouchStop(R.id.seek_bar)
    void onTouchStopOnSeekBar(SeekBar seekBar) {
        Toast.makeText(AASeekBarSampleActivity.this,
                "onTouchStopOnSeekBar() invoked.", Toast.LENGTH_SHORT).show();
    }

}
