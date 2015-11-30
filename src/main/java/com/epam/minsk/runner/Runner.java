package com.epam.minsk.runner;

import java.io.IOException;

import org.xml.sax.SAXException;
import org.xml.sax.XMLReader;

import com.epam.minsk.xml.analyzer.ComponentAnalyzerSAX;
import com.epam.minsk.xml.analyzer.RecipeAnalyzerSAX;

public class Runner {

	public static void main(String[] args) {
		try {
			// создание SAX-анализатора
			XMLReader readerRecipe = org.xml.sax.helpers.XMLReaderFactory.createXMLReader();
			XMLReader readerComponent = org.xml.sax.helpers.XMLReaderFactory.createXMLReader();
			RecipeAnalyzerSAX recipeSax = new RecipeAnalyzerSAX();
			ComponentAnalyzerSAX componentSAX = new ComponentAnalyzerSAX();
			readerRecipe.setContentHandler(recipeSax);
			readerRecipe.parse("recipe.xml");
			readerComponent.setContentHandler(recipeSax);
			readerComponent.parse("component.xml");
		} catch (SAXException e) {
			e.printStackTrace();
			System.out.print("error of SAX");
		} catch (IOException e) {
			e.printStackTrace();
			System.out.print("I/О exception");
		}
	}

}
