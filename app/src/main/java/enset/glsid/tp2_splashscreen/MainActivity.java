package enset.glsid.tp2_splashscreen;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    TextView enset ;
    ConstraintLayout ctl;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        enset= findViewById(R.id.enset);
        ctl= findViewById(R.id.ctl);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                ctl.setVisibility(View.VISIBLE);

                new Handler().postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        enset.setVisibility(View.VISIBLE);
                    }
                },500);
            }
        },100);
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent intent= new Intent(MainActivity.this,Login.class);
                startActivity(intent);
            }
        },5000);
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Toast.makeText(getBaseContext(), "onReStart",
                Toast.LENGTH_LONG).show();
    }

    @Override
    protected void onStart() {
        super.onStart();Toast.makeText(getBaseContext(),
                "onStart",
                Toast.LENGTH_LONG).show();
    }
    @Override
    protected void onStop() {
        super.onStop();
        Toast.makeText(getBaseContext(), "onStop",
                Toast.LENGTH_LONG).show();
    }

    @Override
    protected void onDestroy() {

        super.onDestroy();
        Toast.makeText(getBaseContext(), "onDestroy",
                Toast.LENGTH_LONG).show();
    }

    @Override
    protected void onPause() {
        super.onPause();
        Toast.makeText(getBaseContext(), "onPause",
                Toast.LENGTH_LONG).show();
    }
}