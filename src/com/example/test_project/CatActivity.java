package com.example.test_project;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

/**
 * Created with IntelliJ IDEA.
 * User: user
 * Date: 09.11.13
 * Time: 17:20
 * To change this template use File | Settings | File Templates.
 */
public class CatActivity extends Activity implements View.OnClickListener
{
    @Override
    public void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.cat);

        final Button buttonBack = (Button) findViewById(R.id.btn_back);
        buttonBack.setOnClickListener(this);
    }

    @Override
    public void onClick(View view)
    {
        switch (view.getId())
        {
            case R.id.btn_back:

                finish();
                break;

        }
    }
}
