package com.marien.serviciostabs;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.Menu;
import androidx.appcompat.widget.Toolbar;
import android.view.View;


import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;
import com.google.android.material.navigation.NavigationView;


import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.core.view.GravityCompat;
import androidx.fragment.app.FragmentManager;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.appcompat.app.AppCompatActivity;


public class MenuActivity extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener{
    public static int opcion;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);

        Toolbar toolbar=(Toolbar)findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        //Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        //setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener((view) -> {
            Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                    .setAction("Action", null).show();
        });

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(this, drawer, toolbar, R.string.navigation_drawer_open,R.string.navigation_drawer_close);
        drawer.setDrawerListener(toggle);
        toggle.syncState();
        // drawer.setOnClickListener((View.OnClickListener) toggle);
        //toggle.syncState();

        NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);

        FragmentManager fm=getSupportFragmentManager();
        switch (opcion){
            case 1: fm.beginTransaction().replace(R.id.escenario,new recoleccionDomiciliariaFragment()).commit();break;
            case 2: fm.beginTransaction().replace(R.id.escenario,new barridoLimpiezaFragment()).commit();break;
            case 3: fm.beginTransaction().replace(R.id.escenario,new corteCespedFragment()).commit();break;
            case 4: fm.beginTransaction().replace(R.id.escenario,new podaArbolesFragment()).commit();break;
            case 5: fm.beginTransaction().replace(R.id.escenario,new seviciosEspecialesFragment()).commit();break;
            case 6: fm.beginTransaction().replace(R.id.escenario,new saneamientoFragment()).commit();break;
            default:fm.beginTransaction().replace(R.id.escenario,new recoleccionDomiciliariaFragment()).commit();break;

        }
    }

    public void onBackPressed(){
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        if (drawer.isDrawerOpen(GravityCompat.START)){
            drawer.closeDrawer(GravityCompat.START);
        }else{
            super.onBackPressed();
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu, menu);
        return true;
    }
    public boolean onOptionsItemSelected(MenuItem item){
        int id = item.getItemId();
        if (id ==R.id.action_settings){
            return true;
        }
        return super.onOptionsItemSelected(item);
    }

    @SuppressWarnings("StatementWithEmptyBody")
    @Override
    public boolean onNavigationItemSelected(MenuItem item) {
        FragmentManager fm = getSupportFragmentManager();
        int id = item.getItemId();

        if (id == R.id.nav_camera){
            fm.beginTransaction().replace(R.id.escenario,new recoleccionDomiciliariaFragment()).commit();
        } else if (id == R.id.nav_gallery){
            fm.beginTransaction().replace(R.id.escenario,new barridoLimpiezaFragment()).commit();

        }else if (id == R.id.nav_slideshow){
            fm.beginTransaction().replace(R.id.escenario,new corteCespedFragment()).commit();

        }else if (id == R.id.nav_manage){
            fm.beginTransaction().replace(R.id.escenario,new podaArbolesFragment()).commit();

        }else if (id == R.id.nav_slideshow){
            fm.beginTransaction().replace(R.id.escenario,new seviciosEspecialesFragment()).commit();

        }else if (id == R.id.nav_gallery){
            fm.beginTransaction().replace(R.id.escenario,new saneamientoFragment()).commit();
        } else if (id == R.id.nav_share){
            Intent intencion = new Intent(getApplicationContext(),TabsActivity.class);
            startActivity(intencion);
        }
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }

}