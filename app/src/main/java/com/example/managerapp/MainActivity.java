package com.example.managerapp;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.Debug;
import android.util.Log;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.EditText;
import android.widget.ImageView;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


    }



    //affect the role of googleMaps on the design
    public void OnOpenInGoogleMaps(View view) {
        EditText adresse = (EditText) findViewById(R.id.editadresse);
        //create a Uri from an intent string. Use the result to create an Intent.
        Uri gmmIntentUri = Uri.parse("http://maps.google.co.in/maps?q=" + adresse.getText());

        //create an Intent from gmmIntentUri. Set the action to ACTION_VIEW
        Intent mapIntent = new Intent(Intent.ACTION_VIEW,gmmIntentUri);

        //Make the Intent explicit by setting the Google Maps package
        mapIntent.setPackage("comm.google.android.apps.maps");

        //Attempt to start an activity that can handle the Itent
        startActivity(mapIntent);
    }



//affect the role of nba1 on the design
    public void OnSetAvatarButton(View view) {
        //Application Context Activity
        Intent intent = new Intent(getApplicationContext(), ProfileActivity.class);
        startActivityForResult(intent,0);
    }

// add a link for the welcome page
    public void OnSetWelcomeButton(View view) {
          //Application Context Activity
        EditText adresse = (EditText) findViewById(R.id.editadresse);
        EditText name = (EditText) findViewById(R.id.editname);
        if((adresse.getText()!= null)&&(name.getText()!=null)){
            Intent intent = new Intent(getApplicationContext(), FinalActivity.class);
            startActivityForResult(intent,0);
        }

}
}