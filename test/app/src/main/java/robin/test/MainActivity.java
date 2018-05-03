package robin.test;
// basiert auf: https://www.youtube.com/watch?v=i-V96q4vwuU
//  bla bla bla

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends Activity {

    // Variablen für GUI Elemente deklarieren
    private TextView textOutput;
    private EditText editTextEingabe;
    private Button buttonStart;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Verknüpfen der GUI Elemente mit Code
        textOutput = findViewById(R.id.textOutput);
        editTextEingabe = findViewById(R.id.editTextEingabe);
        buttonStart = findViewById(R.id.buttonStart);

        // Setze GUI Text
        textOutput.setTextSize(18);
        textOutput.setText("Bitte gebe deinen Namen ein.");
        editTextEingabe.setTextSize(18);
        editTextEingabe.setHint("Name");
        buttonStart.setTextSize(18);
        buttonStart.setText("Start");

        // Button für Programmstart
        buttonStart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String eingabe = editTextEingabe.getText().toString();
                textOutput.setText("Hallo " + eingabe + "!");
            }
        });
    }
}
