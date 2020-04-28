package com.example.projectku;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.app.DownloadManager;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        ImageView Mapel= findViewById(R.id.Mapel);
        Mapel.setOnClickListener(new View.OnClickListener() {

                                     @Override
                                     public void onClick(View v) {
                                         Intent intent = new Intent(MainActivity.this, MaPelActivity.class);
                                         startActivity(intent);
                                     }
                                 }
        );

        ImageView Materi= findViewById(R.id.Materi);
        Materi.setOnClickListener(new View.OnClickListener() {

                                      @Override
                                      public void onClick(View v) {
                                          Intent intent = new Intent(MainActivity.this, MainActivity.class);
                                          startActivity(intent);
                                      }
                                  }
        );

        ImageView kelas= findViewById(R.id.kelas);
        kelas.setOnClickListener(new View.OnClickListener() {

                                     @Override
                                     public void onClick(View v) {
                                         Intent intent = new Intent(MainActivity.this, KelasActivity.class);
                                         startActivity(intent);
                                     }
                                 }
        );
        ImageView Account= findViewById(R.id.Account);
        Account.setOnClickListener(new View.OnClickListener() {

                                       @Override
                                       public void onClick(View v) {
                                           Intent intent = new Intent(MainActivity.this, AccountActivity.class);
                                           startActivity(intent);
                                       }
                                   }
        );
        ImageView Setting= findViewById(R.id.Setting);
        Setting.setOnClickListener(new View.OnClickListener() {

                                       @Override
                                       public void onClick(View v) {
                                           Intent intent = new Intent(MainActivity.this, SettingActivity.class);
                                           startActivity(intent);
                                       }
                                   }
        );
        ImageView Nilai= findViewById(R.id.Nilai);
        Nilai.setOnClickListener(new View.OnClickListener() {

                                     @Override
                                     public void onClick(View v) {
                                         Intent intent = new Intent(MainActivity.this, NilaiActivity.class);
                                         startActivity(intent);
                                     }
                                 }
        );


    }
}