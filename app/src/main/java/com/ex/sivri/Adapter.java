package com.ex.sivri;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.viewpager.widget.PagerAdapter;

import com.ex.sivri.Models.Model;
import com.ex.sivri.Models.Bilgiler;

import java.util.List;

public class Adapter extends PagerAdapter {
    private List<Model> models;
    private Bilgiler bilgilers;
    private LayoutInflater layoutInflater;
    private Context context;

    public Adapter(List<Model> models, Context context) {
        this.models = models;
        this.context = context;
    }

    @Override
    public int getCount() {
        return models.size();
    }

    @Override
    public boolean isViewFromObject(@NonNull View view, @NonNull Object object) {
        return view.equals(object);
    }

    @NonNull
    @Override
    public Object instantiateItem(@NonNull ViewGroup container, int position) {
        layoutInflater = LayoutInflater.from(context);
        View view = layoutInflater.inflate(R.layout.item, container, false);
        ImageView imageView;
        TextView title, text;
        imageView = view.findViewById(R.id.image);
        title = view.findViewById(R.id.title);
        text = view.findViewById(R.id.text);

        imageView.setImageResource(models.get(position).getImages());
        text.setText(models.get(position).getText());
        title.setText(models.get(position).getTitle());

        container.addView(view,0);

        return view;
    }

    @Override
    public void destroyItem(@NonNull ViewGroup container, int position, @NonNull Object object) {
        container.removeView((View) object);
    }
}
