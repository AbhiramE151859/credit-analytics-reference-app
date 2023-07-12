/*
 * Small Business Credit Analytics API
 * A collection of Mastercard-provided APIs for retrieving merchant metrics that help in making lending decisions.
 *
 * The version of the OpenAPI document: 0.0.1
 * Contact: apisupport@mastercard.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.mastercard.creditanalytics.api;

import org.junit.Assert;
import org.openapitools.client.ApiException;

import java.io.IOException;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.security.UnrecoverableKeyException;
import java.security.cert.CertificateException;

import org.junit.Test;

/**
 * API tests for MetricsApi
 */
public class MetricsApiTest {
    @Test
    public void getMetricsTest() throws ApiException, UnrecoverableKeyException, CertificateException, IOException, KeyStoreException, NoSuchAlgorithmException {
        Assert.assertNotNull(ApiExamples.getFullyPopulatedMetrics());
        Assert.assertNotNull(ApiExamples.getMerchantWithLowTransactionVolumeMetrics());
        Assert.assertNotNull(ApiExamples.getMerchantWithNoDataFromCurrentOrPreviousYearYoyMetrics());
        Assert.assertNotNull(ApiExamples.getMerchantWithLessThan52WeeksMetrics());

        Assert.assertThrows(ApiException.class, ApiExamples::throwsMetricsNotFound);
        Assert.assertThrows(ApiException.class, ApiExamples::throwsLocationNotFound);
        Assert.assertThrows(ApiException.class, ApiExamples::throwsConsentNotProvided);
    }
    
}
