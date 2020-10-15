package com.example.managerapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


    }
    /*
    @Override
    protected void onActivityResult (int requestCode, int resultCode, Intent data){
        if (resultCode == RESULT_CANCELED)return;

        //Getting the Avatar Image we show to our users
        ImageView avatarImage = (ImageView) findViewById(R.id.nba1);

        //Finuring out the correct image
        String drawableName = "logo11";
        switch (data.getIntExtra("imageID", R.id.logo1)){
            case R.id.logo1:
                drawableName = "logo11";
                break;
            case R.id.logo2:
                drawableName = "logo4";
                break;
            case R.id.logo3:
                drawableName = "logo13";
                break;
            case R.id.logo4:
                drawableName = "logo10";
                break;
            case R.id.logo5:
                drawableName = "logo14";
                break;
            case R.id.logo6:
                drawableName = "logo9";
                break;
            case R.id.logo7:
                drawableName = "logo3";
                break;
            case R.id.logo8:
                drawableName = "logo8";
                break;
            case R.id.logo9:
                drawableName = "logo12";
                break;
        }
        int resID = getResources().getIdentifier(drawableName, "drawable", getPackageName());
        avatarImage.setImageResource(resID);
    }
    */

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
}