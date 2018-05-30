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
import android.widget.TextView;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.Unbinder;

public class MainActivity extends AppCompatActivity {

    private Unbinder unbinder;

    @BindView(R.id.toolbar)
    Toolbar mToolbar;

//    @BindView(R.id.appbar)
//    AppBarLayout mAppbar;

    @BindView(R.id.layout_drawer)
    DrawerLayout mLayoutDrawer;

    @BindView(R.id.view_navigation)
    NavigationView mNavView;

//    @BindView(R.id.txt_left_title)
//    TextView mLeftTitle;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        unbinder = ButterKnife.bind(this);

        setSupportActionBar(mToolbar);
        initToolbar();


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

    private void initToolbar() {
        setSupportActionBar(mToolbar);

        ActionBar ab = getSupportActionBar();
        if (ab != null) {


            ab.setDisplayHomeAsUpEnabled(true);


            ab.setTitle("");


        }

       // mLeftTitle.setVisibility(View.GONE);
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


}
