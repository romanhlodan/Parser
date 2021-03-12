package com;

import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVPrinter;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;

public class Main {

    public static void main(String[] args) throws Exception {

        Health();
//        Auto();
//        RTV();

//        FileWriter out = new FileWriter("data.csv");
//        CSVPrinter csvPrinter = new CSVPrinter(out, CSVFormat.DEFAULT);

    }
    public static void Health() throws IOException {

//        HashSet<Health> hashSet = new HashSet<>();
        ArrayList<Health> health = new ArrayList<>();
        Document doc = Jsoup.connect("https://allegro.pl/kategoria/zdrowie?string=bargain_zone&bmatch=e2101-d3718-c3682-hea-1-2-0304").get();
        Document doc2 = Jsoup.connect("https://allegro.pl/kategoria/zdrowie?string=bargain_zone&bmatch=e2101-d3718-c3682-hea-1-2-0304&p=2").get();
        Document doc3 = Jsoup.connect("https://allegro.pl/kategoria/zdrowie?string=bargain_zone&bmatch=e2101-d3718-c3682-hea-1-2-0304&p=3").get();
        Document doc4 = Jsoup.connect("https://allegro.pl/kategoria/zdrowie?string=bargain_zone&bmatch=e2101-d3718-c3682-hea-1-2-0304&p=4").get();

        Elements elem = doc.getElementsByClass("mx7m_1 mnyp_co mlkp_ag");
        Elements elem2 = doc2.getElementsByClass("mx7m_1 mnyp_co mlkp_ag");
        Elements elem3 = doc3.getElementsByClass("mx7m_1 mnyp_co mlkp_ag");
        Elements elem4 = doc4.getElementsByClass("mx7m_1 mnyp_co mlkp_ag");
//        Boolean aClass = doc.getElementsByClass("mp0t_ji mpof_vs _9c44d_1VS-Y  _9c44d_3_DDQ  mpof_vs _9c44d_2MDwk  ").isEmpty();
//        boolean b = aClass.booleanValue();


        for (Element element : elem) {

                    Element aElem = element.child(0);
                    Element child = aElem.child(1);
                    Elements elements = child.getElementsByClass("mgn2_14 m9qz_yp mqu1_16 mp4t_0 m3h2_0 mryx_0 munh_0");
//                    String title = elements.text();


                    Element aElem1 = element.child(0);
                    Element child1 = aElem1.child(1);
                    Element child3 = child1.child(2);
//                    String price = child3.child(0).text();

                    Element aElem2 = element.child(0);
                    Element child2 = aElem2.child(1);
//                    String description = child2.getElementsByClass("m7er_k4 _9c44d_3TzmE").text();


                    Element aElem3 = element.child(0);
                    Element child4 = aElem3.child(1);
                    Elements a = child4.getElementsByTag("a");
//                    String url = a.attr("href");

                    Element aElem4 = element.child(0);
                    Element child5 = aElem4.child(1);
                    Elements elementsByClass = child5.getElementsByClass("mp0t_ji mpof_vs _9c44d_1VS-Y  _9c44d_3_DDQ  mpof_vs _9c44d_2MDwk  ");

//                    if (elementsByClass.hasClass("mp0t_ji mpof_vs _9c44d_1VS-Y  _9c44d_3_DDQ  mpof_vs _9c44d_2MDwk  ")){
//                        String text = elements.text();
//                        String text1 = child3.child(0).text();
//                        String text2 = child2.getElementsByClass("m7er_k4 _9c44d_3TzmE").text();
//                        String href = a.attr("href");
//
////                        hashSet.add(new Health(text, text1, text2, href));
////                        hashSet.add(new Health(text,text1,text2,href));
//
//                    }

                    health.add(new Health(elements.text(),child3.child(0).text(),child2.getElementsByClass("m7er_k4 _9c44d_3TzmE").text(),a.attr("href")));
            System.out.println(health);
//                             for (Health health2 : hashSet) {
//                                 System.out.println(health2.getTitle());
////                                 System.out.println(health2);
//                    }

                }

//_______________________________
//        for (Element element1 : elem2) {
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
//            String description = child2.getElementsByClass("m7er_k4 _9c44d_3TzmE").text();
//
//            Element aElem3 = element1.child(0);
//            Element child4 = aElem3.child(1);
//            Elements a = child4.getElementsByTag("a");
//            String url = a.attr("href");
//
//            health.add(new Health(title,price,description,url));
//        }
//        for (Health healElem : health) {
//            System.out.println(healElem);
//        }
//
//        for (Element element2 : elem3) {
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
//            String description = child2.getElementsByClass("m7er_k4 _9c44d_3TzmE").text();
//
//            Element aElem3 = element2.child(0);
//            Element child4 = aElem3.child(1);
//            Elements a = child4.getElementsByTag("a");
//            String url = a.attr("href");
//
//            health.add(new Health(title,price,description,url));
//        }
//        for (Health healElem : health) {
//            System.out.println(healElem);
//        }
//
//        for (Element element3 : elem4) {
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
//            String description = child2.getElementsByClass("m7er_k4 _9c44d_3TzmE").text();
//
//            Element aElem3 = element3.child(0);
//            Element child4 = aElem3.child(1);
//            Elements a = child4.getElementsByTag("a");
//            String url = a.attr("href");
//
//            health.add(new Health(title,price,description,url));
//        }
//        for (Health healElem : health) {
//            System.out.println(healElem);
//        }
//    }
//    public static void Auto() throws IOException {
//        ArrayList<Auto> auto = new ArrayList<>();
//        Document connect = Jsoup.connect("https://allegro.pl/kategoria/motoryzacja?string=bargain_zone&bmatch=cl-e2101-d3718-c3682-aut-1-2-0304").get();
//        Document connect1 = Jsoup.connect("https://allegro.pl/kategoria/motoryzacja?string=bargain_zone&bmatch=cl-e2101-d3718-c3682-aut-1-2-0304&p=2").get();
//        Document connect2 = Jsoup.connect("https://allegro.pl/kategoria/motoryzacja?string=bargain_zone&bmatch=cl-e2101-d3718-c3682-aut-1-2-0304&p=3").get();
//        Document connect3 = Jsoup.connect("https://allegro.pl/kategoria/motoryzacja?string=bargain_zone&bmatch=cl-e2101-d3718-c3682-aut-1-2-0304&p=4").get();
//
//        Elements elem = connect.getElementsByClass("mx7m_1 mnyp_co mlkp_ag");
//        Elements elem1 = connect1.getElementsByClass("mx7m_1 mnyp_co mlkp_ag");
//        Elements elem2 = connect2.getElementsByClass("mx7m_1 mnyp_co mlkp_ag");
//        Elements elem3 = connect3.getElementsByClass("mx7m_1 mnyp_co mlkp_ag");
//        for (Element element : elem) {
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
//            Element aElem3 = element.child(0);
//            Element child4 = aElem3.child(1);
//            Elements a = child4.getElementsByTag("a");
//            String url = a.attr("href");
//
//            auto.add(new Auto(title,price,description,url));
//        }
//        for (Auto autoElem : auto) {
//            System.out.println(autoElem);
//        }
//
//        for (Element element1 : elem1) {
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
//            Element aElem3 = element1.child(0);
//            Element child4 = aElem3.child(1);
//            Elements a = child4.getElementsByTag("a");
//            String url = a.attr("href");
//
//            auto.add(new Auto(title,price,description,url));
//        }
//        for (Auto autoElem : auto) {
//            System.out.println(autoElem);
//        }
//
//        for (Element element2 : elem2) {
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
//            Element aElem3 = element2.child(0);
//            Element child4 = aElem3.child(1);
//            Elements a = child4.getElementsByTag("a");
//            String url = a.attr("href");
//
//            auto.add(new Auto(title,price,description,url));
//        }
//        for (Auto autoElem : auto) {
//            System.out.println(autoElem);
//        }
//
//        for (Element element3 : elem3) {
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
//            Element aElem3 = element3.child(0);
//            Element child4 = aElem3.child(1);
//            Elements a = child4.getElementsByTag("a");
//            String url = a.attr("href");
//
//            auto.add(new Auto(title,price,description,url));
//        }
//        for (Auto autoElem : auto) {
//            System.out.println(autoElem);
//        }
//    }
//    public static void RTV() throws IOException {
//        ArrayList<Rtv> rtv = new ArrayList<>();
//
//        Document doc = Jsoup.connect("https://allegro.pl/kategoria/rtv-i-agd?bmatch=cl-e2101-d3718-c3682-ele-1-2-0304").get();
//        Document doc1 = Jsoup.connect("https://allegro.pl/kategoria/rtv-i-agd?bmatch=cl-e2101-d3718-c3682-ele-1-2-0304&p=2").get();
//        Document doc2 = Jsoup.connect("https://allegro.pl/kategoria/rtv-i-agd?bmatch=cl-e2101-d3718-c3682-ele-1-2-0304&p=3").get();
//        Document doc3 = Jsoup.connect("https://allegro.pl/kategoria/rtv-i-agd?bmatch=cl-e2101-d3718-c3682-ele-1-2-0304&p=4").get();
//        Elements Elem = doc.getElementsByClass("mx7m_1 mnyp_co mlkp_ag");
//        Elements Elem1 = doc1.getElementsByClass("mx7m_1 mnyp_co mlkp_ag");
//        Elements Elem2 = doc2.getElementsByClass("mx7m_1 mnyp_co mlkp_ag");
//        Elements Elem3 = doc3.getElementsByClass("mx7m_1 mnyp_co mlkp_ag");
//        for (Element element : Elem) {
//
//            Element aElem = element.child(0);
//            Element child = aElem.child(1);
//            Elements elements = child.getElementsByClass("mgn2_14 m9qz_yp mqu1_16 mp4t_0 m3_0 mryx_0 munh_0");
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
//            Element aElem3 = element.child(0);
//            Element child4 = aElem3.child(1);
//            Elements a = child4.getElementsByTag("a");
//            String url = a.attr("href");
//
//            rtv.add(new Rtv(title,price,description,url));
//        }
//        for (Rtv rtv1 : rtv) {
//            System.out.println(rtv1);
//        }
//
//        for (Element element1 : Elem1) {
//            Element aElem = element1.child(0);
//            Element child = aElem.child(1);
//            Elements elements = child.getElementsByClass("mgn2_14 m9qz_yp mqu1_16 mp4t_0 m3_0 mryx_0 munh_0");
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
//            Element aElem3 = element1.child(0);
//            Element child4 = aElem3.child(1);
//            Elements a = child4.getElementsByTag("a");
//            String url = a.attr("href");
//
//            rtv.add(new Rtv(title,price,description,url));
//        }
//
//        for (Rtv rtv1 : rtv) {
//            System.out.println(rtv1);
//        }
//
//        for (Element element2 : Elem2) {
//            Element aElem = element2.child(0);
//            Element child = aElem.child(1);
//            Elements elements = child.getElementsByClass("mgn2_14 m9qz_yp mqu1_16 mp4t_0 m3_0 mryx_0 munh_0");
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
//            Element aElem3 = element2.child(0);
//            Element child4 = aElem3.child(1);
//            Elements a = child4.getElementsByTag("a");
//            String url = a.attr("href");
//
//            rtv.add(new Rtv(title,price,description,url));
//        }
//
//        for (Rtv rtv1 : rtv) {
//            System.out.println(rtv1);
//        }
//
//        for (Element element3 : Elem3) {
//            Element aElem = element3.child(0);
//            Element child = aElem.child(1);
//            Elements elements = child.getElementsByClass("mgn2_14 m9qz_yp mqu1_16 mp4t_0 m3_0 mryx_0 munh_0");
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
//            Element aElem3 = element3.child(0);
//            Element child4 = aElem3.child(1);
//            Elements a = child4.getElementsByTag("a");
//            String url = a.attr("href");
//
//            rtv.add(new Rtv(title,price,description,url));
//        }
//
//        for (Rtv rtv1 : rtv) {
//            System.out.println(rtv1);
//        }
    }
}
