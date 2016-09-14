package com.example.cristianbaita.sampleminimalproject.activities;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.res.Configuration;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.cristianbaita.sampleminimalproject.R;
import com.example.cristianbaita.sampleminimalproject.fragments.AboutFragment;
import com.example.cristianbaita.sampleminimalproject.helper.ImageLoader;
import com.example.cristianbaita.sampleminimalproject.instagram.InstagramApp;

import java.util.HashMap;

public class HomepageActivity extends FragmentActivity implements NavigationView.OnNavigationItemSelectedListener{

    FragmentTransaction fragmentTransaction;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.homepage_layout);

        NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view_homepage);
        navigationView.setNavigationItemSelectedListener(this);
    }

    public boolean onNavigationItemSelected(MenuItem item) {
        int id = item.getItemId();

        if(id == R.id.nav_about)
        {
            System.out.println("MErge");
            AboutFragment aboutFragment = new AboutFragment();
        }

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout_homepage);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }
}
