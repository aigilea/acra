/*
 * Copyright (c) 2018
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.acra.plugins

import org.acra.annotation.OpenAPI
import org.acra.config.CoreConfiguration

/**
 * Marker interface for ACRA plugins
 *
 * @author F43nd1r
 * @since 18.04.2018
 */
@OpenAPI
interface Plugin {
    /**
     * controls if this instance is active
     *
     * @param config the current config
     * @return if this instance should be called
     */
    @JvmDefault
    fun enabled(config: CoreConfiguration): Boolean {
        return true
    }
}