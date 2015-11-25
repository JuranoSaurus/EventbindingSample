package com.juranoaa.eventbindingsample;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by slhyv on 2015-11-26.
 */
public class ItemSelectSampleActivity extends Activity {
    private ArrayAdapter<String> adapter = null;
    private List<String> items = null;

    private Spinner spinner = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_item_select_sample);

        initDataset();
        adapter = new ArrayAdapter<>(this, R.layout.list_row, R.id.textview_row_in_list, items);

        spinner = (Spinner) findViewById(R.id.spinner);
        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(ItemSelectSampleActivity.this, "item selected, position: "
                        + position + ", text: " + items.get(position), Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {
                Toast.makeText(ItemSelectSampleActivity.this, "nothing selected", Toast.LENGTH_SHORT).show();
            }
        });
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
}
