package com.melofaai.builder.activities;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.fab.FloatingActionButton;
import androidx.fragment.app.Fragment;
import com.melofaai.builder.R;
import com.melofaai.builder.fragments.BuilderFragment;
import com.melofaai.builder.fragments.TemplatesFragment;
import com.melofaai.builder.fragments.SettingsFragment;

public class MainActivity extends AppCompatActivity {

    private BottomNavigationView bottomNav;
    private FloatingActionButton fabAddWebsite;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        bottomNav = findViewById(R.id.bottom_nav);
        fabAddWebsite = findViewById(R.id.fab_add_website);

        // Set default fragment
        if (savedInstanceState == null) {
            getSupportFragmentManager().beginTransaction()
                    .replace(R.id.container, new BuilderFragment())
                    .commit();
        }

        // Bottom navigation listener
        bottomNav.setOnItemSelectedListener(item -> {
            Fragment selectedFragment = null;
            
            if (item.getItemId() == R.id.nav_builder) {
                selectedFragment = new BuilderFragment();
            } else if (item.getItemId() == R.id.nav_templates) {
                selectedFragment = new TemplatesFragment();
            } else if (item.getItemId() == R.id.nav_settings) {
                selectedFragment = new SettingsFragment();
            }

            if (selectedFragment != null) {
                getSupportFragmentManager().beginTransaction()
                        .replace(R.id.container, selectedFragment)
                        .commit();
            }
            return true;
        });

        // FAB click listener
        fabAddWebsite.setOnClickListener(v -> {
            // Open new website dialog
        });
    }
}
