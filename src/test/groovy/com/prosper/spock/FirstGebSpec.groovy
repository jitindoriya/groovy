import geb.spock.GebReportingSpec
import spock.lang.Stepwise
import content.prosper.PublicSiteHomePage
import content.prosper.PublicSiteRegistrationPage
import  content.prosper.PublicSiteSignInPage
@Stepwise
class FirstGebSpec extends GebReportingSpec{

	
	def "Verify Existing User is able to Login as Borrower"() {
		
		when:"User Landed on prosper home page"
		to PublicSiteHomePage
		
		then:"User clicked on Sign-in Button on Header and Navigated to Sign-in Page"
		signIn_btn.click()
		
		and:"User submit the Sign-in form with valid credentials "
		loginAsProsperUser ('test123@c1.stg', 'Password23')
		
	}
}
