package com.example.a21609143.mrfox;

import android.content.Intent;
import android.support.design.widget.Snackbar;
import android.support.v4.widget.SwipeRefreshLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.RelativeLayout;
import android.widget.Toast;

public class MyMain extends AppCompatActivity {

    private SwipeRefreshLayout swipeLayout;
    private SwipeRefreshLayout.OnRefreshListener mOnRefreshListener;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        swipeLayout = findViewById(R.id.swr);
        final RelativeLayout mrelativeLayout = (RelativeLayout) findViewById(R.id.rlMain);

        mOnRefreshListener = new SwipeRefreshLayout.OnRefreshListener() {
            @Override
            public void onRefresh() {

                Snackbar snackbar = Snackbar
                        .make(mrelativeLayout, "lost your Fox?", Snackbar.LENGTH_LONG)
                        .setAction("UNDO", new View.OnClickListener() {
                            @Override
                            public void onClick(View view) {
                            }
                        });

                snackbar.show();

                swipeLayout.setRefreshing(false);
            }
            //Toast.makeText(MyMain.this,"lost your Fox?",Toast.LENGTH_SHORT).show();

        };

        swipeLayout.setOnRefreshListener(mOnRefreshListener);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu,menu);
        return true;
    }

}
