package com.example.mac.a;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
/**
 * Created by mac on 5/18/15.
 */
public class MusicService extends BroadcastReceiver
{
   public  void onReceive(Context paramContext,Intent parmIntent)
   {
       Intent l =new Intent(paramContext,MainActivity.class);
       l.addFlags(R.layout.activity_main);
       paramContext.startActivity(l);
   }
}
