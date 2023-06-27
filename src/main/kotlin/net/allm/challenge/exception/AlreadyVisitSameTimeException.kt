package net.allm.challenge.exception

class AlreadyVisitSameTimeException(
    override val message: String = "You already scheduled the same time of visit of the hospital of choice."
) : RuntimeException()

