/*
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
 *
 * Contributors:
 *     vpasquier
 */
package com.sprintreview.constants

class Configuration {
  companion object {
    const val MONGODB_URI = "MONGODB_URI"
    const val MONGODB_NAME = "MONGODB_DATABASE"
    const val MONGODB_LOCAL = "localhost:27017"
    const val MONGODB_TEST_VERSION = "mongo:latest"
    const val MONGODB_TEST_PORT = 27017

    const val ES_HOST_VAR = "ES_HOST_VAR"
    const val ES_PORT_VAR = "ES_PORT_VAR"
    const val ES_METHOD_VAR = "ES_METHOD_VAR"
    const val ES_HOST = "localhost"
    const val ES_HTTP = "http"
    const val ES_TEST_VERSION = "elasticsearch:latest"
    const val ES_TEST_PORT = "9200"
  }
}
