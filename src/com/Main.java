package com;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;


public class Main {

    public static void main(String[] args) throws Exception {

        Health();
        Auto();
        RTV();
    }

    public static void Health() throws IOException {

        ArrayList<Health> health = new ArrayList<>();
        Document doc = Jsoup.connect("https://allegro.pl/kategoria/zdrowie?string=bargain_zone&bmatch=e2101-d3718-c3682-hea-1-2-0304").userAgent("Chrome/89.0.4389.82").referrer("https://www.google.com.ua/").get();
        Document doc2 = Jsoup.connect("https://allegro.pl/kategoria/zdrowie?string=bargain_zone&bmatch=e2101-d3718-c3682-hea-1-2-0304&p=2").userAgent("Chrome/89.0.4389.82").referrer("https://www.google.com.ua/").get();
        Document doc3 = Jsoup.connect("https://allegro.pl/kategoria/zdrowie?string=bargain_zone&bmatch=e2101-d3718-c3682-hea-1-2-0304&p=3").userAgent("Chrome/89.0.4389.82").referrer("https://www.google.com.ua/").get();


        Elements elem = doc.getElementsByClass("mx7m_1 mnyp_co mlkp_ag");
        Elements elem2 = doc2.getElementsByClass("mx7m_1 mnyp_co mlkp_ag");
        Elements elem3 = doc3.getElementsByClass("mx7m_1 mnyp_co mlkp_ag");

        for (Element element : elem) {

            Element aElem = element.child(0);
            Element child = aElem.child(1);
            Elements elements = child.getElementsByClass("mgn2_14 m9qz_yp mqu1_16 mp4t_0 m3h2_0 mryx_0 munh_0");

            Element aElem1 = element.child(0);
            Element child1 = aElem1.child(1);
            Element child3 = child1.child(2);

            Element aElem2 = element.child(0);
            Element child2 = aElem2.child(1);

            Element aElem3 = element.child(0);
            Element child4 = aElem3.child(1);
            Elements a = child4.getElementsByTag("a");

            Element aElem4 = element.child(0);
            Element child5 = aElem4.child(1);
            Elements elementsByClass = child5.getElementsByClass("mp0t_ji mpof_vs _9c44d_1VS-Y  _9c44d_3_DDQ  mpof_vs _9c44d_2MDwk  ");

            if (elementsByClass.hasClass("mp0t_ji mpof_vs _9c44d_1VS-Y  _9c44d_3_DDQ  mpof_vs _9c44d_2MDwk  ")) {
                String title = elements.text();
                String price = child3.child(0).text();
                String description = child2.getElementsByClass("m7er_k4 _9c44d_3TzmE").text();
                String url = a.attr("href");
                health.add(new Health(title, price, description, url));
            }
        }
        for (Health healthList : health) {

            File file = new File("Health.csv");
            if (!file.exists()) {
                file.createNewFile();
            }
            PrintWriter printWriter = new PrintWriter(new FileWriter(file, true));
            printWriter.append(healthList.getTitle());
            printWriter.append(",");
            printWriter.append(healthList.getDescription());
            printWriter.append(",");
            printWriter.append(healthList.getPrice());
            printWriter.append(",");
            printWriter.append(healthList.getUrl());
            printWriter.append("\r\n");
            printWriter.flush();
            printWriter.close();
            System.out.println("Done");
        }


        for (Element element1 : elem2) {
            Element aElem = element1.child(0);
            Element child = aElem.child(1);
            Elements elements = child.getElementsByClass("mgn2_14 m9qz_yp mqu1_16 mp4t_0 m3h2_0 mryx_0 munh_0");

            Element aElem1 = element1.child(0);
            Element child1 = aElem1.child(1);
            Element child3 = child1.child(2);

            Element aElem2 = element1.child(0);
            Element child2 = aElem2.child(1);

            Element aElem3 = element1.child(0);
            Element child4 = aElem3.child(1);
            Elements a = child4.getElementsByTag("a");

            Element aElem4 = element1.child(0);
            Element child5 = aElem4.child(1);
            Elements elementsByClass = child5.getElementsByClass("mp0t_ji mpof_vs _9c44d_1VS-Y  _9c44d_3_DDQ  mpof_vs _9c44d_2MDwk  ");

            if (elementsByClass.hasClass("mp0t_ji mpof_vs _9c44d_1VS-Y  _9c44d_3_DDQ  mpof_vs _9c44d_2MDwk  ")) {
                String title = elements.text();
                String price = child3.child(0).text();
                String description = child2.getElementsByClass("m7er_k4 _9c44d_3TzmE").text();
                String url = a.attr("href");
                health.add(new Health(title, price, description, url));
            }
        }
        for (Health healthList : health) {
            File file = new File("Health.csv");
            if (!file.exists()) {
                file.createNewFile();
            }
            PrintWriter printWriter = new PrintWriter(new FileWriter(file, true));
            printWriter.append(healthList.getTitle());
            printWriter.append(",");
            printWriter.append(healthList.getDescription());
            printWriter.append(",");
            printWriter.append(healthList.getPrice());
            printWriter.append(",");
            printWriter.append(healthList.getUrl());
            printWriter.append("\r\n");
            printWriter.flush();
            printWriter.close();
            System.out.println("Done");
        }

        for (Element element2 : elem3) {
            Element aElem = element2.child(0);
            Element child = aElem.child(1);
            Elements elements = child.getElementsByClass("mgn2_14 m9qz_yp mqu1_16 mp4t_0 m3h2_0 mryx_0 munh_0");

            Element aElem1 = element2.child(0);
            Element child1 = aElem1.child(1);
            Element child3 = child1.child(2);

            Element aElem2 = element2.child(0);
            Element child2 = aElem2.child(1);

            Element aElem3 = element2.child(0);
            Element child4 = aElem3.child(1);
            Elements a = child4.getElementsByTag("a");

            Element aElem4 = element2.child(0);
            Element child5 = aElem4.child(1);
            Elements elementsByClass = child5.getElementsByClass("mp0t_ji mpof_vs _9c44d_1VS-Y  _9c44d_3_DDQ  mpof_vs _9c44d_2MDwk  ");

            if (elementsByClass.hasClass("mp0t_ji mpof_vs _9c44d_1VS-Y  _9c44d_3_DDQ  mpof_vs _9c44d_2MDwk  ")) {
                String title = elements.text();
                String price = child3.child(0).text();
                String description = child2.getElementsByClass("m7er_k4 _9c44d_3TzmE").text();
                String url = a.attr("href");
                health.add(new Health(title, price, description, url));
            }
        }
        for (Health healthList : health) {
            File file = new File("Health.csv");
            if (!file.exists()) {
                file.createNewFile();
            }
            PrintWriter printWriter = new PrintWriter(new FileWriter(file, true));
            printWriter.append(healthList.getTitle());
            printWriter.append(",");
            printWriter.append(healthList.getDescription());
            printWriter.append(",");
            printWriter.append(healthList.getPrice());
            printWriter.append(",");
            printWriter.append(healthList.getUrl());
            printWriter.append("\r\n");
            printWriter.flush();
            printWriter.close();
            System.out.println("Done");
        }
    }

