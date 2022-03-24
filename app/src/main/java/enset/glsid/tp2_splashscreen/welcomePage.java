package enset.glsid.tp2_splashscreen;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

public class welcomePage extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_welcome_page);

        Bundle b = getIntent().getExtras();
        String nomS="hassan";
        String passwordS=b.getString("password");
        TextView nom= findViewById(R.id.nomU);
        TextView pass= findViewById(R.id.pass);
        nom.setText("nom: "+nomS);
        pass.setText("mot de passe: "+passwordS);


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

    public void retour(View view){
        Intent intent = new Intent(this,Login.class);
        startActivity(intent);
    }
}