/**
 * @author Stefan Prelle
 *
 */
module itextpdf {
	exports com.itextpdf.text.factories;
	exports com.itextpdf.text.pdf.hyphenation;
	exports com.itextpdf.text.html.simpleparser;
	exports com.itextpdf.text.pdf.interfaces;
	exports com.itextpdf.text.xml.xmp;
	exports com.itextpdf.text.xml;
	exports com.itextpdf.text.pdf.parser;
	exports com.itextpdf.text.pdf.collection;
	exports com.itextpdf.text.pdf.codec.wmf;
	exports com.itextpdf.text.pdf.draw;
	exports com.itextpdf.text;
	exports com.itextpdf.text.error_messages;
	exports com.itextpdf.text.pdf;
	exports com.itextpdf.text.pdf.codec;
	exports com.itextpdf.text.pdf.crypto;
	exports com.itextpdf.text.pdf.internal;
	exports com.itextpdf.tools;
	exports com.itextpdf.text.pdf.fonts;
	exports com.itextpdf.text.xml.simpleparser;
	exports com.itextpdf.text.pdf.fonts.cmaps;
	exports com.itextpdf.text.html;
	exports com.itextpdf.text.exceptions;
	exports com.itextpdf.text.pdf.events;

	opens com.itextpdf.text.pdf.fonts;

	requires bcmail.jdk15on;
	requires bcprov.jdk15on;
	requires bctsp.jdk15on;
	requires java.desktop;
	requires java.xml;
}