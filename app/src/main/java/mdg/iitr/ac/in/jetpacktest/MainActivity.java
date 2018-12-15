package mdg.iitr.ac.in.jetpacktest;

import androidx.appcompat.app.AppCompatActivity;

import android.net.Uri;
import android.os.Bundle;

import mdg.iitr.ac.in.jetpacktest.ui.main.LoginFragment;
import mdg.iitr.ac.in.jetpacktest.ui.main.MainFragment;

public class MainActivity extends AppCompatActivity implements LoginFragment.OnFragmentInteractionListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main_activity);
    }

    @Override
    public void onFragmentInteraction(Uri uri) {

    }
}
