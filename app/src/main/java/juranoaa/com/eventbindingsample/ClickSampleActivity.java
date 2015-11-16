package juranoaa.com.eventbindingsample;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

/**
 * Created by slhyv on 2015-11-17.
 */
public class ClickSampleActivity extends Activity implements View.OnClickListener {

    private Button btnFirst = null;
    private Button btnSecond = null;
    private Button btnThird = null;
    private Button btnFourth = null;
    private Button btnFifth = null;
    private Button btnSixth = null;
    private Button btnSeventh = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_click_sample);

        //init ui components
        btnFirst = (Button) findViewById(R.id.btnFirst);
        btnFirst.setOnClickListener(this);
        btnSecond = (Button) findViewById(R.id.btnSecond);
        btnSecond.setOnClickListener(this);
        btnThird = (Button) findViewById(R.id.btn_third);
        btnThird.setOnClickListener(this);
        btnFourth = (Button) findViewById(R.id.btn_fourth);
        btnFourth.setOnClickListener(this);
        btnFifth = (Button) findViewById(R.id.btn_fifth);
        btnFifth.setOnClickListener(this);
        btnSixth = (Button) findViewById(R.id.btn_sixth);
        btnSixth.setOnClickListener(this);
        btnSeventh = (Button) findViewById(R.id.btn_seventh);
        btnSeventh.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.btnFirst:
                Toast.makeText(ClickSampleActivity.this, "Wow, btnFirst was clicked!", Toast.LENGTH_SHORT).show();
                break;
            case R.id.btnSecond:
                Toast.makeText(ClickSampleActivity.this, "Wow, btnSecond was clicked!", Toast.LENGTH_SHORT).show();
                break;
            case R.id.btn_third:
                Toast.makeText(ClickSampleActivity.this, "Wow, btn_third was clicked!", Toast.LENGTH_SHORT).show();
                break;
            case R.id.btn_fourth:
                Toast.makeText(ClickSampleActivity.this, "Wow, btn_fourth was clicked!", Toast.LENGTH_SHORT).show();
                break;
            case R.id.btn_fifth:
                String text = ((Button)v).getText().toString();
                Toast.makeText(ClickSampleActivity.this, "Wow, " + text + " was clicked!", Toast.LENGTH_SHORT).show();
                break;
            case R.id.btn_sixth:
                text = ((Button)v).getText().toString();
                Toast.makeText(ClickSampleActivity.this, "Wow, " + text + " was clicked!", Toast.LENGTH_SHORT).show();
                break;
            case R.id.btn_seventh:
                text = ((Button)v).getText().toString();
                Toast.makeText(ClickSampleActivity.this, "Wow, " + text + " was clicked!", Toast.LENGTH_SHORT).show();
                break;
        }
    }
}
