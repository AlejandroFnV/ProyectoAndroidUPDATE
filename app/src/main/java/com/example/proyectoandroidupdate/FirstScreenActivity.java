package com.example.proyectoandroidupdate;

import android.os.Bundle;

import com.google.android.material.navigation.NavigationView;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.fragment.app.FragmentManager;

import android.view.MenuItem;

public class FirstScreenActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first_screen);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FragmentManager fragmentManager = getSupportFragmentManager();
        fragmentManager.beginTransaction().replace(R.id.framelayout,new InvoiceFragment()).commit();

        DrawerLayout drawer = findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle toogle = new ActionBarDrawerToggle(this, drawer, toolbar,
                R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.addDrawerListener(toogle);
        toogle.syncState();

        //evento navigation
        NavigationView navigationView = findViewById(R.id.navigation);
        navigationView.setNavigationItemSelectedListener(new NavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {
                int id = menuItem.getItemId();
                FragmentManager fragmentManager = getSupportFragmentManager();

                /*switch (id){
                    case R.id.menu_facturas:
                        fragmentManager.beginTransaction().replace(R.id.framelayout,new InvoiceFragment()).commit();
                        break;
                    case R.id.menu_comandas:
                        fragmentManager.beginTransaction().replace(R.id.framelayout,new OrderFragment()).commit();
                        break;
                    default:
                        fragmentManager.beginTransaction().replace(R.id.framelayout,new InvoiceFragment()).commit();
                        break;
                }*/
                if (id == R.id.menu_facturas) {
                    fragmentManager.beginTransaction().replace(R.id.framelayout,new InvoiceFragment()).commit();
                } else if (id == R.id.menu_comandas) {
                    fragmentManager.beginTransaction().replace(R.id.framelayout,new OrderFragment()).commit();
                } else if (id == 0){
                    fragmentManager.beginTransaction().replace(R.id.framelayout,new InvoiceFragment()).commit();
                }

                DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
                drawer.closeDrawer(GravityCompat.START);
                return true;
            }
        }

    );}
}
