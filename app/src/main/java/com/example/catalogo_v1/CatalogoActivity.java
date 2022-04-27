package com.example.catalogo_v1;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class CatalogoActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        FragmentManager fm = getSupportFragmentManager();
        Fragment fragmento = fm.findFragmentById(R.id.container_do_fragmento);
        if (fragmento == null){
            fragmento = new ProdutoFragment();
            fm.beginTransaction()
                    .add(R.id.container_do_fragmento, fragmento)
                    .commit();

        }
    }
}