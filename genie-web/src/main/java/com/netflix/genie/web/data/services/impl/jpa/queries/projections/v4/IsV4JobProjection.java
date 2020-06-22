/*
 *
 *  Copyright 2018 Netflix, Inc.
 *
 *     Licensed under the Apache License, Version 2.0 (the "License");
 *     you may not use this file except in compliance with the License.
 *     You may obtain a copy of the License at
 *
 *         http://www.apache.org/licenses/LICENSE-2.0
 *
 *     Unless required by applicable law or agreed to in writing, software
 *     distributed under the License is distributed on an "AS IS" BASIS,
 *     WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *     See the License for the specific language governing permissions and
 *     limitations under the License.
 *
 */
package com.netflix.genie.web.data.services.impl.jpa.queries.projections.v4;

/**
 * Projection for capturing if the job was launched using Genie v4.
 *
 * @author standon
 * @since 4.0.0
 */
@Deprecated
public interface IsV4JobProjection {
    /**
     * Job was launched using Genie v4.
     *
     * @return true if job was launched via Genie v4 else false
     */
    boolean isV4();
}