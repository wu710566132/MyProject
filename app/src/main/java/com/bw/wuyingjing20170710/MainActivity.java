package com.bw.wuyingjing20170710;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends Activity {

    private AmountView mAmountView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mAmountView = (AmountView) findViewById(R.id.amount_view);
        mAmountView.setGoods_storage(50);
        //	点击加减按钮数量改变。
        mAmountView.setOnAmountChangeListener(new AmountView.OnAmountChangeListener() {

            @Override
            public void onAmountChange(View view, int amount) {
                Toast.makeText(getApplicationContext(), "数量: " + amount, Toast.LENGTH_SHORT).show();
            }

        });
    }
}
