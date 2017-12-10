package com.fju.mid2;

import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import java.util.Random;

public class Func1Activity extends AppCompatActivity {
    Random random=new Random();
    int[]dicepicture={
            R.drawable.d1,R.drawable.d2,R.drawable.d3,R.drawable.d4,R.drawable.d5,R.drawable.d6
    };


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_func1);

    }

    public void f9(View view) {
        int r = random.nextInt(6)+1;
        ImageView qq =findViewById(R.id.button10);
        new AlertDialog.Builder(this)
                .setMessage(r + " ")
                .show();


        switch (r){
            case 1:
                qq.setImageResource(dicepicture[0]);
                break;
            case 2:
                qq.setImageResource(dicepicture[1]);
                break;
                case 3:
                    qq.setImageResource(dicepicture[2]);
                    break;
            case 4:
                qq.setImageResource(dicepicture[3]);
                break;
            case 5:
                qq.setImageResource(dicepicture[4]);
                break;
            case 6:
                qq.setImageResource(dicepicture[5]);
                break;
        }
    }

}
