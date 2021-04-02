package it.heptartle.kbgg.domain.bgg

data class Credentials(val credentials: CredentialsData)

data class CredentialsData(val username: String,
                           val password: String)