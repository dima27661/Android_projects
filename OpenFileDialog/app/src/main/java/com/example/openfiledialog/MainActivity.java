package com.example.openfiledialog;

import android.os.Environment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity implements View.OnClickListener  {

    TextView TextView1 ;
    Button button2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
         TextView1 = (TextView) findViewById(R.id.TextView1);
//        Button button1 = (Button) findViewById( R.id.button1 );
         Button button2 = (Button) findViewById( R.id.button2 );

        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                TextView1.setText("Нажал кнопку 2");

            }
        });

    }

    @Override
    public void onClick(View view)
    {
        switch (view.getId())
        {
            case R.id.button1:
                OpenFileDialog fileDialog = new OpenFileDialog(this);
                fileDialog.show();
                break;
            case R.id.button2:
//                double c = Double.valueOf(centimeters.getText().toString());
                //    double i = 34 *  0.393701;
             //      TextView1.setText(String.valueOf(i));
                TextView1.setText("Нажал кнопку 2");
                break;



            default:
                break;
            //handle multiple view click events
        }
    }

    public  void button3onClick (View view){
        TextView1.setText("button3 is pressed");
    }


}



