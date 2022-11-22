package com.marien.serviciostabs;

import android.os.Bundle;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;
import com.google.android.material.tabs.TabLayout;

import androidx.appcompat.widget.Toolbar;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;
import androidx.viewpager.widget.ViewPager;
import androidx.appcompat.app.AppCompatActivity;

import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.marien.serviciostabs.ui.main.PlaceholderFragment;
import com.marien.serviciostabs.ui.main.SectionsPagerAdapter;
import com.marien.serviciostabs.databinding.ActivityTabsBinding;

public class TabsActivity extends AppCompatActivity{
recoleccionDomiciliariaFragment domiciliario;
barridoLimpiezaFragment barrido;
corteCespedFragment cesped;
podaArbolesFragment podar;
seviciosEspecialesFragment especiales;
saneamientoFragment ambientales;


    private SectionsPagerAdapter mSectionsPagerAdapter;
    private ViewPager mViewPager;

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tabs);

        Toolbar toolbar = (Toolbar) findViewById (R.id.toolbar);
        setSupportActionBar(toolbar);

        mSectionsPagerAdapter = new SectionsPagerAdapter(getSupportFragmentManager());
        mViewPager =(ViewPager) findViewById(R.id.view_pager);
        mViewPager.setAdapter(mSectionsPagerAdapter);

        TabLayout tabLayout =(TabLayout) findViewById(R.id.tabs);
        tabLayout.setupWithViewPager(mViewPager);

        FloatingActionButton fab =(FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener((view) -> {
            Snackbar.make(view,"Replace with your own action",Snackbar.LENGTH_LONG)
                    .setAction("Action",null).show();
        });
    }
    public boolean onCreateOptionsMenu(Menu menu){
        getMenuInflater().inflate(R.menu.menu,menu);
        return true;
    }
    public boolean onOptionsItemSelected(MenuItem item){
        int id=item.getItemId();

        if (id == R.id.action_settings){
            return true;
        }
        return super.onOptionsItemSelected(item);
    }
    public static class PlaceholderFragment extends Fragment{
        private static final String ARG_SECTION_NUMBER ="section_number";
        public PlaceholderFragment(){
        }
        public static PlaceholderFragment newInstance(int sectionMumber){
            PlaceholderFragment fragment = new PlaceholderFragment();
            Bundle args = new Bundle();
            args.putInt(ARG_SECTION_NUMBER, sectionMumber);
            fragment.setArguments(args);
            return fragment;
        }
        public View onCreateView(LayoutInflater inflater, ViewGroup container,Bundle savedInstanceState){
            View rootView = inflater.inflate(R.layout.fragment_tabs, container, false);
            TextView textView =(TextView) rootView.findViewById(R.id.section_label);
            textView.setText("Hello world from section:(getArguments().getInt(ARG_SECTION_NUMBER)");
            return rootView;
        }
    }


    public class SectionsPagerAdapter extends FragmentPagerAdapter{
        public SectionsPagerAdapter (FragmentManager fm){super(fm);}


        public Fragment getItem(int position){
           // return PlaceholderFragment.newInstance(position +1);
            switch (position){
                case 0:
                    domiciliario=new recoleccionDomiciliariaFragment();
                    return domiciliario;
                case 1:
                    barrido =new barridoLimpiezaFragment();
                    return barrido;
                case 2:
                    cesped=new corteCespedFragment();
                    return cesped;
                case 3:
                    podar =new podaArbolesFragment();
                    return podar;
                case 4:
                    especiales=new seviciosEspecialesFragment();
                    return especiales;
                case 5:
                    ambientales=new saneamientoFragment();
                    return ambientales;

            }
            return null;
        }

        public CharSequence getPageTitle (int position){
            switch (position){
                case 0:
                    return  "Recoleccion Domiciliaria";
                case 1:
                    return  "Barrido y Limpieza";
                case 2:
                    return  "Corte de Cesped";
                case 3:
                    return  "Poda de Árboles";
                case 4:
                    return  "Servicios Especiales";
                case 5:
                    return  "Servicios Ambientales";
                default:
                     return null;
            }
        }
        public int getCount(){
            return 6;
        }
    }
}