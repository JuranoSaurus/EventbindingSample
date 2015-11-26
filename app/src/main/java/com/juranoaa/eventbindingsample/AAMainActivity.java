package com.juranoaa.eventbindingsample;

import android.app.Activity;
import android.content.Intent;

import com.juranoaa.eventbindingsample.adapterview.AAItemClickSampleActivity_;
import com.juranoaa.eventbindingsample.adapterview.AAItemSelectSampleActivity_;
import com.juranoaa.eventbindingsample.adapterview.ItemClickSampleActivity;
import com.juranoaa.eventbindingsample.adapterview.ItemSelectSampleActivity;
import com.juranoaa.eventbindingsample.clickandtouch.AAClickSampleActivity_;
import com.juranoaa.eventbindingsample.clickandtouch.AALongClickSampleActivity_;
import com.juranoaa.eventbindingsample.clickandtouch.AATouchSampleActivity_;
import com.juranoaa.eventbindingsample.clickandtouch.ClickSampleActivity;
import com.juranoaa.eventbindingsample.clickandtouch.LongClickSampleActivity;
import com.juranoaa.eventbindingsample.clickandtouch.TouchSampleActivity;
import com.juranoaa.eventbindingsample.seekbar.AASeekBarSampleActivity_;
import com.juranoaa.eventbindingsample.seekbar.SeekBarSampleActivity;
import com.juranoaa.eventbindingsample.text.AATextChangeSampleActivity_;
import com.juranoaa.eventbindingsample.text.TextChangeSampleActivity;

import org.androidannotations.annotations.Click;
import org.androidannotations.annotations.EActivity;

@EActivity(R.layout.activity_main)
public class AAMainActivity extends Activity {
    private Intent intent;

    @Click(R.id.btn_aa_click_sample_activity_call)
    void btnAAClickSampleActivityCallClicked() {
        intent = new Intent(this, AAClickSampleActivity_.class);
        startActivity(intent);
    }

    @Click
    void btnClickSampleActivityCallClicked() {
        intent = new Intent(this, ClickSampleActivity.class);
        startActivity(intent);
    }

    @Click(R.id.btn_aa_long_click_sample_activity_call)
    void btnAALongClickSampleActivityCallClicked() {
        intent = new Intent(this, AALongClickSampleActivity_.class);
        startActivity(intent);
    }

    @Click
    void btnLongClickSampleActivityCallClicked() {
        intent = new Intent(this, LongClickSampleActivity.class);
        startActivity(intent);
    }

    @Click(R.id.btn_aa_touch_sample_activity_call)
    void btnAATouchSampleActivityCallClicked() {
        intent = new Intent(this, AATouchSampleActivity_.class);
        startActivity(intent);
    }

    @Click
    void btnTouchSampleActivityCallClicked() {
        intent = new Intent(this, TouchSampleActivity.class);
        startActivity(intent);
    }

    @Click(R.id.btn_aa_item_click_sample_activity_call)
    void btnAAItemClickSampleActivityCallClicked() {
        intent = new Intent(this, AAItemClickSampleActivity_.class);
        startActivity(intent);
    }

    @Click
    void btnItemClickSampleActivityCallClicked() {
        intent = new Intent(this, ItemClickSampleActivity.class);
        startActivity(intent);
    }

    @Click(R.id.btn_aa_item_select_sample_activity_call)
    void btnAAItemSelectSampleActivityCallClicked() {
        intent = new Intent(this, AAItemSelectSampleActivity_.class);
        startActivity(intent);
    }

    @Click
    void btnItemSelectSampleActivityCallClicked() {
        intent = new Intent(this, ItemSelectSampleActivity.class);
        startActivity(intent);
    }

    @Click(R.id.btn_aa_seek_bar_sample_activity_call)
    void btnAASeekBarSampleActivityCallClicked() {
        intent = new Intent(this, AASeekBarSampleActivity_.class);
        startActivity(intent);
    }

    @Click
    void btnSeekBarSampleActivityCallClicked() {
        intent = new Intent(this, SeekBarSampleActivity.class);
        startActivity(intent);
    }

    @Click(R.id.btn_aa_text_change_sample_activity_call)
    void btnAATextChangeSampleActivityCallClicked() {
        intent = new Intent(this, AATextChangeSampleActivity_.class);
        startActivity(intent);
    }

    @Click
    void btnTextChangeSampleActivityCallClicked() {
        intent = new Intent(this, TextChangeSampleActivity.class);
        startActivity(intent);
    }

}
