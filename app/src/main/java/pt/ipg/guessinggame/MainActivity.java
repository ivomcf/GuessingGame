package pt.ipg.guessinggame;

import androidx.appcompat.app.AppCompatActivity;
import java.util.Random;
import java.util.Scanner;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void readData(View view) {

        EditText editTextInput = (EditText) findViewById(R.id.editTextInput);

        String StrInput = editTextInput.getText().toString();
        int input = -1;
        try {
            input = Integer.parseInt(StrInput);
        } catch (NumberFormatException e){
            e.printStackTrace();
        }

        Random rand = new Random();
        int guessedNumber = rand.nextInt(10);
        int numberOfTries = 0;
    }
}
