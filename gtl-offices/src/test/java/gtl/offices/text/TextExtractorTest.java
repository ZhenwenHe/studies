package gtl.offices.text;

import gtl.offices.text.TextExtractor;
import org.junit.Test;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.awt.image.ImageFilter;
import java.io.File;
import java.io.IOException;

public class TextExtractorTest {

    @Test
    public void parseToParagraphsPDF() {
        String inputFile = "dat/word.pdf";
        String [] paragraphs = TextExtractor.parseToParagraphs(inputFile);
        for(String s : paragraphs){
            System.out.println(s);
        }
    }
    @Test
    public void parseToParagraphsDOC() {
        String inputFile = "dat/word.doc";
        String [] paragraphs = TextExtractor.parseToParagraphs(inputFile);
        for(String s : paragraphs){
            System.out.println(s);
        }
    }
    @Test
    public void parseToParagraphsDOCX() {
        String inputFile = "dat/word.docx";
        String [] paragraphs = TextExtractor.parseToParagraphs(inputFile);
        for(String s : paragraphs){
            System.out.println(s);
        }
    }

}