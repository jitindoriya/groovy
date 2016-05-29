package content.utils

import java.util.ArrayList;
import java.util.Hashtable
import java.util.List;;

class XMLRead {

	/*static main(args) {
	 def dataModal =	new XmlSlurper().parse(new File("E:\\Workspace\\geb-testing-spock\\src\\test\\resources\\modalData.xml"))
	 println dataModal.Data.LoanAmount.size()
	 def mydata =dataModal.Data.findAll{Data->Data.'@flow'=='PrimeBorrowerValidDetails'}
	 mydata.each {data->
	 println data.name()
	 data.children().each {
	 println it.name()
	 }
	 }
	 }*/
	List<Hashtable<String,String>> getDataAsList(def testName){
		List<Hashtable<String,String>> list = new ArrayList<Hashtable<String,String>>();
		def dataModal =	new XmlSlurper().parse(new File("E:\\Workspace\\geb-testing-spock\\src\\test\\resources\\modalData.xml"))

		def mydata =dataModal.Data.findAll{Data->Data.'@flow'=="$testName"}
		def worklogs = [:] 
		mydata.each {data->
//			println data.name()
			data.children().each {
				println	"${it.name()}: ${it.text()}"
				worklogs[it.name()]=it.text()
//				worklogs.put(it.name(), it.text())
			}
			println worklogs
			list.add(worklogs)
		}
		println list
	}
}
