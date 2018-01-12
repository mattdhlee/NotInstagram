package mattlee.notinstagram;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.ittianyu.bottomnavigationviewex.BottomNavigationViewEx;

import butterknife.BindView;
import butterknife.ButterKnife;
import mattlee.notinstagram.Utils.BottomNavigationViewHelper;

public class HomeActivity extends AppCompatActivity {

    private static final String TAG = "HomeActivity";
    @BindView(R.id.bottomNavViewBar) BottomNavigationViewEx mBottomNavigationViewEx;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        ButterKnife.bind(this);
    }

    /**
     * BottomNavigationView set up
     */
    private void setUpBottomNavigationView() {
        //BottomNavigationViewEx bottomNavigationViewEx = (BottomNavigationViewEx) findViewById(R.id.)
        BottomNavigationViewHelper.setUpBottomNavigationView(mBottomNavigationViewEx);

    }
}
