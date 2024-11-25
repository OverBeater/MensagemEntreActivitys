package com.example.MessageActivity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    protected void onStart(){
        super.onStart();
        Log.d("Ciclo de vida", "OnStart");
    }

    protected void onResume(){
        super.onResume();
        Log.d("Ciclo de vida", "OnResume");
    }

    protected void onPause(){
        super.onPause();
        Log.d("Ciclo de vida", "OnPause");
    }

    protected void onStop(){
        super.onStop();
        Log.d("Ciclo de vida", "OnStop");
    }

    protected void onDestroy(){
        super.onDestroy();
        Log.d("Ciclo de vida", "OnDestroy");
    }

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void openActivityB(View v) {

        EditText editTextMessage = findViewById(R.id.editTextMessage);
        String message = editTextMessage.getText().toString();

        Intent intent = new Intent(this, MainActivity2.class);
        intent.putExtra("message", message);
        startActivity(intent);
    }
}