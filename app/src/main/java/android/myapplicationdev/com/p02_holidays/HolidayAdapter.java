package android.myapplicationdev.com.p02_holidays;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;


public class HolidayAdapter extends ArrayAdapter{

    private ArrayList<Holiday> holiday;
    private Context context;
    private TextView tvH,tvD;
    private ImageView iv;


    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        LayoutInflater inflater = (LayoutInflater) context
                .getSystemService(Context.LAYOUT_INFLATER_SERVICE);

        View rowView = inflater.inflate(R.layout.row, parent, false);


        tvH = (TextView) rowView.findViewById(R.id.tvH);
        tvD = (TextView) rowView.findViewById(R.id.tvD);
        iv = (ImageView) rowView.findViewById(R.id.imageView);

        Holiday curr = holiday.get(position);


        tvH.setText(curr.getHoliday());
        tvD.setText(curr.getDate());
        iv.setImageResource(curr.getImg());

        return rowView;
    }
    public HolidayAdapter(Context context, int resource, ArrayList<Holiday> objects){
        super(context, resource, objects);

        holiday = objects;

        this.context = context;
    }

}