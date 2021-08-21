package com.dcx.AAHelper.InfoActivities;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.dcx.AAHelper.R;

/**
 * @author DongCX-LDHSP
 * @date 2021.08.21
 * 展示关于AAHelper的一些信息：
 *     - 作者
 *     - 开源仓库地址
 *     - 何处寻求帮助
 */
public class AboutAAHelperActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about_a_a_helper);
    }
}