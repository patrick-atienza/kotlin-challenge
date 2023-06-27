package net.allm.challenge.exception

class VisitNotFoundException(
    override val message: String = "Scheduled visit not found."
) : RuntimeException() {
}
