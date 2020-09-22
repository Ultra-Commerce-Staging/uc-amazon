/*
 * #%L
 * UltraCommerce Amazon Integrations
 * %%
 * Copyright (C) 2009 - 2017 Ultra Commerce
 * %%
 * Licensed under the Ultra Fair Use License Agreement, Version 1.0
 * (the "Fair Use License" located  at http://license.ultracommerce.org/fair_use_license-1.0.txt)
 * unless the restrictions on use therein are violated and require payment to Ultra in which case
 * the Ultra End User License Agreement (EULA), Version 1.1
 * (the "Commercial License" located at http://license.ultracommerce.org/commercial_license-1.1.txt)
 * shall apply.
 * 
 * Alternatively, the Commercial License may be replaced with a mutually agreed upon license (the "Custom License")
 * between you and Ultra Commerce. You may not use this file except in compliance with the applicable license.
 * #L%
 */
package com.ultracommerce.vendor.amazon.s3.config;

import com.ultracommerce.common.logging.LifeCycleEvent;
import com.ultracommerce.common.logging.ModuleLifecycleLoggingBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author Nick Crum ncrum
 */
@Configuration
public class AmazonS3Configuration {

    @Bean
    public ModuleLifecycleLoggingBean ucAmazonS3ModuleLifecycle() {
        return new ModuleLifecycleLoggingBean(AmazonS3ModuleRegistration.MODULE_NAME, LifeCycleEvent.LOADING);
    }
}
