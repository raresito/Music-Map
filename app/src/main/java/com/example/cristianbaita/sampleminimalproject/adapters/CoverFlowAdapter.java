package com.example.cristianbaita.sampleminimalproject.adapters;

/**
 * Created by teo on 24.08.2016.
 */
import android.content.Context;
import android.content.DialogInterface;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.example.cristianbaita.sampleminimalproject.activities.LoginActivity;
import com.example.cristianbaita.sampleminimalproject.pojo.Game;
import com.example.cristianbaita.sampleminimalproject.R;
import com.example.cristianbaita.sampleminimalproject.pojo.GoogleLoginManager;

import java.util.ArrayList;

public class CoverFlowAdapter extends BaseAdapter {

    private ArrayList<Game> data;
    private AppCompatActivity activity;

    public CoverFlowAdapter(AppCompatActivity context, ArrayList<Game> objects) {
        this.activity = context;
        this.data = objects;
    }

    @Override
    public int getCount() {
        return data.size();
    }

    @Override
    public Game getItem(int position) {
        return data.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        ViewHolder viewHolder;

        if (convertView == null) {
            LayoutInflater inflater = (LayoutInflater) activity.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            convertView = inflater.inflate(R.layout.item_flow_view, null, false);

            viewHolder = new ViewHolder(convertView);
            convertView.setTag(viewHolder);
        } else {
            viewHolder = (ViewHolder) convertView.getTag();
        }

        viewHolder.gameImage.setImageResource(data.get(position).getImageSource());
        Log.i("MainActivity", "aici");


        convertView.setOnClickListener(onClickListener(position));

        return convertView;
    }

    private View.OnClickListener onClickListener(final int position) {
        return new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                AlertDialog.Builder dialog = new AlertDialog.Builder(activity);
                String nameApplication = getItem(position).getName();

                dialog.setMessage("Are you sure you want to login with " + nameApplication + "?");
                dialog.setPositiveButton("YES", new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int which) {
                        Toast.makeText(activity, "Cool", Toast.LENGTH_SHORT).show();
                        dialog.dismiss();

                        LoginActivity loginActivity = (LoginActivity) activity;
                        if(position == 2)
                            loginActivity.btnConnect.performClick();
                        if(position == 0)
                            loginActivity.signIn();
                        if(position == 1)
                            loginActivity.facebookbutton.performClick();
                    }
                });
                dialog.setNegativeButton("CANCEL", new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int which) {
                        Toast.makeText(activity, "You chose to cancel!", Toast.LENGTH_SHORT).show();
                        dialog.dismiss();
                    }
                });
                dialog.setIcon(android.R.drawable.ic_dialog_alert);
                dialog.show();


            }
        };
    }


    private static class ViewHolder {
        private ImageView gameImage;

        public ViewHolder(View v) {
            gameImage = (ImageView) v.findViewById(R.id.image);

        }
    }
}