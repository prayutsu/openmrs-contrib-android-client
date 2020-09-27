/*
 * The contents of this file are subject to the OpenMRS Public License
 * Version 1.0 (the "License"); you may not use this file except in
 * compliance with the License. You may obtain a copy of the License at
 * http://license.openmrs.org
 *
 * Software distributed under the License is distributed on an "AS IS"
 * basis, WITHOUT WARRANTY OF ANY KIND, either express or implied. See the
 * License for the specific language governing rights and limitations
 * under the License.
 *
 * Copyright (C) OpenMRS, LLC.  All Rights Reserved.
 */

package org.openmrs.mobile.databases.entities

import androidx.room.ColumnInfo
import androidx.room.Entity
import org.openmrs.mobile.models.Resource

@Entity(tableName = "observations")
class ObservationEntity : Resource() {
    @ColumnInfo(name = "encounter_id")
    var encounterKeyID: Long = 0

    @ColumnInfo(name = "displayValue")
    var displayValue: String? = null

    @ColumnInfo(name = "diagnosisOrder")
    var diagnosisOrder: String? = null

    @ColumnInfo(name = "diagnosisList")
    var diagnosisList: String? = null

    @ColumnInfo(name = "diagnosisCertainty")
    var diagnosisCertainty: String? = null

    @ColumnInfo(name = "diagnosisNote")
    var diagnosisNote: String? = null

    @ColumnInfo(name = "conceptUuid")
    var conceptuuid: String? = null

}
