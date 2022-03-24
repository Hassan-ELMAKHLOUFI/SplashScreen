package enset.glsid.tp2_splashscreen;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Login extends AppCompatActivity {

    Intent intent;
    Bundle b;
    EditText nomUtilisateur;
    EditText password;
    @Override
    protected void onCreate(Bundle savedInstanceState) {



        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        nomUtilisateur= findViewById(R.id.nomUtilisateur);
        password = findViewById(R.id.password);
        intent = new Intent(this,welcomePage.class);
        b= new Bundle();

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

    public void login(View view) {
        b.putString("password", String.valueOf(password.getText()));
        b.putString("nomUtilisateur",nomUtilisateur.getText().toString());
        intent.putExtras(b);
        startActivity(intent);
    }
}