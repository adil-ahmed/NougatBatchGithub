package com.teamflybd.nougatbatchgithub;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class ListviewActivity extends AppCompatActivity {
    ListView listview;
    ArrayList<String> peoples;
    ArrayList<String> countries;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_listview);

        listview = findViewById(R.id.listview);
        peoples = new ArrayList<String>();
        countries = new ArrayList<String>();

        peoples.add("Akil");
        peoples.add("Ahnaf");
        peoples.add("Emran");
        peoples.add("Ashik");
        peoples.add("Shan");
        peoples.add("Rafi");
        peoples.add("Rana");
        peoples.add("Zaman");
        peoples.add("Nadim");
        peoples.add("Fiz");
        peoples.add("Arif");
        peoples.add("Mahmud");
        peoples.add("Gazi");
        peoples.add("Khan");
        peoples.add("Nabil");


        countries.add("Bangladesh");
        countries.add("Pakistan");
        countries.add("India");
        countries.add("Chaina");
        countries.add("Argentina");
        countries.add("Brazil");
        countries.add("Germany");


        ListViewAdapter adapter = new ListViewAdapter(this,peoples,countries);

        listview.setAdapter(adapter);

        listview.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(ListviewActivity.this, "clicked on "+ peoples.get(position), Toast.LENGTH_SHORT).show();
            }
        });

    }
}
