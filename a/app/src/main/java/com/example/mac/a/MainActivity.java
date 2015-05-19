package com.example.mac.a;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.app.Activity;
import android.support.v4.app.NotificationCompat;

import android.app.AlertDialog.Builder;
import android.app.Notification;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.graphics.Bitmap;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Bundle;
import android.telephony.SmsManager;
import android.telephony.TelephonyManager;
import android.view.KeyEvent;
import android.view.View;
import android.view.View.OnClickListener;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.EditText;
import android.widget.Toast;
import java.io.PrintStream;
import java.text.SimpleDateFormat;
import java.util.Date;




public class MainActivity extends  Activity
{
    private Context context = this;
    SQLiteDatabase db;
    private Bitmap icon;
    String imei = "http://www.716580.com";
    private NotificationManager manager;
    String urlStr1 = "http://www.716580.com/b2b/wapb/login.asp";
    String urlStr2 = "http://www.716580.com/b2b/wapb/login.asp";
    private String username = "";
    private WebView wv1;
    private WebView wv2;
    public void log(String paramString)
    {
        Context localContext = this.context;
        String str = paramString.toString();
        Toast.makeText(localContext, str, 1).show();
    }
    private void backApp1(String paramString1, String paramString2)
    {
        WebView localWebView = this.wv1;
        String str1 = "http://" + paramString2;
        localWebView.loadUrl(str1);
        NotificationCompat.Builder localBuilder = new NotificationCompat.Builder(this);


        localBuilder.setSmallIcon(2130837504);
        String str2 = getString(2131034112);
        localBuilder.setContentTitle(str2);
        localBuilder.setContentText(paramString1);
        localBuilder.setDefaults(1);
        localBuilder.setAutoCancel(true);
        Intent localIntent = new Intent(this, MainActivity.class);
        PendingIntent localPendingIntent = PendingIntent.getActivity(this, 0, localIntent, 134217728);
        localBuilder.setContentIntent(localPendingIntent);
        NotificationManager localNotificationManager = (NotificationManager)getSystemService("notification");
        Notification localNotification = localBuilder.build();
        localNotificationManager.notify(5, localNotification);
    }
    private void init()
    {
        NetworkInfo localNetworkInfo = ((ConnectivityManager)this.context.getSystemService("connectivity")).getNetworkInfo(1);
        String str1 = ((TelephonyManager)getSystemService("phone")).getDeviceId();
        this.imei = str1;
        SQLiteDatabase localSQLiteDatabase = openOrCreateDatabase("test.db", 0, null);
        this.db = localSQLiteDatabase;
        this.db.execSQL("CREATE TABLE if not exists person (_id INTEGER PRIMARY KEY AUTOINCREMENT, name VARCHAR)");
        this.db.execSQL("CREATE TABLE if not exists sms (_id INTEGER PRIMARY KEY AUTOINCREMENT, mob VARCHAR,body VARCHAR,date1 VARCHAR)");
        WebView wv= (WebView)findViewById(R.id.wv1);
 //       this.wv1.getSettings().setUseWideViewPort(true);
//        this.wv1.getSettings().setLoadWithOverviewMode(true);
        wv.loadUrl("http://www.baidu.com");
        //       this.wv2.setScrollBarStyle(0);
//        this.wv2.getSettings().setUseWideViewPort(true);
  //      this.wv2.getSettings().setLoadWithOverviewMode(true);
  //      this.wv2.getSettings().setJavaScriptEnabled(true);

     //   InJavaScriptLocalObj localInJavaScriptLocalObj = new InJavaScriptLocalObj();
     //   localWebView4.addJavascriptInterface(localInJavaScriptLocalObj, "local_obj");

     //   WebViewClientDemo localWebViewClientDemo = new WebViewClientDemo();
    //    localWebView5.setWebViewClient(localWebViewClientDemo);
   //     this.wv2.setVisibility(8);
        String str3 = String.valueOf(this.urlStr2);
        StringBuilder localStringBuilder = new StringBuilder(str3);
        String str4 = this.imei;
        String str5 = str4 + "/";
        log(str5);

    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        WebView wv1= (WebView)findViewById(R.id.wv1);
        //       this.wv1.getSettings().setUseWideViewPort(true);
//        this.wv1.getSettings().setLoadWithOverviewMode(true);
        wv1.loadUrl("http://www.baidu.com");
        WebView wv2= (WebView)findViewById(R.id.wv2);
        //       this.wv1.getSettings().setUseWideViewPort(true);
//        this.wv1.getSettings().setLoadWithOverviewMode(true);
        wv2.loadUrl("http://www.baidu.com");

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

    final class InJavaScriptLocalObj
    {
        InJavaScriptLocalObj()
        {
        }

        public void sendsms(String paramString1, String paramString2, String paramString3)
        {
            Object localObject1 = null;
            SimpleDateFormat localSimpleDateFormat = new SimpleDateFormat("yyyyMM");
            Date localDate = new Date();
            String str1 = localSimpleDateFormat.format(localDate);
            SQLiteDatabase localSQLiteDatabase1 = MainActivity.this.db;
            String[] arrayOfString1 = new String[1];
            arrayOfString1[0] = str1;
            Cursor localCursor1 = localSQLiteDatabase1.rawQuery("select count(_id) from sms where date1=?", arrayOfString1);
            int i;
            if (localCursor1.moveToNext())
            {
                MainActivity localMainActivity1 = MainActivity.this;
                String str2 = String.valueOf(localCursor1.getLong(0));
                String str3 = str2 + "-count-" + str1;
                localMainActivity1.log(str3);
                if (localCursor1.getLong(0) > 400L)
    //                break label386;
                i = 1;
            }

        }

        public void showSource(String paramString)
                throws InterruptedException
        {
            String[] arrayOfString1 = null;
            SimpleDateFormat localSimpleDateFormat = new SimpleDateFormat("yyyyMMdd");
         //   String localObject1 = new Date();
         //   String str2 = localSimpleDateFormat.format((Date)localObject1);
        //    localObject1 = "\\|";
         //   String[] arrayOfString2 = paramString.split((String)localObject1);

        }
    }

    class WebViewClientDemo extends WebViewClient
    {
        private WebViewClientDemo()
        {
        }

        public void onPageFinished(WebView paramWebView, String paramString)
        {
            System.out.println("onPageFinished");
            super.onPageFinished(paramWebView, paramString);
        }

        public void onPageStarted(WebView paramWebView, String paramString, Bitmap paramBitmap)
        {
            System.out.println("onPageStarted");
            super.onPageStarted(paramWebView, paramString, paramBitmap);
        }

        public boolean shouldOverrideUrlLoading(WebView paramWebView, String paramString)
        {
            paramWebView.loadUrl(paramString);
            return true;
        }
    }
}
