/*
 * ***********************************************************************
 * SPA Vue Project CONFIDENTIAL
 * ___________________
 *
 * Copyright 2022 SPA Vue Project.
 * All Rights Reserved.
 *
 * NOTICE:  All information contained herein is, and remains the property
 * of SPA Vue Project and its suppliers, if any. The intellectual and
 * technical concepts contained herein are proprietary to SPA Vue Project
 * and its suppliers and are protected by trade secret or copyright law.
 * Dissemination of this information or reproduction of this material
 * is strictly forbidden unless prior written permission is obtained
 * from SPA Vue Project.
 * ***********************************************************************
 */

package com.vue.core.models.impl;

import com.adobe.cq.export.json.ComponentExporter;
import com.adobe.cq.export.json.ExporterConstants;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.vue.core.models.Headercomponent;
import org.apache.sling.api.SlingHttpServletRequest;
import org.apache.sling.api.resource.Resource;
import org.apache.sling.models.annotations.Exporter;
import org.apache.sling.models.annotations.Model;
import org.apache.sling.models.annotations.injectorspecific.InjectionStrategy;
import org.apache.sling.models.annotations.injectorspecific.SlingObject;
import org.apache.sling.models.annotations.injectorspecific.ValueMapValue;

@Model(adaptables = {
    SlingHttpServletRequest.class
}, adapters = {
    Headercomponent.class,
    ComponentExporter.class
}, resourceType = "vue/components/headercomponent")
@Exporter(name = ExporterConstants.SLING_MODEL_EXPORTER_NAME, extensions = ExporterConstants.SLING_MODEL_EXTENSION)
public class HeadercomponentImpl
    implements Headercomponent
{

    @ValueMapValue(injectionStrategy = InjectionStrategy.OPTIONAL)
    private String headerType;
    @ValueMapValue(injectionStrategy = InjectionStrategy.OPTIONAL)
    private String headerText;
    @ValueMapValue(injectionStrategy = InjectionStrategy.OPTIONAL)
    private String headerFont;
    @ValueMapValue(injectionStrategy = InjectionStrategy.OPTIONAL)
    private String headerColor;
    @ValueMapValue(injectionStrategy = InjectionStrategy.OPTIONAL)
    private String headerTypeTabs;
    @ValueMapValue(injectionStrategy = InjectionStrategy.OPTIONAL)
    private String headerTextTabs;
    @ValueMapValue(injectionStrategy = InjectionStrategy.OPTIONAL)
    private String headerFontTabs;
    @ValueMapValue(injectionStrategy = InjectionStrategy.OPTIONAL)
    private String headerColorTabs;
    @SlingObject
    private Resource resource;

    @Override
    @JsonProperty("headerType")
    public String getHeaderType() {
        return headerType;
    }

    @Override
    @JsonProperty("headerText")
    public String getHeaderText() {
        return headerText;
    }

    @Override
    @JsonProperty("headerFont")
    public String getHeaderFont() {
        return headerFont;
    }

    @Override
    @JsonProperty("headerColor")
    public String getHeaderColor() {
        return headerColor;
    }

    @Override
    @JsonProperty("headerTypeTabs")
    public String getHeaderTypeTabs() {
        return headerTypeTabs;
    }

    @Override
    @JsonProperty("headerTextTabs")
    public String getHeaderTextTabs() {
        return headerTextTabs;
    }

    @Override
    @JsonProperty("headerFontTabs")
    public String getHeaderFontTabs() {
        return headerFontTabs;
    }

    @Override
    @JsonProperty("headerColorTabs")
    public String getHeaderColorTabs() {
        return headerColorTabs;
    }

    @Override
    public String getExportedType() {
        return resource.getResourceType();
    }

}
