package eu.michelibros.ciannacounter;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final Button button = (Button) findViewById(R.id.btn_test);
         button.setOnClickListener(new View.OnClickListener() {
             public void onClick(View v) {
                 Toast.makeText(MainActivity.this, "Hello World!", Toast.LENGTH_LONG).show();
             }
         });
    }
}
