package assalaam.calculator.id.tempatnongkrong;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.webkit.WebView;

/**
 * Created by Administrator on 8/7/2017.
 */

public class Web extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_web);

        WebView view = (WebView) findViewById(R.id.weeb);
        view.loadUrl("https//www.smkassalaambandung.sch.id");
    }
}
