package com.example.myapplication;

import android.os.Bundle;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.example.myapplication.R;

public class MainActivity extends AppCompatActivity {

    ImageView obraz;
    TextView pytanieTxt;

    RadioButton odpA, odpB, odpC;
    Button btnDalej;

    String[] pytania = {
            "Które to schronisko?",
            "Zwierzę na zdjęciu to",
            "W oddali są widoczne"
    };

    String[][] odpowiedzi = {
            {"Na Rysiance", "Na Wielkiej Raczy", "Na Wielkiej Rycerzowej"},
            {"owczarek", "wilk", "kozica"},
            {"Himalaje", "Alpy", "Tatry"}
    };

    int[] poprawne = {1, 1, 2};

    int[] obrazy = {
            R.drawable.img1,
            R.drawable.img2,
            R.drawable.img3
    };

    int index = 0;
    int punkty = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        obraz = findViewById(R.id.obraz);
        pytanieTxt = findViewById(R.id.pytanieTxt);

        odpA = findViewById(R.id.odpA);
        odpB = findViewById(R.id.odpB);
        odpC = findViewById(R.id.odpC);

        btnDalej = findViewById(R.id.btnDalej);

        pokazPytanie();

        btnDalej.setOnClickListener(v -> {

            int zaznaczona = -1;

            if (odpA.isChecked()) zaznaczona = 0;
            if (odpB.isChecked()) zaznaczona = 1;
            if (odpC.isChecked()) zaznaczona = 2;

            if (zaznaczona == poprawne[index]) {
                punkty++;
            }

            index++;

            if (index < pytania.length) {
                pokazPytanie();
            } else {
                Toast.makeText(this,
                        "Koniec quizu. Punkty: " + punkty,
                        Toast.LENGTH_LONG).show();
            }
        });
    }

    void pokazPytanie() {

        obraz.setImageResource(obrazy[index]);

        pytanieTxt.setText(pytania[index]);

        odpA.setText(odpowiedzi[index][0]);
        odpB.setText(odpowiedzi[index][1]);
        odpC.setText(odpowiedzi[index][2]);

        odpA.setChecked(false);
        odpB.setChecked(false);
        odpC.setChecked(false);
    }
}