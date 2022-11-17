package com.example.recyderview;

import android.media.Image;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class StoreAdapter {
    class StoreViewHolder extends RecyclerView.Adapter<StoreAdapter.StoreViewHolder>{
        private List<Store> storesList;
        public StoreAdapter(List<Store> storesList){
            this.storesList=storesList;
        }
        ImageView img;
        TextView tvClose, tvName,tvAddress,tvService,tvSaleOff,tvDistance;
        public StoreViewHolder(@NonNull View itemView){
            super(itemView);

            img=itemView.findViewById(R.id.image_view_food);
            tvClose=itemView.findViewById(R.id.text_view_title_close_time);
            tvName=itemView.findViewById(R.id.text_view_name);
            tvAddress=itemView.findViewById(R.id.text_view_address);
            tvService=itemView.findViewById(R.id.text_view_category);
            tvSaleOff=itemView.findViewById(R.id.text_view_sale_off);
            tvDistance=itemView.findViewById(R.id.text_view_distance);
        }

        @NonNull
        @Override
        public StoreViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
            LayoutInflater layoutInflater=LayoutInflater.from(parent.getContext());
            View view=layoutInflater.inflate(R.layout.layout_item_store,parent,false);
            return new StoreViewHolder(view);
        }

        @Override
        public void onBindViewHolder(@NonNull StoreViewHolder holder, int position) {
            holder.bind(storesList.get(position));

        }

        @Override
        public int getItemCount() {
            if(storesList==null||storesList.size()==0) {        //storeList.isEmpty
                return 0;                                       //không có giá trị nào
            }
            return storesList.size();                           //trả về số dòng đưa ra
        }
        public void bind(Store store){
            img.setImageResource(store.getImage());
            tvName.setText(store.getName());
            tvAddress.setText(store.getAddress());
            tvClose.setText(store.getCloseTime());
            //service
            if(store.getListServiceType().isEmpty()){
                tvService.setVisibility(View.GONE);
            }else {
                String service="";
                if(store.getListServiceType().size()==1){
                    service += store.getListServiceType().get(0).toString();
                }else {
                    for (int i = 0; i < store.getListServiceType().size(); i++) {
                        if (i == store.getListServiceType().size() - 1) {
                            service += store.getListServiceType().get(i).toString();
                        } else {
                            service += store.getListServiceType().get(i).toString() + "/";
                        }
                    }
                }
                tvService.setText(service);
                tvService.setVisibility(View.VISIBLE);
            }
            //saleoff
        if(store.getSaleOff().isEmpty()){
            tvSaleOff.setVisibility(View.GONE);
        }else {
            tvSaleOff.setText(store.getSaleOff());
            tvSaleOff.setVisibility(View.VISIBLE);
        }
        //distance
        if(store.getDistance()==0){
            tvDistance.setVisibility(View.GONE);
        }else {
            tvDistance.setText(">" + store.getDistance() + "km");
            tvDistance.setVisibility(View.VISIBLE);
        }
        }
    }
}
