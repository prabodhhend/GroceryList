package org.gl.activity;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.design.widget.NavigationView;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import org.gl.R;
import org.gl.fragment.MainFragment;

/**
 * Created by ADMIN on 5/18/2017.
 */

public class MainActivity extends AppCompatActivity {

    private DrawerLayout drawerLayout;
    private Toolbar toolbar;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        toolbar = (Toolbar) findViewById(R.id.toolbar);
        //setSupportActionBar(toolbar);
        initNavigationDrawer();
    }


    public void initNavigationDrawer() {

        NavigationView navigationView = (NavigationView)findViewById(R.id.navigation_view);

        navigationView.setNavigationItemSelectedListener(new NavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(MenuItem menuItem) {
                Fragment newFragment;
                FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
                int id = menuItem.getItemId();
                switch (id){
                    case R.id.home:
                        newFragment = new MainFragment();
                        transaction.replace(R.id.fragment_main, newFragment);
                        transaction.addToBackStack(null);
                        transaction.commit();
                        break;
                    case R.id.settings:
                        Toast.makeText(getApplicationContext(),"Settings",Toast.LENGTH_SHORT).show();
                        break;
                    case R.id.about_us:
                        Toast.makeText(getApplicationContext(),"about_us",Toast.LENGTH_SHORT).show();
                        break;
                    case R.id.profile:
                        Toast.makeText(getApplicationContext(),"profile",Toast.LENGTH_SHORT).show();
                        break;
                    case R.id.privacy_policy:
                        Toast.makeText(getApplicationContext(),"privacy_policy",Toast.LENGTH_SHORT).show();
                        break;
                    case R.id.logout:
                        finish();
                    case R.id.my_list:
                        Toast.makeText(getApplicationContext(),"my_list",Toast.LENGTH_SHORT).show();
                        break;

                }
                drawerLayout.closeDrawers();
                return true;
            }
        });
        View header = navigationView.getHeaderView(0);
        TextView tv_email = (TextView)header.findViewById(R.id.tv_email);
        tv_email.setText("raj.amalw@learn2crack.com");
        drawerLayout = (DrawerLayout)findViewById(R.id.drawer);

        ActionBarDrawerToggle actionBarDrawerToggle = new ActionBarDrawerToggle(this,drawerLayout,toolbar,R.string.drawer_open,R.string.drawer_close){

            @Override
            public void onDrawerClosed(View v){
                super.onDrawerClosed(v);
            }

            @Override
            public void onDrawerOpened(View v) {
                super.onDrawerOpened(v);
            }
        };
        drawerLayout.addDrawerListener(actionBarDrawerToggle);
        actionBarDrawerToggle.syncState();
    }
}
