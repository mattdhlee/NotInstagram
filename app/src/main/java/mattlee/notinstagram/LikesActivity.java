package mattlee.notinstagram;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;

import com.ittianyu.bottomnavigationviewex.BottomNavigationViewEx;

import butterknife.BindView;
import butterknife.ButterKnife;
import mattlee.notinstagram.Utils.BottomNavigationViewHelper;


public class LikesActivity extends AppCompatActivity {

    private static final String TAG = "LikesActivity";
    @BindView(R.id.bottomNavViewBar) BottomNavigationViewEx mBottomNavigationViewEx;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        ButterKnife.bind(this);

        Log.d(TAG, "oncreate: starting test");

        setUpBottomNavigationView();
    }
    
    private void setUpBottomNavigationView() {
        //BottomNavigationViewEx bottomNavigationViewEx = (BottomNavigationViewEx) findViewById(R.id.)
        BottomNavigationViewHelper.setUpBottomNavigationView(mBottomNavigationViewEx);

    }
}
