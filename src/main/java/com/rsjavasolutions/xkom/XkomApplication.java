package com.rsjavasolutions.xkom;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
public class XkomApplication {

	public static void main(String[] args) {

		SpringApplication.run(XkomApplication.class, args);

        XKomDataService xKomDataService = new XKomDataService();

        System.out.println();
        System.out.println("nazwa przedmiotu w promce na x kom");
        System.out.println(xKomDataService.getItemName());

        System.out.println();
        System.out.println("Stara cena:");
        System.out.println(xKomDataService.getOldPrice());

        System.out.println();
        System.out.println("Cena w promocji:");
        System.out.println(xKomDataService.getNewPrice());

        System.out.println();
        System.out.println("Link: ");
        System.out.println("https://www.x-kom.pl/goracy_strzal");

        System.out.println();
        System.out.println("Foto: ");
        System.out.println(xKomDataService.getImageSource());

//        System.out.println();
//        System.out.println("Nazwa przedmiotu");
//        System.out.println(dataService.getPromoData().getElementsByClass("promo-box-name").text());
//        System.out.println();
////
//		System.out.println("stara cena");
//		System.out.println(dataService.getPromoData().getElementsByClass("promo-box-old-price").text());
//		System.out.println();
////
//		System.out.println("cena w promce");
//		System.out.println(dataService.getPromoData().getElementsByClass("promo-box-new-price").text());
//		System.out.println();

//
//		System.out.println("fota");
//		String basicString = dataService.getPromoData("https://www.morele.net/").getElementsByClass("prom-box-image").toString();
//
//		String firstSub = basicString.substring(9);
//
//		String link = firstSub.substring(0, firstSub.indexOf("\""));
//
//		System.out.println(link);
//
//		String photo = dataService.getPromoData(link).getElementsByClass("mobx-img mobx-media-loaded").toString();
//		System.out.println(photo);
////		String third = firstSub.substring(10);
////		String fourth = third.substring(0, third.indexOf("\""));
////		System.out.println(fourth);
//
//
////
//		System.out.println("fota");
//		String basicString = dataService.getPromoData().getElementsByClass("prom-box-image").toString();
//		String firstSub = basicString.substring(basicString.indexOf("<img src="));
//		String third = firstSub.substring(10);
//		String fourth = third.substring(0, third.indexOf("\""));
//		System.out.println(fourth);

	}

}
