package company.my.lesson3;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.view.menu.ActionMenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class ActivityMain extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

//        TextView tffft = findViewById(R.id.jsnfjkgf);
        Button btn = findViewById(R.id.button);
        btn.setOnClickListener(this);
//        btn.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Toast.makeText(ActivityMain.this, "Hello from toast", Toast.LENGTH_LONG).show();
//            }
//        });
    }

    public void Func1(View v) {
        Toast.makeText(this, "Hello from second toast", Toast.LENGTH_SHORT).show();
    }

    @Override
    public void onClick(View v) {
       Toast.makeText(ActivityMain.this, "Hello from third toast", Toast.LENGTH_SHORT).show();
    }
}
