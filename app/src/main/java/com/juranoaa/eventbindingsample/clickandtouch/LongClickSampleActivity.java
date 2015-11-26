package com.juranoaa.eventbindingsample.clickandtouch;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.juranoaa.eventbindingsample.R;

/**
 * Created by slhyv on 2015-11-17.
 */
public class LongClickSampleActivity extends Activity {

    private Button btnFirst = null;
    private Button btnLongFirst = null;
    private Button btnLongSecond = null;
    private Button btnLongThird = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_long_click_sample);

        //init ui components
        btnFirst = (Button) findViewById(R.id.btn_first);
        btnFirst.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                Toast.makeText(LongClickSampleActivity.this, "btn_first long clicked", Toast.LENGTH_SHORT).show();
                return true;
            }
        });
        btnLongFirst = (Button) findViewById(R.id.btn_long_first);
        btnLongFirst.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                Toast.makeText(LongClickSampleActivity.this, "btn_long_first long clicked", Toast.LENGTH_SHORT).show();
                return true;
            }
        });
        btnLongSecond = (Button) findViewById(R.id.btn_long_second);
        btnLongSecond.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                Toast.makeText(LongClickSampleActivity.this, "btn_long_second long clicked", Toast.LENGTH_SHORT).show();
                return true;
            }
        });
        btnLongThird = (Button) findViewById(R.id.btn_long_third);
        btnLongThird.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                Toast.makeText(LongClickSampleActivity.this, "btn_long_third long clicked", Toast.LENGTH_SHORT).show();
                return true;
            }
        });
    }
}
