package android.myapplicationdev.com.p02_holidays;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;


public class TypeHoliday extends AppCompatActivity {

    ListView lv;
    TextView tv;
    ArrayAdapter aa;
    ArrayList<Holiday> al;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.holiday_list);

        lv = (ListView) findViewById(R.id.lvHoliday2);
        tv = (TextView)findViewById(R.id.textView);

        Intent i = getIntent();
        String type = i.getStringExtra("type");
        tv.setText(type);
        al = new ArrayList<Holiday>();
        if(type.equalsIgnoreCase("secular")){
            al.add(new Holiday("New Year's Day","1 Jan 2017",type,R.drawable.newyear));
            al.add(new Holiday("Labour Day","1 May 2017",type,R.drawable.labourday));

        } else {
            al.add(new Holiday("Chinese New Year","28-29 Jan 2017",type,R.drawable.cny));
            al.add(new Holiday("Good Friday","14 April 2017",type,R.drawable.goodfriday));

        }
        aa = new HolidayAdapter(this, R.layout.row, al);
        lv.setAdapter(aa);
        lv.setOnItemClickListener(new AdapterView.OnItemClickListener() {

            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Holiday selection = al.get(position);

                Toast.makeText(TypeHoliday.this, selection.getHoliday()
                                + ": " + selection.getDate(),
                        Toast.LENGTH_LONG).show();
            }
        });
    }
}