Amazon Integrations Module
==========================

This module contains Ultra integrations with Amazon AWS APIs.

The following functionality is covered by this module (could be a partial list):

S3 integration : Ability to store images and other assets produced by Ultra using Amazon's S3 storage
Fulfillment : Roadmap Item


## Steps to enable this module

1. Add the dependency management section to your **parent** `pom.xml`:
    ```xml
    <dependency>
        <groupId>com.ultracommerce</groupId>
        <artifactId>ultra-amazon</artifactId>
        <version>1.0.0-GA</version>
        <type>jar</type>
        <scope>compile</scope>
    </dependency>
    ```

2. Pull this dependency into your `core/pom.xml`:
    ```xml
    <dependency>
        <groupId>com.ultracommerce</groupId>
        <artifactId>ultra-amazon</artifactId>
    </dependency>
    ```

3. Include the necessary `patchConfigLocation` files in your `admin/web.xml`:
    ```xml
        classpath:/uc-amazon-applicationContext.xml
    ```
    > Note: These two lines should go before the `classpath:/applicationContext.xml` line, but after `classpath:/uc-admin-applicationContext.xml`

4. Include the necessary `patchConfigLocation` files in your `site/web.xml`:
    ```xml
        classpath:/uc-amazon-applicationContext.xml
    ```
    > Note: This line should go before the `classpath:/applicationContext.xml` line
