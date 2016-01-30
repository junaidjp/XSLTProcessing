package com.zensolutions;

import java.io.FileOutputStream;

import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerFactory;

public class XSLTTransformator {
	
	
	public static void main(String[] args) {
		  try {

		    TransformerFactory tFactory = TransformerFactory.newInstance();

		    Transformer transformer =
		      tFactory.newTransformer
		         (new javax.xml.transform.stream.StreamSource
		            ("employee.xsl"));

		    transformer.transform
		      (new javax.xml.transform.stream.StreamSource
		            ("Employeedatachicago.xml"),
		       new javax.xml.transform.stream.StreamResult
		            ( new FileOutputStream("employee.html")));
		    System.out.println("Done");
		    }
		  catch (Exception e) {
		    e.printStackTrace( );
		    }
		  }

}
