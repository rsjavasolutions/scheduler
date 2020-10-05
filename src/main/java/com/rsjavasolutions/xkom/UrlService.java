package com.rsjavasolutions.xkom;


import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;
import org.springframework.stereotype.Service;

import java.io.IOException;

public class UrlService {

    public String getPromoData() {
        Elements elements2 = null;
        try {
            Document document = Jsoup.connect("https://www.x-kom.pl/goracy_strzal").get();
             elements2 = document.getElementsByClass("container");
        } catch (IOException e) {
            e.printStackTrace();
        }
        return elements2.get(0).toString();
    }


}
