package com.example.martoraneca.topgrossingmovies;

import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import android.support.v4.view.GestureDetectorCompat;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import static com.example.martoraneca.topgrossingmovies.R.drawable.downtown_only_arrow_trans;

public class MainMoviesActivity extends AppCompatActivity implements IMethods {

    private TextView mMovieName;
    private TextView mMovieYear;
    private ImageView mMoviePoster;
    private TextView mMovieGross;
    private TextView mPlace;

    private GestureDetectorCompat gestureObject;

    private int counter = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_movies);

        mMovieName = (TextView) findViewById(R.id.movieName);
        mMovieYear = (TextView) findViewById(R.id.movieYear);
        mMoviePoster = (ImageView) findViewById(R.id.moviePoster);
        mMovieGross = (TextView) findViewById(R.id.movieGross);
        mPlace = (TextView) findViewById(R.id.place);
        ImageView mImdbLogo = (ImageView) findViewById(R.id.imdbLogo);
        TextView mMoreInfo = (TextView) findViewById(R.id.moreInfo);

        mMoreInfo.setCompoundDrawablesWithIntrinsicBounds(0, 0, 0, downtown_only_arrow_trans);

        gestureObject = new GestureDetectorCompat(this, new LearnGesture());

        updateMovie();

        mImdbLogo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                AlertDialog.Builder alert = new AlertDialog.Builder(MainMoviesActivity.this);
                alert.setTitle("Are you sure?");
                alert.setMessage("Do you want to open 'www.imdb.com' or IMDb Android Application (if you have it on your device) to see more information about the movie?");
                alert.setPositiveButton("Yes", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        Intent intent = new Intent();
                        intent.setAction(Intent.ACTION_VIEW);
                        intent.addCategory(Intent.CATEGORY_BROWSABLE);
                        intent.setData(Uri.parse(Data.getImdbLinks()[counter]));
                        startActivity(intent);
                    }
                });
                alert.setNegativeButton("Cancel", null);
                alert.show();
            }
        });

    }

    public boolean onTouchEvent(MotionEvent event) {
        this.gestureObject.onTouchEvent(event);
        return super.onTouchEvent(event);
    }

    private class LearnGesture extends GestureDetector.SimpleOnGestureListener {

        @Override
        public boolean onFling(MotionEvent event1, MotionEvent event2,
                               float velocityX, float velocityY) {
            //right-to-left gesture
            if (event2.getX() < event1.getX()) {
                if (Data.getMoviesNames().length - 1 > counter) {
                    counter++;
                    updateMovie();
                }
            //left-to-right gesture
            } else if (event2.getX() > event1.getX()) {
                if (counter > 0) {
                    counter--;
                    updateMovie();
                }
            }
            return true;
        }

    }

    @Override
    public void updateMovie() {
        mMovieName.setText(Data.getMoviesNames()[counter]);
        mMovieYear.setText(Data.getMoviesYears()[counter]);
        mMoviePoster.setImageResource(Data.getMoviesPosters()[counter]);
        mMovieGross.setText(Data.getMoviesBoxOffices()[counter]);
        mPlace.setText(Data.getPlace()[counter]);
    }

}