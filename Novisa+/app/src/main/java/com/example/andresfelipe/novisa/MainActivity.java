package com.example.andresfelipe.novisa;

//import com.example.andresfelipe.novisa.CreateNewUsers;
import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;


public class MainActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button buttonCreateMNA = (Button) findViewById(R.id.buttonCreateNewUser);
        buttonCreateMNA.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                Intent create = new Intent(MainActivity.this,CreateNewUsers.class);
                startActivity(create);
            }
        });

        Button buttonForgotPassword = (Button) findViewById(R.id.buttonForgotPassword);
        buttonForgotPassword.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                Intent create = new Intent(MainActivity.this,PickContactActivity.class);
                startActivity(create);
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
