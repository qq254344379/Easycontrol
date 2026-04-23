package top.saymzx.easycontrol.app;

import android.app.Activity;
import android.os.Bundle;
import top.saymzx.easycontrol.app.helper.ViewTools;

public class ActiveActivity extends Activity {

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    ViewTools.setStatusAndNavBar(this);
    ViewTools.setLocale(this);
    // Activation bypassed - skip directly to main interface
    finish();
  }
}