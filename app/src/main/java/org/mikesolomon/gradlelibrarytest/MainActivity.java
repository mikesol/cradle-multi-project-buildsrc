package org.mikesolomon.gradlelibrarytest;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import org.mikesolomon.mylib.MyLibraryClass;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        MyLibraryClass a = new MyLibraryClass();
    }
}
