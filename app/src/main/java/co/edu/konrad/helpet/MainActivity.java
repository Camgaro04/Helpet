 package co.edu.konrad.helpet;

import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.design.widget.NavigationView;
import android.support.v4.app.Fragment;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.Toolbar;

import co.edu.konrad.helpet.Fragments.ConsultsFragment;
import co.edu.konrad.helpet.Fragments.FindPetFragment;
import co.edu.konrad.helpet.Fragments.PetLostFragment;

 public class MainActivity extends AppCompatActivity {

     private DrawerLayout dl;
     private ActionBarDrawerToggle t;
     private NavigationView nv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        BottomNavigationView bottomNavigationView =
                findViewById(R.id.navigation);
        loadFragment(new PetLostFragment());
        dl = (DrawerLayout)findViewById(R.id.activity_main);
        t = new ActionBarDrawerToggle(this, dl,R.string.Open, R.string.Close);

        dl.addDrawerListener(t);
        t.syncState();

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        nv = (NavigationView)findViewById(R.id.nav_view);

        bottomNavigationView.setOnNavigationItemSelectedListener(
                new BottomNavigationView.OnNavigationItemSelectedListener() {
                    @Override
                    public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                        Fragment fragment = null;

                        switch (item.getItemId()) {
                            case R.id.navigation_lost:
                                fragment = new PetLostFragment();
                                break;

                            case R.id.navigation_find:
                                fragment = new FindPetFragment();
                                break;

                            case R.id.navigation_consults:
                                fragment = new ConsultsFragment();
                                break;

                        }
                        return loadFragment(fragment);
                    }
                });

    }

     private boolean loadFragment(Fragment fragment) {
         //switching fragment
         if (fragment != null) {
             getSupportFragmentManager()
                     .beginTransaction()
                     .replace(R.id.container, fragment)
                     .commit();
             return true;
         }
         return false;
     }
     @Override
     public boolean onOptionsItemSelected(MenuItem item) {
         if(t.onOptionsItemSelected(item))
             return true;

         return super.onOptionsItemSelected(item);
     }
}
