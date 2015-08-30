package com.example.getmyphonenumber;

import java.util.List;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.LinearLayout;
import android.widget.TextView;

public class MyAdapter extends BaseAdapter {

	private List<PhoneInfo> lists;
	private Context context;
	private LinearLayout layout;
	public MyAdapter(List<PhoneInfo> lists,Context context) {
		// TODO Auto-generated constructor stub
		this.lists=lists;
		this.context=context;
	}
	@Override
	public int getCount() {
		// TODO Auto-generated method stub
		return lists.size();
	}

	@Override
	public Object getItem(int position) {
		// TODO Auto-generated method stub
		return lists.get(position);
	}

	@Override
	public long getItemId(int position) {
		// TODO Auto-generated method stub
		return position;
	}

	@Override
	public View getView(int position, View convertView, ViewGroup parent) {
		// TODO Auto-generated method stub
//		LayoutInflater inflater=LayoutInflater.from(context);
//		layout=(LinearLayout) inflater.inflate(R.layout.call,null);
//		TextView nameTv=(TextView) layout.findViewById(R.id.name);
//		TextView numberTv=(TextView) layout.findViewById(R.id.number);
//		nameTv.setText(lists.get(position).getName());
//		numberTv.setText(lists.get(position).getNumber());
		ViewHolder holder;
		if (convertView==null) {
			convertView=LayoutInflater.from(context).inflate(R.layout.call,null);
			holder=new ViewHolder();
			holder.nameTv=(TextView) convertView.findViewById(R.id.name);
			holder.numberTv=(TextView) convertView.findViewById(R.id.number);
			holder.nameTv.setText(lists.get(position).getName());
			holder.numberTv.setText(lists.get(position).getNumber());
			convertView.setTag(holder);
		}else {
			holder=(ViewHolder) convertView.getTag();
			holder.nameTv.setText(lists.get(position).getName());
			holder.numberTv.setText(lists.get(position).getNumber());
			
		}
		return convertView;
	}
	private static class ViewHolder{
		TextView nameTv;
		TextView numberTv;
		
	}

}
