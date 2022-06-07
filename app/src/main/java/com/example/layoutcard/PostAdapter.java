package com.example.layoutcard;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class PostAdapter extends RecyclerView.Adapter<PostAdapter.viewHolder> {
    private List<Post> postslist;

    public PostAdapter(List<Post> postslist) {
        this.postslist = postslist;
    }

    @NonNull
    @Override
    public viewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.list_item,parent,false);
        return new viewHolder(view);
    }


    @Override
    public void onBindViewHolder(@NonNull viewHolder holder, int position) {
        holder.tvtitle.setText(postslist.get(position).getTitle());
        holder.tvbody.setText(postslist.get(position).getBody());
        holder.textView2.setText(postslist.get(position).getId());



    }


    @Override
    public int getItemCount() {
        return postslist.size();
    }



    public class viewHolder extends  RecyclerView.ViewHolder{

        TextView tvtitle;
        TextView tvbody;
        TextView textView2;

        public viewHolder(@NonNull View itemView) {
            super(itemView);

            tvtitle = itemView.findViewById(R.id.tvtitle);
            tvbody = itemView.findViewById(R.id.tvbody);
            textView2 = itemView.findViewById(R.id.textView2);



        }
    }
}
