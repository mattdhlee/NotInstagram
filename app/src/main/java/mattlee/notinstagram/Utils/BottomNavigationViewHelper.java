package mattlee.notinstagram.Utils;

import com.ittianyu.bottomnavigationviewex.BottomNavigationViewEx;

/**
 * Created by Matt on 2018-01-12.
 */

public class BottomNavigationViewHelper {

    private static final String TAG = "BottomNavigationViewHelper";

    public static void setUpBottomNavigationView(BottomNavigationViewEx bottomNavigationViewEx) {

        bottomNavigationViewEx.enableAnimation(false);
        bottomNavigationViewEx.enableItemShiftingMode(false);
        bottomNavigationViewEx.enableShiftingMode(false);
        bottomNavigationViewEx.setTextVisibility(false);
    }


}
