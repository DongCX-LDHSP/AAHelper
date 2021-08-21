package com.dcx.AAHelper.AAActivities;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

import com.dcx.AAHelper.R;
import com.dcx.AAHelper.Utils.ToastMaker;

public class SimpleAAActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_simple_a_a);

        /* 展示提示语 */
        ToastMaker.showShortToast(this, getString(R.string.simpleAAMessage));
    }

    public void returnHomepage(View view) {
        finish();
    }

    public void computeTheFee(View view) {
        /* TODO: 在这里执行计算费用的操作 */

        /* TODO: 计算完成之后，跳转到结果展示界面，
           这里肯定要传送给结果页面封装好的数据，
           考虑到后期想要实现“生成计算过程的功能点”，
           这里肯定需要设计一个数据结构出来，
           这也就决定了之后还要对这块的跳转语句进行修改 */
        Intent intent = new Intent(this, ShowResultActivity.class);
        startActivity(intent);
    }
}
