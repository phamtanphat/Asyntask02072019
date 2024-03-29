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
            protected void onPreExecute() {
                mtxt.setText("Bat dau thuc thi");
                super.onPreExecute();
            }

            @Override
            protected String doInBackground(String... strings) {
                for (int i = 1; i <= 3; i++) {
                    String congviec = "Thuc thi cong viec " + i;
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    publishProgress(congviec);
                }
                return "Thuc thi ket thuc";
            }

            @Override
            protected void onProgressUpdate(String... values) {
                mtxt.append("\n" + values[0]);
                super.onProgressUpdate(values);
            }

            @Override
            protected void onPostExecute(String s) {
                mtxt.append("\n" + s);
                mtxt.append("\n" + "Ket thuc phan xu ly");
                super.onPostExecute(s);
            }
        };
    }

}
