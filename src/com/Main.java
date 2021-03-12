package com;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.IOException;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) throws IOException {
//        ArrayList<Rtv> rtv = new ArrayList<>();
//
//        Document doc = Jsoup.connect("https://allegro.pl/kategoria/rtv-i-agd?bmatch=cl-e2101-d3718-c3682-ele-1-2-0304").get();
//        Document doc1 = Jsoup.connect("https://allegro.pl/kategoria/rtv-i-agd?bmatch=cl-e2101-d3718-c3682-ele-1-2-0304&p=2").get();
//        Document doc2 = Jsoup.connect("https://allegro.pl/kategoria/rtv-i-agd?bmatch=cl-e2101-d3718-c3682-ele-1-2-0304&p=3").get();
//        Document doc3 = Jsoup.connect("https://allegro.pl/kategoria/rtv-i-agd?bmatch=cl-e2101-d3718-c3682-ele-1-2-0304&p=4").get();
//        Elements h2Elem = doc.getElementsByClass("mx7m_1 mnyp_co mlkp_ag");
//        Elements h2Elem1 = doc1.getElementsByClass("mx7m_1 mnyp_co mlkp_ag");
//        Elements h2Elem2 = doc2.getElementsByClass("mx7m_1 mnyp_co mlkp_ag");
//        Elements h2Elem3 = doc3.getElementsByClass("mx7m_1 mnyp_co mlkp_ag");
//        for (Element element : h2Elem) {
//
//            Element aElem = element.child(0);
//            Element child = aElem.child(1);
//            Elements elements = child.getElementsByClass("mgn2_14 m9qz_yp mqu1_16 mp4t_0 m3h2_0 mryx_0 munh_0");
//            String title = elements.text();
//
//            Element aElem1 = element.child(0);
//            Element child1 = aElem1.child(1);
//            Element child3 = child1.child(2);
//            String price = child3.child(0).text();
//
//            Element aElem2 = element.child(0);
//            Element child2 = aElem2.child(1);
//            String description = child2.getElementsByClass("mpof_z0 m7er_k4").text();
//
//            rtv.add(new Rtv(title,price,description));
//        }
//        for (Rtv rtv1 : rtv) {
//            System.out.println(rtv1);
//        }
//
//        for (Element element1 : h2Elem1) {
//            Element aElem = element1.child(0);
//            Element child = aElem.child(1);
//            Elements elements = child.getElementsByClass("mgn2_14 m9qz_yp mqu1_16 mp4t_0 m3h2_0 mryx_0 munh_0");
//            String title = elements.text();
//
//            Element aElem1 = element1.child(0);
//            Element child1 = aElem1.child(1);
//            Element child3 = child1.child(2);
//            String price = child3.child(0).text();
//
//            Element aElem2 = element1.child(0);
//            Element child2 = aElem2.child(1);
//            String description = child2.getElementsByClass("mpof_z0 m7er_k4").text();
//
//            rtv.add(new Rtv(title,price,description));
//        }
//
//        for (Rtv rtv1 : rtv) {
//            System.out.println(rtv1.getTitle()+ "   " + rtv1.getDescription()+ "  "+ rtv1.getPrice());
//        }
//
//        for (Element element2 : h2Elem2) {
//            Element aElem = element2.child(0);
//            Element child = aElem.child(1);
//            Elements elements = child.getElementsByClass("mgn2_14 m9qz_yp mqu1_16 mp4t_0 m3h2_0 mryx_0 munh_0");
//            String title = elements.text();
//
//            Element aElem1 = element2.child(0);
//            Element child1 = aElem1.child(1);
//            Element child3 = child1.child(2);
//            String price = child3.child(0).text();
//
//            Element aElem2 = element2.child(0);
//            Element child2 = aElem2.child(1);
//            String description = child2.getElementsByClass("mpof_z0 m7er_k4").text();
//
//            rtv.add(new Rtv(title,price,description));
//        }
//
//        for (Rtv rtv1 : rtv) {
//            System.out.println(rtv1.getTitle()+ "   " + rtv1.getDescription()+ "  "+ rtv1.getPrice());
//        }
//
//        for (Element element3 : h2Elem3) {
//            Element aElem = element3.child(0);
//            Element child = aElem.child(1);
//            Elements elements = child.getElementsByClass("mgn2_14 m9qz_yp mqu1_16 mp4t_0 m3h2_0 mryx_0 munh_0");
//            String title = elements.text();
//
//            Element aElem1 = element3.child(0);
//            Element child1 = aElem1.child(1);
//            Element child3 = child1.child(2);
//            String price = child3.child(0).text();
//
//
//            Element aElem2 = element3.child(0);
//            Element child2 = aElem2.child(1);
//            String description = child2.getElementsByClass("mpof_z0 m7er_k4").text();
//
//            rtv.add(new Rtv(title,price,description));
//        }
//
//        for (Rtv rtv1 : rtv) {
//            System.out.println(rtv1.getTitle()+ "   " + rtv1.getDescription()+ "  "+ rtv1.getPrice());
//        }

        RTV();
    }

    public static void RTV() throws IOException {
        ArrayList<Rtv> rtv = new ArrayList<>();

        Document doc = Jsoup.connect("https://allegro.pl/kategoria/rtv-i-agd?bmatch=cl-e2101-d3718-c3682-ele-1-2-0304").get();
        Document doc1 = Jsoup.connect("https://allegro.pl/kategoria/rtv-i-agd?bmatch=cl-e2101-d3718-c3682-ele-1-2-0304&p=2").get();
        Document doc2 = Jsoup.connect("https://allegro.pl/kategoria/rtv-i-agd?bmatch=cl-e2101-d3718-c3682-ele-1-2-0304&p=3").get();
        Document doc3 = Jsoup.connect("https://allegro.pl/kategoria/rtv-i-agd?bmatch=cl-e2101-d3718-c3682-ele-1-2-0304&p=4").get();
        Elements h2Elem = doc.getElementsByClass("mx7m_1 mnyp_co mlkp_ag");
        Elements h2Elem1 = doc1.getElementsByClass("mx7m_1 mnyp_co mlkp_ag");
        Elements h2Elem2 = doc2.getElementsByClass("mx7m_1 mnyp_co mlkp_ag");
        Elements h2Elem3 = doc3.getElementsByClass("mx7m_1 mnyp_co mlkp_ag");
        for (Element element : h2Elem) {

            Element aElem = element.child(0);
            Element child = aElem.child(1);
            Elements elements = child.getElementsByClass("mgn2_14 m9qz_yp mqu1_16 mp4t_0 m3h2_0 mryx_0 munh_0");
            String title = elements.text();

            Element aElem1 = element.child(0);
            Element child1 = aElem1.child(1);
            Element child3 = child1.child(2);
            String price = child3.child(0).text();

            Element aElem2 = element.child(0);
            Element child2 = aElem2.child(1);
            String description = child2.getElementsByClass("mpof_z0 m7er_k4").text();

            rtv.add(new Rtv(title,price,description));
        }
        for (Rtv rtv1 : rtv) {
            System.out.println(rtv1);
        }

        for (Element element1 : h2Elem1) {
            Element aElem = element1.child(0);
            Element child = aElem.child(1);
            Elements elements = child.getElementsByClass("mgn2_14 m9qz_yp mqu1_16 mp4t_0 m3h2_0 mryx_0 munh_0");
            String title = elements.text();

            Element aElem1 = element1.child(0);
            Element child1 = aElem1.child(1);
            Element child3 = child1.child(2);
            String price = child3.child(0).text();

            Element aElem2 = element1.child(0);
            Element child2 = aElem2.child(1);
            String description = child2.getElementsByClass("mpof_z0 m7er_k4").text();

            rtv.add(new Rtv(title,price,description));
        }

        for (Rtv rtv1 : rtv) {
            System.out.println(rtv1.getTitle()+ "   " + rtv1.getDescription()+ "  "+ rtv1.getPrice());
        }

        for (Element element2 : h2Elem2) {
            Element aElem = element2.child(0);
            Element child = aElem.child(1);
            Elements elements = child.getElementsByClass("mgn2_14 m9qz_yp mqu1_16 mp4t_0 m3h2_0 mryx_0 munh_0");
            String title = elements.text();

            Element aElem1 = element2.child(0);
            Element child1 = aElem1.child(1);
            Element child3 = child1.child(2);
            String price = child3.child(0).text();

            Element aElem2 = element2.child(0);
            Element child2 = aElem2.child(1);
            String description = child2.getElementsByClass("mpof_z0 m7er_k4").text();

            rtv.add(new Rtv(title,price,description));
        }

        for (Rtv rtv1 : rtv) {
            System.out.println(rtv1.getTitle()+ "   " + rtv1.getDescription()+ "  "+ rtv1.getPrice());
        }

        for (Element element3 : h2Elem3) {
            Element aElem = element3.child(0);
            Element child = aElem.child(1);
            Elements elements = child.getElementsByClass("mgn2_14 m9qz_yp mqu1_16 mp4t_0 m3h2_0 mryx_0 munh_0");
            String title = elements.text();

            Element aElem1 = element3.child(0);
            Element child1 = aElem1.child(1);
            Element child3 = child1.child(2);
            String price = child3.child(0).text();


            Element aElem2 = element3.child(0);
            Element child2 = aElem2.child(1);
            String description = child2.getElementsByClass("mpof_z0 m7er_k4").text();

            rtv.add(new Rtv(title,price,description));
        }

        for (Rtv rtv1 : rtv) {
            System.out.println(rtv1.getTitle()+ "   " + rtv1.getDescription()+ "  "+ rtv1.getPrice());
        }
    }
}
