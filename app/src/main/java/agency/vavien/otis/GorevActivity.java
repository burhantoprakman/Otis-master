package agency.vavien.otis;

import android.app.Fragment;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;

import com.ittianyu.bottomnavigationviewex.BottomNavigationViewEx;

public class GorevActivity extends AppCompatActivity {

    private BottomNavigationViewEx.OnNavigationItemSelectedListener mOnNavigationItemSelectedListener
            = new BottomNavigationView.OnNavigationItemSelectedListener() {

        @Override
        public boolean onNavigationItemSelected(@NonNull MenuItem item) {
            switch (item.getItemId()) {
                case R.id.teknisyen:
                    changeFragment(0);
                    return true;
                case R.id.aktifgorev:
                    changeFragment(1);
                    return true;
                case R.id.gorevata:
                    changeFragment(2);
                    return true;
            }

            return false;
        }

    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gorev);
        setFragment(new GorevTab1());
        BottomNavigationViewEx navigation = (BottomNavigationViewEx) findViewById(R.id.navigation1);
        navigation.enableAnimation(false);
        navigation.setOnNavigationItemSelectedListener(mOnNavigationItemSelectedListener);
    }
    protected void setFragment(Fragment fragment) {
        FragmentManager fragmentManager=getFragmentManager();
        FragmentTransaction fragmentTransaction =
                fragmentManager.beginTransaction();
        fragmentTransaction.replace(R.id.frameLayout1, fragment);
        fragmentTransaction.commit();
    }
    public void changeFragment(int position){
        Fragment newFragment = null;


        if (position == 0) {
            newFragment = new GorevTab1();
        } else if (position == 1) {
            newFragment = new GorevTab2();
        } else if(position == 2) {
            newFragment = new GorevTab3();
        }

        getFragmentManager().beginTransaction().replace(
                R.id.frameLayout1, newFragment)
                .commit();
    }
}
