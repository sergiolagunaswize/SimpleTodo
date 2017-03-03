package com.wizeline.shekomaru.simpletodo;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;

public class EditItemActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_edit_item);

        EditText editText = (EditText) findViewById(R.id.et_edit);
        editText.setText(getIntent().getStringExtra("content"));

        findViewById(R.id.bt_edit_confirm).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                EditText editText = (EditText) findViewById(R.id.et_edit);
                String newContent = editText.getText().toString();
                if (!newContent.equals("")) {
                    setResult(RESULT_OK, getIntent());
                    getIntent().putExtra("content", newContent);
                    finish();
                }
            }
        });
    }
}
