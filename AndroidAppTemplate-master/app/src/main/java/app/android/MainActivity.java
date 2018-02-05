package app.android;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends Activity {

    TextView textView;
    EditText editText;
    Button button;
    EditText num1;
    EditText num2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Log.d("DebuggingMessage","Activity created...");

        textView = findViewById(R.id.textView);
        editText = findViewById(R.id.editText);
        button = findViewById(R.id.button);
        num1 = findViewById(R.id.num1);
        num2 = findViewById(R.id.num2);
        textView.setText("Android-App-Basics");

        editText.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textView.setText(editText.getText());
            }
        });

        textView.setOnClickListener((View view) -> {
            textViewClicked();
        });

    }

    public void buttonClicked(View view) {
        //textView.append(editText.getText());
        Intent intent = new Intent(getBaseContext(), Activity2.class);
        intent.putExtra("num1", num1.getText().toString());
        intent.putExtra("num2", num2.getText().toString());
        startActivity(intent);
    }

    public void textViewClicked() {
        textView.setText("");
    }

    @Override
    protected void onStart(){
        super.onStart();
        Log.d("DebuggingMessage","Activity Started...");
    };
    @Override
    protected void onRestart(){
        super.onRestart();
        Log.d("DebuggingMessage","Activity Restarted...");
    };
    @Override
    protected void onResume(){
        super.onResume();
        Log.d("DebuggingMessage","Activity Resumed...");
    };
    @Override
    protected void onPause(){
        super.onPause();
        Log.d("DebuggingMessage","Activity Paused...");
    };
    @Override
    protected void onStop(){
        super.onStop();
        Log.d("DebuggingMessage","Activity Stopped...");
    };
    @Override
    protected void onDestroy(){
        super.onDestroy();
        Log.d("DebuggingMessage","Activity Destroyed...");
    };

}
