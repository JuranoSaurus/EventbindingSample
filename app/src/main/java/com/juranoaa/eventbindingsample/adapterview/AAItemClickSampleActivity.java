package com.juranoaa.eventbindingsample.adapterview;

import android.app.Activity;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import com.juranoaa.eventbindingsample.R;

import org.androidannotations.annotations.EActivity;
import org.androidannotations.annotations.ItemClick;
import org.androidannotations.annotations.ItemLongClick;
import org.androidannotations.annotations.ViewById;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by slhyv on 2015-11-16.
 */

@EActivity(R.layout.activity_item_click_sample)
public class AAItemClickSampleActivity extends Activity {

    private ArrayAdapter<String> adapter = null;
    private List<String> items = null;

    @ViewById
    ListView listView;

    /** onCreate에서 setContentView(R.layout...)가
     * 늦게 일어나므로 adapter와 listView를 onCreate에 선언할 수 없다. */
    @Override
    protected void onStart() {
        super.onStart();

        initDataset();

        adapter = new ArrayAdapter<>(this, R.layout.list_row, R.id.textview_row_in_list, items);
        listView.setAdapter(adapter);
    }

    /** listView에 대한 암시적 바인딩 */
    @ItemClick
    public void listViewItemClicked(int position) {
        Toast.makeText(AAItemClickSampleActivity.this, "clicked, item position: " + position +
                        ", text: " + items.get(position), Toast.LENGTH_SHORT).show();
    }

    /** listView에 대한 암시적 바인딩 */
    @ItemLongClick
    public void listViewItemLongClicked(int position) {
        Toast.makeText(AAItemClickSampleActivity.this, "long clicked, item position: " + position +
                ", text: " + items.get(position), Toast.LENGTH_SHORT).show();
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
        items.add("Sweden");
        items.add("Argentina");
        items.add("Brazil");
        items.add("Austria");
        items.add("Japan");
        items.add("Nigeria");
    }
}
