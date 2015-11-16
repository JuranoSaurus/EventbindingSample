package juranoaa.com.eventbindingsample;

import android.app.Activity;
import android.content.Intent;

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

}
