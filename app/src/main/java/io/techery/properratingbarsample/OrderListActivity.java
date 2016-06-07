package io.techery.properratingbarsample;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class OrderListActivity extends AppCompatActivity {
    int count1 = 0, count2 = 0, count3 = 0, count4 = 0;
    private TextView qty1, qty2, qty3, qty4;
    private Button inc1, dec1, inc2, dec2, inc3, dec3, inc4, dec4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_order_list);
        inc1 = (Button) findViewById(R.id.btn_inc1);
        dec1 = (Button) findViewById(R.id.btn_dec1);
        qty1 = (TextView) findViewById(R.id.txtv_qty1);
        inc2 = (Button) findViewById(R.id.btn_inc2);
        dec2 = (Button) findViewById(R.id.btn_dec2);
        qty2 = (TextView) findViewById(R.id.txtv_qty2);
        inc3 = (Button) findViewById(R.id.btn_inc3);
        dec3 = (Button) findViewById(R.id.btn_dec3);
        qty3 = (TextView) findViewById(R.id.txtv_qty3);
        inc4 = (Button) findViewById(R.id.btn_inc4);
        dec4 = (Button) findViewById(R.id.btn_dec4);
        qty4 = (TextView) findViewById(R.id.txtv_qty4);
        setTitle("OrderList");
        android.support.v7.app.ActionBar actionBar = getSupportActionBar();
        actionBar.setHomeButtonEnabled(true);
        actionBar.setDisplayHomeAsUpEnabled(true);
        inc1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                count1 = count1 + 1;
                qty1.setText(String.format(String.valueOf(count1)));
            }
        });
        dec1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (count1 != 0) {
                    count1 = count1 - 1;
                    qty1.setText(String.format(String.valueOf(count1)));
                }

            }
        });
        inc2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                count2 = count2 + 1;
                qty2.setText(String.format(String.valueOf(count2)));
            }
        });
        dec2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (count2 != 0) {
                    count2 = count2 - 1;
                    qty2.setText(String.format(String.valueOf(count2)));
                }

            }
        });

        inc3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                count3 = count3 + 1;
                qty3.setText(String.format(String.valueOf(count3)));
            }
        });
        dec3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (count3 != 0) {
                    count3 = count3 - 1;
                    qty3.setText(String.format(String.valueOf(count3)));
                }

            }
        });

        inc4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                count4 = count4 + 1;
                qty4.setText(String.format(String.valueOf(count4)));
            }
        });
        dec4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (count4 != 0) {
                    count4 = count4 - 1;
                    qty4.setText(String.format(String.valueOf(count4)));
                }

            }
        });
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case android.R.id.home:
                this.finish();
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }
}
