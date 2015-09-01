package com.example.andresfelipe.novisa;

import android.app.AlertDialog;
import android.content.Intent;
import android.database.Cursor;
import android.net.Uri;
import android.provider.ContactsContract;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

public class PickContactActivity extends AppCompatActivity {

    static final int PICK_CONTACT =1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pick_contact);

        Button buttonOpenContactPicker = (Button) findViewById(R.id.buttonContactPicker);
        buttonOpenContactPicker.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                Intent intent = new Intent(Intent.ACTION_PICK, ContactsContract.Contacts.CONTENT_URI);
                startActivityForResult(intent,PICK_CONTACT);
            }
        });
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data)
    {
        super.onActivityResult(requestCode, resultCode, data);

        if(requestCode==PICK_CONTACT)
        {
            if(resultCode==RESULT_OK)
            {
                Cursor cursor = null;
                Cursor curme = null;
                String phoneNumber = "";
                int phoneIdx = 0;
                int nameColumn =0;
                String name ="";
                int emailColumn =0;
                String email ="";


                Uri result = data.getData();
                String id = result.getLastPathSegment();
                cursor = getContentResolver().query(ContactsContract.CommonDataKinds.Phone.CONTENT_URI, null, ContactsContract.CommonDataKinds.Phone.CONTACT_ID + "=?", new String[]{id}, null);
                phoneIdx = cursor.getColumnIndex(ContactsContract.CommonDataKinds.Phone.DATA);
                nameColumn = cursor.getColumnIndex(ContactsContract.CommonDataKinds.Phone.DISPLAY_NAME);
                curme = getContentResolver().query(ContactsContract.CommonDataKinds.Email.CONTENT_URI, null, ContactsContract.CommonDataKinds.Email.CONTACT_ID + "=?", new String[]{id}, null);
                emailColumn = curme.getColumnIndex(ContactsContract.CommonDataKinds.Email.ADDRESS);
                if (cursor.moveToNext()) {
                    while (cursor.isAfterLast() == false) {
                        phoneNumber = cursor.getString(phoneIdx);
                        name = cursor.getString(nameColumn);
                        email = cursor.getString(emailColumn);
                        cursor.moveToNext();
                        AlertDialog alertDialog;
                        alertDialog = new AlertDialog.Builder(this).create();
                        alertDialog.setTitle("Hola");
                        alertDialog.setMessage("resultado: " + phoneNumber + " " + name + "" + email);
                        alertDialog.show();

                        /*curme = getContentResolver().query(ContactsContract.CommonDataKinds.Email.CONTENT_URI, null, ContactsContract.CommonDataKinds.Email.CONTACT_ID + "=?", new String[]{id}, null);
                emailColumn = curme.getColumnIndex(ContactsContract.CommonDataKinds.Email.ADDRESS);
                if (curme.moveToNext()) {
                    while (curme.isAfterLast() == false) {
                        String emaill = curme.getString(
                                curme.getColumnIndex(ContactsContract.CommonDataKinds.Email.DATA));
                        String emailType = curme.getString(
                                curme.getColumnIndex(ContactsContract.CommonDataKinds.Email.TYPE));*/
                    }
                } else {
                    //no results actions
                }
                //String[] projection = {ContactsContract.CommonDataKinds.Phone.NUMBER};

                // Perform the query on the contact to get the NUMBER column
                // We don't need a selection or sort order (there's only one result for the given URI)
                // CAUTION: The query() method should be called from a separate thread to avoid blocking
                // your app's UI thread. (For simplicity of the sample, this code doesn't do that.)
                // Consider using CursorLoader to perform the query.
                //Cursor cursor = getContentResolver().query(contactData, null, null, null, null);



                /*if(cursor.getCount() > 0)
                {
                    while (cursor.moveToNext())
                    {
                        //int column = cursor.getColumnIndex(ContactsContract.CommonDataKinds.Phone.NUMBER);
                        //String number = cursor.getString(column);
                        String number = cursor.getString(cursor.getColumnIndexOrThrow(ContactsContract.CommonDataKinds.Phone.NUMBER));
                        AlertDialog alertDialog;
                        alertDialog = new AlertDialog.Builder(this).create();
                        alertDialog.setTitle("Hola");
                        alertDialog.setMessage("resultado" );
                        alertDialog.show();
                        //String name = cursor.getString(cursor.getColumnIndex(ContactsContract.CommonDataKinds.Identity.DISPLAY_NAME));
                    }
                }
                //Cursor c =  managedQuery(contactData, null, null, null, null);*/
            }
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_pick_contact, menu);
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
