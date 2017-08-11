package assalaam.calculator.id.tempatnongkrong;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageButton;
import android.view.View;
import android.content.Intent;

/**
 * Created by Administrator on 8/8/2017.
 */

public class home2 extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home2);

        ImageButton next = (ImageButton) findViewById(R.id.imageButton2);
        next.setOnClickListener(new View .OnClickListener() {
            public void onClick(View bebek) {
                Intent myIntent = new
                        Intent(bebek.getContext(), Lawangwengi.class);
                startActivityForResult(myIntent, 0);
            }
        });

        ImageButton aa= (ImageButton) findViewById(R.id.imageButton);
        aa.setOnClickListener(new View.OnClickListener() {
            public void onClick(View bebek) {
                Intent myIntent = new
                        Intent(bebek.getContext(), Boberr.class);
                startActivityForResult(myIntent, 0);
            }
        });

        ImageButton bb = (ImageButton) findViewById(R.id.imageButton3);
        bb.setOnClickListener(new View.OnClickListener() {
            public void onClick(View bebek) {
                Intent myIntent = new
                        Intent(bebek.getContext(), WikiCoffe.class);
                startActivityForResult(myIntent, 0);
            }
        });

        ImageButton dd = (ImageButton) findViewById(R.id.imageButton4);
        dd.setOnClickListener(new View.OnClickListener() {
            public void onClick(View bebek) {
                Intent myIntent = new
                        Intent(bebek.getContext(), DakkenColonel.class);
                startActivityForResult(myIntent, 0);
            }
        });

        ImageButton ee = (ImageButton) findViewById(R.id.imageButton5);
        ee.setOnClickListener(new View.OnClickListener() {
            public void onClick(View bebek) {
                Intent myIntent = new
                        Intent(bebek.getContext(), Gasibu.class);
                startActivityForResult(myIntent, 0);
            }
        });

        ImageButton ff = (ImageButton) findViewById(R.id.imageButton6);
        ff.setOnClickListener(new View.OnClickListener() {
            public void onClick(View bebek) {
                Intent myIntent = new
                        Intent(bebek.getContext(), Pakarr.class);
                startActivityForResult(myIntent, 0);
            }
        });

        ImageButton gg = (ImageButton) findViewById(R.id.imageButton7);
        gg.setOnClickListener(new View.OnClickListener() {
            public void onClick(View bebek) {
                Intent myIntent = new
                        Intent(bebek.getContext(), SudirmasStreet.class);
                startActivityForResult(myIntent, 0);
            }
        });

    }
}
