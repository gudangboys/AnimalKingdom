package com.croozer.animalkingdom;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;

public class BirdActivity extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.list_view_holder);

        ArrayList<Names> namesArrayList = new ArrayList<>();

        namesArrayList.add(new Names("Adelie Penguin", "Pygoscelis adeliae", R.drawable.adelie_penguin,
                R.drawable.adelie_penguin_location_map));
        namesArrayList.add(new Names("Albatross", "Diomedeidae", R.drawable.albatross,
                R.drawable.albatross_location_map));
        namesArrayList.add(new Names("Barn Owl", "Tyto Alba", R.drawable.barn_owl,
                R.drawable.barn_owl_location_map));
        namesArrayList.add(new Names("Canada Goose", "Branta Canadensis",
                R.drawable.canada_goose, R.drawable.chicken_location_map));
        namesArrayList.add(new Names("Chicken", "Gallus Gallus",
                R.drawable.chicken, R.drawable.chicken_location_map));
        namesArrayList.add(new Names("Common Buzzard", "Buteo Buteo",
                R.drawable.buzzard, R.drawable.common_buzzard_location_map));
        namesArrayList.add(new Names("Frigate Bird", "Fregatidae",
                R.drawable.frigate_bird, R.drawable.frigatebird_location_map));
        namesArrayList.add(new Names("Falcon", "Falco Peregrinus", R.drawable.peregrine_falcon,
                R.drawable.falcon_location_map));
        namesArrayList.add(new Names("Flamingo", "Phoenicopteridae",
                R.drawable.flamingo, R.drawable.chicken_location_map));
        namesArrayList.add(new Names("Golden Oriole", "Oriolus Oriolus",
                R.drawable.golden_oriole, R.drawable.golden_oriole_location_map));
        namesArrayList.add(new Names("Guineafowl", "Numididae",
                R.drawable.guineafowl, R.drawable.chicken_location_map));
        namesArrayList.add(new Names("Great Blue Heron", "Ardea Herodias",
                R.drawable.great_blue_heron, R.drawable.chicken_location_map));

        NamesAdapter namesAdapter = new NamesAdapter(this, namesArrayList);

        ListView listView = findViewById(R.id.list);

        listView.setAdapter(namesAdapter);


    }
}
