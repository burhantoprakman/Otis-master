package agency.vavien.otis;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class DashActivity extends AppCompatActivity {
    Button iletisim, sss, kayitolustur;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dash);

        iletisim = (Button) findViewById(R.id.iletisim);
        sss = (Button) findViewById(R.id.sss);
        kayitolustur = (Button) findViewById(R.id.kayitolustur);

        iletisim.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent1 = new Intent(DashActivity.this,IletisimActivity.class);
                startActivity(intent1);
            }
        });
        sss.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(DashActivity.this, "SAYFA YAPIM AŞAMASINDADIR", Toast.LENGTH_LONG).show();
            }
        });


        kayitolustur.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(DashActivity.this,MainActivity.class);
                startActivity(intent);
            }
        });
    }

}
