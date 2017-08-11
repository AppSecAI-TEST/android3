package assalaam.calculator.id.tempatnongkrong;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class home extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        ImageButton next = (ImageButton) findViewById(R.id.playy);
        next.setOnClickListener(new View.OnClickListener() {
            public void onClick(View bebek) {
                Intent myIntent = new
                        Intent(bebek.getContext(), home2.class);
                startActivityForResult(myIntent, 0);
            }
        });

        ImageButton xx = (ImageButton) findViewById(R.id.profilx);
        xx.setOnClickListener(new View.OnClickListener() {
            public void onClick(View bebek) {
                Intent myIntent = new
                        Intent(bebek.getContext(), Profil.class);
                startActivityForResult(myIntent, 0);
            }
        });

        ImageButton zz = (ImageButton) findViewById(R.id.webb);
        zz.setOnClickListener(new View.OnClickListener() {
            public void onClick(View bebek) {
                Intent myIntent = new
                        Intent(bebek.getContext(), Web.class);
                startActivityForResult(myIntent, 0);
            }
        });
    }
}
