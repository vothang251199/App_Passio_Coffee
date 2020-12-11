package com.example.app_passio_coffee.adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.app_passio_coffee.R;
import com.example.app_passio_coffee.model.ItemGioHang;

import java.util.List;

public class AdapterGioHang extends RecyclerView.Adapter<AdapterGioHang.GioHangViewHolder>{

    List<ItemGioHang> list;

    public void setData(List<ItemGioHang> list){
        this.list = list;
        notifyDataSetChanged();
    }


    @NonNull
    @Override
    public GioHangViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_gio_hang, parent, false);
        return new GioHangViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull GioHangViewHolder holder, int position) {
        ItemGioHang itemGioHang = list.get(position);
        if (itemGioHang == null){
            return;
        }

        holder.imgGhMon.setImageResource(itemGioHang.getImgMon());
        holder.tvGhTenMon.setText(itemGioHang.getTenMon());
        holder.tvGhGiaMon.setText(itemGioHang.getGiaMon());
        holder.tvGhSoLuong.setText(itemGioHang.getSoLuongMon());

        //holder.itemGhMon.setOnClickListener
    }

    @Override
    public int getItemCount() {
        if (list != null){
            return list.size();
        }
        return 0;
    }

    public class GioHangViewHolder extends RecyclerView.ViewHolder {
        private ImageView imgGhMon;
        private TextView tvGhTenMon, tvGhSoLuong;
        private TextView tvGhGiaMon;
        private LinearLayout itemGhMon;


        public GioHangViewHolder(@NonNull View itemView) {
            super(itemView);
            //itemGhMon = itemView.findViewById(R.id.item_gio_hang);
            imgGhMon = itemView.findViewById(R.id.img_gh_mon);
            tvGhTenMon = itemView.findViewById(R.id.tv_gh_tenmon);
            tvGhGiaMon = itemView.findViewById(R.id.tv_gh_giamon);
            tvGhSoLuong = itemView.findViewById(R.id.tv_gh_soluong);
        }
    }
}
