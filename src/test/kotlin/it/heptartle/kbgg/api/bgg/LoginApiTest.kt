package it.heptartle.kbgg.api.bgg

import it.heptartle.kbgg.domain.bgg.Credentials
import it.heptartle.kbgg.domain.bgg.CredentialsData
import it.heptartle.kbgg.factory.BggLoginServiceFactory
import it.heptartle.kbgg.factory.BggServiceFactory
import org.junit.jupiter.api.Test

class LoginApiTest {

    private val service = BggLoginServiceFactory.getLoginService()

    @Test
    fun retrieveForum() {
        val response = service.doLogin(Credentials(CredentialsData("danxus", "dnx1990"))).execute()
        check(response.code() == 202)
    }

}