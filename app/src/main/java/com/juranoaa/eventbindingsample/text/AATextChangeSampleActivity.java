package com.juranoaa.eventbindingsample.text;

import android.app.Activity;
import android.text.Editable;
import android.util.Log;
import android.widget.TextView;
import android.widget.Toast;

import com.juranoaa.eventbindingsample.R;

import org.androidannotations.annotations.AfterTextChange;
import org.androidannotations.annotations.BeforeTextChange;
import org.androidannotations.annotations.Click;
import org.androidannotations.annotations.EActivity;
import org.androidannotations.annotations.TextChange;
import org.androidannotations.annotations.ViewById;

@EActivity(R.layout.activity_text_change_sample)
public class AATextChangeSampleActivity extends Activity {

    @ViewById
    TextView textView;

    @Override
    protected void onStart() {
        super.onStart();
    }

    /**
     * textViewTextChanged
     * @param text 수정된 텍스트
     * @param textView
     * @param before 수정 전의 텍스트 길이 //TODO: 이거 이상한데 ...
     * @param start 수정된 텍스트의 시작 위치
     * @param count 수정된 텍스트의 길이 //TODO: 이거 이상한데 ...
     */
    @TextChange
    void textViewTextChanged(CharSequence text, TextView textView, int before, int start, int count) {
        Toast.makeText(AATextChangeSampleActivity.this,
                "textViewTextChanged() invoked. text: " + text + ", before: " + before + ", start:" + start + ", count: " + count
                , Toast.LENGTH_SHORT).show();
        Log.d("TAG", "textViewTextChanged() invoked. text: " + text + ", before: " + before + ", start:" + start + ", count: " + count);
    }

    /**
     * textViewBeforeTextChanged
     * @param textView
     * @param text 수정 전의 텍스트
     * @param start 수정된 텍스트의 시작 위치
     * @param count 수정된 텍스트의 문자 수
     * @param after 수정 이후의 텍스트 길이 //TODO: 이거 이상한데 ...
     */
    @BeforeTextChange
    void textViewBeforeTextChanged(TextView textView, CharSequence text, int start, int count, int after) {
        Toast.makeText(AATextChangeSampleActivity.this,
                "textViewBeforeTextChanged() invoked. text: " + text + ", start:" + start
                        + ", count: " + count + ", after:" + after
                , Toast.LENGTH_SHORT).show();
        Log.d("TAG", "textViewBeforeTextChanged() invoked. text: " + text + ", start:" + start
                + ", count: " + count + ", after:" + after);
    }

    @AfterTextChange
    void textViewAfterTextChanged(Editable editable, TextView textView) {
        Toast.makeText(AATextChangeSampleActivity.this,
                "textViewAfterTextChanged() invoked. editable: " + editable
                , Toast.LENGTH_SHORT).show();
        Log.d("TAG", "textViewAfterTextChanged() invoked. editable: " + editable);
    }

    @Click
    void btnTextChangeClicked() {
        textView.setText("Hello text changed");
    }

    @Click
    void btnTextAppendClicked() {
        textView.append(" added");
    }
}
