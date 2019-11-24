package comandydevo.wixsite.seemantshekhar43.reminder;

import android.os.CountDownTimer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //calling the text views
        final TextView textView1 = (TextView)findViewById(R.id.mnumber);
        final TextView textView2 = (TextView)findViewById(R.id.result);

        //setting the countdown timer

        new CountDownTimer(10000,1000){
            public void onTick(long millisecondUntilDone){
                textView1.setText("Time: " + String.valueOf(millisecondUntilDone/1000));
            }
            public void onFinish(){
                textView2.setText("Done!!!");
                textView1.setText("0");
            }
        }.start();

    }
}
