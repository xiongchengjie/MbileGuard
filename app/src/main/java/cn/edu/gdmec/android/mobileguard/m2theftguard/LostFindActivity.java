package cn.edu.gdmec.android.mobileguard.m2theftguard;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import cn.edu.gdmec.android.mobileguard.R;

public class LostFindActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lost_find);
        startSetUpActivity();
    }
    private void startSetUpActivity(){
        Intent intent = new Intent(LostFindActivity.this,Setup1Activty.class);
        startActivity(intent);
        finish();


    }
}
