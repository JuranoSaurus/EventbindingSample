package com.juranoaa.eventbindingsample.clickandtouch;

import android.app.Activity;
import android.widget.Toast;

import com.juranoaa.eventbindingsample.R;

import org.androidannotations.annotations.EActivity;
import org.androidannotations.annotations.LongClick;

/**
 * Created by slhyv on 2015-11-16.
 */

@EActivity(R.layout.activity_long_click_sample)
public class AALongClickSampleActivity extends Activity {

    /** 바인드하지 못함! 다른 액티비티에 R.id.btnFirst가 있기 때문 */
    @LongClick
    void btnFirst() {
        //UNREACHABLE CODE
        Toast.makeText(AALongClickSampleActivity.this, "btn_first long clicked", Toast.LENGTH_SHORT).show();
    }

    /** 명시적 바인딩 */
    @LongClick(R.id.btn_long_first)
    void btnLongFirst() {
        Toast.makeText(AALongClickSampleActivity.this, "btn_long_first long clicked", Toast.LENGTH_SHORT).show();
    }

    /** 암시적 바인딩 */
    @LongClick
    void btnLongSecond() {
        Toast.makeText(AALongClickSampleActivity.this, "btn_long_second long clicked", Toast.LENGTH_SHORT).show();
    }

    /** 암시적 바인딩 + 메소드 접미사 */
    @LongClick
    void btnLongThirdLongClicked() {
        Toast.makeText(AALongClickSampleActivity.this, "btn_long_third long clicked", Toast.LENGTH_SHORT).show();
    }

}
