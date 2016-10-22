package me.ryanfinlayson.mrpotatohead;

import android.media.Image;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //create reference to the checkBoxes
        final CheckBox bodyBox = (CheckBox) findViewById(R.id.bodyBox);
        final CheckBox mustacheBox = (CheckBox) findViewById(R.id.mustacheBox);
        final CheckBox noseBox = (CheckBox) findViewById(R.id.noseBox);
        final CheckBox hatBox = (CheckBox) findViewById(R.id.hatBox);
        final CheckBox mouthBox = (CheckBox) findViewById(R.id.mouthBox);
        final CheckBox armBox = (CheckBox) findViewById(R.id.armBox);
        final CheckBox glassesBox = (CheckBox) findViewById(R.id.glassesBox);
        final CheckBox earBox = (CheckBox) findViewById(R.id.earsBox);
        final CheckBox eyeBox = (CheckBox) findViewById(R.id.eyesBox);
        final CheckBox eyebrowBox = (CheckBox) findViewById(R.id.eyebrowsBox);
        final CheckBox shoeBox = (CheckBox) findViewById(R.id.shoesBox);

        //create a reference to the images
        final ImageView bodyImage = (ImageView) findViewById(R.id.bodyImageView);
        final ImageView mustacheImage = (ImageView) findViewById(R.id.mustacheImageView);
        final ImageView noseImage = (ImageView)  findViewById(R.id.noseImageView);
        final ImageView hatImage = (ImageView) findViewById(R.id.hatImageView);
        final ImageView mouthImage = (ImageView) findViewById(R.id.mouthImageView);
        final ImageView armsImage = (ImageView)  findViewById(R.id.armsImageView);
        final ImageView glassesImage = (ImageView) findViewById(R.id.glassesImageView);
        final ImageView earsImage = (ImageView)  findViewById(R.id.earsImageView);
        final ImageView eyesImage = (ImageView) findViewById(R.id.eyesImageView);
        final ImageView eyebrowImage = (ImageView) findViewById(R.id.eyebrowsImageView);
        final ImageView shoeImage = (ImageView) findViewById(R.id.shoesImageView);


        //create click listeners for the checkboxes

        bodyBox.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(bodyBox.isChecked() && bodyImage.getVisibility()!= View.VISIBLE){
                    bodyImage.setVisibility(View.VISIBLE);
                } else{
                    bodyImage.setVisibility(View.INVISIBLE);
                }
            }
        });

        mustacheBox.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (mustacheBox.isChecked() && mustacheImage.getVisibility()!= View.VISIBLE){
                    mustacheImage.setVisibility(View.VISIBLE);
                } else{
                    mustacheImage.setVisibility(View.INVISIBLE);
                }
            }
        });

        noseBox.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (noseBox.isChecked() && noseImage.getVisibility()!= View.VISIBLE){
                    noseImage.setVisibility(View.VISIBLE);
                } else{
                    noseImage.setVisibility(View.INVISIBLE);
                }

            }
        });

        hatBox.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (hatBox.isChecked() && hatImage.getVisibility()!= View.VISIBLE){
                    hatImage.setVisibility(View.VISIBLE);
                } else{
                    hatImage.setVisibility(View.INVISIBLE);
                }

            }
        });

        mouthBox.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (mouthBox.isChecked() && mouthImage.getVisibility()!= View.VISIBLE){
                    mouthImage.setVisibility(View.VISIBLE);
                } else{
                    mouthImage.setVisibility(View.INVISIBLE);
                }

            }
        });

        armBox.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (armBox.isChecked() && armsImage.getVisibility()!= View.VISIBLE){
                    armsImage.setVisibility(View.VISIBLE);
                } else{
                    armsImage.setVisibility(View.INVISIBLE);
                }

            }
        });

        glassesBox.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (glassesBox.isChecked() && glassesImage.getVisibility()!= View.VISIBLE){
                    glassesImage.setVisibility(View.VISIBLE);
                } else{
                    glassesImage.setVisibility(View.INVISIBLE);
                }

            }
        });

        earBox.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (earBox.isChecked() && earsImage.getVisibility()!= View.VISIBLE){
                    earsImage.setVisibility(View.VISIBLE);
                } else{
                    earsImage.setVisibility(View.INVISIBLE);
                }

            }
        });

        eyeBox.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (eyeBox.isChecked() && eyesImage.getVisibility()!= View.VISIBLE){
                    eyesImage.setVisibility(View.VISIBLE);
                } else{
                    eyesImage.setVisibility(View.INVISIBLE);
                }

            }
        });

        eyebrowBox.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (eyebrowBox.isChecked() && eyebrowImage.getVisibility()!= View.VISIBLE){
                    eyebrowImage.setVisibility(View.VISIBLE);
                } else{
                    eyebrowImage.setVisibility(View.INVISIBLE);
                }

            }
        });

        shoeBox.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(shoeBox.isChecked() && shoeImage.getVisibility()!= View.VISIBLE){
                    shoeImage.setVisibility(View.VISIBLE);
                } else{
                    shoeImage.setVisibility(View.INVISIBLE);
                }
            }
        });







    }


}
