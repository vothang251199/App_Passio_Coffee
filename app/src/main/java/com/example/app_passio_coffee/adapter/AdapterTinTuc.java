package com.example.app_passio_coffee.adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.app_passio_coffee.R;
import com.example.app_passio_coffee.model.TinTuc;

import java.util.List;

public class AdapterTinTuc extends RecyclerView.Adapter<AdapterTinTuc.TinTucViewHolder>{

    private List<TinTuc> mListTinTuc;
    public void setData(List<TinTuc> list){
        this.mListTinTuc = list;
        notifyDataSetChanged();
    }


    @NonNull
    @Override
    public TinTucViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_tintuc, parent, false);
        return new TinTucViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull TinTucViewHolder holder, int position) {
        TinTuc tinTuc = mListTinTuc.get(position);
        if (tinTuc == null){
            return;
        }
        holder.imgTinTuc.setImageResource(tinTuc.getImg());
        holder.tvTitleTinTuc.setText(tinTuc.getTitletintuc());
        holder.tvMoTaTinTuc.setText(tinTuc.getNoidungtintuc());
    }

    @Override
    public int getItemCount() {
        if (mListTinTuc != null){
            return mListTinTuc.size();
        }
        return 0;
    }

    public class TinTucViewHolder extends RecyclerView.ViewHolder {
        private ImageView imgTinTuc;
        private TextView tvTitleTinTuc;
        private TextView tvMoTaTinTuc;

        public TinTucViewHolder(@NonNull View itemView) {
            super(itemView);

            imgTinTuc = itemView.findViewById(R.id.img_tintuc);
            tvTitleTinTuc = itemView.findViewById(R.id.tv_title_tintuc);
            tvMoTaTinTuc = itemView.findViewById(R.id.tv_mota_tintuc);
        }
    }
}
