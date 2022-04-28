/*
 * Copyright 2012-2021 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.azure.spring.initializr.extension.dependency.springazure;

import io.spring.initializr.generator.buildsystem.gradle.GradleBuild;
import io.spring.initializr.generator.spring.build.BuildCustomizer;
import io.spring.initializr.generator.version.Version;

/**
 * A Gradle {@link BuildCustomizer} that automatically adds "com.azure.spring:spring-cloud-azure-native-configuration" dependency when the relevant Spring Cloud Azure
 * library and Spring Native dependency are selected.
 */
public class SpringCloudAzureNativeGradleBuildCustomizer extends AbstractSpringCloudAzureNativeBuildCustomizer<GradleBuild> {

    public SpringCloudAzureNativeGradleBuildCustomizer(Version platformVersion) {
        super(platformVersion);
    }
}
