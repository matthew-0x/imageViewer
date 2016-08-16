package com.nasaimage.imageviewer;

import android.app.ProgressDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main_activity);

    }

    public void onRefresh(View v){
        ProgressDialog dialog = ProgressDialog.show(this, "Loading", "In progress...");
        TextView tv=(TextView)findViewById(R.id.imageTitle);
        tv.setText(R.string.app_name);
        try {
            Thread.sleep(5000);
        }catch(Exception e){
            e.printStackTrace();
        }
        dialog.dismiss();
    }
}
