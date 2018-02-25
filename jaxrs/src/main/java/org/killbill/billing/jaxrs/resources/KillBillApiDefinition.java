/*
 * Copyright 2014-2018 Groupon, Inc
 * Copyright 2014-2018 The Billing Project, LLC
 *
 * The Billing Project licenses this file to you under the Apache License, version 2.0
 * (the "License"); you may not use this file except in compliance with the
 * License.  You may obtain a copy of the License at:
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.  See the
 * License for the specific language governing permissions and limitations
 * under the License.
 */

package org.killbill.billing.jaxrs.resources;


import io.swagger.annotations.SwaggerDefinition;
import io.swagger.jaxrs.config.ReaderListener;
import io.swagger.models.Swagger;
import io.swagger.models.auth.BasicAuthDefinition;

@SwaggerDefinition
public class KillBillApiDefinition implements ReaderListener {

    public static final String BASIC_AUTH_SCHEME = "basicAuth";

    @Override
    public void beforeScan(final io.swagger.jaxrs.Reader reader, final Swagger swagger) {

    }

    @Override
    public void afterScan(final io.swagger.jaxrs.Reader reader, final Swagger swagger) {
        BasicAuthDefinition basicAuthDefinition = new BasicAuthDefinition();
        swagger.addSecurityDefinition(BASIC_AUTH_SCHEME, basicAuthDefinition);
    }

}
