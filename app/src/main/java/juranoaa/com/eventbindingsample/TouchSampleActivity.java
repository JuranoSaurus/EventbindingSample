package juranoaa.com.eventbindingsample;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by slhyv on 2015-11-17.
 */
public class TouchSampleActivity extends Activity {

    private TextView touchStatus = null;
    private ImageView imageView = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_touch_sample);

        //init ui components
        touchStatus = (TextView) findViewById(R.id.touch_status);

        imageView = (ImageView) findViewById(R.id.imageView);
        imageView.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                Log.v("TAG", "onTouch() invoked");
                switch (event.getAction()){
                    case MotionEvent.ACTION_DOWN:
                        touchStatus.setText("imageViewTouched() ACTION_DOWN, x:" + event.getX() + ", y:" + event.getY());
                        break;
                    case MotionEvent.ACTION_MOVE:
                        touchStatus.setText("imageViewTouched() ACTION_MOVE, x:" + event.getX() + ", y:" + event.getY());
                        break;
                    case MotionEvent.ACTION_UP:
                        touchStatus.setText("imageViewTouched() ACTION_UP, x:" + event.getX() + ", y:" + event.getY());
                        break;
                }
                return false;
            }
        });
    }
}
