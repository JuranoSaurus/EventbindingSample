package juranoaa.com.eventbindingsample;

import android.app.Activity;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import org.androidannotations.annotations.Click;
import org.androidannotations.annotations.EActivity;

@EActivity(R.layout.activity_click_sample)
public class AAClickSampleActivity extends Activity {

    /** 기본: layout id를 이용한 수동 바인딩 */
    @Click(R.id.btnFirst)
    void btnFirst() {
        Toast.makeText(AAClickSampleActivity.this, "Wow, btnFirst was clicked!", Toast.LENGTH_SHORT).show();
    }

    /** R.id.btnSecond에 함수명으로 자동 바인딩 */
    @Click
    void btnSecond() {
        Toast.makeText(AAClickSampleActivity.this, "Wow, btnSecond was clicked!", Toast.LENGTH_SHORT).show();
    }

    /** R.id.btn_third인 snake_case 표기가 btnThird() camelCase 함수명으로 자동 바인딩 */
    @Click
    void btnThird() {
        Toast.makeText(AAClickSampleActivity.this, "Wow, btn_third was clicked!", Toast.LENGTH_SHORT).show();
    }

    /** 메소드 명으로 버튼 이름 뒤에 Clicked 접미사를 붙여도 자동 바인딩 */
    @Click
    void btnFourthClicked() {
        Toast.makeText(AAClickSampleActivity.this, "Wow, btn_fourth was clicked!", Toast.LENGTH_SHORT).show();
    }

    /** 파라미터로 해당 view 받아오기 */
    @Click
    void btnFifthClicked(View clickedView) {
        String text = ((Button)clickedView).getText().toString();
        Toast.makeText(AAClickSampleActivity.this, "Wow, " + text + " was clicked!", Toast.LENGTH_SHORT).show();
    }

    /** 뷰 그룹을 이용하여 여러 버튼을 눌렀을 때 핸들링 */
    @Click({R.id.btn_sixth, R.id.btn_seventh})
    void btnSixthOrSeventhClicked(View clickedView) {
        String text = ((Button)clickedView).getText().toString();
        Toast.makeText(AAClickSampleActivity.this, "Wow, " + text + " was clicked!", Toast.LENGTH_SHORT).show();
    }
}
























