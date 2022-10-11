package com.example.myapplicationcsdn;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    int size=30;
    public void bigger(View v){     // 按钮对应的 onclick 响应
        TextView txv;
        txv= (TextView) findViewById(R.id.txv);  // 根据ID找到对应的text对象
        txv.setTextSize(++size);       // 修改对象的字符大小-size
    }
    public void small(View v){     // 按钮对应的 onclick 响应
        TextView txv;
        txv= (TextView) findViewById(R.id.txv);  // 根据ID找到对应的text对象
        txv.setTextSize(--size);       // 修改对象的字符大小-size
    }
    public void color(View v){// 按钮对应的 onclick 响应

        int r = (int)(Math.random()*256);
        int g = (int)(Math.random()*256);
        int b = (int)(Math.random()*256);
        TextView txv;
        txv= (TextView) findViewById(R.id.txv);  // 根据ID找到对应的text对象
        txv.setTextColor(Color.rgb(r,g,b));      // 修改对象的字符大小-size
    }

    public void display(View v){     // 另外一个按钮对应的 onclick 响应
        EditText name= (EditText) findViewById(R.id.name);  //还是根据ID找到对象，并进行接下来的操作
        TextView text2= (TextView) findViewById(R.id.txv);

        text2.setText(name.getText().toString());   // 设置字符
    }
}