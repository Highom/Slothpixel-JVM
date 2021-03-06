package zone.nora.slothpixel.player

import com.google.gson.annotations.SerializedName
import zone.nora.slothpixel.player.links.PlayerLinks
import zone.nora.slothpixel.player.rewards.PlayerRewards
import zone.nora.slothpixel.player.stats.Stats
import zone.nora.slothpixel.player.voting.Voting

class Player {
    @SerializedName("uuid")
    val uuid = ""

    @SerializedName("username")
    val username = ""

    @SerializedName("online")
    val online = false

    @SerializedName("rank")
    val rank = ""

    @SerializedName("rank_plus_color")
    val rankPlusColor = ""

    @SerializedName("rank_formatted")
    val rankFormatted = ""

    @SerializedName("prefix")
    val prefix = ""

    @SerializedName("karma")
    val karma = 0

    @SerializedName("exp")
    val exp = 0

    @SerializedName("level")
    val level = 0.0

    @SerializedName("achievement_points")
    val achievementPoints = 0

    @SerializedName("quests_completed")
    val questsCompleted = 0

    @SerializedName("total_kills")
    val totalKills = 0

    @SerializedName("total_wins")
    val totalWins = 0

    @SerializedName("total_coins")
    val totalCoins = 0

    @SerializedName("mc_version")
    val mcVersion = ""

    @SerializedName("first_login")
    val firstLogin: Long = 0

    @SerializedName("last_login")
    val lastLogin: Long = 0

    @SerializedName("last_logout")
    val lastLogout: Long = 0

    @SerializedName("last_game")
    val lastGame = ""

    @SerializedName("language")
    val language = ""

    @SerializedName("gifts_sent")
    val giftsSent = 0

    @SerializedName("gifts_received")
    val giftsReceived = 0

    @SerializedName("is_contributor")
    val isContributor = false

    @SerializedName("rewards")
    val rewards = PlayerRewards()

    @SerializedName("voting")
    val voting = Voting()

    @SerializedName("links")
    val links = PlayerLinks()

    @SerializedName("stats")
    val stats = Stats()
}