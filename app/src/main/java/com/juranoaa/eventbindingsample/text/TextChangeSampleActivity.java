package com.juranoaa.eventbindingsample.text;

import android.app.Activity;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.SeekBar;
import android.widget.TextView;
import android.widget.Toast;

import com.juranoaa.eventbindingsample.R;

import org.androidannotations.annotations.AfterTextChange;
import org.androidannotations.annotations.BeforeTextChange;
import org.androidannotations.annotations.Click;
import org.androidannotations.annotations.TextChange;
import org.androidannotations.annotations.ViewById;

public class TextChangeSampleActivity extends Activity {
    private TextView textView = null;
    private Button btnTextChange = null;
    private Button btnTextAppend = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_text_change_sample);

        btnTextChange = (Button) findViewById(R.id.btn_text_change);
        btnTextChange.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textView.setText("Hello text changed");
            }
        });
        btnTextAppend = (Button) findViewById(R.id.btn_text_append);
        btnTextAppend.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textView.append(" added");
            }
        });

        textView = (TextView) findViewById(R.id.text_view);
        textView.addTextChangedListener(new TextWatcher() {

            //TODO: 주석 작성하기
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {
                Toast.makeText(TextChangeSampleActivity.this,
                        "textViewBeforeTextChanged() invoked. text: " + s + ", start:" + start
                                + ", count: " + count + ", after:" + after
                        , Toast.LENGTH_SHORT).show();
                Log.d("TAG", "textViewBeforeTextChanged() invoked. text: " + s + ", start:" + start
                        + ", count: " + count + ", after:" + after);
            }

            //TODO: 주석 작성하기
            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                Toast.makeText(TextChangeSampleActivity.this,
                        "textViewTextChanged() invoked. text: " + s + ", before: " + before + ", start:" + start + ", count: " + count
                        , Toast.LENGTH_SHORT).show();
                Log.d("TAG", "textViewTextChanged() invoked. text: " + s + ", before: " + before + ", start:" + start + ", count: " + count);
            }

            //TODO: 주석 작성하기
            @Override
            public void afterTextChanged(Editable s) {
                Toast.makeText(TextChangeSampleActivity.this,
                        "textViewAfterTextChanged() invoked. editable: " + s
                        , Toast.LENGTH_SHORT).show();
                Log.d("TAG", "textViewAfterTextChanged() invoked. editable: " + s);
            }
        });
    }

}
