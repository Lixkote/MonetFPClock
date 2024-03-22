package community.fairphone.clock;
import com.google.android.material.color.DynamicColors;


import android.app.Activity;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

public class CentralActivity extends Activity {
    private static final String TAG = CentralActivity.class.getSimpleName();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        DynamicColors.applyToActivityIfAvailable(this);
        super.onCreate(savedInstanceState);
        finish();
    }
}
