package org.testing.preferencefragment_test;

import android.os.Bundle;
import android.preference.PreferenceActivity;
// Not working:
import android.support.v4.preference.PreferenceFragment;
// working:
//import android.preference.PreferenceFragment;

import java.util.List;

public class ApplicationPreferencesActivity extends PreferenceActivity {
  @Override
  public void onBuildHeaders(List<Header> target) {
    loadHeadersFromResource(R.xml.preference_headers, target);
  }

  @Override
  protected boolean isValidFragment (String fragmentName)
  {
    return (SettingsFragmentTest.class.getName().equals(fragmentName));
  }

  public static class SettingsFragmentTest extends PreferenceFragment {
    @Override
    public void onCreate(Bundle savedInstanceState) {
      super.onCreate(savedInstanceState);
      addPreferencesFromResource(R.xml.settings_test);
    }
  }
}