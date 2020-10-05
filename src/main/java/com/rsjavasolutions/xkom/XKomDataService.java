package com.rsjavasolutions.xkom;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class XKomDataService {

   private UrlService urlService = new UrlService();

    public String getItemName(){
        String allContent = urlService.getPromoData();
        String name = allContent.substring(allContent.indexOf("<h1 class"));

        return  name.substring(32, name.indexOf('/')-1);
    }

    public String getOldPrice(){
        String allContent = urlService.getPromoData();
        String price = allContent.substring(allContent.indexOf("oldPrice"));

        return price.substring(10, price.indexOf(','))   + " zł";
    }

    public String getNewPrice(){
        String allContent = urlService.getPromoData();
        String price = allContent.substring(allContent.indexOf("\"extend\":{\"id\":"));
        String newPrice = price.substring(price.indexOf("price"));

        return newPrice.substring(newPrice.indexOf("price") + 7, newPrice.indexOf(','))   + " zł";
    }

    public String getLink(){
        return "https://www.x-kom.pl/goracy_strzal";
    }

    public String getImageSource(){
        String allContent = urlService.getPromoData();

        String photo = allContent.substring(allContent.indexOf("><img src=\"https://") + 11);

        String photoUrl = photo.substring(0, photo.indexOf('"'));

        return photoUrl;
    }

}
