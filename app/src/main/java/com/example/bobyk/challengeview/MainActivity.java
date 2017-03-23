package com.example.bobyk.challengeview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.example.bobyk.challengeview.adapters.MainAdapter;
import com.example.bobyk.challengeview.model.SectionModel;

import java.util.ArrayList;
import java.util.List;

import butterknife.Bind;
import butterknife.ButterKnife;

public class MainActivity extends AppCompatActivity {

    @Bind(R.id.main_rv)
    RecyclerView mainRV;

    private MainAdapter mainAdapter;
    private List<SectionModel> sections;
    private List<Integer> items;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
        initItems();
        init();
    }

    private void initItems() {
        SectionModel sectionModel1 = new SectionModel();
        sectionModel1.setLabel("First Section");
        items = new ArrayList<>();
        items.add(1);
        sectionModel1.setItems(items);
//        items.clear();

        SectionModel sectionModel2 = new SectionModel();
        sectionModel2.setLabel("Second Section");
        items = new ArrayList<>();
        items.add(2);
        items.add(3);
        items.add(4);
        sectionModel2.setItems(items);
//        items.clear();

        SectionModel sectionModel3 = new SectionModel();
        sectionModel3.setLabel("Third Section");
        items = new ArrayList<>();
        items.add(5);
        items.add(6);
        items.add(7);
        items.add(8);
        items.add(9);
        items.add(10);
        items.add(11);
        sectionModel3.setItems(items);
//        items.clear();

        SectionModel sectionModel4 = new SectionModel();
        sectionModel4.setLabel("Fourth Section");
        items = new ArrayList<>();
        items.add(12);
        items.add(13);
        items.add(14);
        items.add(15);
        items.add(16);
        items.add(17);
        items.add(18);
        items.add(19);
        items.add(20);
        items.add(21);
        sectionModel4.setItems(items);
//        items.clear();

        sections = new ArrayList<>();
        sections.add(sectionModel1);
        sections.add(sectionModel2);
        sections.add(sectionModel3);
        sections.add(sectionModel4);
    }

    private void init() {
        LinearLayoutManager layoutManager
                = new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false);
        mainRV.setLayoutManager(layoutManager);

        mainAdapter = new MainAdapter(this, sections);
        mainRV.setAdapter(mainAdapter);
    }
}
