package com.example.flutteruikit;

import android.os.Bundle;
import io.flutter.app.FlutterActivity;
import io.flutter.plugins.GeneratedPluginRegistrant;
import android.view.WindowManager.LayoutParams;

public class MainActivity extends FlutterActivity {
  @Override
 // public static final int FLAG_SECURE;
  protected void onCreate(Bundle savedInstanceState) {
    
    super.onCreate(savedInstanceState);
    
    GeneratedPluginRegistrant.registerWith(this);
    //getWindow().setFlags(WindowManager.LayoutParams.FLAG_SECURE, WindowManager.LayoutParams.FLAG_SECURE);
    getWindow().addFlags(LayoutParams.FLAG_SECURE);
  }
}

  