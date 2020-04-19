package pt.ipg.guessinggame;

import androidx.appcompat.app.AppCompatActivity;
import java.util.Random;
import java.util.Scanner;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    int numberOfTries = 0;
    int input = -1;
    Random rand = new Random();
    int guessedNumber = rand.nextInt(10);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void readData(View view) {

        EditText editTextInput = (EditText) findViewById(R.id.editTextInput);
        String StrInput = editTextInput.getText().toString();

        try {
            input = Integer.parseInt(StrInput);
        } catch (NumberFormatException e){
            e.printStackTrace();
        }

        if (input < 0){
            editTextInput.setError("It needs to be higher than 0!");
            editTextInput.requestFocus();
            return;
        }

        if (input > 10){
            editTextInput.setError("It needs to be lower than 10!");
            editTextInput.requestFocus();
            return;
        }

        numberOfTries++;
        TextView tv = (TextView) findViewById(R.id.textViewTriesDisplay);
        tv.setText("" + numberOfTries);

    }
}
