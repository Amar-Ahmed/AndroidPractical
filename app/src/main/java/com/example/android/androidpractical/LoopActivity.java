package com.example.android.androidpractical;

import android.content.Intent;
import android.os.AsyncTask;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;


public class LoopActivity extends AppCompatActivity {
    //private EditText time;
    private TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_loop);
         textView = (TextView) findViewById(R.id.textview01);
        //Starting the task.
        new AsynchronousTask().execute();
        Intent intent = new Intent(this, LoginActivity.class);
        startActivity(intent);

    }

    // The definition of our task class
    private class AsynchronousTask extends AsyncTask<Integer, Integer, Integer> {
        @Override
        protected void onPreExecute() {
            super.onPreExecute();
        }

        @Override
        protected Integer doInBackground(Integer... params) {
            int num =0;

            for (int i = 0; i <= 100000; i++) {
                num=i;

            }
            return num ;
        }

        @Override
        protected void onProgressUpdate(Integer... values) {
            super.onProgressUpdate(values);
            textView.setProgress(num);
        }

        @Override
        protected void onPostExecute(Integer result) {
            super.onPostExecute(result);
            textView.setText("Loop completed");
        }
    }
}
