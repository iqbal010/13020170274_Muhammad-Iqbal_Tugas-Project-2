package id.co.myproject.tugass;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private Button btnLuas;
    private EditText etD2, etD1;
    private TextView tvHasil;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnLuas = findViewById(R.id.btn_luas);
        etD1 = findViewById(R.id.et_d1);
        etD2 = findViewById(R.id.et_d2);
        tvHasil = findViewById(R.id.tv_hasil);

        btnLuas.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (!TextUtils.isEmpty(etD1.getText().toString())){
                    if (!TextUtils.isEmpty(etD2.getText().toString())){
                        double hasil, d1, d2;
                        d1 = Double.parseDouble(etD1.getText().toString());
                        d2 = Double.parseDouble(etD2.getText().toString());
                        hasil = 0.5*d1*d2;
                        tvHasil.setText(String.valueOf(hasil)+ " cm(2)");
                    }else {
                        etD2.setError("Diagonal 2 tidak boleh kosong");
                    }
                }else {
                    etD1.setError("Diagonal 1 tidak boleh kosong");
                }
            }
        });
    }
}
