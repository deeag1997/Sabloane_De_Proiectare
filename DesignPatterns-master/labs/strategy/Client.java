/*
 * Copyright (c) 2018 SSI Schaefer Noell GmbH
 *
 * $Header: $
 */

package strategy;

import strategy.model.Book;
import strategy.model.Image;
import strategy.model.ImageProxy;
import strategy.model.Paragraph;
import strategy.model.Section;

/**
 * @author aag
 * @version $Revision: $, $Date: $, $Author: $
 */

public class Client {

  public static void main(String[] args) {
    Book noapteBuna = new Book("Noapte buna copii.!");
    Section cap1 = new Section("Capitolul 1.");
    cap1.add(new Paragraph("Text 1"));
    cap1.add(new Paragraph("Text 2"));
    cap1.add(new Image("Image 1"));
    cap1.add(new ImageProxy("image1.jpg"));
    cap1.add(new ImageProxy("image2.jpg"));
    noapteBuna.add(cap1);
    noapteBuna.add(new Paragraph("Multumesc"));
    noapteBuna.print();
	
	Paragraph paragraph = new Paragraph("test");
	AlignStrategy align = new SpecialAlign();
	paragraph.setAlignStrategy(align);
	paragraph.print();
  }

}
