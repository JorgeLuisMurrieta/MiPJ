package com.example.yourrem;

import android.os.Bundle;
import com.google.android.material.tabs.TabLayout;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;
import androidx.viewpager.widget.ViewPager;
import androidx.appcompat.app.AppCompatActivity;
import android.widget.TextView;

public class TabbeedActivity extends AppCompatActivity {
    TextView scrollingText;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tabbeed);

        scrollingText=(TextView)findViewById(R.id.scrollingText);
        scrollingText.setSelected(true);


        SectionsPagerAdapter sectionsPagerAdapter = new SectionsPagerAdapter(this, getSupportFragmentManager());
        ViewPager viewPager = findViewById(R.id.view_pager);
        viewPager.setAdapter(sectionsPagerAdapter);
        TabLayout tabs = findViewById(R.id.tabs);

        tabs.setupWithViewPager(viewPager);

        tabs.setupWithViewPager(viewPager);
        tabs.getTabAt(0).setIcon(R.drawable.lista);
        tabs.getTabAt(1).setIcon(R.drawable.bib);
        tabs.getTabAt(2).setIcon(R.drawable.cal);
    }

    public class SectionsPagerAdapter extends FragmentPagerAdapter {

        public SectionsPagerAdapter(TabbeedActivity tabbeedActivity, FragmentManager fm) {
            super(fm);
        }

        @Override
        public Fragment getItem(int i) {

            switch (i){

                default: return null;
                case 0:
                    Fragment_uno tab1= new Fragment_uno();
                    return tab1;
                case 1:
                    Fragment_dos tb2 = new Fragment_dos();
                    return  tb2;
                case 2:
                    Fragment_tres tb3 = new Fragment_tres();
                    return  tb3;
            }
        }
        @Override
        public int getCount() {
            return 3;
        }
        @Override
        public CharSequence getPageTitle(int i) {
            switch (i) {
                case 0:
                    return "Apuntes";
                case 1:
                    return "La Bíblia";
                case 2:
                    return "Calendario";
            }
            return null;
        }
    }
}