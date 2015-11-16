package juranoaa.com.eventbindingsample;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

import org.androidannotations.annotations.Click;
import org.androidannotations.annotations.EActivity;

@EActivity(R.layout.activity_main)
public class AAMainActivity extends Activity {
    private Intent intent;

    @Click
    void btnClickSampleActivityCallClicked() {
        intent = new Intent(this, AAClickSampleActivity_.class);
        startActivity(intent);
    }

    @Click
    void btnLongClickSampleActivityCallClicked() {
        intent = new Intent(this, AALongClickSampleActivity_.class);
        startActivity(intent);
    }

    @Click
    void btnTouchSampleActivityCallClicked() {
        intent = new Intent(this, AATouchSampleActivity_.class);
        startActivity(intent);
    }

}
