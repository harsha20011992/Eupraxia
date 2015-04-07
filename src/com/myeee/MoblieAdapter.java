package com.myeee;

import android.content.Context;
import android.graphics.Color;
import android.text.SpannableString;
import android.text.style.UnderlineSpan;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;
 
public class MoblieAdapter extends ArrayAdapter<String> {
	private final Context context;
	private final String[] values;
	private final String[] newnames;
	private final String[] numbers;
 
	public MoblieAdapter(Context context, String[] values, String[] newnames, String[] numbers) {
		super(context, R.layout.stringmenu, values);
		this.context = context;
		this.values = values;
		this.newnames = newnames;
		this.numbers = numbers;
	}
 
	@Override
	public View getView(int position, View convertView, ViewGroup parent) {
		LayoutInflater inflater = (LayoutInflater) context
			.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
 
		View rowView = inflater.inflate(R.layout.stringmenu, parent, false);
		TextView textView = (TextView) rowView.findViewById(R.id.post);
		TextView textViewNames = (TextView) rowView.findViewById(R.id.name);
		TextView textViewNumbers = (TextView) rowView.findViewById(R.id.numbers);
		//ImageView imageView = (ImageView) rowView.findViewById(R.id.logo);
		textView.setText(values[position]);
		textViewNames.setText(newnames[position]);
		//textViewNumbers.setText(numbers[position]);
		SpannableString content = new SpannableString(numbers[position]);
		content.setSpan(new UnderlineSpan(), 0, content.length(), 0);
		textViewNumbers.setText(content);

		textView.setTextColor(Color.BLUE);
	
 
		return rowView;
	}
}