package com.example.lottogame;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.Date;

public class MainActivity extends AppCompatActivity {

    EditText txn1,txn2,txn3;
    ImageView ivplay;
    TextView tvn1,tvn2,tvn3,tvresult;
    RecyclerView rc;
   ArrayList<GameResult> arr =new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
         rc = findViewById(R.id.rc);
        rc.setLayoutManager(new LinearLayoutManager(getApplicationContext()));

        txn1 =  findViewById(R.id.txn1);
        txn2 =  findViewById(R.id.txn2);
        txn3 =  findViewById(R.id.txn3);
        ivplay =  findViewById(R.id.ivplay);
        tvn1 =  findViewById(R.id.tvn1);
        tvn2 =  findViewById(R.id.tvn2);
        tvn3 =  findViewById(R.id.tvn3);
        tvresult=  findViewById(R.id.tvresult);


        ivplay.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                try {


                    int n1 = (int) ((Math.random() * (31 - 1)) + 1);
                    int n3 = (int) ((Math.random() * (31 - 1)) + 1);
                    int n2 = (int) ((Math.random() * (31 - 1)) + 1);


                    tvn1.setText(n1 + "");
                    tvn2.setText(n2 + "");
                    tvn3.setText(n3 + "");


                    int c1 = Integer.parseInt(txn1.getText().toString());
                    int c2 = Integer.parseInt(txn2.getText().toString());
                    int c3 = Integer.parseInt(txn3.getText().toString());
                   /*


                   kjdijgldjjg



                    */
                    int win = 0;

                    if (c1 == n1 || c1 == n2 || c1 == n3) // فحص اذا كان العدد الاولى
                        win++;

                    if (c2 == n1 || c2 == n2 || c2 == n3)
                        win++;

                    if (c3 == n1 || c3 == n2 || c3 == n3)
                        win++;
                    tvresult.setText(win + "  نتيجتك ");


                    GameResult gm=new GameResult(n1,n2,n3,c1,c2,c3,new Date(),win);
                    arr.add(gm);

                    GameResultAdapter adp=new GameResultAdapter(arr);

                    rc.setAdapter(adp);




                } catch (Exception e) {
//                    throw new RuntimeException(e);
                    Toast.makeText(MainActivity.this, "حدث خطاء ما", Toast.LENGTH_SHORT).show();

                }

            }
        });




    }
}