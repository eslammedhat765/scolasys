package touch.com.scolasys.ui;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

import touch.com.scolasys.R;

public class SplashScreen extends AppCompatActivity {
    TextView Scolasys;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);
        getSupportActionBar().hide();
        new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    Thread.sleep(4000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                Intent intent = new Intent(getBaseContext(), IntroActivity.class);
                startActivity(intent);
                finish();
            }
        }).start();
    }
}
