package pe.edu.cibertec.animacionestransiciones;

import android.app.Activity;
import android.app.ActivityOptions;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    private Button btnZoom, btnClockWise, btnFade, btnTranslade, btnTransition;
    private ImageView imageView;
    private Animation animation;
    private Context context;
    private Intent intent;
    private ActivityOptions activityOptions;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnZoom = findViewById(R.id.btnZoom);
        btnClockWise = findViewById(R.id.btnClockWise);
        btnFade = findViewById(R.id.btnFade);
        btnTranslade = findViewById(R.id.btnTranslate);
        btnTransition = findViewById(R.id.btnTransition);
        imageView = findViewById(R.id.imageView);
        context = getApplicationContext();

        btnZoom.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                animation = AnimationUtils.loadAnimation(context, R.anim.zoom);
                imageView.startAnimation(animation);
            }
        });

        btnClockWise.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                animation = AnimationUtils.loadAnimation(context, R.anim.clockwise);
                imageView.startAnimation(animation);
            }
        });

        btnFade.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                animation = AnimationUtils.loadAnimation(context, R.anim.fade);
                imageView.startAnimation(animation);
            }
        });

        btnTranslade.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                animation = AnimationUtils.loadAnimation(context, R.anim.translate);
                imageView.startAnimation(animation);
            }
        });

        btnTransition.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                intent = new Intent(context, TransitionActivity.class);
                if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
                    activityOptions = ActivityOptions.makeSceneTransitionAnimation(MainActivity.this, imageView, getString(R.string.app_name));
                    startActivity(intent, activityOptions.toBundle());
                }
            }
        });
    }
}
