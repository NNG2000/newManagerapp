package com.example.managerapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.Image;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class ProfileActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);
    }



    public void SetTeamIcon9(View view) {
        //Creating a Return intent to pass to the Main Activity
        Intent returnIntent = new Intent();

        //Figuring out which image was clicked
        ImageView selectedImage = (ImageView) view;

        //Adding stuff to the return intent
        returnIntent.putExtra("imageID", selectedImage.getImageAlpha());
        setResult(RESULT_OK, returnIntent);

        //Finishing Activity and return to main screen!
        finish();
    }

    public void SetTeamIcon8(View view) {
        //Creating a Return intent to pass to the Main Activity
        Intent returnIntent = new Intent();

        //Figuring out which image was clicked
        ImageView selectedImage = (ImageView) view;

        //Adding stuff to the return intent
        returnIntent.putExtra("imageID", selectedImage.getImageAlpha());
        setResult(RESULT_OK, returnIntent);

        //Finishing Activity and return to main screen!
        finish();
    }

    public void SetTeamIcon7(View view) {
        //Creating a Return intent to pass to the Main Activity
        Intent returnIntent = new Intent();

        //Figuring out which image was clicked
        ImageView selectedImage = (ImageView) view;

        //Adding stuff to the return intent
        returnIntent.putExtra("imageID", selectedImage.getImageAlpha());
        setResult(RESULT_OK, returnIntent);

        //Finishing Activity and return to main screen!
        finish();
    }

    public void SetTeamIcon6(View view) {
        //Creating a Return intent to pass to the Main Activity
        Intent returnIntent = new Intent();

        //Figuring out which image was clicked
        ImageView selectedImage = (ImageView) view;

        //Adding stuff to the return intent
        returnIntent.putExtra("imageID", selectedImage.getImageAlpha());
        setResult(RESULT_OK, returnIntent);

        //Finishing Activity and return to main screen!
        finish();
    }

    public void SetTeamIcon5(View view) {
        //Creating a Return intent to pass to the Main Activity
        Intent returnIntent = new Intent();

        //Figuring out which image was clicked
        ImageView selectedImage = (ImageView) view;

        //Adding stuff to the return intent
        returnIntent.putExtra("imageID", selectedImage.getImageAlpha());
        setResult(RESULT_OK, returnIntent);

        //Finishing Activity and return to main screen!
        finish();
    }

    public void SetTeamIcon4(View view) {
        //Creating a Return intent to pass to the Main Activity
        Intent returnIntent = new Intent();

        //Figuring out which image was clicked
        ImageView selectedImage = (ImageView) view;

        //Adding stuff to the return intent
        returnIntent.putExtra("imageID", selectedImage.getImageAlpha());
        setResult(RESULT_OK, returnIntent);

        //Finishing Activity and return to main screen!
        finish();
    }

    public void SetTeamIcon3(View view) {
        //Creating a Return intent to pass to the Main Activity
        Intent returnIntent = new Intent();

        //Figuring out which image was clicked
        ImageView selectedImage = (ImageView) view;

        //Adding stuff to the return intent
        returnIntent.putExtra("imageID", selectedImage.getImageAlpha());
        setResult(RESULT_OK, returnIntent);

        //Finishing Activity and return to main screen!
        finish();
    }

    public void SetTeamIcon2(View view) {
        //Creating a Return intent to pass to the Main Activity
        Intent returnIntent = new Intent();

        //Figuring out which image was clicked
        ImageView selectedImage = (ImageView) view;

        //Adding stuff to the return intent
        returnIntent.putExtra("imageID", selectedImage.getImageAlpha());
        setResult(RESULT_OK, returnIntent);

        //Finishing Activity and return to main screen!
        finish();
    }

    public void SetTeamIcon1(View view) {
        //Creating a Return intent to pass to the Main Activity
        Intent returnIntent = new Intent();

        //Figuring out which image was clicked
        ImageView selectedImage = (ImageView) view;

        //Adding stuff to the return intent
        returnIntent.putExtra("imageID", selectedImage.getImageAlpha());
        setResult(RESULT_OK, returnIntent);

        //Finishing Activity and return to main screen!
        finish();
    }
}