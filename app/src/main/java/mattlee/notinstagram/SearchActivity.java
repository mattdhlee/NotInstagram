package mattlee.notinstagram;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.ittianyu.bottomnavigationviewex.BottomNavigationViewEx;

import butterknife.BindView;
import butterknife.ButterKnife;
import mattlee.notinstagram.Utils.BottomNavigationViewHelper;

public class SearchActivity extends AppCompatActivity {

    private static final String TAG = "SearchActivity";
    @BindView(R.id.bottomNavViewBar) BottomNavigationViewEx mBottomNavigationViewEx;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        ButterKnife.bind(this);


        setUpBottomNavigationView();
    }

    /**
     * BottomNavigationView set up
     */
    private void setUpBottomNavigationView() {
        //BottomNavigationViewEx bottomNavigationViewEx = (BottomNavigationViewEx) findViewById(R.id.)
        BottomNavigationViewHelper.setUpBottomNavigationView(mBottomNavigationViewEx);

    }
}
