package cn.edu.gdmec.android.mobileguard.m2theftguard;

import android.os.Bundle;
import android.widget.RadioButton;

import cn.edu.gdmec.android.mobileguard.R;

public class Setup4Activty extends BaseSetupActivity {

    @Override
    public void showNext() {
        startActivityAndFinishSelf(LostFindActivity.class);
    }

    @Override
    public void showPre() {
        startActivityAndFinishSelf(Setup3Activty.class);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_setup4_activty);
        //设置第四个小圆点的颜色
        ((RadioButton)findViewById(R.id.rb_four)).setChecked(true);
    }
}
