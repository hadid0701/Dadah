package com.example.daftartim.data.model
import com.google.gson.annotations.SerializedName


data class TeamResponse(
    @SerializedName("teams")
    var teams: List<Team?>? = null
){

data class Team(
    @SerializedName("idLeague")
    var idLeague: String? = null,
    @SerializedName("idSoccerXML")
    var idSoccerXML: String? = null,
    @SerializedName("idTeam")
    var idTeam: String? = null,
    @SerializedName("intFormedYear")
    var intFormedYear: String? = null,
    @SerializedName("intLoved")
    var intLoved: String? = null,
    @SerializedName("intStadiumCapacity")
    var intStadiumCapacity: String? = null,
    @SerializedName("strAlternate")
    var strAlternate: String? = null,
    @SerializedName("strCountry")
    var strCountry: String? = null,
    @SerializedName("strDescriptionCN")
    var strDescriptionCN: Any? = null,
    @SerializedName("strDescriptionDE")
    var strDescriptionDE: String? = null,
    @SerializedName("strDescriptionEN")
    var strDescriptionEN: String? = null,
    @SerializedName("strDescriptionES")
    var strDescriptionES: String? = null,
    @SerializedName("strDescriptionFR")
    var strDescriptionFR: Any? = null,
    @SerializedName("strDescriptionHU")
    var strDescriptionHU: Any? = null,
    @SerializedName("strDescriptionIL")
    var strDescriptionIL: Any? = null,
    @SerializedName("strDescriptionIT")
    var strDescriptionIT: String? = null,
    @SerializedName("strDescriptionJP")
    var strDescriptionJP: Any? = null,
    @SerializedName("strDescriptionNL")
    var strDescriptionNL: Any? = null,
    @SerializedName("strDescriptionNO")
    var strDescriptionNO: Any? = null,
    @SerializedName("strDescriptionPL")
    var strDescriptionPL: Any? = null,
    @SerializedName("strDescriptionPT")
    var strDescriptionPT: Any? = null,
    @SerializedName("strDescriptionRU")
    var strDescriptionRU: Any? = null,
    @SerializedName("strDescriptionSE")
    var strDescriptionSE: Any? = null,
    @SerializedName("strDivision")
    var strDivision: Any? = null,
    @SerializedName("strFacebook")
    var strFacebook: String? = null,
    @SerializedName("strGender")
    var strGender: String? = null,
    @SerializedName("strInstagram")
    var strInstagram: String? = null,
    @SerializedName("strKeywords")
    var strKeywords: String? = null,
    @SerializedName("strLeague")
    var strLeague: String? = null,
    @SerializedName("strLocked")
    var strLocked: String? = null,
    @SerializedName("strManager")
    var strManager: String? = null,
    @SerializedName("strRSS")
    var strRSS: String? = null,
    @SerializedName("strSport")
    var strSport: String? = null,
    @SerializedName("strStadium")
    var strStadium: String? = null,
    @SerializedName("strStadiumDescription")
    var strStadiumDescription: String? = null,
    @SerializedName("strStadiumLocation")
    var strStadiumLocation: String? = null,
    @SerializedName("strStadiumThumb")
    var strStadiumThumb: String? = null,
    @SerializedName("strTeam")
    var strTeam: String? = null,
    @SerializedName("strTeamBadge")
    var strTeamBadge: String? = null,
    @SerializedName("strTeamBanner")
    var strTeamBanner: String? = null,
    @SerializedName("strTeamFanart1")
    var strTeamFanart1: String? = null,
    @SerializedName("strTeamFanart2")
    var strTeamFanart2: String? = null,
    @SerializedName("strTeamFanart3")
    var strTeamFanart3: String? = null,
    @SerializedName("strTeamFanart4")
    var strTeamFanart4: String? = null,
    @SerializedName("strTeamJersey")
    var strTeamJersey: String? = null,
    @SerializedName("strTeamLogo")
    var strTeamLogo: String? = null,
    @SerializedName("strTeamShort")
    var strTeamShort: String? = null,
    @SerializedName("strTwitter")
    var strTwitter: String? = null,
    @SerializedName("strWebsite")
    var strWebsite: String? = null,
    @SerializedName("strYoutube")
    var strYoutube: String? = null
) }