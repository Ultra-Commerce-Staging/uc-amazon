# Module Installation
The Ultra Amazon module requires [configuration](#configuration-changes) and [third-party property configuration](#third-party-property-configuration)

## Ultra Dependency

- Version 2.1.x-GA requires Ultra 5.2 or later.
- Version 2.0.x-GA requires Ultra 5.0 or 5.1
- Version 1.1.x-GA requires Ultra 4.0 or 4.1
- Version 1.0.x-GA requires Ultra 3.1

## Configuration Changes
**Step 1.**  Add the dependency into your `core/pom.xml`:

```xml
<dependency>
    <groupId>com.ultracommerce</groupId>
    <artifactId>ultra-amazon</artifactId>
</dependency>
```

## Third Party Property Configuration
This module requires you to configure properties specific to your amazon account.

### Amazon Credentials
Ultra requires access to your Amazon AWS account. See [About Amazon Credentials](http://docs.aws.amazon.com/IAM/latest/UserGuide/id_credentials_access-keys.html) for more information.

**AccessKeyId / SecretKey**
One approach for setting up credentials is to use an accessKeyId and secretKey.  When you create the access keys on amazon you will need to copy the values and add the following properties to your `common-shared.properties` file located in your core project.

    aws.s3.accessKeyId=

    aws.s3.secretKey=

**Instance Profiles**
If you are hosting on EC2, you can now use Instance Profiles.  See [Creating Instance Profiles](http://docs.aws.amazon.com/codedeploy/latest/userguide/getting-started-create-iam-instance-profile.html)

If you are using Instance Profiles, then the following property should be set:

    aws.s3.useInstanceProfile=true

### Amazon File Storage Location Information
Ultra needs to know the specific location within your S3 account to store the files.   You will need to set the bucket name and the bucket location.  These properties are described on the [Amazon S3 Location Selection page](http://docs.aws.amazon.com/AmazonS3/latest/dev/LocationSelection.html).

_The bucket name must be unique across all of Amazon_

    aws.s3.defaultBucketName=

_If you would like to store files inside of a folder within the bucket (like 'img'), set the following property:_

    aws.s3.bucketSubDirectory=img

> Starting and trailing slashes will be stripped from this value to build the file path so they are not necessary

_The Amazon module will default to the "us-west-2" region of S3. You can override the region by setting the following property._

    aws.s3.defaultBucketRegion=us-west-2

_If your uploads require Server-Side Encryption, enable with this property. The default value is "false"._

    aws.s3.sse=true


