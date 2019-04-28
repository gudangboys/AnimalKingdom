package com.croozer.animalkingdom;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;

public class AnimalActivity extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.list_view_holder);

        ArrayList<Names> namesArrayList = new ArrayList<>();

        namesArrayList.add(new Names("Aardvark", "Orycteropus Afer",
                R.drawable.aardvark, R.drawable.aardvark_location_map));
        namesArrayList.add(new Names("African Bush Elephant", "Loxodonta Africana Africana",
                R.drawable.african_bush_elephant, R.drawable.african_bush_elephant_location_map));
        namesArrayList.add(new Names("African Wild Dog", "Lycaon Pictus",
                R.drawable.african_wild_dog, R.drawable.african_wild_dog_location_map));
        namesArrayList.add(new Names("Anteater", "Myrmecophaga Tridactyla",
                R.drawable.ant_eater, R.drawable.anteater_location_map));
        namesArrayList.add(new Names("Screaming Hairy Armadillo", "Chaetophractus Vellerosus",
                R.drawable.screaming_hairy_armadillo, R.drawable.aardvark_location_map));
        namesArrayList.add(new Names("Crab Eating Macaque", "Macaca Fascicularis",
                R.drawable.crab_eating_macaque, R.drawable.crab_eating_macaque_location_map));
        namesArrayList.add(new Names("Dingo", "Canis Lupus Dingo", R.drawable.dingo,
                R.drawable.dingo_location_map));
        namesArrayList.add(new Names("Donkey", "Equus Asinus", R.drawable.donkey,
                R.drawable.donkey_location_map));
        namesArrayList.add(new Names("Olive Baboon", "Papio Anubis",
                R.drawable.baboon, R.drawable.baboon_location_map));

        NamesAdapter namesAdapter = new NamesAdapter(this, namesArrayList);

        ListView listView = findViewById(R.id.list);

        listView.setAdapter(namesAdapter);




    }
}
