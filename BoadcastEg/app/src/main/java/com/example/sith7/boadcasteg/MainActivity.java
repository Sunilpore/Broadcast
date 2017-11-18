package com.example.sith7.boadcasteg;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.support.design.widget.CoordinatorLayout;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText window;
    Button button;
    Intent a;
    Snackbar snackbar;
    CoordinatorLayout cordlay;
    String name;


    private final String ActA ="A_clicked";

    @Override
    protected void onStart() {
        super.onStart();
        registerReceiver(A,new IntentFilter(ActA));
//        registerReceiver(new BoradCast().A,new IntentFilter(ActA));  //Call by class object
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

     button=findViewById(R.id.tv_boradcast);
     window=findViewById(R.id.tv_window);
     cordlay=findViewById(R.id.tv_cordlay);


     a=new Intent(ActA);   //Intent instance are used to call particular action for 'BroadcastReceiver' class by passing String value inside it.

     button.setOnClickListener(new View.OnClickListener() {
         @Override
         public void onClick(View view) {

             sendBroadcast(a);

         }
     });

    }


    BroadcastReceiver A=new BroadcastReceiver() {
        @Override
        public void onReceive(Context context, Intent intent) {
            name= window.getText().toString();
            if(name.equals(""))
                Snackbar.make(cordlay,"You are Smart,....But Enter a name plz",Snackbar.LENGTH_LONG).show();
            else{

                snackbar=Snackbar.make(cordlay,name,Snackbar.LENGTH_LONG);
                snackbar.show();
            }

         Log.d("TAG","inside reciever");
        }
    };


}
