package hoangduy.code.bai1_tuan4;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    ListView lvmonan;
    ArrayList<mangxahoi> mang;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lvmonan = findViewById(R.id.listvieu);
        mang = new ArrayList<mangxahoi>();
        mang.add(new mangxahoi(R.drawable.facebook, "facebook"));
        mang.add(new mangxahoi(R.drawable.in, "Linkedin"));
        mang.add(new mangxahoi(R.drawable.msn, "MSN"));
        mang.add(new mangxahoi(R.drawable.sky, "Skype"));
        mang.add(new mangxahoi(R.drawable.yahoo, "Yahoo"));


        mangxahoiadapter haha = new mangxahoiadapter(
                MainActivity.this,
                R.layout.mangxahoi_dong,
                mang
        );

        lvmonan.setAdapter(haha);
    }
}
