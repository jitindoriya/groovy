package com.prosper.spock

import static org.junit.Assert.*;

import content.utils.XMLRead
import org.junit.Test

import com.prosper.content.XMLReader;;

class TestDataModal {

	@Test
	public void test() {

		XMLRead xml = new XMLRead()
		 //printl xml.getDataAsList('PrimeBorrowerValidDetail')
		 println  xml.getDataAsList('PrimeBorrowerValidDetail')
		 }

	/*	XMLReader xml = new XMLReader("E:\\Workspace\\geb-testing-spock\\src\\test\\resources\\testData.xml")
		xml.getDataAsList("PrimeBorrowerValidDetails")*/
}