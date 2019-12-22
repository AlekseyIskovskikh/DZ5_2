package com.example.appbar;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class NotesActivity extends AppCompatActivity {
    private EditText mInputNote;
    private Button mBtnSaveNote;
    private static String NOTE_TEXT = "note_text";
    private SharedPreferences myNoteSharedPref;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initViews();
        getDateFromSharedPref();
    }

    private void initViews(){
       mBtnSaveNote = findViewById(R.id.btnSaveNote);
       mInputNote = findViewById(R.id.inputNote);

       myNoteSharedPref = getSharedPreferences("MyNote", MODE_PRIVATE);

       mBtnSaveNote.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {
               SharedPreferences.Editor myEditor = myNoteSharedPref.edit();
               String noteTxt = mInputNote.getText().toString();
               myEditor.putString(NOTE_TEXT, noteTxt);
               myEditor.apply();
               Toast.makeText(NotesActivity.this, "данные сохранены", Toast.LENGTH_LONG).show();
           }
       });
    }
    private void getDateFromSharedPref(){
        String noteTxt = myNoteSharedPref.getString(NOTE_TEXT, "");
        mInputNote.setText(noteTxt);
    }
}
