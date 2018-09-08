package me.riyazahamed.citutorial;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Toast;

import me.riyazahamed.citutorial.library.ContinuousIntegrationTutorial;

public class MainActivity extends AppCompatActivity {

    private final ContinuousIntegrationTutorial tutorial = new ContinuousIntegrationTutorial();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toast.makeText(getApplicationContext(), tutorial.getData(), Toast.LENGTH_LONG).show();
    }
}
