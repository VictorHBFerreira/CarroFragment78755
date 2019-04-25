package br.com.fiap.carrofragment78755;

import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void bannerFusca(View view) { alterarFragment(new FuscaFragment());
    }

    public void bannervvvvv(View view) { alterarFragment(new Glitch());
    }

    public void bannerTesla(View view) { alterarFragment(new TeslaFragment());
    }

    public void bannerFerrari(View view) { alterarFragment(new FerrariFragment());
    }

    public void alterarFragment(Fragment fragment){
        getSupportFragmentManager().beginTransaction()
                .replace(R.id.fragmentContainer, fragment)
                .addToBackStack(null)
                .commit();
    }


}
