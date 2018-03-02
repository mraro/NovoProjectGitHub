package com.example.t_ex_140542.novoprojectgithub;

import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Gravity;
import android.view.MenuItem;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        BottomNavigationView bottomNavigationView = (BottomNavigationView)findViewById(R.id.bottomNav);

        bottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                switch (item.getItemId()){
                    case R.id.recents:
                        Toast toast = Toast.makeText(MainActivity.this,"Clique para recentes", Toast.LENGTH_LONG);
                        toast.setGravity(Gravity.CENTER_HORIZONTAL |Gravity.CENTER_VERTICAL,0,0);
                        toast.show();

                        break;

                    case R.id.favorite:
                        Toast toast2 = Toast.makeText(MainActivity.this,"Clique para Favoritos", Toast.LENGTH_LONG);
                        toast2.setGravity(Gravity.CENTER_HORIZONTAL |Gravity.CENTER_VERTICAL,0,0);
                        toast2.show();

                        break;

                    case R.id.location:
                        Toast toast3 = Toast.makeText(MainActivity.this,"Clique para Localizaçãp", Toast.LENGTH_LONG);
                        toast3.setGravity(Gravity.CENTER_HORIZONTAL |Gravity.CENTER_VERTICAL,0,0);
                        toast3.show();

                        break;
                }
                return true;
            }
        });
    }
}


