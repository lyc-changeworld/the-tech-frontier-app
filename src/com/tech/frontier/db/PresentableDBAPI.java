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

package com.tech.frontier.db;

import com.tech.frontier.db.impl.AbsDBAPI;
import com.tech.frontier.listeners.DataListener;

import java.util.List;

/**
 * 可用于数据展示的数据库操作接口，也就是含有setData
 * 
 * @author mrsimple
 * @param <T>
 */
public abstract class PresentableDBAPI<T> extends AbsDBAPI<T> {

    public PresentableDBAPI(String table) {
        super(table);
    }

    /**
     * 保存数据到数据库
     * 
     * @param articles
     */
    public abstract void saveDatas(List<T> datas);

    /**
     * 加载所有缓存
     * 
     * @param listener
     */
    public abstract void loadDatasFromDB(DataListener<List<T>> listener);
}