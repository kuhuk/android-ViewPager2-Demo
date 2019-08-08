package dev.kuhuk.viewpager2_demo;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;

public class AdapterViewPager extends RecyclerView.Adapter<AdapterViewPager.MyViewHolder> {

    private LayoutInflater mInflater;

    private int[] colorArray = new int[]{android.R.color.holo_orange_light, android.R.color.holo_green_light,
            android.R.color.holo_orange_dark, android.R.color.holo_purple
    };

    AdapterViewPager(Context context) {
        this.mInflater = LayoutInflater.from(context);
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = mInflater.inflate(R.layout.adapter_view_pager, parent, false);
        return new AdapterViewPager.MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
        holder.llItem.setBackgroundResource(colorArray[position]);
    }

    @Override
    public int getItemCount() {
        return colorArray.length;
    }

    static class MyViewHolder extends RecyclerView.ViewHolder {
        LinearLayout llItem;

        private MyViewHolder(View itemLayoutView) {
            super(itemLayoutView);
            llItem = itemLayoutView.findViewById(R.id.llItem);
        }
    }
}
