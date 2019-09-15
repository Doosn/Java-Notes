package com.leosanqing.abstractFactory.listfactory;

import com.leosanqing.abstractFactory.factory.Item;
import com.leosanqing.abstractFactory.factory.Page;

import java.util.Iterator;

/**
 * @Author: leosanqing
 * @Date: 2019-09-14 21:26
 */
public class ListPage extends Page {
    public ListPage(String title, String author) {
        super(title, author);
    }

    @Override
    public String makeHTML() {
        StringBuffer buffer = new StringBuffer();
        buffer.append("<html><head><title>" + title + "</title></head>\n");
        buffer.append("<body>\n");
        buffer.append("<h1>" + title + "</h1>");
        buffer.append("<ul>\n");
        Iterator<Item> iterator = content.iterator();
        while (iterator.hasNext()) {
            buffer.append(iterator.next().makeHTML());
        }
        buffer.append("</ul>\n");
        buffer.append("<hr><address>" + author + "</address>");
        buffer.append("</body></html>\n");

        return buffer.toString();
    }
}