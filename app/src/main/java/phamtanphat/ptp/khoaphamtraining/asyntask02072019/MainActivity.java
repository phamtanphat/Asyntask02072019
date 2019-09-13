package phamtanphat.ptp.khoaphamtraining.asyntask02072019;

import androidx.appcompat.app.AppCompatActivity;

import android.os.AsyncTask;
import android.os.Bundle;
import android.os.Handler;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView txt;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txt = findViewById(R.id.textview);

    }
    //Nested class
    // inner class : Delegate

    // params : gia tri truyen vao cho phan xu ly logic
    // progress : gia tri khi xu ly se cap nhat len cho view
    // result : sau khi thuc thi xog day la du lieu tra ve


    //Bat dau thuc thi
    //  Thuc thi cong viec 1
    //  Thuc thi cong viec 2
    //  Thuc thi cong viec 3
    //Thuc thi ket thuc
    //Ket thuc phan xu ly
    class Xulytientrinh extends AsyncTask<Void,String,String> {
        @Override
        protected void onPreExecute() {
            new Handler().postDelayed(new Runnable() {
                @Override
                public void run() {
                    txt.setText("Bat dau thuc thi \n");
                }
            }, 2000);
            super.onPreExecute();
        }

        @Override
        protected String doInBackground(Void... voids) {
            for (int i = 1 ; i <= 3 ; i++ ){
                try {
                    String congviec = "Thuc thi cong viec " + i;
                    Thread.sleep(1000);
                    publishProgress(congviec);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            return "Thuc thi ket thuc";
        }
        @Override
        protected void onProgressUpdate(String... values) {
            txt.append(values[0] + "\n");
            super.onProgressUpdate(values);
        }

        @Override
        protected void onPostExecute(String s) {
            txt.append(s + "\n");
            txt.append("Ket thuc phan xu ly");
            super.onPostExecute(s);
        }

    }


}
