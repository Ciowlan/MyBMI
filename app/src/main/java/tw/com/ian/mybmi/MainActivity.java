package tw.com.ian.mybmi;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {
    TextView tv;
    EditText ed_heigth,ed_weigth;
    double h,w;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tv = findViewById(R.id.tv_bmi);
        ed_heigth = findViewById(R.id.ed_Height);
        ed_weigth = findViewById(R.id.ed_Weight);
    }

    public void kickme(View view) {
        tv.setText("媽 我在這裡");
    }

    public void btnClick(View view) {
        String strH = ed_heigth.getText().toString();
        String strW = ed_weigth.getText().toString();
        h=Double.parseDouble(strH);
        w=Double.parseDouble(strW);
        double bmi = w/(h*h);
        tv.setText(" "+bmi);
    }
}