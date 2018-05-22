package com.example.datenknecht.myapplication;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import org.w3c.dom.Text;

public class SystemAdapter extends RecyclerView.Adapter<SystemAdapter.NumberViewHolder>{
    private static final String TAG = SystemAdapter.class.getSimpleName();

    private int mNumberItems;

    public SystemAdapter(int numberOfItems){
        mNumberItems=numberOfItems;
    }

    @Override
    public SystemAdapter.NumberViewHolder onCreateViewHolder(ViewGroup viewGroup, int viewType) {
        Context context = viewGroup.getContext();
        int layoutIdForListItem = R.layout.new_device_item;
        LayoutInflater inflater = LayoutInflater.from(context);
        boolean shouldAttachToParentImmediately = false;

        View view = inflater.inflate(layoutIdForListItem,viewGroup, shouldAttachToParentImmediately);
        NumberViewHolder viewHolder = new NumberViewHolder(view);

        return viewHolder;
    }

    public void onBindViewHolder(NumberViewHolder holder, int position)  {
        Log.d(TAG,"#"+position);
        holder.bind(position);
    }

    public int getItemCount() {return mNumberItems;}

    class NumberViewHolder extends RecyclerView.ViewHolder{
        TextView listItemNumberView;
        public NumberViewHolder (View itemView){
            super(itemView);
            listItemNumberView = (TextView) itemView.findViewById(R.id.system_item);
        }


        void bind (int listIndex){
            listItemNumberView.setText(String.valueOf(listIndex));
        }
    }
}
