package com.example.picasso;

import android.graphics.Bitmap;

import com.squareup.picasso.Transformation;

/**
 * Created by Anand on 17/10/2016.
 */

public class CustomTransformation implements Transformation {
    @Override
    public Bitmap transform(Bitmap source) {
        int minSize = Math.min(source.getWidth(), source.getHeight());
        int x = (source.getWidth() - minSize) / 2;
        int y = (source.getHeight() - minSize) / 2;

        Bitmap bitmap = Bitmap.createBitmap(source, x, y, minSize, minSize);

        if(bitmap != source) {
            source.recycle();
        }
        return bitmap;
    }

    @Override
    public String key() {
        return "square_image";
    }
}
