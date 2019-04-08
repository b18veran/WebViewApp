package com.example.brom.webviewapp;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.webkit.WebSettings;
import android.webkit.WebView;


public class MainActivity extends AppCompatActivity {
    // Create a private member variable that can hold our WebView
   // WebView webView = new WebView(this);
    private WebView webview;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        /* This code is run when the App is created. Include code that creates your WebView */
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        webview = findViewById(R.id.webviews);

        //Dessa gör att det går att klicka på appen.
       // setContentView(webView);
        WebSettings websettings = webview.getSettings();
        websettings.setJavaScriptEnabled(true);
        //webView.loadUrl("http://wwwlab.iit.his.se/b18veran/Mobilappdesign/App/App-Om.html");
        webview.loadUrl("file:///android_asset/about.html");

        // 1. Create a WebView element in the layout file content_main.xml
        // -- Commit and push to your github fork
        // 2. Give the WebView element created in step 1 ID "my_webview"
        // Enter your code that creates your WebView here...
        /*
        <WebView
        android:id="@+id/my_webview"
        android:layout_width="match_parent"
        android:layout_height="match_parent" />
        */
        // -- Commit and push to your github fork

        // 3. Locate the WebView element created in step 1 using the ID created in step 2

        // 4. Create a new WebViewClient to attach to our WebView. This allows us to
        //    browse the web inside our app.
        // -- Commit and push to your github fork
        // 5. Enter the url to load in our WebView
        // -- Commit and push to your github fork
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
            webview.loadUrl("http://wwwlab.iit.his.se/b18veran/Mobilappdesign/App/App-Om.html");
            return true;
        }
        if (id == R.id.action_setting) {
            webview.loadUrl("file:///android_asset/about.html");
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
