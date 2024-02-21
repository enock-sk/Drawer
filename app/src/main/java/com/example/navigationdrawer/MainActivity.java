package com.example.navigationdrawer;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;

import com.google.android.material.appbar.MaterialToolbar;
import com.google.android.material.navigation.NavigationView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        MaterialToolbar toolbar = findViewById(R.id.topAppBar);
        DrawerLayout drawerLayout = findViewById(R.id.drawer_layout);
        NavigationView navigationView=findViewById(R.id.navigation_view);
        toolbar.setNavigationOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                drawerLayout.openDrawer(GravityCompat.START);
            }
        });
        navigationView.setNavigationItemSelectedListener(new NavigationView.OnNavigationItemSelectedListener() {
            @SuppressLint("NonConstantResourceId")
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                int id= item.getItemId();
                drawerLayout.closeDrawer(GravityCompat.START);
                    if (id == R.id.nav_home) {
                        Toast.makeText(MainActivity.this, "Home is Clicked", Toast.LENGTH_SHORT).show();
                    } else if (id == R.id.nav_message) {
                        Toast.makeText(MainActivity.this, "Message is Clicked", Toast.LENGTH_SHORT).show();
                    } else if (id == R.id.nav_sync) {
                        Toast.makeText(MainActivity.this, "Sync is Clicked", Toast.LENGTH_SHORT).show();
                    } else if (id == R.id.nav_delete) {
                        Toast.makeText(MainActivity.this, "Delete is Clicked", Toast.LENGTH_SHORT).show();
                    } else if (id == R.id.nav_setting) {
                        Toast.makeText(MainActivity.this, "Setting is Clicked", Toast.LENGTH_SHORT).show();
                    } else if (id == R.id.nav_login) {
                        Toast.makeText(MainActivity.this, "Login is Clicked", Toast.LENGTH_SHORT).show();
                    } else if (id == R.id.nav_share) {
                        Toast.makeText(MainActivity.this, "Share is Clicked", Toast.LENGTH_SHORT).show();
                    } else if (id == R.id.nav_rate) {
                        Toast.makeText(MainActivity.this, "Rate us is Clicked", Toast.LENGTH_SHORT).show();
                    }
                        return true;
                    }
        }
        );

    }
}