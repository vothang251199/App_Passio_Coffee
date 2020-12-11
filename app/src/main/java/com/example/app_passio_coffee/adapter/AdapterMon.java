package com.example.app_passio_coffee.adapter;

import android.app.Activity;
import android.app.AlertDialog;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import com.example.app_passio_coffee.ChonMon;
import com.example.app_passio_coffee.R;
import com.example.app_passio_coffee.model.Mon;

import java.util.List;

public class AdapterMon extends RecyclerView.Adapter<AdapterMon.MonViewHolder>{

    List<Mon> list;
    int DonGia, Soluong, Tong;
    Dialog dialogView;

    public void setData(List<Mon> list){
        this.list = list;
        notifyDataSetChanged();
    }


    @NonNull
    @Override
    public MonViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_mon, parent, false);
        final MonViewHolder holder = new MonViewHolder(view);

        return new MonViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MonViewHolder holder, int position) {
        Mon mon = list.get(position);
        if (mon == null){
            return;
        }

        holder.imgMon.setImageResource(mon.getImgMon());
        holder.tvTenMon.setText(mon.getTenMon());
        holder.tvGiaMon.setText(mon.getGiaMon());
        holder.itemMon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //AlertDialog.Builder builder = new AlertDialog.Builder(v.getRootView().getContext());
                dialogView = new Dialog(v.getRootView().getContext());
                dialogView.setContentView(R.layout.dialog_item_mon);
                dialogView.getWindow().setLayout(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.WRAP_CONTENT);

                TextView tvDgTenmon, tvSoLuong, tvDgGiaMon, tvTongGia;
                ImageView imgDgMon, imgCong, imgTru, imgCloseDialog;
                View themVaoGioHang;


                tvDgTenmon =  dialogView.findViewById(R.id.tv_dg_tenmon);
                tvDgGiaMon =  dialogView.findViewById(R.id.tv_dg_giamon);
                imgDgMon =  dialogView.findViewById(R.id.img_dg_mon);
                tvTongGia = dialogView.findViewById(R.id.tv_dg_tonggia);
                tvSoLuong = dialogView.findViewById(R.id.tv_soluong);
                imgCong = dialogView.findViewById(R.id.img_cong);
                imgTru = dialogView.findViewById(R.id.img_tru);
                imgCloseDialog = dialogView.findViewById(R.id.img_close_dg);
                themVaoGioHang = dialogView.findViewById(R.id.layout_themvaogiohang);
                //ánh xạ layout xem giỏ hàng từ Activity Chọn Món




                tvDgTenmon.setText(list.get(holder.getAdapterPosition()).getTenMon());
                tvDgGiaMon.setText(list.get(holder.getAdapterPosition()).getGiaMon());
                imgDgMon.setImageResource(list.get(holder.getAdapterPosition()).getImgMon());
                tvTongGia.setText(tvDgGiaMon.getText());

                String st1 = (String) tvDgGiaMon.getText();
                String st2 = (String) tvTongGia.getText();
                DonGia = Integer.parseInt(st1.substring(0, (st1.indexOf('.'))));
                Soluong = Integer.parseInt(tvSoLuong.getText().toString());
                Tong = Integer.parseInt(st2.substring(0, (st1.indexOf('.'))));

                imgCong.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Soluong += 1;
                        Tong = DonGia* Soluong;
                        tvSoLuong.setText(String.valueOf(Soluong));
                        tvTongGia.setText(String.valueOf(Tong) + ".000đ");
                    }
                });

                imgTru.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        if (Soluong >1){
                            Soluong -= 1;
                            Tong = DonGia * Soluong;
                            tvSoLuong.setText(String.valueOf(Soluong));
                            tvTongGia.setText(String.valueOf(Tong) + ".000đ");
                        }
                    }
                });

                imgCloseDialog.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        dialogView.dismiss();
                    }
                });

                themVaoGioHang.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        ChonMon.tv_XemGH_TongGia.setText(tvTongGia.getText());
                        ChonMon.tv_XemGH_SoLuong.setText(tvSoLuong.getText());
                        dialogView.dismiss();
                        ChonMon.xemGioHang.setVisibility(View.VISIBLE);
                    }
                });

                dialogView.show();

            }
        });
    }

    @Override
    public int getItemCount() {
        if (list != null){
            return list.size();
        }
        return 0;
    }

    public class MonViewHolder extends RecyclerView.ViewHolder {
        private ImageView imgMon;
        private TextView tvTenMon;
        private TextView tvGiaMon;
        private CardView itemMon;


        public MonViewHolder(@NonNull View itemView) {
            super(itemView);
            itemMon = itemView.findViewById(R.id.item_mon);
            imgMon = itemView.findViewById(R.id.img_mon);
            tvTenMon = itemView.findViewById(R.id.tv_tenmon);
            tvGiaMon = itemView.findViewById(R.id.tv_giamon);
        }
    }
}
