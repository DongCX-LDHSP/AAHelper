package com.dcx.AAHelper.AAActivities;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import com.dcx.AAHelper.R;
import com.dcx.AAHelper.Utils.ToastMaker;

public class DayAAActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_day_a_a);

        ToastMaker.showShortToast(this, getString(R.string.dayAAMessage));
    }
}