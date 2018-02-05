package app.android;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class Activity2 extends Activity {
    TextView textView2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_2);
       textView2 = findViewById(R.id.textView2);

        int num1 =  Integer.parseInt(getIntent().getStringExtra("num1"));
        int num2 = Integer.parseInt(getIntent().getStringExtra("num2"));
        textView2.setText(num1+"+"+num2+"="+(num1+num2));






    }
    public void buttonClicked(View view) {
        //textView.append(editText.getText());
        Intent intent = new Intent(getBaseContext(), MainActivity.class);
        startActivity(intent);
    }


}