    public static void Auto() throws IOException {
        ArrayList<Auto> auto = new ArrayList<>();
        Document connect = Jsoup.connect("https://allegro.pl/kategoria/motoryzacja?string=bargain_zone&bmatch=cl-e2101-d3718-c3682-aut-1-2-0304").userAgent("Chrome/89.0.4389.82").referrer("https://www.google.com.ua/").get();
        Document connect1 = Jsoup.connect("https://allegro.pl/kategoria/motoryzacja?string=bargain_zone&bmatch=cl-e2101-d3718-c3682-aut-1-2-0304&p=2").userAgent("Chrome/89.0.4389.82").referrer("https://www.google.com.ua/").get();
        Document connect2 = Jsoup.connect("https://allegro.pl/kategoria/motoryzacja?string=bargain_zone&bmatch=cl-e2101-d3718-c3682-aut-1-2-0304&p=3").userAgent("Chrome/89.0.4389.82").referrer("https://www.google.com.ua/").get();

        Elements elem = connect.getElementsByClass("mx7m_1 mnyp_co mlkp_ag");
        Elements elem1 = connect1.getElementsByClass("mx7m_1 mnyp_co mlkp_ag");
        Elements elem2 = connect2.getElementsByClass("mx7m_1 mnyp_co mlkp_ag");
        for (Element element : elem) {

            Element aElem = element.child(0);
            Element child = aElem.child(1);
            Elements elements = child.getElementsByClass("mgn2_14 m9qz_yp mqu1_16 mp4t_0 m3h2_0 mryx_0 munh_0");

            Element aElem1 = element.child(0);
            Element child1 = aElem1.child(1);
            Element child3 = child1.child(2);

            Element aElem2 = element.child(0);
            Element child2 = aElem2.child(1);

            Element aElem3 = element.child(0);
            Element child4 = aElem3.child(1);
            Elements a = child4.getElementsByTag("a");

            Element aElem4 = element.child(0);
            Element child5 = aElem4.child(1);
            Elements elementsByClass = child5.getElementsByClass("mp0t_ji mpof_vs _9c44d_1VS-Y  _9c44d_3_DDQ  mpof_vs _9c44d_2MDwk  ");

            if (elementsByClass.hasClass("mp0t_ji mpof_vs _9c44d_1VS-Y  _9c44d_3_DDQ  mpof_vs _9c44d_2MDwk  ")) {
                String title = elements.text();
                String price = child3.child(0).text();
                String description = child2.getElementsByClass("m7er_k4 _9c44d_3TzmE").text();
                String url = a.attr("href");
                auto.add(new Auto(title, price, description, url));
            }
        }
        for (Auto autoList : auto) {
            File file = new File("Auto.csv");
            if (!file.exists()) {
                file.createNewFile();
            }
            PrintWriter printWriter = new PrintWriter(new FileWriter(file, true));
            printWriter.append(autoList.getTitle());
            printWriter.append(",");
            printWriter.append(autoList.getDescription());
            printWriter.append(",");
            printWriter.append(autoList.getPrice());
            printWriter.append(",");
            printWriter.append(autoList.getUrl());
            printWriter.append("\r\n");
            printWriter.flush();
            printWriter.close();
            System.out.println("Done");
        }

        for (Element element1 : elem1) {
            Element aElem = element1.child(0);
            Element child = aElem.child(1);
            Elements elements = child.getElementsByClass("mgn2_14 m9qz_yp mqu1_16 mp4t_0 m3h2_0 mryx_0 munh_0");

            Element aElem1 = element1.child(0);
            Element child1 = aElem1.child(1);
            Element child3 = child1.child(2);

            Element aElem2 = element1.child(0);
            Element child2 = aElem2.child(1);

            Element aElem3 = element1.child(0);
            Element child4 = aElem3.child(1);
            Elements a = child4.getElementsByTag("a");

            Element aElem4 = element1.child(0);
            Element child5 = aElem4.child(1);
            Elements elementsByClass = child5.getElementsByClass("mp0t_ji mpof_vs _9c44d_1VS-Y  _9c44d_3_DDQ  mpof_vs _9c44d_2MDwk  ");

            if (elementsByClass.hasClass("mp0t_ji mpof_vs _9c44d_1VS-Y  _9c44d_3_DDQ  mpof_vs _9c44d_2MDwk  ")) {
                String title = elements.text();
                String price = child3.child(0).text();
                String description = child2.getElementsByClass("m7er_k4 _9c44d_3TzmE").text();
                String url = a.attr("href");
                auto.add(new Auto(title, price, description, url));
            }
        }
        for (Auto autoList : auto) {
            File file = new File("Auto.csv");
            if (!file.exists()) {
                file.createNewFile();
            }
            PrintWriter printWriter = new PrintWriter(new FileWriter(file, true));
            printWriter.append(autoList.getTitle());
            printWriter.append(",");
            printWriter.append(autoList.getDescription());
            printWriter.append(",");
            printWriter.append(autoList.getPrice());
            printWriter.append(",");
            printWriter.append(autoList.getUrl());
            printWriter.append("\r\n");
            printWriter.flush();
            printWriter.close();
            System.out.println("Done");
        }

        for (Element element2 : elem2) {
            Element aElem = element2.child(0);
            Element child = aElem.child(1);
            Elements elements = child.getElementsByClass("mgn2_14 m9qz_yp mqu1_16 mp4t_0 m3h2_0 mryx_0 munh_0");

            Element aElem1 = element2.child(0);
            Element child1 = aElem1.child(1);
            Element child3 = child1.child(2);

            Element aElem2 = element2.child(0);
            Element child2 = aElem2.child(1);

            Element aElem3 = element2.child(0);
            Element child4 = aElem3.child(1);
            Elements a = child4.getElementsByTag("a");

            Element aElem4 = element2.child(0);
            Element child5 = aElem4.child(1);
            Elements elementsByClass = child5.getElementsByClass("mp0t_ji mpof_vs _9c44d_1VS-Y  _9c44d_3_DDQ  mpof_vs _9c44d_2MDwk  ");

            if (elementsByClass.hasClass("mp0t_ji mpof_vs _9c44d_1VS-Y  _9c44d_3_DDQ  mpof_vs _9c44d_2MDwk  ")) {
                String title = elements.text();
                String price = child3.child(0).text();
                String description = child2.getElementsByClass("m7er_k4 _9c44d_3TzmE").text();
                String url = a.attr("href");
                auto.add(new Auto(title, price, description, url));
            }
        }
        for (Auto autoList : auto) {
            File file = new File("Auto.csv");
            if (!file.exists()) {
                file.createNewFile();
            }
            PrintWriter printWriter = new PrintWriter(new FileWriter(file, true));
            printWriter.append(autoList.getTitle());
            printWriter.append(",");
            printWriter.append(autoList.getDescription());
            printWriter.append(",");
            printWriter.append(autoList.getPrice());
            printWriter.append(",");
            printWriter.append(autoList.getUrl());
            printWriter.append("\r\n");
            printWriter.flush();
            printWriter.close();
            System.out.println("Done");
        }
    }

