package com.example.utsmobilesatu
// data class Club
data class Club(
    val name: String,
    val epl: Int,
    val fa: Int,
    val efl: Int,
    val championsleague: Int,
    val europaleague: Int
) {
    val totalTrophy: Int
        get() = epl + fa + efl + championsleague + europaleague
}

// extension function recap
fun Club.recap(): String {
    return "$name:\n" +
            "EPL: $epl\n" +
            "FA: $fa\n" +
            "EFL: $efl\n" +
            "Champions League: $championsleague\n" +
            "Europa League: $europaleague\n" +
            "Total Trophies: $totalTrophy"
}
