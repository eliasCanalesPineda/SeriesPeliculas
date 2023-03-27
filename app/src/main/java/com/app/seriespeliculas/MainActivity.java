package com.app.seriespeliculas;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager2.widget.ViewPager2;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {


    ViewPager2 viewPager2;
    CachoAdapter adapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        viewPager2 = findViewById(R.id.vpr);

        adapter = new CachoAdapter(this);

        adapter.addFragment(MovieFragment.newInstance());
        adapter.addFragment(AnimeFragment.newInstance());
        adapter.addFragment(SerieFragment.newInstance());

        viewPager2.setAdapter(adapter);

    }
}