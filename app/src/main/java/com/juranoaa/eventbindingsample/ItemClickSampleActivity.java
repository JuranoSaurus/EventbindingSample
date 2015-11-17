package com.juranoaa.eventbindingsample;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by slhyv on 2015-11-17.
 */
public class ItemClickSampleActivity extends Activity {

    private ListView listView = null;
    private ArrayAdapter<String> adapter = null;
    private List<String> items = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_item_click_sample);

        initDataset();
        adapter = new ArrayAdapter<>(this, R.layout.list_row, R.id.textview_row_in_list, items);

        //init ui components
        listView = (ListView) findViewById(R.id.listView);
        listView.setAdapter(adapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(ItemClickSampleActivity.this, "clicked, item position: " + position +
                        ", text: " + items.get(position), Toast.LENGTH_SHORT).show();
            }
        });
        listView.setOnItemLongClickListener(new AdapterView.OnItemLongClickListener() {
            @Override
            public boolean onItemLongClick(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(ItemClickSampleActivity.this, "long clicked, item position: " + position +
                        ", text: " + items.get(position), Toast.LENGTH_SHORT).show();
                return true;
            }
        });
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
