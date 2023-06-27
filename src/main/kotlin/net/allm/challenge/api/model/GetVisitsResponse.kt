package net.allm.challenge.api.model

import net.allm.challenge.model.Hospital

class GetVisitsResponse(
    var id: Long,
    var hospital: Hospital,
    var date: String
)

