package juranoaa.com.eventbindingsample;

import android.app.Activity;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import org.androidannotations.annotations.EActivity;
import org.androidannotations.annotations.LongClick;
import org.androidannotations.annotations.Touch;
import org.androidannotations.annotations.ViewById;

/**
 * Created by slhyv on 2015-11-16.
 */

@EActivity(R.layout.activity_touch_sample)
public class AATouchSampleActivity extends Activity {

    @ViewById
    TextView touchStatus;

    /** R.id.imageView와 암시적 바인딩 */
//    @Touch
//    void imageViewTouched() {
//        Toast.makeText(AATouchSampleActivity.this, "imageViewTouched() invoked", Toast.LENGTH_SHORT).show();
//    }

    /** R.id.imageView와 암시적 바인딩 + 파라미터 */
    @Touch
    void imageViewTouched(View view, MotionEvent e) {
        switch (e.getAction()){
            case MotionEvent.ACTION_DOWN:
                touchStatus.setText("imageViewTouched() ACTION_DOWN, x:" + e.getX() + ", y:" + e.getY());
                break;
            case MotionEvent.ACTION_MOVE:
                touchStatus.setText("imageViewTouched() ACTION_MOVE, x:" + e.getX() + ", y:" + e.getY());
                break;
            case MotionEvent.ACTION_UP:
                touchStatus.setText("imageViewTouched() ACTION_UP, x:" + e.getX() + ", y:" + e.getY());
                break;
        }
    }
}