    public static void RTV() throws IOException {
        ArrayList<Rtv> rtv = new ArrayList<>();

        Document doc = Jsoup.connect("https://allegro.pl/kategoria/rtv-i-agd?bmatch=cl-e2101-d3718-c3682-ele-1-2-0304").userAgent("Chrome/89.0.4389.82").referrer("https://www.google.com.ua/").get();
        Document doc1 = Jsoup.connect("https://allegro.pl/kategoria/rtv-i-agd?bmatch=cl-e2101-d3718-c3682-ele-1-2-0304&p=2").userAgent("Chrome/89.0.4389.82").referrer("https://www.google.com.ua/").get();
        Document doc2 = Jsoup.connect("https://allegro.pl/kategoria/rtv-i-agd?bmatch=cl-e2101-d3718-c3682-ele-1-2-0304&p=3").userAgent("Chrome/89.0.4389.82").referrer("https://www.google.com.ua/").get();

        Elements Elem = doc.getElementsByClass("mx7m_1 mnyp_co mlkp_ag");
        Elements Elem1 = doc1.getElementsByClass("mx7m_1 mnyp_co mlkp_ag");
        Elements Elem2 = doc2.getElementsByClass("mx7m_1 mnyp_co mlkp_ag");
        for (Element element : Elem) {

            Element aElem = element.child(0);
            Element child = aElem.child(1);
            Elements elements = child.getElementsByClass("mgn2_14 m9qz_yp mqu1_16 mp4t_0 m3h2_0 mryx_0 munh_0");

            Element aElem1 = element.child(0);
            Element child1 = aElem1.child(1);
            Element child3 = child1.child(2);

            Element aElem2 = element.child(0);
            Element child2 = aElem2.child(1);

            Element aElem3 = element.child(0);
            Element child4 = aElem3.child(1);
            Elements a = child4.getElementsByTag("a");

            Element aElem4 = element.child(0);
            Element child5 = aElem4.child(1);
            Elements elementsByClass = child5.getElementsByClass("mp0t_ji mpof_vs _9c44d_1VS-Y  _9c44d_3_DDQ  mpof_vs _9c44d_2MDwk  ");

            if (elementsByClass.hasClass("mp0t_ji mpof_vs _9c44d_1VS-Y  _9c44d_3_DDQ  mpof_vs _9c44d_2MDwk  ")) {
                String title = elements.text();
                String price = child3.child(0).text();
                String description = child2.getElementsByClass("m7er_k4 _9c44d_3TzmE").text();
                String url = a.attr("href");

                rtv.add(new Rtv(title, price, description, url));
            }
        }
        for (Rtv rtvList : rtv) {
            File file = new File("RTV.csv");
            if (!file.exists()) {
                file.createNewFile();
            }
            PrintWriter printWriter = new PrintWriter(new FileWriter(file, true));
            printWriter.append(rtvList.getTitle());
            printWriter.append(",");
            printWriter.append(rtvList.getDescription());
            printWriter.append(",");
            printWriter.append(rtvList.getPrice());
            printWriter.append(",");
            printWriter.append(rtvList.getUrl());
            printWriter.append("\r\n");
            printWriter.flush();
            printWriter.close();
            System.out.println("Done");
        }

        for (Element element1 : Elem1) {
            Element aElem = element1.child(0);
            Element child = aElem.child(1);
            Elements elements = child.getElementsByClass("mgn2_14 m9qz_yp mqu1_16 mp4t_0 m3h2_0 mryx_0 munh_0");

            Element aElem1 = element1.child(0);
            Element child1 = aElem1.child(1);
            Element child3 = child1.child(2);

            Element aElem2 = element1.child(0);
            Element child2 = aElem2.child(1);

            Element aElem3 = element1.child(0);
            Element child4 = aElem3.child(1);
            Elements a = child4.getElementsByTag("a");

            Element aElem4 = element1.child(0);
            Element child5 = aElem4.child(1);
            Elements elementsByClass = child5.getElementsByClass("mp0t_ji mpof_vs _9c44d_1VS-Y  _9c44d_3_DDQ  mpof_vs _9c44d_2MDwk  ");

            if (elementsByClass.hasClass("mp0t_ji mpof_vs _9c44d_1VS-Y  _9c44d_3_DDQ  mpof_vs _9c44d_2MDwk  ")) {
                String title = elements.text();
                String price = child3.child(0).text();
                String description = child2.getElementsByClass("m7er_k4 _9c44d_3TzmE").text();
                String url = a.attr("href");
                rtv.add(new Rtv(title, price, description, url));
            }
        }
        for (Rtv rtvList : rtv) {
            File file = new File("RTV.csv");
            if (!file.exists()) {
                file.createNewFile();
            }
            PrintWriter printWriter = new PrintWriter(new FileWriter(file, true));
            printWriter.append(rtvList.getTitle());
            printWriter.append(",");
            printWriter.append(rtvList.getDescription());
            printWriter.append(",");
            printWriter.append(rtvList.getPrice());
            printWriter.append(",");
            printWriter.append(rtvList.getUrl());
            printWriter.append("\r\n");
            printWriter.flush();
            printWriter.close();
            System.out.println("Done");
        }

        for (Element element2 : Elem2) {
            Element aElem = element2.child(0);
            Element child = aElem.child(1);
            Elements elements = child.getElementsByClass("mgn2_14 m9qz_yp mqu1_16 mp4t_0 m3h2_0 mryx_0 munh_0");

            Element aElem1 = element2.child(0);
            Element child1 = aElem1.child(1);
            Element child3 = child1.child(2);

            Element aElem2 = element2.child(0);
            Element child2 = aElem2.child(1);

            Element aElem3 = element2.child(0);
            Element child4 = aElem3.child(1);
            Elements a = child4.getElementsByTag("a");

            Element aElem4 = element2.child(0);
            Element child5 = aElem4.child(1);
            Elements elementsByClass = child5.getElementsByClass("mp0t_ji mpof_vs _9c44d_1VS-Y  _9c44d_3_DDQ  mpof_vs _9c44d_2MDwk  ");

            if (elementsByClass.hasClass("mp0t_ji mpof_vs _9c44d_1VS-Y  _9c44d_3_DDQ  mpof_vs _9c44d_2MDwk  ")) {
                String title = elements.text();
                String price = child3.child(0).text();
                String description = child2.getElementsByClass("m7er_k4 _9c44d_3TzmE").text();
                String url = a.attr("href");
                rtv.add(new Rtv(title, price, description, url));
            }
        }
        for (Rtv rtvList : rtv) {
            File file = new File("RTV.csv");
            if (!file.exists()) {
                file.createNewFile();
            }
            PrintWriter printWriter = new PrintWriter(new FileWriter(file, true));
            printWriter.append(rtvList.getTitle());
            printWriter.append(",");
            printWriter.append(rtvList.getDescription());
            printWriter.append(",");
            printWriter.append(rtvList.getPrice());
            printWriter.append(",");
            printWriter.append(rtvList.getUrl());
            printWriter.append("\r\n");
            printWriter.flush();
            printWriter.close();
            System.out.println("Done");
        }

    }
}


