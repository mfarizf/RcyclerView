package com.example.recyclerviewfrz;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

public class SongAdapter extends RecyclerView.Adapter<SongAdapter.ViewHolder> {

    private List<Song> songList;

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View v = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.song_list_item, viewGroup, false);
        ViewHolder vh = new ViewHolder(v);
        return vh;
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder viewHolder, int position) {
        Song song = songList.get(position);
        viewHolder.tvRank.setText(String.valueOf(song.getRank()));
        viewHolder.tvSongName.setText(song.getName());
        viewHolder.tvSinger.setText(song.getSinger());
        viewHolder.tvYear.setText(song.getYear());
        viewHolder.ivAlbumCover.setImageResource(song.getPics());
        viewHolder.tvYear.setText("2016");

    }

    @Override
    public int getItemCount() {
        return songList.size();
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {
        public TextView tvRank, tvSongName, tvSinger, tvYear;
        public ImageView ivAlbumCover;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            tvRank = itemView.findViewById(R.id.tv_rank);
            tvSongName = itemView.findViewById(R.id.tv_song_name);
            tvSinger = itemView.findViewById(R.id.tv_singer);
            tvYear = itemView.findViewById(R.id.tv_year);
            ivAlbumCover = itemView.findViewById(R.id.iv_album_cover);
        }
    }

    public SongAdapter(List<Song> songList) {
        this.songList = songList;
    }
}
