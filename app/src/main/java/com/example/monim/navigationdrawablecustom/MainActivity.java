package com.example.monim.navigationdrawablecustom;

import android.support.design.widget.AppBarLayout;
import android.support.design.widget.NavigationView;
import android.support.v4.app.Fragment;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBar;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.Unbinder;

public class MainActivity extends AppCompatActivity /*implements View.OnClickListener */{

    private Unbinder unbinder;



    @BindView(R.id.layout_drawer)
    DrawerLayout mLayoutDrawer;

    @BindView(R.id.view_navigation)
    NavigationView mNavView;




    @BindView(R.id.btn_one)
    Button mButtonOne;

    @BindView(R.id.btn_two)
    Button mButtonTwo;

    @BindView(R.id.btn_three)
    Button mButtonThree;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        unbinder = ButterKnife.bind(this);
/*

        mButtonOne.setOnClickListener(this);
        mButtonTwo.setOnClickListener(this);
        mButtonThree.setOnClickListener(this);
*/




        mNavView.setNavigationItemSelectedListener(
                new NavigationView.OnNavigationItemSelectedListener() {
                    @Override
                    public boolean onNavigationItemSelected(MenuItem menuItem) {
                        // set item as selected to persist highlight
                        menuItem.setChecked(true);
                        // close drawer when item is tapped
                        mLayoutDrawer.closeDrawers();

                        // Add code here to update the UI based on the item selected
                        // For example, swap UI fragments here

                        return true;
                    }
                });

    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case R.id.nav_home:
                mLayoutDrawer.openDrawer(GravityCompat.START);
                return true;

            case R.id.nav_address:
                mLayoutDrawer.openDrawer(GravityCompat.START);
                return true;

            case R.id.nav_home1:
                mLayoutDrawer.openDrawer(GravityCompat.START);
                return true;

            case R.id.nav_address1:
                mLayoutDrawer.openDrawer(GravityCompat.START);
                return true;
        }
        return super.onOptionsItemSelected(item);
    }


 /*   @Override
    public void onClick(View v) {
        switch (v.getId())
        {
            case R.id.btn_one:
                setValue(1);
            case R.id.btn_two:
                setValue(2);
            case R.id.btn_three:
                setValue(3);

        }
    }*/

    public void sendValue(View v)
    {
        Toast.makeText(getApplicationContext(),String.valueOf(v.getTag()),Toast.LENGTH_LONG).show();
    }
}
