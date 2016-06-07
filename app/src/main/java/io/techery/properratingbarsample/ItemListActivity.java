package io.techery.properratingbarsample;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;
import android.view.ViewGroup;
import android.widget.TextView;

import butterknife.Bind;
import butterknife.ButterKnife;
import io.techery.properratingbar.ProperRatingBar;
import io.techery.properratingbar.RatingListener;

public class ItemListActivity extends AppCompatActivity {

    @Bind(R.id.rootView)
    ViewGroup rootView;
    @Bind(R.id.lowerRatingBar)
    ProperRatingBar lowerRatingBar;
    private TextView rating;
    private RatingListener ratingListener = new RatingListener() {
        @Override
        public void onRatePicked(ProperRatingBar ratingBar) {

            int rate = ratingBar.getRating();

            rating.setText(
                    String.format(String.valueOf(rate)));
        }
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_item_list);
        ButterKnife.bind(this);

        rating = (TextView) findViewById(R.id.txtv_rating);
        lowerRatingBar.setListener(ratingListener);
        setTitle("Item List");
        android.support.v7.app.ActionBar actionBar = getSupportActionBar();
        actionBar.setHomeButtonEnabled(true);
        actionBar.setDisplayHomeAsUpEnabled(true);
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
