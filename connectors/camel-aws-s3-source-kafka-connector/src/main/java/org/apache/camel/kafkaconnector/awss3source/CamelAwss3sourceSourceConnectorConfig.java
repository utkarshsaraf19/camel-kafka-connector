/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.apache.camel.kafkaconnector.awss3source;

import java.util.Map;
import javax.annotation.Generated;
import org.apache.camel.kafkaconnector.CamelSourceConnectorConfig;
import org.apache.kafka.common.config.ConfigDef;

@Generated("This class has been generated by camel-kafka-connector-generator-maven-plugin, remove this annotation to prevent it from being generated.")
public class CamelAwss3sourceSourceConnectorConfig
        extends
            CamelSourceConnectorConfig {

    public static final String CAMEL_SOURCE_AWSS3SOURCE_KAMELET_BUCKET_NAME_OR_ARN_CONF = "camel.kamelet.aws-s3-source.bucketNameOrArn";
    public static final String CAMEL_SOURCE_AWSS3SOURCE_KAMELET_BUCKET_NAME_OR_ARN_DOC = "The S3 Bucket name or ARN";
    public static final String CAMEL_SOURCE_AWSS3SOURCE_KAMELET_BUCKET_NAME_OR_ARN_DEFAULT = null;
    public static final String CAMEL_SOURCE_AWSS3SOURCE_KAMELET_DELETE_AFTER_READ_CONF = "camel.kamelet.aws-s3-source.deleteAfterRead";
    public static final String CAMEL_SOURCE_AWSS3SOURCE_KAMELET_DELETE_AFTER_READ_DOC = "Delete objects after consuming them";
    public static final Boolean CAMEL_SOURCE_AWSS3SOURCE_KAMELET_DELETE_AFTER_READ_DEFAULT = true;
    public static final String CAMEL_SOURCE_AWSS3SOURCE_KAMELET_ACCESS_KEY_CONF = "camel.kamelet.aws-s3-source.accessKey";
    public static final String CAMEL_SOURCE_AWSS3SOURCE_KAMELET_ACCESS_KEY_DOC = "The access key obtained from AWS";
    public static final String CAMEL_SOURCE_AWSS3SOURCE_KAMELET_ACCESS_KEY_DEFAULT = null;
    public static final String CAMEL_SOURCE_AWSS3SOURCE_KAMELET_SECRET_KEY_CONF = "camel.kamelet.aws-s3-source.secretKey";
    public static final String CAMEL_SOURCE_AWSS3SOURCE_KAMELET_SECRET_KEY_DOC = "The secret key obtained from AWS";
    public static final String CAMEL_SOURCE_AWSS3SOURCE_KAMELET_SECRET_KEY_DEFAULT = null;
    public static final String CAMEL_SOURCE_AWSS3SOURCE_KAMELET_REGION_CONF = "camel.kamelet.aws-s3-source.region";
    public static final String CAMEL_SOURCE_AWSS3SOURCE_KAMELET_REGION_DOC = "The AWS region to connect to Example: eu-west-1";
    public static final String CAMEL_SOURCE_AWSS3SOURCE_KAMELET_REGION_DEFAULT = null;
    public static final String CAMEL_SOURCE_AWSS3SOURCE_KAMELET_AUTO_CREATE_BUCKET_CONF = "camel.kamelet.aws-s3-source.autoCreateBucket";
    public static final String CAMEL_SOURCE_AWSS3SOURCE_KAMELET_AUTO_CREATE_BUCKET_DOC = "Setting the autocreation of the S3 bucket bucketName.";
    public static final Boolean CAMEL_SOURCE_AWSS3SOURCE_KAMELET_AUTO_CREATE_BUCKET_DEFAULT = false;
    public static final String CAMEL_SOURCE_AWSS3SOURCE_KAMELET_INCLUDE_BODY_CONF = "camel.kamelet.aws-s3-source.includeBody";
    public static final String CAMEL_SOURCE_AWSS3SOURCE_KAMELET_INCLUDE_BODY_DOC = "If it is true, the exchange will be consumed and put into the body and closed. If false the S3Object stream will be put raw into the body and the headers will be set with the S3 object metadata.";
    public static final Boolean CAMEL_SOURCE_AWSS3SOURCE_KAMELET_INCLUDE_BODY_DEFAULT = true;
    public static final String CAMEL_SOURCE_AWSS3SOURCE_KAMELET_PREFIX_CONF = "camel.kamelet.aws-s3-source.prefix";
    public static final String CAMEL_SOURCE_AWSS3SOURCE_KAMELET_PREFIX_DOC = "The AWS S3 bucket prefix to consider while searching Example: folder/";
    public static final String CAMEL_SOURCE_AWSS3SOURCE_KAMELET_PREFIX_DEFAULT = null;
    public static final String CAMEL_SOURCE_AWSS3SOURCE_KAMELET_IGNORE_BODY_CONF = "camel.kamelet.aws-s3-source.ignoreBody";
    public static final String CAMEL_SOURCE_AWSS3SOURCE_KAMELET_IGNORE_BODY_DOC = "If it is true, the S3 Object Body will be ignored completely, if it is set to false the S3 Object will be put in the body. Setting this to true, will override any behavior defined by includeBody option.";
    public static final Boolean CAMEL_SOURCE_AWSS3SOURCE_KAMELET_IGNORE_BODY_DEFAULT = false;

    public CamelAwss3sourceSourceConnectorConfig(
            ConfigDef config,
            Map<String, String> parsedConfig) {
        super(config, parsedConfig);
    }

    public CamelAwss3sourceSourceConnectorConfig(
            Map<String, String> parsedConfig) {
        this(conf(), parsedConfig);
    }

    public static ConfigDef conf() {
        ConfigDef conf = new ConfigDef(CamelSourceConnectorConfig.conf());
        conf.define(CAMEL_SOURCE_AWSS3SOURCE_KAMELET_BUCKET_NAME_OR_ARN_CONF, ConfigDef.Type.STRING, CAMEL_SOURCE_AWSS3SOURCE_KAMELET_BUCKET_NAME_OR_ARN_DEFAULT, ConfigDef.Importance.HIGH, CAMEL_SOURCE_AWSS3SOURCE_KAMELET_BUCKET_NAME_OR_ARN_DOC);
        conf.define(CAMEL_SOURCE_AWSS3SOURCE_KAMELET_DELETE_AFTER_READ_CONF, ConfigDef.Type.BOOLEAN, CAMEL_SOURCE_AWSS3SOURCE_KAMELET_DELETE_AFTER_READ_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_AWSS3SOURCE_KAMELET_DELETE_AFTER_READ_DOC);
        conf.define(CAMEL_SOURCE_AWSS3SOURCE_KAMELET_ACCESS_KEY_CONF, ConfigDef.Type.PASSWORD, CAMEL_SOURCE_AWSS3SOURCE_KAMELET_ACCESS_KEY_DEFAULT, ConfigDef.Importance.HIGH, CAMEL_SOURCE_AWSS3SOURCE_KAMELET_ACCESS_KEY_DOC);
        conf.define(CAMEL_SOURCE_AWSS3SOURCE_KAMELET_SECRET_KEY_CONF, ConfigDef.Type.PASSWORD, CAMEL_SOURCE_AWSS3SOURCE_KAMELET_SECRET_KEY_DEFAULT, ConfigDef.Importance.HIGH, CAMEL_SOURCE_AWSS3SOURCE_KAMELET_SECRET_KEY_DOC);
        conf.define(CAMEL_SOURCE_AWSS3SOURCE_KAMELET_REGION_CONF, ConfigDef.Type.STRING, CAMEL_SOURCE_AWSS3SOURCE_KAMELET_REGION_DEFAULT, ConfigDef.Importance.HIGH, CAMEL_SOURCE_AWSS3SOURCE_KAMELET_REGION_DOC);
        conf.define(CAMEL_SOURCE_AWSS3SOURCE_KAMELET_AUTO_CREATE_BUCKET_CONF, ConfigDef.Type.BOOLEAN, CAMEL_SOURCE_AWSS3SOURCE_KAMELET_AUTO_CREATE_BUCKET_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_AWSS3SOURCE_KAMELET_AUTO_CREATE_BUCKET_DOC);
        conf.define(CAMEL_SOURCE_AWSS3SOURCE_KAMELET_INCLUDE_BODY_CONF, ConfigDef.Type.BOOLEAN, CAMEL_SOURCE_AWSS3SOURCE_KAMELET_INCLUDE_BODY_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_AWSS3SOURCE_KAMELET_INCLUDE_BODY_DOC);
        conf.define(CAMEL_SOURCE_AWSS3SOURCE_KAMELET_PREFIX_CONF, ConfigDef.Type.STRING, CAMEL_SOURCE_AWSS3SOURCE_KAMELET_PREFIX_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_AWSS3SOURCE_KAMELET_PREFIX_DOC);
        conf.define(CAMEL_SOURCE_AWSS3SOURCE_KAMELET_IGNORE_BODY_CONF, ConfigDef.Type.BOOLEAN, CAMEL_SOURCE_AWSS3SOURCE_KAMELET_IGNORE_BODY_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_AWSS3SOURCE_KAMELET_IGNORE_BODY_DOC);
        return conf;
    }
}