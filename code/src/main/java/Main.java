import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Dictionary;
import java.util.Hashtable;

public class Main {
    public static void main(String[] args) throws IOException {
        Scraper sr = new Scraper("https://www.multicom.no/");
        System.out.println(sr.getRoot());

        //System.out.println("getContentFromTag: "+ sr.getContentFromTag("h1"));
        //System.out.println("getContentFromId: "+ sr.getContentFromId("header1"));
        //System.out.println("getContentFromClass: "+ sr.getContentFromClass("class1"));
        //System.out.println("getLinksInPage: "+ sr.getLinksInPage());
        //System.out.println("contains: " + sr.contains("hild"));
        //System.out.println("contains CaseInSensetive: " + sr.containsCaseInSensetive("Child"));
        //System.out.println("getAllImagesFromPage : " + sr.getAllImagesFromPage());
        //System.out.println("getImageById : " + sr.getImageById("bestebildet"));
        //System.out.println("getImageByClass : " + sr.getImageByClass("bestebildene"));
        //System.out.println("getAllVideosFromPage : " + sr.getAllVideosFromPage());
        //System.out.println("getVideoById : " + sr.getVideoById("bestevideoen"));
        //System.out.println("getVideoByClass : " + sr.getVideoByClass("bestevideoene"));
        //System.out.println("getClassesInPage : " + sr.getClassesInPage());
        //System.out.println("getIdsInPage : " + sr.getIdsInPage());

    }
}


