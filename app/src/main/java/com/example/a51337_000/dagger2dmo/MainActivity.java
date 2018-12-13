package com.example.a51337_000.dagger2dmo;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import com.example.a51337_000.dagger2dmo.test1.DaggerWufanComponent1;
import com.example.a51337_000.dagger2dmo.test1.Wufan1;
import com.example.a51337_000.dagger2dmo.test2.DaggerWufanComponent2;
import com.example.a51337_000.dagger2dmo.test2.Wufan2;
import com.example.a51337_000.dagger2dmo.test3.DaggerWufanComponent3;
import com.example.a51337_000.dagger2dmo.test3.Wufan3;
import com.example.a51337_000.dagger2dmo.test4.DaggerWufanComponent4;
import com.example.a51337_000.dagger2dmo.test4.Wufan4;
import com.example.a51337_000.dagger2dmo.test5.DaggerWufanComponent5;
import com.example.a51337_000.dagger2dmo.test5.Wufan5;
import com.example.a51337_000.dagger2dmo.test6.DaggerWufanComponent6;
import com.example.a51337_000.dagger2dmo.test6.Wufan6;
import com.example.a51337_000.dagger2dmo.test6.WufanModule6;

/*
* https://blog.csdn.net/briblue/article/details/75578459
* */

public class MainActivity extends AppCompatActivity {
    public static final String TAG = MainActivity.class.getSimpleName() + "=====>>>>>";
    Button bt1, bt2, bt3, bt4, bt5, bt6;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        bt1 = findViewById(R.id.bt1);
        bt2 = findViewById(R.id.bt2);
        bt3 = findViewById(R.id.bt3);
        bt4 = findViewById(R.id.bt4);
        bt5 = findViewById(R.id.bt5);
        bt6 = findViewById(R.id.bt6);

        final Wufan1 wufan1 = DaggerWufanComponent1.builder().build().chisha1();
        bt1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.d(TAG, wufan1.eat());
            }
        });

        final Wufan2 wufan2 = DaggerWufanComponent2.builder().build().chisha2();
        bt2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.d(TAG, wufan2.eat());
            }
        });

        final Wufan3 wufan3 = DaggerWufanComponent3.builder().build().chisha3();
        bt3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.d(TAG, wufan3.eat());
            }
        });

        final Wufan4 wufan4 = DaggerWufanComponent4.builder().build().chisha4();
        bt4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.d(TAG, wufan4.eat());
            }
        });

        final Wufan5 wufan5 = DaggerWufanComponent5.builder().build().chisha5();
        bt5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.d(TAG, wufan5.eat());
            }
        });

        final Wufan6 wufan6 = DaggerWufanComponent6.builder().wufanModule6(new WufanModule6("老李饭馆")).build().chisha6();
        bt6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.d(TAG, wufan6.eat());
            }
        });
    }
}
