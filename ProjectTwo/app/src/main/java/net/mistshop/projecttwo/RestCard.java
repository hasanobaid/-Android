package net.mistshop.projecttwo;

import android.support.annotation.NonNull;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.ViewGroup;
import android.graphics.drawable.Drawable;
import android.support.v4.content.ContextCompat;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.RatingBar;
import android.widget.TextView;
import android.widget.Toast;

public class RestCard extends RecyclerView.Adapter<RestCard.ViewHolder> {
    private String[] name;
    private String[] description;
    private int[] rating;
    private int[] imageID;

    public RestCard(String[] name, String[] description, int[] rating, int[] imageID) {
        this.name = name;
        this.description = description;
        this.rating = rating;
        this.imageID = imageID;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        CardView view = (CardView) LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.resturant_card, viewGroup, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder viewHolder, int i) {

        CardView cardView = viewHolder.cardView;

        ImageView imageView = (ImageView) cardView.findViewById(R.id.image);
        Drawable dr = ContextCompat.getDrawable(cardView.getContext(), imageID[i]);
        imageView.setImageDrawable(dr);

        TextView txtName = (TextView) cardView.findViewById(R.id.txtName);
        TextView txtDesc = (TextView) cardView.findViewById(R.id.txtDesc);
        RatingBar ratingBar = (RatingBar) cardView.findViewById(R.id.rating);

        txtName.setText(name[i]);
        txtDesc.setText(description[i]);
        ratingBar.setRating(rating[i]);

        cardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //
            }
        });

    }

    @Override
    public int getItemCount() {
        return name.length;
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {
        private CardView cardView;

        public ViewHolder(CardView cardView) {
            super(cardView);
            this.cardView = cardView;
        }

    }
}
