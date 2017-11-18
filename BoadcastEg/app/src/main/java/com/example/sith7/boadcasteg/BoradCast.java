package com.example.sith7.boadcasteg;


import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Log;
import android.widget.Toast;

public class BoradCast {

   /* //Foe this extend interface class 'BroadcastReceiver'
    @Override
    public void onReceive(Context context, Intent intent) {
        Log.d("TAG","inside reciever");
    }*/

    BroadcastReceiver A=new BroadcastReceiver() {
        @Override
        public void onReceive(Context context, Intent intent) {

            Log.d("TAG","inside reciever");
        }
    };

}
