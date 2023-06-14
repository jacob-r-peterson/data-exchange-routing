package gov.cdc.dex.csv.dtos

data class RouterConfiguration (
    val fileType                : String,
    val messageType             : String,
    val messageVersion          : String,
    val configurationFileName   : String,
)