package com.juranoaa.eventbindingsample;

import android.app.Activity;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.Toast;

import org.androidannotations.annotations.EActivity;
import org.androidannotations.annotations.ItemSelect;
import org.androidannotations.annotations.ViewById;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by slhyv on 2015-11-26.
 */
@EActivity(R.layout.activity_item_select_sample)
public class AAItemSelectSampleActivity extends Activity {
    private ArrayAdapter<String> adapter = null;
    private List<String> items = null;

    @ViewById
    Spinner spinner;

    /** onCreate에서 setContentView(R.layout...)가
     * 늦게 일어나므로 adapter와 listView를 onCreate에 선언할 수 없다. */
    @Override
    protected void onStart() {
        super.onStart();

        initDataset();

        adapter = new ArrayAdapter<>(this, R.layout.list_row, R.id.textview_row_in_list, items);
        spinner.setAdapter(adapter);
    }

    private void initDataset() {
        //init dataset
        items = new ArrayList<>();
        items.add("Korea");
        items.add("USA");
        items.add("UK");
        items.add("China");
        items.add("Germany");
        items.add("Norway");
    }

    /** spinner에 대한 암시적 바인딩 */
    @ItemSelect
    public void spinnerItemSelected(boolean selected, int position) {
        Toast.makeText(this, "item selected: " + selected + ", position: "
                + position + ", text: " + items.get(position), Toast.LENGTH_SHORT).show();
    }
}
