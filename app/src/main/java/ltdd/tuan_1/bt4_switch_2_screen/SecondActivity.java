package ltdd.tuan_1.bt4_switch_2_screen;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.widget.Button;

public class SecondActivity extends Activity {

    Button btnSecond;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        btnSecond =findViewById(R.id.to_mainAct_button);

        btnSecond.setOnClickListener(view -> {
            Intent intent = new Intent(SecondActivity.this, MainActivity.class);
            startActivity(intent);
        });
    }
}
