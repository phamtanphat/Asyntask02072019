package phamtanphat.ptp.khoaphamtraining.asyntask02072019;

import androidx.appcompat.app.AppCompatActivity;

import android.os.AsyncTask;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    String ten;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Bat dau thuc thi
        //  Thuc thi cong viec 1
        //  Thuc thi cong viec 2
        //  Thuc thi cong viec 3
        //Thuc thi ket thuc
        //Ket thuc phan xu ly
    }
    //Nested class
    // inner class : Delegate

    // params : gia tri truyen vao cho phan xu ly logic
    // progress : gia tri khi xu ly se cap nhat len cho view
    // result : sau khi thuc thi xog day la du lieu tra ve
    class Xulytientrinh extends AsyncTask<String,String,String> {

        @Override
        protected void onPreExecute() {
            super.onPreExecute();
        }

        @Override
        protected String doInBackground(String... strings) {
            return null;
        }

        @Override
        protected void onProgressUpdate(String... values) {
            super.onProgressUpdate(values);
        }

        @Override
        protected void onPostExecute(String s) {
            super.onPostExecute(s);
        }
    }
}
