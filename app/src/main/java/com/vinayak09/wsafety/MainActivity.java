package com.vinayak09.wsafety;

import androidx.activity.result.ActivityResultCallback;
import androidx.activity.result.ActivityResultLauncher;
import androidx.activity.result.contract.ActivityResultContracts;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.PopupMenu;
import androidx.core.content.ContextCompat;

import android.Manifest;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;

import com.google.android.material.snackbar.Snackbar;

import java.util.Map;
import java.util.Objects;
import java.util.function.BiConsumer;


public class MainActivity extends AppCompatActivity {


    String num1 = "", num2 = "", num3 = "", num4 = "", num5 = "";
    String num6 = "", num7 = "", num8 = "", num9 = "", num10 = "";
    String num11 = "", num12 = "", num13 = "", num14 = "", num15 = "";


    @Override
    protected void onResume() {
        super.onResume();

        SharedPreferences sharedPreferences = getSharedPreferences("MySharedPref",MODE_PRIVATE);

        num1 = sharedPreferences.getString("ENUM1","NONE");
        num2 = sharedPreferences.getString("ENUM2","NONE");
        num3 = sharedPreferences.getString("ENUM3","NONE");
        num4 = sharedPreferences.getString("ENUM4","NONE");
        num5 = sharedPreferences.getString("ENUM5","NONE");
        num6 = sharedPreferences.getString("ENUM6","NONE");
        num7 = sharedPreferences.getString("ENUM7","NONE");
        num8 = sharedPreferences.getString("ENUM8","NONE");
        num9 = sharedPreferences.getString("ENUM9","NONE");
        num10 = sharedPreferences.getString("ENUM10","NONE");
        num11 = sharedPreferences.getString("ENUM11","NONE");
        num12 = sharedPreferences.getString("ENUM12","NONE");
        num13 = sharedPreferences.getString("ENUM13","NONE");
        num14 = sharedPreferences.getString("ENUM14","NONE");
        num15 = sharedPreferences.getString("ENUM15","NONE");

        if(num1.equalsIgnoreCase("NONE")){
            startActivity(new Intent(this,RegisterNumberActivity.class));
        }else {
            TextView textView =  findViewById(R.id.textNum);
            String numbers = "";

            if (!Objects.equals(num1, "NONE")) numbers+=num1+"\n";
            if (!Objects.equals(num2, "NONE")) numbers+=num2+"\n";
            if (!Objects.equals(num3, "NONE")) numbers+=num3+"\n";
            if (!Objects.equals(num4, "NONE")) numbers+=num4+"\n";
            if (!Objects.equals(num5, "NONE")) numbers+=num5+"\n";
            if (!Objects.equals(num6, "NONE")) numbers+=num6+"\n";
            if (!Objects.equals(num7, "NONE")) numbers+=num7+"\n";
            if (!Objects.equals(num8, "NONE")) numbers+=num8+"\n";
            if (!Objects.equals(num9, "NONE")) numbers+=num9+"\n";
            if (!Objects.equals(num10, "NONE")) numbers+=num10+"\n";
            if (!Objects.equals(num11, "NONE")) numbers+=num11+"\n";
            if (!Objects.equals(num12, "NONE")) numbers+=num12+"\n";
            if (!Objects.equals(num13, "NONE")) numbers+=num13+"\n";
            if (!Objects.equals(num14, "NONE")) numbers+=num14+"\n";
            if (!Objects.equals(num15, "NONE")) numbers+=num15+"\n";

            textView.setText("SOS Will Be Sent To\n"+numbers);
        }
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
            if (android.os.Build.VERSION.SDK_INT >= android.os.Build.VERSION_CODES.O) {
                NotificationChannel channel = new NotificationChannel("MYID", "CHANNELFOREGROUND", NotificationManager.IMPORTANCE_DEFAULT);

                NotificationManager m = (NotificationManager) getSystemService(Context.NOTIFICATION_SERVICE);
                m.createNotificationChannel(channel);
            }
        }



        
    }


    private ActivityResultLauncher<String[]> multiplePermissions = registerForActivityResult(new ActivityResultContracts.RequestMultiplePermissions(), new ActivityResultCallback<Map<String, Boolean>>() {
        @Override
        public void onActivityResult(Map<String, Boolean> result) {

            for (Map.Entry<String,Boolean> entry : result.entrySet())
                if(!entry.getValue()){
                    Snackbar snackbar = Snackbar.make(findViewById(android.R.id.content),"Permission Must Be Granted!", Snackbar.LENGTH_INDEFINITE);
                    snackbar.setAction("Grant Permission", new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            multiplePermissions.launch(new String[]{entry.getKey()});
                            snackbar.dismiss();
                        }
                    });
                    snackbar.show();
                }


        }

    });



    public void stopService(View view) {

        Intent notificationIntent = new Intent(this,ServiceMine.class);
        notificationIntent.setAction("stop");
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
            getApplicationContext().startForegroundService(notificationIntent);
            Snackbar.make(findViewById(android.R.id.content),"Service Stopped!", Snackbar.LENGTH_LONG).show();
        }
    }

    public void startServiceV(View view) {





        if (ContextCompat.checkSelfPermission(this, Manifest.permission.SEND_SMS) == PackageManager.PERMISSION_GRANTED && ContextCompat.checkSelfPermission(this, Manifest.permission.ACCESS_COARSE_LOCATION) == PackageManager.PERMISSION_GRANTED && ContextCompat.checkSelfPermission(this, Manifest.permission.ACCESS_FINE_LOCATION) == PackageManager.PERMISSION_GRANTED  ) {
            Intent notificationIntent = new Intent(this,ServiceMine.class);
            notificationIntent.setAction("Start");
            if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
                getApplicationContext().startForegroundService(notificationIntent);
                Snackbar.make(findViewById(android.R.id.content),"Service Started!", Snackbar.LENGTH_LONG).show();
            }
        }else{
            multiplePermissions.launch(new String[]{Manifest.permission.SEND_SMS,Manifest.permission.ACCESS_COARSE_LOCATION,Manifest.permission.ACCESS_FINE_LOCATION});
        }

    }

    public void PopupMenu(View view) {
        PopupMenu popupMenu = new PopupMenu(MainActivity.this,view);
        popupMenu.getMenuInflater().inflate(R.menu.popup,popupMenu.getMenu());
        popupMenu.setOnMenuItemClickListener(new PopupMenu.OnMenuItemClickListener() {
            @Override
            public boolean onMenuItemClick(MenuItem item) {
                if(item.getItemId() == R.id.changeNum){
                    startActivity(new Intent(MainActivity.this,RegisterNumberActivity.class));
                }
                return true;
            }
        });
        popupMenu.show();
    }
}