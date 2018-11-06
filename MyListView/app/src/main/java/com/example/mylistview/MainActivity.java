package com.example.mylistview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    ListView listView1;
    String[] names;
    Button button1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        listView1 = (ListView) findViewById(R.id.ListView1);

        // устанавливаем режим выбора пунктов списка
        listView1.setChoiceMode(ListView.CHOICE_MODE_SINGLE);
        // Создаем адаптер, используя массив из файла ресурсов
        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this,R.array.names,android.R.layout.simple_list_item_single_choice );
        listView1.setAdapter(adapter);

        //        Button btnChecked = (Button) findViewById(R.id.btnChecked);
//        btnChecked.setOnClickListener(this);
//
        // получаем массив из файла ресурсов
        names = getResources().getStringArray(R.array.names);

        button1 = (Button) findViewById(R.id.button1);
        button1.setOnClickListener(this);
       // listView1.setOnClickListener(this);

    }

    @Override
    public void onClick(View view) {

        switch (view.getId()){
            case R.id.button1 :
//                Toast.makeText(getApplicationContext(), "Неудача", Toast.LENGTH_SHORT).show();
                Toast.makeText(getApplicationContext(), names[listView1.getCheckedItemPosition()], Toast.LENGTH_SHORT).show();
                break;


        }

//        textView.setText("checked: " + names[lvMain.getCheckedItemPosition()]);

//        try {
//            ftpConn("n***.n****.ru","*****","*****");
//        } catch (FileNotFoundException ex) {
//            Toast.makeText(getApplicationContext(), "Неудача", Toast.LENGTH_SHORT).show();
//        }


    }
}
