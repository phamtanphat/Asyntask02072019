package phamtanphat.ptp.khoaphamtraining.asyntask02072019;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.AsyncTask;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView mtxt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mtxt = findViewById(R.id.textview);
        //Bat dau thuc thi
        //  Thuc thi cong viec 1
        //  Thuc thi cong viec 2
        //  Thuc thi cong viec 3
        //Thuc thi ket thuc
        //Ket thuc phan xu ly


        // class vo danh
        xuytientrinh().execute();
    }
    @SuppressLint("StaticFieldLeak")
    private AsyncTask<String,String,String> xuytientrinh(){
        return new AsyncTask<String, String, String>() {
            @Override
            protected String doInBackground(String... strings) {
                return null;
            }
        };
    }

}
