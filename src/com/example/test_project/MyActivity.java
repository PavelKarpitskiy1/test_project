package com.example.test_project;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MyActivity extends Activity implements View.OnClickListener
{
    /**
     * Called when the activity is first created.
     */
    @Override
    public void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.main);

        Button buttonShowCat = (Button) findViewById(R.id.btn_show_cat);
        buttonShowCat.setOnClickListener(this);

        findViewById(R.id.view).setOnClickListener(this);
    }

    @Override
    protected void onSaveInstanceState(Bundle outState)
    {
        super.onSaveInstanceState(outState);
    }

    @Override
    public void onClick(View view)
    {
        switch (view.getId())
        {
            case R.id.btn_show_cat:

                startActivity(new Intent(this, CatActivity.class));
                break;

            case R.id.view:

                Toast.makeText(this, getString(R.string.alert_view_clicked), Toast.LENGTH_SHORT).show();
                break;
        }
    }
}
