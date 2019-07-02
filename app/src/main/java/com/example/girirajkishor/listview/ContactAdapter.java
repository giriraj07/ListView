package com.example.girirajkishor.listview;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.ArrayList;

public class ContactAdapter extends BaseAdapter {

    private ArrayList<Contact> contacts;
    private Context context;
    public ContactAdapter(ArrayList<Contact> contacts,Context context) {
        this.contacts = contacts;
        this.context=context;
    }

    @Override
    public int getCount() {
        return contacts.size();
    }

    @Override
    public Contact getItem(int position) {
        return contacts.get(position);
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        LayoutInflater li=LayoutInflater.from(context);
        View InflatedView=li.inflate(R.layout.item_roww,parent,false);
        bind(InflatedView,contacts.get(position));
        return InflatedView;
    }
    public void bind(View inflatedView,Contact currentContact){
        TextView tvName,tvSuraname,tvPhone;
        tvName=inflatedView.findViewById(R.id.tvName);
        tvSuraname=inflatedView.findViewById(R.id.tvSurname);
        tvPhone=inflatedView.findViewById(R.id.tvPhone);

        // currentContact.getBaseContext();
        tvName.setText(currentContact.getName());
        tvSuraname.setText(currentContact.getSurname());
        tvPhone.setText(currentContact.getNumber());



    }
}
