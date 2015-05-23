/*
 * The MIT License (MIT)
 *
 * Copyright (c) 2014-2015 Umeng, Inc
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in
 * all copies or substantial portions of the Software.
 * 
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN
 * THE SOFTWARE.
 */

package com.tech.frontier.adapters;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.tech.frontier.R;
import com.tech.frontier.adapters.MenuAdapter.MenuViewHolder;
import com.tech.frontier.entities.MenuItem;

import java.util.List;

/**
 * 菜单列表Adapter
 * 
 * @author mrsimple
 */
public class MenuAdapter extends BaseAdapter<MenuItem, MenuViewHolder> {

    public MenuAdapter(List<MenuItem> dataSet) {
        super(dataSet);
    }

    @Override
    protected void bindDataToItemView(MenuViewHolder viewHolder, MenuItem item) {
        viewHolder.nameTextView.setText(item.text);
        viewHolder.userImageView.setImageResource(item.iconResId);
    }

    @Override
    public MenuViewHolder onCreateViewHolder(ViewGroup viewGroup, int viewType) {
        return new MenuViewHolder(inflateItemView(viewGroup, R.layout.menu_item));
    }

    static class MenuViewHolder extends RecyclerView.ViewHolder {
        public ImageView userImageView;
        public TextView nameTextView;

        public MenuViewHolder(View itemView) {
            super(itemView);
            userImageView = (ImageView) itemView.findViewById(R.id.menu_icon_imageview);

            nameTextView = (TextView) itemView.findViewById(R.id.menu_text_tv);
        }
    }
}
