package com.example.android.miwok;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v4.view.LayoutInflaterFactory;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import java.util.ArrayList;
import android.app.Activity;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by Rafal on 2/15/2017.
 */

public class WordAdapter extends ArrayAdapter<Word> {

    /**
     * Custom constructor. Context is used to inflate the layout file and
     * list is the data we want to populate into the lists.
     *
     * @param context the current context
     * @param wordList a list of Word objects to display in a list
     */
    public WordAdapter(Activity context, ArrayList<Word> wordList) {
        super(context, 0, wordList);
    }

    /**
     * Provide a view for AdapterView
     *
     * @param position the position in the list of data that should be displayed
     * @param convertView the recycled view to populate
     * @param parent The parent ViewGroup that is used for inflation
     * @return the View for the position in the AdapterView
     */
    @NonNull
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        //check if existing view is being reused, otherwise inflate the view
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(R.layout.list_item, parent, false);
        }

        // Get the {@link Word} object located at this position in the list
        Word currentWord = getItem(position);

        // Find the TextView in the list_item.xml layout with the id default_text_view
        TextView defaultWordTextView = (TextView) listItemView.findViewById(R.id.default_text_view);

        // Get the word from the current Word object and set this text on the TextView
        defaultWordTextView.setText(currentWord.getDefaultWord());

        // Find the TextView in the list_item.xml layout with the id miwok_text_view
        TextView miwokWordTextView = (TextView) listItemView.findViewById(R.id.miwok_text_view);

        // Get the word from the current Word object and set this text on the TextView
        miwokWordTextView.setText(currentWord.getMiwokWord());

        // Find the ImageView in the list_item.xml layout with the is image
        ImageView imageView = (ImageView) listItemView.findViewById((R.id.image));

        // Get the image resource id from the current Word object to display correct image
        imageView.setImageResource(currentWord.getImageResourceId());

        // Return the whole list item layout.
        return listItemView;
    }
}
