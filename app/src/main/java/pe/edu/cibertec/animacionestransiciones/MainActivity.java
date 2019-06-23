package pe.edu.cibertec.animacionestransiciones;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    private Button btnZoom, btnClockWise, btnFade, btnTranslade;
    private ImageView imageView;
    private Animation animation;
    private Context context;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnZoom = findViewById(R.id.btnZoom);
        btnClockWise = findViewById(R.id.btnClockWise);
        btnFade = findViewById(R.id.btnFade);
        btnTranslade = findViewById(R.id.btnTranslate);
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
    }
}
