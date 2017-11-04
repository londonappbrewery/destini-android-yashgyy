package com.londonappbrewery.destini;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    // TODO: Steps 4 & 8 - Declare member variables here:
    Button topButton;
    Button bottomButton;
    TextView storyText;
    public int mStoryIndex=1;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        topButton=(Button)findViewById(R.id.buttonTop);
        bottomButton=(Button)findViewById(R.id.buttonBottom);
        storyText=(TextView)findViewById(R.id.storyTextView);

        // TODO: Step 5 - Wire up the 3 views from the layout to the member variables:
        topButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
            checkUpper();
            }
        });
        bottomButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
            CheckLower();
            }
        });

    }
    public void checkUpper(){
        switch (mStoryIndex){
            case 1:
                    topButton.setText(R.string.T3_Ans1);
                    bottomButton.setText(R.string.T3_Ans2);
                    storyText.setText(R.string.T3_Story);

                    break;
            case 2:
                    if(topButton.getText().equals(getString(R.string.T2_Ans1))){
                        topButton.setText(R.string.T3_Ans1);
                        bottomButton.setText(R.string.T3_Ans2);
                        storyText.setText(R.string.T3_Story);
                    }
                    else{
                        topButton.setVisibility(View.GONE);
                        bottomButton.setVisibility(View.GONE);
                        storyText.setText(R.string.T6_End);
                    }
                    break;
            case 3:
                    topButton.setVisibility(View.GONE);
                    bottomButton.setVisibility(View.GONE);
                    storyText.setText(R.string.T6_End);
                    break;

        }
        mStoryIndex+=1;
    }

    public void CheckLower(){
        switch (mStoryIndex){
            case 1:
                    topButton.setText(R.string.T2_Ans1);
                    bottomButton.setText(R.string.T2_Ans2);
                    storyText.setText(R.string.T2_Story);
                    break;
            case 2:
                    if(bottomButton.getText().equals(getString(R.string.T2_Ans2))){
                        topButton.setVisibility(View.GONE);
                        bottomButton.setVisibility(View.GONE);
                        storyText.setText(R.string.T4_End);

                    }
                    else{
                        topButton.setVisibility(View.GONE);
                        bottomButton.setVisibility(View.GONE);
                        storyText.setText(R.string.T5_End);
                    }
                    break;
            case 3:
                    topButton.setVisibility(View.GONE);
                    bottomButton.setVisibility(View.GONE);
                    storyText.setText(R.string.T5_End);
                break;

        }
        mStoryIndex+=1;
    }

}

