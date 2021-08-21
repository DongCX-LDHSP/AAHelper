package com.dcx.AAHelper;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

import com.dcx.AAHelper.AAActivities.DayAAActivity;
import com.dcx.AAHelper.AAActivities.PersonAAActivity;
import com.dcx.AAHelper.AAActivities.SimpleAAActivity;
import com.dcx.AAHelper.InfoActivities.AboutAAHelperActivity;
import com.dcx.AAHelper.InfoActivities.RentTipActivity;
import com.dcx.AAHelper.Utils.ToastMaker;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ToastMaker.showShortToast(this, getString(R.string.homepageMessage));
    }

    public void simpleAA(View view) {
        Intent intent = new Intent(this, SimpleAAActivity.class);
        startActivity(intent);
    }

    public void dayAA(View view) {
        Intent intent = new Intent(this, DayAAActivity.class);
        startActivity(intent);
    }

    public void personAA(View view) {
        Intent intent = new Intent(this, PersonAAActivity.class);
        startActivity(intent);
    }

    public void showRentTip(View view) {
        Intent intent = new Intent(this, RentTipActivity.class);
        startActivity(intent);
    }

    public void showAboutAAHelper(View view) {
        Intent intent = new Intent(this, AboutAAHelperActivity.class);
        startActivity(intent);
    }
}
