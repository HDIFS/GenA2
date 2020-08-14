package com.example.gena;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;
import java.util.List;


public class ApprenticeAdapter extends RecyclerView.Adapter<ApprenticeViewHolder> {

    private Context mContext;
    private List<ApprenticeData> mApprenticeList;

    ApprenticeAdapter(Context mContext, List<ApprenticeData> mApprenticeList) {
        this.mContext = mContext;
        this.mApprenticeList = mApprenticeList;
    }


    @NonNull
    @Override
    public ApprenticeViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View mView = LayoutInflater.from(parent.getContext()).inflate(R.layout.recyclerview_item_row, parent, false);
        return new ApprenticeViewHolder(mView);
    }

    @Override
    public void onBindViewHolder(final ApprenticeViewHolder holder, int position) {
        holder.mImage.setImageResource(mApprenticeList.get(position).getApprenticePicture());
        holder.mTitle.setText(mApprenticeList.get(position).getApprenticeName());
        holder.mCardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent mIntent = new Intent(mContext, ApprenticeDetail.class);
                mIntent.putExtra("Title", mApprenticeList.get(holder.getAdapterPosition()).getApprenticeName());
                mIntent.putExtra("Description", mApprenticeList.get(holder.getAdapterPosition()).getApprenticeDescription());
                mIntent.putExtra("Image", mApprenticeList.get(holder.getAdapterPosition()).getApprenticePicture());
                mContext.startActivity(mIntent);
            }
        });

    }

    @Override
    public int getItemCount() {
        return mApprenticeList.size();
    }

}

class ApprenticeViewHolder extends RecyclerView.ViewHolder {

    CardView mCardView = itemView.findViewById(R.id.cardview);
    ImageView mImage;
    TextView mTitle;

    ApprenticeViewHolder(View itemView) {
        super(itemView);

        mImage = itemView.findViewById(R.id.ivImage);
        mTitle = itemView.findViewById(R.id.tvTitle);
    }
}
