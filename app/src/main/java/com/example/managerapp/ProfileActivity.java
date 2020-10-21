package com.example.managerapp;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

public class ProfileActivity extends AppCompatActivity {
//reques_code for the image
    private static final int REQUEST_CODE =123;

    ImageView image;
    Button buttonset;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);
        //the picture selected will change our Avatard
        image = findViewById(R.id.nba1);
        buttonset = findViewById(R.id.btnset);

        buttonset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();

                intent.setType("image/^");   //allow to selecte any king of image
                intent.setAction(Intent.ACTION_GET_CONTENT);
                startActivityForResult(Intent.createChooser(intent, "newImage"), REQUEST_CODE);
            }
        });

    }
    //code to select any picture on the computer
    protected void onActivityResult2(int requestCode, int resultCode, @Nullable Intent data) {
          if (requestCode == REQUEST_CODE  && resultCode == RESULT_OK  && data != null){
              Uri imageData = data.getData();

              image.setImageURI(imageData);

          }

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

    @Override
    protected void onActivityResult (int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if (resultCode == RESULT_CANCELED) return;

        //Getting the Avatar Image we show to our users
        ImageView avatarImage = (ImageView) findViewById(R.id.nba1);
        ImageView avatarImageFinal = (ImageView) findViewById(R.id.imageparty);

        //Finuring out the correct image
        String drawableName = "logo0";
        switch (data.getIntExtra("imageID", R.id.logo1)) {
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
        avatarImageFinal.setImageResource(resID);
    }
}